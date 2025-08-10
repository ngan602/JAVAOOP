package BAITAPOOP.BAITAP2.Person;

public class Information {

    public static void main(String[] args) {
        //Khởi tạo lại class Person
        Person person = new Person("Nguyễn Văn A", "20","Male","Hanoi","09091234567");
        System.out.println("Personal info");
        System.out.println("Name: "+ person.getName());
        System.out.println("Adresse: "+ person.getAddress());
        System.out.println("Age: " +person.getAge());
        System.out.println("Gender: " +person.getGender());
        System.out.println("Phone: " +person.getPhone());



    }
}
