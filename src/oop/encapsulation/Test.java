package oop.encapsulation;

public class Test {
    public static void main(String[] args) {
        Student student=new Student();
        student.setStName("s1");
        System.out.println(student.getStName());

        student.setStAddress("Queens");
        System.out.println(student.getStAddress());

        student.setStage(20);
        System.out.println(student.getStage());

        student.setStnumber(1000);
        System.out.println(student.getStnumber());


    }



}
