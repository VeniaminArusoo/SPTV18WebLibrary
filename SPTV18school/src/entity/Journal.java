/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entity;

import entity.Student;
import entity.Teacher;


/**
 *
 * @author user
 */
public class Journal{
    private Student student;
    private Teacher teacher;

    public Journal() {
    }

    public Journal(Student student, Teacher teacher) {
        this.student = student;
        this.teacher = teacher;
    }

    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }

    public Teacher getTeacher() {
        return teacher;
    }

    public void setTeacher(Teacher teacher) {
        this.teacher = teacher;
    }

    @Override
    public String toString() {
        return "Journal{" + "student=" + student + ", teacher=" + teacher + '}';
    }
    

}