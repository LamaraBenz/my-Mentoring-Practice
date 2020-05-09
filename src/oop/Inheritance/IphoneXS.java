package oop.Inheritance;

public class IphoneXS extends Iphone{
    public String price;
    public String touchID;

    public IphoneXS() {
    }

    public IphoneXS(String price) {
        this.price = price;
    }

    public IphoneXS(String price, String touchID) {
        this.price = price;
        this.touchID = touchID;
    }
    public void Price() {
        System.out.println("my iphoneXS price is");

    }

    public void TouchID() {
        System.out.println("my mobile has touch ID feature");
    }







}
