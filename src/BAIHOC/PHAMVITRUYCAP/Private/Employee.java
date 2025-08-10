package BAIHOC.PHAMVITRUYCAP.Private;

public class Employee {

    String companyName = "F entreprise";

    public static void main(String[] args) {
        PRIVATE privateinfo = new PRIVATE();
        privateinfo.getInfo(); //Lấy duoc ham này do nó là public
//        privateinfo.getAdress(); //Khoong lấy được do là private, chỉ trích xuất đuoc cùng class

    }
}
