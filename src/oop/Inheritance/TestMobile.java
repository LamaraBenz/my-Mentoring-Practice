package oop.Inheritance;

public class TestMobile{
    public static void main(String[] args) {
        Iphone MyPhone = new Iphone();
        MyPhone.MobileBrand();
        MyPhone.IphoneScreen();
        MyPhone.IphoneStorage();

        Mobile M1 = new Iphone();
        M1.MobileBrand();
        M1.MobileOS();
        // we did the single level of inheritance
        System.out.println("******************");

        IphoneX myX = new IphoneX();
        myX.camera();
        myX.Facerecognition();

        myX.IphoneScreen();
        myX.MobileBrand(); // multi level inheritance

        IphoneXS myXS= new IphoneXS();
        myXS.Price();
        myXS.MobileOS();
        myXS.IphoneStorage(); // i did a hierarchical level




    }
}
