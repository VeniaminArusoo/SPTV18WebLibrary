/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sptv18school;

import entity.Journal;
import entity.Teacher;
import entity.Student;
import entity.SaverToFile;
import entity.Subject;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import provider.ProviderJournal;
import provider.ProviderStudent;
import provider.ProviderSubject;
import provider.ProviderTeacher;
/**
 *
 * @author user
 */
public class SPTV18school {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                 
    }

   
    public class School{
        List<Student> students= new ArrayList<>();
         List<Teacher> teachers= new ArrayList();
       
        List<Journal> journals= new ArrayList<>();
        SaverToFile  saverToFile;
        public School() {
        saverToFile = new SaverToFile();
        students.addAll(saverToFile.loadStudent());
        teachers.addAll(saverToFile.loadTeacher());
        }
        public void run(){
            System.out.println("---Модель школы---");
            boolean repeat = true;
            do{
            System.out.println("Список задач:");
            System.out.println("0. Выйти из программы");
            System.out.println("1. Добавить нового ученика");
            System.out.println("2. Добавить нового учителя");
            System.out.println("3. Вывести список учеников");
            System.out.println("4. Вывести список учителей");
            System.out.println("5. Добавить новый предмет");
            System.out.println("6. Вывести список предметов");
            System.out.println("7. Вывести оценкку  по предмету ученику");
            System.out.println("8. Исправить оценку");
            System.out.println("9. Вывести учеников и их оценки по предмету для учителя");
            
            Scanner scanner = new Scanner(System.in);
            int task = scanner.nextInt(); scanner.nextLine();
            switch (task) {
                case 1:
ProviderStudent providerStudent=new ProviderStudent();
Student person=providerStudent.createStudent();
students.add(person);
saverToFile.saveStudent(students);
System.out.println("Добавлен ученик: "+person.toString());
break;
case 2:
ProviderTeacher providerTeacher = new ProviderTeacher();
Teacher teacher = providerTeacher.createTeacher();
teachers.add(teacher);
saverToFile.saveTeacher(teachers);
System.out.println("Добавлен учитель: ");
System.out.println(teacher.toString());
break;
case 3:
ProviderSubject providerSubject = new ProviderSubject();
Subject subject = providerSubject.createSubject();
subjects.add(subject);
saverToFile.saveSubject(subjects);
System.out.println("Добавлен предмет: ");
System.out.println(subject.toString());
break;
case 4:
System.out.println("Список учеников: ");
for (int i = 0; i < persons.size(); i++) {
person = persons.get(i);
System.out.println(i + 1 + ". " + person.toString());
}
break;
case 5:
System.out.println("Список учителей: ");
for (int i = 0; i < teachers.size(); i++) {
teacher = teachers.get(i);
System.out.println(i + 1 + ". " + teacher.toString());
}
break;
case 6:
System.out.println("Список предметов: ");
for (int i = 0; i < subjects.size(); i++) {
subject = subjects.get(i);
System.out.println(i + 1 + ". " + subject.toString());
}
break;
case 7:
ProviderHistory providerHistory = new ProviderHistory();
History history = providerHistory.createHistory(teachers,students,subjects,ratings);
histories.add(history);
saverToFile.saveHistories(histories);
System.out.println("Выполнено");
System.out.println(history.toString());
break;
case 8:
System.out.println("Полный список");
for(int i = 0;i< histories.size(); i++){
history =histories.get(i);
System.out.println(i+1+"."+ history.toString());
}
}
}while(repeat);
}
}