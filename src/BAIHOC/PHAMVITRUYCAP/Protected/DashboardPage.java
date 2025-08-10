package BAIHOC.PHAMVITRUYCAP.Protected;

import BAIHOC.PHAMVITRUYCAP.COMMON.BasePage;

// class dashboard sẽ kế thừa class Basepage
public class DashboardPage extends BasePage {
    public void getDrive(){
        System.out.println(driver); //In được driver vì class dashboard kế thừa class basepage
    }

    public static void main(String[] args) {
        loginPage Loginpage= new loginPage();
        System.out.println(Loginpage.buttonLogin);
        System.out.println(Loginpage.inputEmail);

        System.out.println("____________");

        //Do đã thừa kế nên mới có thể lấy được driver trong Basepage
        DashboardPage dashboardpage = new DashboardPage();
        dashboardpage.getDrive(); //Vì trong getDrive() đã có sẵn System.out.println(driver); rồi -> gọi trực tiếp

        //System.out.println(dashboardpage.getDrive(); //ko thể in ra gì vì nó là hàm
        BasePage basepage = new BasePage();

        //System.out.println(basepage.driver); // java: driver has protected access in BAIHOC.PHAMVITRUYCAP.COMMON.BasePage (
        //(ko cùng package)
    }


}








//public class DashboardPage extends BasePage{
//
//    public void getDriver(){
//        System.out.println(driver);
//    }
//
//    public static void main(String[] args) {
//
//        LoginPage loginPage = new LoginPage();
//
//        System.out.println(loginPage.inputEmail);
//        System.out.println(loginPage.inputPassword);
//
//        BasePage basePage = new BasePage();
//        //System.out.println(basePage.driver); //Không được bởi vì khác package
//    }
//}