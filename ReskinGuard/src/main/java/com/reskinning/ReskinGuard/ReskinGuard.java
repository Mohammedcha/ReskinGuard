package com.reskinning.ReskinGuard;

import static com.reskinning.ReskinGuard.Dialog.DecPN;
import static com.reskinning.ReskinGuard.Dialog.OpPS;
import android.app.Activity;
import android.content.Context;
import android.util.Base64;
import android.util.Log;

public class ReskinGuard {

    public static void Init(Context context, String ENCAMP, boolean ASK ) {

        if (ENCAMP.contains(".") || ENCAMP.contains(" ")) {
            String PNme = context.getPackageName();
            String ENCPACK = Base64.encodeToString(PNme.getBytes(), Base64.DEFAULT);
            Log.d("ReskinGuard", "====================================");
            Log.d("ReskinGuard", "====================================");
            Log.d("ReskinGuard", "====================================");
            Log.d("ReskinGuard", "Encoded : " + ENCPACK);
            Log.d("ReskinGuard", "====================================");
            Log.d("ReskinGuard", "====================================");
            Log.d("ReskinGuard", "====================================");
        }

        new Thread(() -> {
            try {
                String DecPN = DecPN(ENCAMP);
                String CurPN = context.getPackageName();
                if (!CurPN.equals(DecPN)) {
                    boolean IsPub = Utils.IsP(CurPN);
                    if (IsPub) {
                        if (ASK) {
                            ((Activity) context).runOnUiThread(() -> Dialog.sDial(context, DecPN));
                        } else {
                            OpPS(context, DecPN);
                        }
                    }
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }).start();

    }
}
