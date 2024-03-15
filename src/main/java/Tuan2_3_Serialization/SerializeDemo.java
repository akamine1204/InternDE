package Tuan2_3_Serialization;

import java.io.*;
import java.util.ArrayList;

public class SerializeDemo {
    public static  void main(String args[]) throws IOException, ClassNotFoundException {
        ArrayList<Student> listStudent = new ArrayList<>();
        listStudent.add(new Student("Trần Đức Hoàng",23));
        listStudent.add(new Student("Ngô Minh Đạt",22));
        listStudent.add(new Student("Trần Trung Dũng",21));
        listStudent.add(new Student("Nguyễn Phương Anh",24));

        //serialize listStudent
        FileOutputStream fileOut = new FileOutputStream("/Users/akamine/IdeaProjects/Intern_JavaCore/src/Serialization/Storage.txt");
        ObjectOutputStream oos = new ObjectOutputStream(fileOut);
        oos.writeObject(listStudent);
        fileOut.close();
        oos.close();


        //deserialize tu file Storage.txt
        FileInputStream fileIn = new FileInputStream("/Users/akamine/IdeaProjects/Intern_JavaCore/src/Serialization/Storage.txt");
        ObjectInputStream ois = new ObjectInputStream(fileIn);

        ArrayList<Student> dsStudent = new ArrayList<>();
        dsStudent = (ArrayList<Student>) ois.readObject();

        for(Student s : dsStudent){
            s.printStudent();
        }
    }
}
