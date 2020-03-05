/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package provider;

import entity.Student;
import java.util.Scanner;

/**
 *
 * @author user
 */
public class ProviderStudent {
    public Student createBook(){
        Scanner scanner = new Scanner(System.in);
        Student student = new Student();
        System.out.println("Имя ученика");
        String fname = scanner.nextLine();
        student.setFname(fname);
        System.out.println("Фамилия ученика:");
        String lname = scanner.nextLine();
        student.setLname(lname);
        return student;
    }

    public Student createStudent() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}