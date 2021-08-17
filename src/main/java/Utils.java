import soot.jimple.infoflow.InfoflowConfiguration;
import soot.jimple.infoflow.android.InfoflowAndroidConfiguration;

public class Utils {
    public static InfoflowAndroidConfiguration getFlowDroidConfig(String apkPath, String androidPlatform) {
        //Android 所有配置项，可能需要参考 Steven Arzt的博士毕业论文
        
        final InfoflowAndroidConfiguration androidConfig = new InfoflowAndroidConfiguration();
        androidConfig.setAliasingAlgorithm();
        androidConfig.setCallgraphAlgorithm();
        androidConfig.setCodeEliminationMode();
        androidConfig.setDataFlowTimeout();
        androidConfig.setEnableArraySizeTainting();
        androidConfig.setEnableArrayTracking();
        androidConfig.setEnableExceptionTracking();
        androidConfig.setEnableLineNumbers();
        androidConfig.setEnableOriginalNames();
        androidConfig.setEnableReflection();
        androidConfig.setEnableTypeChecking();
        androidConfig.setExcludeSootLibraryClasses();
        androidConfig.setFlowSensitiveAliasing();
        androidConfig.setIgnoreFlowsInSystemPackages();
        androidConfig.setImplicitFlowMode();
        androidConfig.setIncrementalResultReporting();
        androidConfig.setInspectSinks();
        androidConfig.setInspectSources();
        androidConfig.setLogSourcesAndSinks();
        androidConfig.setMaxThreadNum();
        androidConfig.setMemoryThreshold();
        androidConfig.setMergeDexFiles();
        androidConfig.setOneComponentAtATime();
        androidConfig.setOneSourceAtATime();
        androidConfig.setSootIntegrationMode();
        androidConfig.setStaticFieldTrackingMode();
        androidConfig.setStopAfterFirstFlow();
        androidConfig.setStopAfterFirstKFlows();
        androidConfig.setTaintAnalysisEnabled();
        androidConfig.setWriteOutputFiles();
        return androidConfig;
    }
}
