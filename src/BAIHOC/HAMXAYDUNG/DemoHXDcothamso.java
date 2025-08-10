package BAIHOC.HAMXAYDUNG;

import javax.sound.midi.Soundbank;

public class DemoHXDcothamso {
    public String lastname;
    public String firstname;
    public String marital_status;


    //Khoi tao ham xay dung -> gan tham so trong ham  vaf mapping voi variable ở trên
    public DemoHXDcothamso(String lastname, String firstname, String marital_status){
        this.lastname = lastname; //Do tham số trùng với tên biến nên điền là this
        this.firstname = firstname;
        this.marital_status= marital_status;
    }
    //Gán giá trị và in ra trong hàm main
    public static void main(String[] args) {
      //Data 1
        System.out.println("1.");
        DemoHXDcothamso demoHXDcothamso = new DemoHXDcothamso("Macron", "Brigitte","married");
        System.out.println("Fullname: " + demoHXDcothamso.firstname + " "+ demoHXDcothamso.lastname);
        System.out.println("Status: " + demoHXDcothamso.marital_status);
    //Data 2
        System.out.println("2.");
        DemoHXDcothamso demoHXDcothamso1 = new DemoHXDcothamso("Klein","Anna","Single");
        System.out.println("Fullname: " + demoHXDcothamso1.firstname + " "+ demoHXDcothamso1.lastname);
        System.out.println("Status: " + demoHXDcothamso1.marital_status);
    }
}
