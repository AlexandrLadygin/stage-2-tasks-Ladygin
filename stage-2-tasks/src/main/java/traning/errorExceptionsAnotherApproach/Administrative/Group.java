package traning.errorExceptionsAnotherApproach.Administrative;

import java.util.List;

public class Group {

    private int numberOfGroup;
    private List<Student> students;

    public Group(int numberOfGroup, List<Student> students) {
        this.numberOfGroup = numberOfGroup;
        this.students = students;
    }

    public int getNumberOfGroup() {
        return numberOfGroup;
    }

    public void setNumberOfGroup(int numberOfGroup) {
        this.numberOfGroup = numberOfGroup;
    }

    public List<Student> getStudents() {
        return students;
    }

    public void setStudents(List<Student> students) {
        this.students = students;
    }
}
