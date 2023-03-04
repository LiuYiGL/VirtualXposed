package mirror.android.content.pm;

import android.content.pm.SigningInfo;

import mirror.MethodReflectParams;
import mirror.RefClass;
import mirror.RefConstructor;

public class SigningInfoTiramisu {
    public static Class<?> TYPE = RefClass.load(SigningInfoTiramisu.class, "android.content.pm.SigningInfo");

    @MethodReflectParams("android.content.pm.SigningDetails")
    public static RefConstructor<SigningInfo> ctor;
}
