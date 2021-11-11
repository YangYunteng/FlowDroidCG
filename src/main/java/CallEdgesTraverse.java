import java.io.File;
import java.util.HashMap;
import java.util.Map;
import java.util.Vector;

public class CallEdgesTraverse {
    private static final String androidJar = BuildConfig.ANDROID_JAR;
    private static final String apkPath = BuildConfig.APK_PATH;

    private static final String outPath = "./result/log.txt";
    public static final String SensitiveApiPath = "";
    static Object ob = new Object();

    private static Map<String, Boolean> visited = new HashMap<>();
    private static Vector<String> fileVec = new Vector<>();
    private static Vector<String> sensitiveApi = new Vector<>();

    public static void getFile(String appDirPath) {
        File file = new File(appDirPath);
        File[] files = file.listFiles();
        for(int i=0;i<files)
    }
}
