package Tuan2_3_Serialization;

import java.io.Serializable;

public class Student implements Serializable {
    private String name;
    private int age;

    public Student(String name, int age){
        this.name = name;
        this.age = age;
    }

    public String getName(){
        return this.name;
    }

    public int getAge(){
        return this.age;
    }

    public void setName(String name){
        this.name = name;
    }

    public void setAge(int age){
        this.age = age;
    }

    public void printStudent(){
        System.out.println("Thông tin sinh viên: - Họ tên: "+this.getName()+" - Tuổi: "+this.getAge());
    }
}
