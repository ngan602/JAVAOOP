package BAIHOC.PHAMVITRUYCAP.Private;

public class PRIVATE {
        //Biến adress
        private String adress = "123 NVT Street";
        private String age = "20 yo";


        //Hàm lấy lại được các biêến private do cùng 1 class
    public void getInfo() {
        System.out.println(adress);
        System.out.println(age);
    }
    private void getAdress(){
        System.out.println(adress);
    }

    public static void main(String[] args) {
        PRIVATE newPrivate = new PRIVATE();
        newPrivate.getInfo();
        newPrivate.getAdress(); //In được do chung 1 class PRIVATE
    }


}
