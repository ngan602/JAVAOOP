package BAIHOC.PHAMVITRUYCAP.Default;

import BAIHOC.PHAMVITRUYCAP.Private.PRIVATE;

public class Student {
    public static void main(String[] args) {
        School school = new School();
        school.getAuthen(); // Gọi đc do là kiểu default, cùng PACKAGE

        PRIVATE private1 = new PRIVATE();
//        PRIVATE.adress; //Không gọi đc biến adress trong class PRIVATE vì nó khác package
    }

}
