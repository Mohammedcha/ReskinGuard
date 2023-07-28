package com.reskinning.ReskinGuard;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.util.Base64;

public class Dialog {

    public static void sDial(Context context, String DecPN) {
        AlertDialog.Builder builder = new AlertDialog.Builder(context);
        builder.setTitle(DecPN("VXBkYXRlIEF2YWlsYWJsZQ=="));
        builder.setMessage(DecPN("QW4gdXBkYXRlIGlzIGF2YWlsYWJsZSBmb3IgdGhlIGFwcC4gRG8geW91IHdhbnQgdG8gdXBkYXRlPw=="));
        builder.setCancelable(false);
        builder.setPositiveButton(DecPN("VXBkYXRl"), (dialog, which) -> OpPS(context, DecPN));
        builder.setNegativeButton(DecPN("RXhpdA=="), (dialog, which) -> {
            if (context instanceof Activity) {
                ((Activity) context).finish();
            }
        });
        AlertDialog dialog = builder.create();
        dialog.show();
    }

    static String DecPN(String BsPN) {
        byte[] data = Base64.decode(BsPN, Base64.DEFAULT);
        return new String(data);
    }

    static void OpPS(Context context, String PN) {
        Intent intent = new Intent(Intent.ACTION_VIEW);
        intent.setData(Uri.parse(Utils.DecPS("bWFya2V0Oi8vZGV0YWlscz9pZD0=") + PN));
        context.startActivity(intent);
    }
}
