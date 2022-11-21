package javaproj12;

import java.io.Serializable;

public class Graduate extends Student implements Serializable {
    private String hakwi, zungong;


    public Graduate(String hakbun, String name, String hakgua, int age, String hakwi, String zungong) {
        super(hakbun, name, hakgua, age);
        this.hakwi = hakwi;
        this.zungong = zungong;
    }

    public String toString() {
        return String.format("%s,%s,%s",
                super.toString().replace("class:student", "class:Graduate"), hakwi, zungong);
    }
}
