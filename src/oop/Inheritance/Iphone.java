package oop.Inheritance;

public class Iphone extends Mobile{
    public String Apple;
    public String screen;
    public int Storage;

    public Iphone() {
    }

    public Iphone(String apple) {
        Apple = apple;
    }

    public Iphone(String apple, String screen) {
        Apple = apple;
        this.screen = screen;
    }

    public Iphone(String apple, String screen, int storage) {
        Apple = apple;
        this.screen = screen;
        Storage = storage;
    }
    public void MobileBrand() {
        System.out.println("my mobile brand is Iphone");

    }

    public void IphoneScreen() {
        System.out.println("my mobile screen is 6 inch");
    }
    public void IphoneStorage(){
        System.out.println("my mobile storage is 64Gb");


    }

}
