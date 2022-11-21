package javaproj12;

import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

public class main {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        ArrayList<Student> students = new ArrayList<>();
        students.add(new UnderGraduate("100", "Lee", "사물인터넷", 21, "테니스"));
        students.add(new UnderGraduate("101", "Kim", "지능시스템", 21, "요가"));
        students.add(new UnderGraduate("102", "Park", "사이버보안", 24, "댄스"));
        students.add(new UnderGraduate("103", "Kim", "ICT융합엔터테인먼트", 21, "야구"));
        students.add(new Graduate("G100", "Jung", "정보시스템", 26, "석사", "인공지능"));
        students.add(new Graduate("G101", "Lee", "정보시스템", 26, "석사", "보안"));
        students.add(new Graduate("G200", "Han", "정보컴퓨터공학", 28, "박사", "임베디드시스템"));

        saveDataToFile(students, "src/javaproj12/data/output.txt");
        // System.out.println(loadDataFromFile("src/javaproj12/data/output.txt"));
        ArrayList<Student> output = loadDataFromFile("src/javaproj12/data/output.txt");
        for (var data : output) System.out.println(data);

        saveObjectToFile(students, "src/javaproj12/data/output.dat");
        // System.out.println(loadObjectFromFile("src/javaproj12/data/output.dat"));
        ArrayList<Student> output_obj = loadObjectFromFile("src/javaproj12/data/output.dat");
        for (var data : output_obj) System.out.println(data);

    }

    public static Student toStudent(String data) {
        Scanner scan = new Scanner(data).useDelimiter("\\s*,\\s*");
        scan.next();
        if (data.contains("class:Student")) {
            return (new Student(scan.next(), scan.next(), scan.next(), Integer.parseInt(scan.next())));
        }
        else if (data.contains("class:UnderGraduate")) {
            return (new UnderGraduate(scan.next(), scan.next(), scan.next(), Integer.parseInt(scan.next()), scan.next()));
        }
        else if (data.contains("class:Graduate")) {
            return (new Graduate(scan.next(), scan.next(), scan.next(), Integer.parseInt(scan.next()), scan.next(), scan.next()));
        }
        else {
            System.out.println("Convert Err");
            return null;
        }
    }

    public static void saveDataToFile(ArrayList<Student> students, String fileName) throws IOException {
        PrintWriter ostream = new PrintWriter(new FileWriter(fileName));
        for (var data : students) {
            ostream.println(data.toString());
        }
        ostream.close();
    }

    public static ArrayList<Student> loadDataFromFile(String fileName) throws IOException {
        ArrayList<Student> studentList = new ArrayList<>();
        BufferedReader istream = null;
        istream = new BufferedReader(new FileReader("src/javaproj12/data/output.txt"));
        String line;
        while ((line = istream.readLine()) != null) {
            studentList.add(toStudent(line));
        }
        istream.close();
        return studentList;
    }

    public static void saveObjectToFile(ArrayList<Student> students, String fileName) throws IOException {
        ObjectOutputStream ostream = null;
        ostream = new ObjectOutputStream(new FileOutputStream(fileName));
        for (var data : students) {
            ostream.writeObject(data);
        }
        ostream.writeObject(null);  //EOF 판별용 null obj
        if (ostream != null) ostream.close();
    }

    public static ArrayList<Student> loadObjectFromFile(String fileName) throws IOException, ClassNotFoundException {
        ArrayList<Student> studentList = new ArrayList<>();
        ObjectInputStream istream = null;
        istream = new ObjectInputStream(new FileInputStream(fileName));
        Student s;
        while ((s = (Student) istream.readObject()) != null) {
            studentList.add(s);
        }
        if (istream != null) istream.close();
        return studentList;
    }
}
