package BAIHOC.HAMXAYDUNG;

public class demohamxaydungkhongthamso {

    public String name;
    public String phone;
    public String ID;
    public static String job = "Student";

    //Hàm xây dụng có tên giống class
    private demohamxaydungkhongthamso(){
        name = "Shin";
        phone = "1234567";
        ID = "0909";
    }

    public static void main(String[] args) {
        //Khởi tạo đối tượng class là nó đã chạy cái hàm xây dựng luôn
        demohamxaydungkhongthamso DemoHXD = new demohamxaydungkhongthamso();
        System.out.println(DemoHXD.name);
        System.out.println(DemoHXD.phone);
        System.out.println(DemoHXD.ID);
        System.out.println("---------------");
        demohamxaydungkhongthamso DemoHXD2 = new demohamxaydungkhongthamso();
        System.out.println(DemoHXD2.ID);
        System.out.println(DemoHXD2.name);
    }
}

