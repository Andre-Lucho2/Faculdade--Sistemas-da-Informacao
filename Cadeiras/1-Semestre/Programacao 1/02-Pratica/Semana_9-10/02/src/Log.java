/*
 * Log.i(TAG,"This is an info message");
 * Log.e(TAG,"This is an error message");
 * Log.w(TAG,"This is a warning message");
 * Log.d(TAG,"This is a debug message");
 * 
 * NÃO ALTERARRR
 */

public class Log {

    public static final String ANSI_RESET = "\u001B[0m";
    public static final String ANSI_BLACK = "\u001B[30m";
    public static final String ANSI_RED = "\u001B[31m";
    public static final String ANSI_GREEN = "\u001B[32m";
    public static final String ANSI_YELLOW = "\u001B[33m";
    public static final String ANSI_BLUE = "\u001B[34m";
    public static final String ANSI_PURPLE = "\u001B[35m";
    public static final String ANSI_CYAN = "\u001B[36m";
    public static final String ANSI_WHITE = "\u001B[37m";

    public static void printYellow(String className, String message) {
        System.out.println(ANSI_YELLOW + className + " : " + message + ANSI_RESET);
    }

    public static void printBlue(String className, String message) {
        System.out.println(ANSI_BLUE + className + " : " + message + ANSI_RESET);
    }

    public static void printCYAN(String className, String message) {
        System.out.println(ANSI_CYAN + className + " : " + message + ANSI_RESET);
    }

    public static void printRED(String className, String message) {
        System.out.println(ANSI_RED + className + " : " + message + ANSI_RESET);
    }

    public static void reset() {
        System.out.println(ANSI_RESET);
    }

}
