package traning.errorExceptionsAnotherApproach.Administrative;

import java.util.List;

public class Subject {
    private SubjectEnums subject;
    private List<Mark> marks;

    public Subject(SubjectEnums subject, List<Mark> marks) {
        this.subject = subject;
        this.marks = marks;
    }

    public SubjectEnums getSubject() {
        return subject;
    }

    public List<Mark> getMarks() {
        return marks;
    }
}
