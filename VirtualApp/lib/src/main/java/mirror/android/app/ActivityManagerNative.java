package mirror.android.app;


import android.os.Build;
import android.os.IInterface;

import mirror.ApiRequest;
import mirror.RefClass;
import mirror.RefStaticObject;
import mirror.RefStaticMethod;

public class ActivityManagerNative {
    public static Class<?> TYPE = RefClass.load(ActivityManagerNative.class, "android.app.ActivityManagerNative");
    @ApiRequest(allVersion = false, except = {Build.VERSION_CODES.TIRAMISU})
    public static RefStaticObject<Object> gDefault;
    public static RefStaticMethod<IInterface> getDefault;
}
