package oop.encapsulation;

public class Student {
    private int stnumber;
    private String stName;
    private String stAddress;
    public int stage;

    public Student() {
    }

    public Student(int stnumber, String stName, String stAddress, int stage) {
        this.stnumber = stnumber;
        this.stName = stName;
        this.stAddress = stAddress;
        this.stage = stage;
    }

    public int getStnumber() {
        return stnumber;
    }

    public void setStnumber(int stnumber) {
        this.stnumber = stnumber;
    }

    public String getStName() {
        return stName;
    }

    public void setStName(String stName) {
        this.stName = stName;
    }

    public String getStAddress() {
        return stAddress;
    }

    public void setStAddress(String stAddress) {
        this.stAddress = stAddress;
    }

    public int getStage() {
        return stage;
    }

    public void setStage(int stage) {
        this.stage = stage;
    }
}
