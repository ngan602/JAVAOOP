package BAITAPOOP.BAITAP2.Company;
//+ Tạo class "Company" để gọi lại thông tin từ class Person: name, age, gender.
// Solve: Phải có 1 constructor voi 3 tham so duoc yeu cau
// Còn lại các thông tin khác không được hiển thị ra.


import BAITAPOOP.BAITAP2.Person.Person;

public class Company {
    public static void main(String[] args) {
        Person person1 = new Person("Karen", "45", "Female");
        System.out.println("Thông tin nhân viên ID 12345 trong Company");
        System.out.println("Name: "+ person1.getName());
        System.out.println("Age: "+ person1.getAge());
        System.out.println("Gender: "+ person1.getGender());
    }
}



//
//Person person = new Person(String name, String age, String gender);//
//FAUX: ❌ Sai: Trong Java, khi tạo đối tượng,
// bạn không khai báo lại kiểu dữ liệu (String, int...) bên trong new.

//❌ Sai: Getter không nhận tham số. Getter chỉ trả về giá trị đã lưu trong đối tượng.
//        System.out.println("Thông tin nhân viên trong Company");
//        System.out.println("Name: "+ person.getName("Karen"));
//        System.out.println("Age: "+ person.getAge("45"));
//        System.out.println("Gender: "+ person.getName("Female));