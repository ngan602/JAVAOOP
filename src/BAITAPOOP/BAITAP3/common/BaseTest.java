package BAITAPOOP.BAITAP3.common;
//+ Tạo class "BaseTest" để tạo hàm createDriver và closeDriver
//- Hàm createDriver hiển thị thông tin: Browser, Report, Headless
//- Hàm closeDriver hiển thị thông tin "Closed browser: " + browser và truyền Browser vào


public class BaseTest {
    protected void createDriver(){
        System.out.println("Create Driver");
        System.out.println("Browser" + Constants.getBrowser());
        System.out.println("Report" + Constants.isReport());
        System.out.println("Headless" + Constants.isHeadless());
        System.out.println("============");

    }

    protected void closeDriver(String browser){
        System.out.println("Closed browser: " + browser); //overload
    }

    protected void closeDriver(){
        closeDriver(Constants.getBrowser()); // truyền browser từ constant
    }

}
