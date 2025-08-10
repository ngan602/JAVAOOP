package BAITAPOOP.BAITAP3.common;
//+ Tạo class "Constants" lưu các thông tin dạng static:
//browser (String), report (boolean), headless (boolean)

public class Constants {
    public static String browser = "Chrome";
    public static boolean report = true;
    public static boolean headless = true;

    public static String getBrowser() {
        return browser;
    }

    public static void setBrowser(String browser) {
        Constants.browser = browser;
    }

    public static boolean isReport() {
        return report;
    }

    public static void setReport(boolean report) {
        Constants.report = report;
    }

    public static boolean isHeadless() {
        return headless;
    }

    public static void setHeadless(boolean headless) {
        Constants.headless = headless;
    }
}
