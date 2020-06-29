package traning.errorExceptions.Essenses;

import java.util.ArrayList;
import java.util.List;

public class Student {
    private int studentId;
    private int facultyId;
    private int groupId;
    private ArrayList<Mark> markList;

    public Student(int studentId, int facultyId, int groupId, ArrayList<Mark> markList) {
        this.studentId = studentId;
        this.facultyId = facultyId;
        this.groupId = groupId;
        this.markList = markList;
    }

    public int getStudentId() {
        return studentId;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    public int getFacultyId() {
        return facultyId;
    }

    public void setFacultyId(int facultyId) {
        this.facultyId = facultyId;
    }

    public int getGroupId() {
        return groupId;
    }

    public void setGroupId(int groupId) {
        this.groupId = groupId;
    }


    public List<Mark> getMarkList() {
        return markList;
    }

    public void setMarkList(ArrayList<Mark> markList) {
        this.markList = markList;
    }


    @Override
    public String toString() {
        return "Student{" +
                "studentId=" + studentId +
                ", facultyId=" + facultyId +
                ", groupId=" + groupId +
                ", markList=" + markList +
                '}';
    }
}
