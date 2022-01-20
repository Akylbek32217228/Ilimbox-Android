package ilimboxAndroid.ilimbox.network;

import android.content.Context;

import java.io.InputStream;
import java.security.KeyStore;
import java.util.Arrays;
import java.util.concurrent.TimeUnit;

import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.TrustManager;
import javax.net.ssl.TrustManagerFactory;
import javax.net.ssl.X509TrustManager;

import ilimboxAndroid.ilimbox.BuildConfig;
import ilimboxAndroid.ilimbox.R;
import ilimboxAndroid.ilimbox.app.MyApplication;
import ilimboxAndroid.ilimbox.app.Urls;
import okhttp3.OkHttpClient;
import okhttp3.logging.HttpLoggingInterceptor;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class APIClient {

    private static Retrofit retrofit = null;

    private static final HttpLoggingInterceptor interceptor = new HttpLoggingInterceptor();
    private static final OkHttpClient.Builder builder = getTrustCertificate(MyApplication.Companion.getInstance().getApplicationContext());


    public static Retrofit getRetrofitInstance() {

        if (retrofit == null) {
            interceptor.setLevel(HttpLoggingInterceptor.Level.BODY);
            if (BuildConfig.DEBUG) {
                builder.addInterceptor(interceptor);
            }
            builder.connectTimeout(5, TimeUnit.MINUTES)
            .writeTimeout(5, TimeUnit.MINUTES)
            .readTimeout(5, TimeUnit.MINUTES);

            retrofit = new Retrofit.Builder()
                    .addConverterFactory(GsonConverterFactory.create())
                    .baseUrl(Urls.MOODLE_URL.toString())
                    .client(builder.build())
                    .build();
        }
        return retrofit;
    }

    private static OkHttpClient.Builder getTrustCertificate(Context context)  {
        OkHttpClient.Builder client = new OkHttpClient.Builder();
        try {

            final KeyStore ks = KeyStore.getInstance("BKS");
            // the bks file we generated above
            final InputStream in = context.getResources().openRawResource( R.raw.mystore);
            try {
                // don't forget to put the password used above in strings.xml/mystore_password
                ks.load(in, context.getString(R.string.keystore_pass).toCharArray());
            } finally {
                in.close();
            }

            TrustManagerFactory trustManagerFactory = TrustManagerFactory.getInstance(TrustManagerFactory.getDefaultAlgorithm());
            trustManagerFactory.init(ks);
            TrustManager[] trustManagers = trustManagerFactory.getTrustManagers();
            if (trustManagers.length != 1 || !(trustManagers[0] instanceof X509TrustManager)) {
                throw new IllegalStateException("Unexpected default trust managers:" + Arrays.toString(trustManagers));
            }
            X509TrustManager trustManager = (X509TrustManager) trustManagers[0];
            SSLContext sslContext = SSLContext.getInstance("SSL");
            sslContext.init(null, new TrustManager[] { trustManager }, null);
            SSLSocketFactory sslSocketFactory = sslContext.getSocketFactory();
            client.sslSocketFactory(sslSocketFactory, trustManager);

        } catch (Exception e) {

        }
        return client;
    }
    

}
