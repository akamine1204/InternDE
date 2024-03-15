package Tuan3_3_json;

import Tuan2_3_Serialization.Student;
import com.google.gson.Gson;

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


public class jsonDemo {
    public static void main(String args[]) throws IOException, ClassNotFoundException {
        ArrayList<Student> listStudent = new ArrayList<>();
        listStudent.add(new Student("Tran Duc Hoang",23));
        listStudent.add(new Student("Ngo Minh Dat",22));
        listStudent.add(new Student("Tran Trung Dung",21));
        listStudent.add(new Student("Nguyen Phuong Anh",24));

        //parse listStudent -> json
        Gson gson = new Gson();
        String json = gson.toJson(listStudent);

        //serialize json vào file storage.txt
        FileOutputStream fileOut = new FileOutputStream("/Users/akamine/IdeaProjects/Intern_JavaCore/InternDE/src/main/java/Tuan3_3_json/storage.txt");
        ObjectOutputStream oos = new ObjectOutputStream(fileOut);
        oos.writeObject(json);
        fileOut.close();
        oos.close();


        //deserialize tu file Storage.txt
        FileInputStream fileIn = new FileInputStream("/Users/akamine/IdeaProjects/Intern_JavaCore/InternDE/src/main/java/Tuan3_3_json/storage.txt");
        ObjectInputStream ois = new ObjectInputStream(fileIn);

        String textToJson;
        textToJson = (String) ois.readObject();

        System.out.println(" Du lieu json trong file storage.txt:  "+textToJson);

        //parse json -> listObject
        Gson gson1 = new Gson();
        List<Student> listStudent1 = new ArrayList<>();
        Student[] arrayStudent = gson.fromJson(textToJson,Student[].class);
        for(Student s : arrayStudent){
           listStudent1.add(s);
        }

        for(Student s : listStudent1){
            s.printStudent();
        }
    }
}
