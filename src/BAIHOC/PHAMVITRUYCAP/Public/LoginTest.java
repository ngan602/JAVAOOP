package BAIHOC.PHAMVITRUYCAP.Public;

import BAIHOC.PHAMVITRUYCAP.Protected.loginPage;

//In dữ liệu của class configdata
public class LoginTest {
    public static void main(String[] args) {
        ConfigData configdata = new ConfigData();
        System.out.println(configdata.Browser);

        //trong class loginPage có các hàm public nên có thể in được dù là khác package
        loginPage loginpage = new loginPage();
        System.out.println(loginpage.buttonLogin);
    }


}





//package PhamViTruyCap.PhamViPublic;
//
//import PhamViTruyCap.PhamViProtected.LoginPage;
//
//public class LoginTest {
//    public static void main(String[] args) {
//        ConfigData configData = new ConfigData();
//        System.out.println(configData.BROWSER);
//
//        LoginPage loginPage = new LoginPage();
//        System.out.println(loginPage.buttonLogin);
//    }
//}
