/*В университете есть несколько факультетов, в которых учатся студенты, объединенные в группы.
У каждого студента есть несколько учебных предметов по которым он получает оценки.
Необходимо реализовать иерархию студентов, групп и факультетов.

       + Посчитать средний балл по всем предметам студента
        Посчитать средний балл по конкретному предмету в конкретной группе и на конкретном факультете
        Посчитать средний балл по предмету для всего университета

        Релизовать следующие исключения:

        Оценка ниже 0 или выше 10
        Отсутсвие предметов у студента (должен быть хотя бы один)
        Отсутствие студентов в группе
        Отсутствие групп на факультете
        Отсутствие факультетов в университете*/


package traning.errorExceptionsAnotherApproach.Runner;

import traning.errorExceptionsAnotherApproach.Administrative.*;
import traning.errorExceptionsAnotherApproach.Exceptions.*;

import java.util.*;

public class Runner {
    public static void main(String[] args) {

        // Alex marks
        ArrayList<Mark> marks_1_Alex =  new ArrayList<>();
        marks_1_Alex.add(new Mark(5));
        marks_1_Alex.add(new Mark(5));
        marks_1_Alex.add(new Mark(5));

        ArrayList<Mark> marks_2_Alex =  new ArrayList<>();
        marks_2_Alex.add(new Mark(6));
        marks_2_Alex.add(new Mark(6));
        marks_2_Alex.add(new Mark(6));

        ArrayList<Mark> marks_3_Alex =  new ArrayList<>();
        marks_3_Alex.add(new Mark(7));
        marks_3_Alex.add(new Mark(7));
        marks_3_Alex.add(new Mark(7));


        // Dmitry marks
        ArrayList<Mark> marks_1_Dmitry =  new ArrayList<>();
        marks_1_Dmitry.add(new Mark(1));
        marks_1_Dmitry.add(new Mark(1));
        marks_1_Dmitry.add(new Mark(1));

        ArrayList<Mark> marks_2_Dmitry =  new ArrayList<>();
        marks_2_Dmitry.add(new Mark(2));
        marks_2_Dmitry.add(new Mark(2));
        marks_2_Dmitry.add(new Mark(2));

        ArrayList<Mark> marks_3_Dmitry =  new ArrayList<>();
        marks_3_Dmitry.add(new Mark(3));
        marks_3_Dmitry.add(new Mark(3));
        marks_3_Dmitry.add(new Mark(3));


        // Olga marks
        ArrayList<Mark> marks_1_Olga =  new ArrayList<>();
        marks_1_Olga.add(new Mark(1));
        marks_1_Olga.add(new Mark(1));
        marks_1_Olga.add(new Mark(1));

        ArrayList<Mark> marks_2_Olga =  new ArrayList<>();
        marks_2_Olga.add(new Mark(2));
        marks_2_Olga.add(new Mark(2));
        marks_2_Olga.add(new Mark(2));

        ArrayList<Mark> marks_3_Olga =  new ArrayList<>();
        marks_3_Olga.add(new Mark(3));
        marks_3_Olga.add(new Mark(3));
        marks_3_Olga.add(new Mark(3));


        // Lena marks
        ArrayList<Mark> marks_1_Lena =  new ArrayList<>();
        marks_1_Lena.add(new Mark(1));
        marks_1_Lena.add(new Mark(1));
        marks_1_Lena.add(new Mark(1));

        ArrayList<Mark> marks_2_Lena =  new ArrayList<>();
        marks_2_Lena.add(new Mark(2));
        marks_2_Lena.add(new Mark(2));
        marks_2_Lena.add(new Mark(2));

        ArrayList<Mark> marks_3_Lena =  new ArrayList<>();
        marks_3_Lena.add(new Mark(3));
        marks_3_Lena.add(new Mark(3));
        marks_3_Lena.add(new Mark(3));


        // Tanya marks
        ArrayList<Mark> marks_1_Tanya =  new ArrayList<>();
        marks_1_Tanya.add(new Mark(1));
        marks_1_Tanya.add(new Mark(1));
        marks_1_Tanya.add(new Mark(1));

        ArrayList<Mark> marks_2_Tanya =  new ArrayList<>();
        marks_2_Tanya.add(new Mark(2));
        marks_2_Tanya.add(new Mark(2));
        marks_2_Tanya.add(new Mark(2));

        ArrayList<Mark> marks_3_Tanya =  new ArrayList<>();
        marks_3_Tanya.add(new Mark(1));
        marks_3_Tanya.add(new Mark(1));
        marks_3_Tanya.add(new Mark(1));



        // Oleg marks
        ArrayList<Mark> marks_1_Oleg =  new ArrayList<>();
        marks_1_Oleg.add(new Mark(1));
        marks_1_Oleg.add(new Mark(1));
        marks_1_Oleg.add(new Mark(1));

        ArrayList<Mark> marks_2_Oleg =  new ArrayList<>();
        marks_2_Oleg.add(new Mark(2));
        marks_2_Oleg.add(new Mark(2));
        marks_2_Oleg.add(new Mark(2));

        ArrayList<Mark> marks_3_Oleg =  new ArrayList<>();
        marks_3_Oleg.add(new Mark(9));
        marks_3_Oleg.add(new Mark(9));
        marks_3_Oleg.add(new Mark(9));

        // Evgenya marks
        ArrayList<Mark> marks_1_Evgenya =  new ArrayList<>();
        marks_1_Evgenya.add(new Mark(1));
        marks_1_Evgenya.add(new Mark(1));
        marks_1_Evgenya.add(new Mark(1));

        ArrayList<Mark> marks_2_Evgenya =  new ArrayList<>();
        marks_2_Evgenya.add(new Mark(2));
        marks_2_Evgenya.add(new Mark(2));
        marks_2_Evgenya.add(new Mark(2));

        ArrayList<Mark> marks_3_Evgenya =  new ArrayList<>();
        marks_3_Evgenya.add(new Mark(9));
        marks_3_Evgenya.add(new Mark(9));
        marks_3_Evgenya.add(new Mark(9));

        // Pavel marks
        ArrayList<Mark> marks_1_Pavel =  new ArrayList<>();
        marks_1_Pavel.add(new Mark(1));
        marks_1_Pavel.add(new Mark(1));
        marks_1_Pavel.add(new Mark(1));

        ArrayList<Mark> marks_2_Pavel =  new ArrayList<>();
        marks_2_Pavel.add(new Mark(2));
        marks_2_Pavel.add(new Mark(2));
        marks_2_Pavel.add(new Mark(2));

        ArrayList<Mark> marks_3_Pavel =  new ArrayList<>();
        marks_3_Pavel.add(new Mark(9));
        marks_3_Pavel.add(new Mark(9));
        marks_3_Pavel.add(new Mark(9));




        ArrayList<Subject> subjects_Alex = new ArrayList<>();
        subjects_Alex.add(new Subject(SubjectEnums.BIOLOGY, marks_1_Alex));
        subjects_Alex.add(new Subject(SubjectEnums.PHYSICS, marks_2_Alex));
        subjects_Alex.add(new Subject(SubjectEnums.CHEMICAL, marks_3_Alex));

        ArrayList<Subject> subjects_Dmitry = new ArrayList<>();
        subjects_Dmitry.add(new Subject(SubjectEnums.BIOLOGY, marks_1_Dmitry));
        subjects_Dmitry.add(new Subject(SubjectEnums.PHYSICS, marks_2_Dmitry));
        subjects_Dmitry.add(new Subject(SubjectEnums.CHEMICAL, marks_3_Dmitry));

        ArrayList<Subject> subjects_Olga = new ArrayList<>();
        subjects_Olga.add(new Subject(SubjectEnums.HISTORY, marks_1_Olga));
        subjects_Olga.add(new Subject(SubjectEnums.ECONOMY, marks_2_Olga));
        subjects_Olga.add(new Subject(SubjectEnums.CHEMICAL, marks_3_Olga));

        ArrayList<Subject> subjects_Lena = new ArrayList<>();
        subjects_Lena.add(new Subject(SubjectEnums.HISTORY, marks_1_Lena));
        subjects_Lena.add(new Subject(SubjectEnums.ECONOMY, marks_2_Lena));
        subjects_Lena.add(new Subject(SubjectEnums.CHEMICAL, marks_3_Lena));

        ArrayList<Subject> subjects_Tanya = new ArrayList<>();
        subjects_Tanya.add(new Subject(SubjectEnums.BIOLOGY, marks_1_Tanya));
        subjects_Tanya.add(new Subject(SubjectEnums.INFORMATICS, marks_2_Tanya));
        subjects_Tanya.add(new Subject(SubjectEnums.MATH, marks_3_Tanya));

        ArrayList<Subject> subjects_Oleg = new ArrayList<>();
        subjects_Oleg.add(new Subject(SubjectEnums.BIOLOGY, marks_1_Oleg));
        subjects_Oleg.add(new Subject(SubjectEnums.INFORMATICS, marks_2_Oleg));
        subjects_Oleg.add(new Subject(SubjectEnums.MATH, marks_3_Oleg));

        ArrayList<Subject> subjects_Evgenya = new ArrayList<>();
        subjects_Evgenya.add(new Subject(SubjectEnums.INFORMATICS, marks_1_Evgenya));
        subjects_Evgenya.add(new Subject(SubjectEnums.PHYSICS, marks_2_Evgenya));
        subjects_Evgenya.add(new Subject(SubjectEnums.MATH, marks_3_Evgenya));

        ArrayList<Subject> subjects_Pavel = new ArrayList<>();
        subjects_Pavel.add(new Subject(SubjectEnums.INFORMATICS, marks_1_Pavel));
        subjects_Pavel.add(new Subject(SubjectEnums.PHYSICS, marks_2_Pavel));
        subjects_Pavel.add(new Subject(SubjectEnums.MATH, marks_3_Pavel));


        ArrayList<Student> students1 = new ArrayList<>();
        students1.add(new Student(1, "Alex", subjects_Alex));
        students1.add(new Student(2, "Dmitry", subjects_Dmitry));
        ArrayList<Student> students2 = new ArrayList<>();
        students2.add(new Student(3, "Olga", subjects_Olga));
        students2.add(new Student(4, "Lena", subjects_Lena));
        ArrayList<Student> students3 = new ArrayList<>();
        students3.add(new Student(5, "Tanya", subjects_Tanya));
        students3.add(new Student(6, "Oleg", subjects_Oleg));
        ArrayList<Student> students4 = new ArrayList<>();
        students4.add(new Student(7, "Evgenya", subjects_Evgenya));
        students4.add(new Student(8, "Pavel", subjects_Pavel));



        ArrayList<Group> groupList_1 = new ArrayList<>();
        groupList_1.add(new Group(1, students1));
        groupList_1.add(new Group(2, students2));
        ArrayList<Group> groupList_2 = new ArrayList<>();
        groupList_2.add(new Group(1, students3));
        groupList_2.add(new Group(2, students4));



        ArrayList<Faculty> faculties = new ArrayList<>();
        faculties.add(new Faculty(1, groupList_1));
        faculties.add(new Faculty(2, groupList_2));


        University university = new University(faculties);

        double result1 = 0;
        try {
            result1 = university.getAverageOfAllMarks();
        } catch (InvalidMarkException e) {
            e.printStackTrace();
        }


        double result2 = 0;
        try {
            result2 = university.getAverageByStudentId(8);
        } catch (InvalidMarkException | InvalidStudentException e) {
            e.printStackTrace();
        }


        double result3 = 0;
        try {

            result3 = university.getAverageBySubjectName("BIOLOGY");
        } catch (InvalidMarkException e) {
            e.printStackTrace();
        }


        double result4 = 0;
        try {
            result4 = university.getAverageBySubjectNameByGroupNumberByFacultyNumber("BIOLOGY", 1, 1);
        } catch (InvalidMarkException | InvalidFacultyException | InvalidGroupException | InvalidSubjectException e) {
            e.printStackTrace();
        }

        System.out.println("Average by all marks: " + result1
                            + "\n" + "Average marks by student's Id:  " + result2
                            + "\n" + "Average marks by subject's name:  " + result3
                            + "\n" + "Average marks by subject's name, group's number and faculty's number:  " + result4);

    }
}