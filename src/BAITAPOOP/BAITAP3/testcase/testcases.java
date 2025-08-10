package BAITAPOOP.BAITAP3.testcase;
//- Hàm createDriver hiển thị thông tin: Browser, Report, Headless
//- Hàm closeDriver hiển thị thông tin "Closed browser: " + browser và truyền Browser vào
//- 2 hàm TC từ class TestCases sẽ kế thừa lại class BaseTest và mỗi TC phải có thông tin createDriver và closeDriver
//- Hàm TC tự viết các step theo ý mình tự nghiên cứu không cần hỏi lại. Dạng step in ra System.out.println("step...")
//+ Hàm xây dựng và hàm get/set tương ứng để giải quyết bài toán theo yêu cầu (nếu có)



import BAITAPOOP.BAITAP3.common.BaseTest;
import BAITAPOOP.BAITAP3.common.Constants;

public class testcases extends BaseTest {
        private String loginPage ="https://cms.anhtester.com/login";
        private String userName = "admin@example.com";
        private String pass = "123456";


    public void Testcase1_login(){
        super.createDriver();

        System.out.println("Step1: Login to page" + loginPage);
        System.out.println("Step2: Enter username" + userName);
        System.out.println("Step3: Enter password" + pass);
        System.out.println("Step 4: Click on login button");

        super.closeDriver(Constants.getBrowser());
        }

    public void Testcase2_addnewCategorie(){
         super.createDriver();

        System.out.println("Step 1: access to categories section");
        System.out.println("Step 2: click on Add new category");
        System.out.println("Step 3: enter name of category");
        System.out.println("Step 4: click on Save");
        super.closeDriver(Constants.getBrowser());
        }

    public static void main(String[] args) {
        testcases Testcase = new testcases();
//        System.out.println(Testcase.Testcase1_login()); //không thể in hàm được
        Testcase.Testcase1_login();
        System.out.println();
        Testcase.Testcase2_addnewCategorie();
        System.out.println();
    }

}
