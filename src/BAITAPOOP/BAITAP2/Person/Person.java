package BAITAPOOP.BAITAP2.Person;

//- Tại package "person" :
//        + Tạo class "Person" với các thông tin: name, age, gender, address, phone
//	+ Hàm xây dựng và hàm get tương ứng để giải quyết bài toán theo yêu cầu
//	+ Tạo class "Information" để gọi lại tất cả các thông tin từ class Person


public class Person {
        private String name ;
        private String age;
        private String gender;
        private String address;
        private String phone;

    public Person(String name, String age, String gender, String address, String phone) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.address = address;
        this.phone = phone;
    }

    public Person(String name, String age, String gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
    }

    public String getName() {
        return name;
    }

    public String getAge() {
        return age;
    }

    public String getGender() {
        return gender;
    }

    public String getAddress() {
        return address;
    }

    public String getPhone() {
        return phone;
    }
}


