import soot.*;
import soot.jimple.*;

public class AndroidCallGraph {
    private static final String androidJar = BuildConfig.ANDROID_JAR;
    private static final String apkPath = BuildConfig.APK_PATH;
    private static final String outputPath = "./output";
    private static final String classPath = "com.caremark.caremark.LauncherActivity";

    public static void main(String[] args) {
        System.out.println(androidJar);
        InstrumentUtil.setupSoot(androidJar, apkPath, outputPath);
        SootClass sootClass = Scene.v().getSootClass(classPath);
        SootMethod sm = sootClass.getMethodByName("validateforRooted");
        JimpleBody jimpleBody = (JimpleBody) sm.getActiveBody();
        for (Unit unit : jimpleBody.getUnits()) {
            Stmt stmt = (Stmt) unit;
            if (stmt instanceof NopStmt)
                System.out.println("<NopStmt");
            if (stmt instanceof IdentityStmt)
                System.out.println("<IdentityStmt>");
            if (stmt instanceof AssignStmt)
                System.out.println("<AssignStmt>");
            if (stmt instanceof TableSwitchStmt)
                System.out.println("<TableSwitchStmt>");
            if (stmt instanceof LookupSwitchStmt)
                System.out.println("<LookupSwitchStmt>");
            if (stmt instanceof InvokeStmt)
                System.out.println("<InvokeStmt>");
            if (stmt instanceof ReturnStmt)
                System.out.println("<ReturnStmt>");
            if (stmt instanceof ReturnVoidStmt)
                System.out.println("<ReturnVoidStmt>");
            if (stmt instanceof EnterMonitorStmt)
                System.out.println("<EnterMonitorStmt>");
            if (stmt instanceof ExitMonitorStmt)
                System.out.println("<ExitMonitorStmt>");
            if (stmt instanceof ThrowStmt)
                System.out.println("<ThrowStmt>");
            if (stmt instanceof RetStmt)
                System.out.println("<RetStmt>");
            System.out.println(unit);
        }
//        System.out.println(unit);
//        PackManager.v().writeOutput();
    }
}
