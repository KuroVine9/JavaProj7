package javaproj12;

import java.io.Serializable;

public class Student implements Serializable {
    private String hakbun, name, hakgya;
    private int age;

    public Student(String hakbun, String name, String hakgua, int age) {
        this.hakbun = hakbun;
        this.name = name;
        this.hakgya = hakgua;
        this.age = age;
    }

    public String toString() {
        return String.format("class:student,%s,%s,%s,%d", hakbun, name, hakgya, age);
    }
}
