package mirror.android.app;

import android.os.Build;

import java.io.File;

import mirror.ApiRequest;
import mirror.RefClass;
import mirror.RefObject;

public class ContextImplKitkat {
    public static Class<?> TYPE = RefClass.load(ContextImplKitkat.class, "android.app.ContextImpl");
    @ApiRequest(allVersion = false, except = {Build.VERSION_CODES.TIRAMISU})
    public static RefObject<File[]> mExternalCacheDirs;
    @ApiRequest(allVersion = false, except = {Build.VERSION_CODES.TIRAMISU})
    public static RefObject<File[]> mExternalFilesDirs;
    public static RefObject<String> mOpPackageName;
}
