package com.reskinning.ReskinGuard;

import android.util.Base64;
import java.net.HttpURLConnection;
import java.net.URL;
import java.io.IOException;

public class Utils {

    public static boolean IsP(String PN) throws IOException {
        String URI = DecPS("aHR0cHM6Ly9wbGF5Lmdvb2dsZS5jb20vc3RvcmUvYXBwcy9kZXRhaWxzP2lkPQ==") + PN;
        HttpURLConnection connection = (HttpURLConnection) new URL(URI).openConnection();
        connection.setRequestMethod("GET");
        connection.connect();
        int responseCode = connection.getResponseCode();
        return responseCode == HttpURLConnection.HTTP_OK;
    }

    public static String DecPS(String BsPS) {
        byte[] data = Base64.decode(BsPS, Base64.DEFAULT);
        return new String(data);
    }

}
