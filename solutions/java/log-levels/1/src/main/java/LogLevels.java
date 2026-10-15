public class LogLevels {
    
    public static String message(String logLine) {
        String[] arr = logLine.split(":");
        return arr[1].trim() ;
    }

    public static String logLevel(String logLine) {
        String[] arr = logLine.split(":");
        return arr[0].replace('[', ' ').replace(']', ' ').trim().toLowerCase();
    }

    public static String reformat(String logLine) {
        String[] arr = logLine.split(":");
        String s2 = arr[0].replace('[', '(').replace(']', ')').toLowerCase();
        String s1 =  arr[1].trim();
        return s1.concat(" ").concat(s2);
    }
}
