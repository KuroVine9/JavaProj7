package javaproj12;

import java.io.Serializable;

public class UnderGraduate extends Student implements Serializable {
    private String dongari;

    public UnderGraduate(String hakbun, String name, String hakgua, int age, String dongari) {
        super(hakbun, name, hakgua, age);
        this.dongari = dongari;
    }

    public String toString() {
        return String.format("%s,%s",
                super.toString().replace("class:student", "class:UnderGraduate"), dongari);
    }
}
