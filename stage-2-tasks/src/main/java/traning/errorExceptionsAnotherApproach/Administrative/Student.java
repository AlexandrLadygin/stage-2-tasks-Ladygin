package traning.errorExceptionsAnotherApproach.Administrative;

import java.util.List;

public class Student {

    private int id;
    private String name;
    private List <Subject> subjects;

    public Student(int id, String name, List<Subject> subjects) {
        this.id = id;
        this.name = name;
        this.subjects = subjects;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public List<Subject> getSubjects() {
        return subjects;
    }

}
