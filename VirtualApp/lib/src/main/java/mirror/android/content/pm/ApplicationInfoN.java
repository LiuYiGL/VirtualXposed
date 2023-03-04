package mirror.android.content.pm;

import android.content.pm.ApplicationInfo;
import android.content.pm.SharedLibraryInfo;
import android.os.Build;

import java.util.List;

import mirror.ApiRequest;
import mirror.RefClass;
import mirror.RefObject;

public class ApplicationInfoN {
    public static Class<?> TYPE = RefClass.load(ApplicationInfoN.class, ApplicationInfo.class);
    public static RefObject<String> deviceProtectedDataDir;
    @ApiRequest(allVersion = false, except = {Build.VERSION_CODES.TIRAMISU})
    public static RefObject<String> deviceEncryptedDataDir;
    public static RefObject<String> credentialProtectedDataDir;
    @ApiRequest(allVersion = false, except = {Build.VERSION_CODES.TIRAMISU})
    public static RefObject<String> credentialEncryptedDataDir;
    public static RefObject<List<SharedLibraryInfo>> sharedLibraryInfos;
}
