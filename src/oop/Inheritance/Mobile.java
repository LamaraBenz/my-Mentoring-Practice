package oop.Inheritance;


public class Mobile {
    public String brand;
    public String screen;


    public Mobile() {
    }

    public Mobile(String brand) {
        this.brand = brand;
    }

    public Mobile(String brand, String screen) {
        this.brand = brand;
        this.screen = screen;
    }


    public void MobileBrand() {
        System.out.println("my mobile brand is");

    }

    public void MobileScreen() {
        System.out.println("my mobile screen is");
    }

   public void MobileOS(){
       System.out.println("my mobile OPERATING SYSTEM");

   }




}