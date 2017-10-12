package com.github.vasiliz.rocketswheel.services.authServise;

import android.support.annotation.NonNull;

public interface AuthUserCallback {

    void handleErrorAction(@NonNull Throwable pThrowable);

    void onAuthorize();

    void onCredentialsValidate();

}
