package com.example.daniel_shon_studenapp.Model;

import java.util.LinkedList;
import java.util.List;


public class Model {

    private static Model instance = null;

    public static Model getModel(){
        if(instance == null){
            instance = new Model();
        }
        return  instance;
    }

    private Model(){
        for(int i=0;i<10;i++){
            addStudent(new Student("Student " + i,"id "+i,"phone +972 "+i,"address "+i, "avatar", false));
        }
    }


    public void deleteStudent(int index){ // delete student at position pos
        studentList.remove(index);
    }
    List<Student> studentList = new LinkedList<>();
    public List<Student> getAllStudents(){ // return all students
        return studentList;
    }
    public void addStudent(Student st){ // add a student to the list
        studentList.add(st);
    }

}
