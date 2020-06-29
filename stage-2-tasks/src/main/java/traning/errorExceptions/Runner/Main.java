package traning.errorExceptions.Runner;

import traning.errorExceptions.Essenses.Mark;
import traning.errorExceptions.Essenses.Student;
import traning.errorExceptions.Exceptions.*;
import traning.errorExceptions.Service.Service;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        //Иерархия следующая:
        // факультет №1 включает в себя группы №1 и №2;
        // факультет №2 включает в себя группы №3 и №4;
        // факультет №3 включает в себя группы №5 и №6;

        // в группе №1 изучаются предметы №1,2,3,4;
        // в группе №2 изучаются предметы №1,2,3,5;
        // в группе №3 изучаются предметы №1,2,3,6;
        // в группе №4 изучаются предметы №2,3,4,5;
        // в группе №5 изучаются предметы №3,4,5,6;
        // в группе №6 изучаются предметы №1,3,4,5;

        //по каждому предмету студент получает по 3 оценки;

        //в каждой группе по одному студенту (для меньшей громоздкости);

        ArrayList<Mark> marks1 = new ArrayList<Mark>();
        marks1.add(new Mark(1, 2));
        marks1.add(new Mark(1, 2));
        marks1.add(new Mark(1, 2));
        marks1.add(new Mark(2, 10));
        marks1.add(new Mark(2, 7));
        marks1.add(new Mark(2, 4));
        marks1.add(new Mark(3, 3));
        marks1.add(new Mark(3, 7));
        marks1.add(new Mark(3, 6));
        marks1.add(new Mark(4, 6));
        marks1.add(new Mark(4, 6));
        marks1.add(new Mark(4, 6));

        ArrayList<Mark> marks2 = new ArrayList<Mark>();
        marks2.add(new Mark(1, 10));
        marks2.add(new Mark(1, 2));
        marks2.add(new Mark(1, 2));
        marks2.add(new Mark(2, 2));
        marks2.add(new Mark(2, 2));
        marks2.add(new Mark(2, 2));
        marks2.add(new Mark(3, 2));
        marks2.add(new Mark(3, 2));
        marks2.add(new Mark(3, 2));
        marks2.add(new Mark(5, 7));
        marks2.add(new Mark(5, 7));
        marks2.add(new Mark(5, 7));

        ArrayList<Mark> marks3 = new ArrayList<Mark>();
        marks3.add(new Mark(1, 2));
        marks3.add(new Mark(1, 2));
        marks3.add(new Mark(1, 2));
        marks3.add(new Mark(2, 10));
        marks3.add(new Mark(2, 10));
        marks3.add(new Mark(2, 10));
        marks3.add(new Mark(3, 10));
        marks3.add(new Mark(3, 10));
        marks3.add(new Mark(3, 10));
        marks3.add(new Mark(6, 10));
        marks3.add(new Mark(6, 10));
        marks3.add(new Mark(6, 10));

        ArrayList<Mark> marks4 = new ArrayList<Mark>();
        marks4.add(new Mark(2, 10));
        marks4.add(new Mark(2, 10));
        marks4.add(new Mark(2, 10));
        marks4.add(new Mark(3, 10));
        marks4.add(new Mark(3, 10));
        marks4.add(new Mark(3, 10));
        marks4.add(new Mark(4, 10));
        marks4.add(new Mark(4, 10));
        marks4.add(new Mark(4, 10));
        marks4.add(new Mark(5, 7));
        marks4.add(new Mark(5, 7));
        marks4.add(new Mark(5, 7));

        ArrayList<Mark> marks5 = new ArrayList<Mark>();
        marks5.add(new Mark(3, 10));
        marks5.add(new Mark(3, 10));
        marks5.add(new Mark(3, 10));
        marks5.add(new Mark(4, 10));
        marks5.add(new Mark(4, 10));
        marks5.add(new Mark(4, 10));
        marks5.add(new Mark(5, 7));
        marks5.add(new Mark(5, 7));
        marks5.add(new Mark(5, 7));
        marks5.add(new Mark(6, 10));
        marks5.add(new Mark(6, 10));
        marks5.add(new Mark(6, 10));

        ArrayList<Mark> marks6 = new ArrayList<Mark>();
        marks6.add(new Mark(1, 1));
        marks6.add(new Mark(1, 1));
        marks6.add(new Mark(1, 1));
        marks6.add(new Mark(3, 1));
        marks6.add(new Mark(3, 1));
        marks6.add(new Mark(3, 1));
        marks6.add(new Mark(4, 1));
        marks6.add(new Mark(4, 1));
        marks6.add(new Mark(4, 1));
        marks6.add(new Mark(5, 7));
        marks6.add(new Mark(5, 7));
        marks6.add(new Mark(5, 7));

        ArrayList<Student> students = new ArrayList<Student>();
        students.add(new Student(1,1,1, marks1));
        students.add(new Student(2,1,2, marks2));
        students.add(new Student(3,2,3, marks3));
        students.add(new Student(4,2,4, marks4));
        students.add(new Student(5,3,5, marks5));
        students.add(new Student(6,3,6, marks6));

        Service service = new Service();
        double result1 = 0;
        double result2 = 0;
        double result3 = 0;

        //Посчитать средний балл по всем предметам студента
        try {
            result1 = service.GetAverageMarkByStudentId(1,students);
        } catch (MarkException e) {
            e.printStackTrace();
        } catch (StudentException e) {
            e.printStackTrace();
        } catch (GroupException e) {
            e.printStackTrace();
        } catch (FacultyException e) {
            e.printStackTrace();
        } catch (CourseException e) {
            e.printStackTrace();
        }

        //Посчитать средний балл по предмету для всего университета
        try {
            result2 = service.GetAverageMarkByCourseId(5,students);
        } catch (MarkException e) {
            e.printStackTrace();
        } catch (StudentException e) {
            e.printStackTrace();
        } catch (CourseException e) {
            e.printStackTrace();
        } catch (GroupException e) {
            e.printStackTrace();
        } catch (FacultyException e) {
            e.printStackTrace();
        }

        //Посчитать средний балл по конкретному предмету в конкретной группе и на конкретном факультете
        try {
            result3 = service.GetAverageMarkByCourseIdGroupIdFacultyId(1,1,1, students);
        } catch (MarkException e) {
            e.printStackTrace();
        } catch (StudentException e) {
            e.printStackTrace();
        } catch (GroupException e) {
            e.printStackTrace();
        } catch (FacultyByGroupException e) {
            e.printStackTrace();
        } catch (StudentByCourseException e) {
            e.printStackTrace();
        } catch (FacultyException e) {
            e.printStackTrace();
        } catch (CourseException e) {
            e.printStackTrace();
        }
        System.out.println(result1 + "\n" + result2 + "\n" + result3);
    }
}
