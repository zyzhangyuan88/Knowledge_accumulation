package study.hz.com.accumulation.app;

import java.io.File;

/**
 *
 * Created by Alex on 2016/11/2.
 */

public class Constants {
    //================= PATH ====================
    public static final String PATH_DATA = App.getInstance().getCacheDir().getAbsolutePath() + File.separator + "data";
    public static final String PATH_CACHE = PATH_DATA + File.separator + "NetCache";

    public static final String PRIMARYCOLOR = "PRIMARYCOLOR";
    public static final String TITLECOLOR = "TITLECOLOR";
    public static final String DISCOVERlASTpAGE = "DISCOVERlASTpAGE";
}
