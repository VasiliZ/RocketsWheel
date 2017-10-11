package com.github.vasiliz.rocketswheel.authServise;

import android.content.Context;
import android.os.AsyncTask;
import android.os.Handler;
import android.support.annotation.NonNull;

public class AuthService {

    private final Context mContext;

    public AuthService(@NonNull final Context pContext) {
        mContext = pContext;
    }

    public void checkCredentials(@NonNull final AuthUserCallback pAuthUserCallback, @NonNull final String pCredentials) {
        pAuthUserCallback.onCredentialsValidate();
    }

    public void authorize(@NonNull final AuthUserCallback pAuthUserCallback, @NonNull final String pCredentials) {
        new AsyncTask() {

            @Override
            protected Object doInBackground(Object[] pObjects) {
                try {
                    Thread.sleep(2000);

                } catch (InterruptedException pE) {
                    pE.printStackTrace();
                }
                return null;
            }

               @Override
            protected void onPostExecute(Object pO) {
                super.onPostExecute(pO);
                new Handler(mContext.getMainLooper()).post(() -> pAuthUserCallback.onAuthorize()
                );

            }
        }.execute(null, null, null);

    }

}
