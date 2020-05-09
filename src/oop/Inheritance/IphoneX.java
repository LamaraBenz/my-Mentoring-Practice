package oop.Inheritance;

public class IphoneX extends Iphone {
    public String camera;
    public String facerecognition;

    public IphoneX() {
    }

    public IphoneX(String camera) {
        this.camera = camera;
    }

    public IphoneX(String camera, String facerecognition) {
        this.camera = camera;
        this.facerecognition = facerecognition;
    }
    public void camera() {
        System.out.println("my mobile camera is");

    }

    public void Facerecognition() {
        System.out.println("my mobile has a face recognition feature");
    }





}
