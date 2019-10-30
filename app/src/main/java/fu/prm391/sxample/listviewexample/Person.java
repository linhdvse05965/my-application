package fu.prm391.sxample.listviewexample;

import java.io.Serializable;

public class Person implements Serializable {

    private String name;
    private String phone;
    private int imageID;

    public Person(String name, String phone, int imageID) {
        this.name = name;
        this.phone = phone;
        this.imageID = imageID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public int getImageID() {
        return imageID;
    }

    public void setImageID(int imageID) {
        this.imageID = imageID;
    }
}
