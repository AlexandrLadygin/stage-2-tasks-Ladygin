package traning.errorExceptionsAnotherApproach.Administrative;

import traning.errorExceptionsAnotherApproach.Exceptions.*;

import java.util.List;

public class University {
    private List<Faculty> faculties;

    public University(List<Faculty> faculties) {
        this.faculties = faculties;
    }

    public List<Faculty> getFaculties() {
        return faculties;
    }

    public void setFaculties(List<Faculty> faculties) {
        this.faculties = faculties;
    }


    public double getAverageOfAllMarks () throws InvalidMarkException {

        double marksSum = 0;
        double marksCount = 0;

        for (Faculty f : this.getFaculties()){
            for (Group g: f.getGroups()){
                for (Student s: g.getStudents()){
                    for (Subject sb : s.getSubjects()){
                        for (Mark m : sb.getMarks()){
                            if (m.getMarkValue() <= 0 || m.getMarkValue() > 10) {
                                throw new InvalidMarkException( m.getMarkValue() + " isn't valid value! Mark must be from 1 to 10, check "
                                                                + s.getName() + "'s " + sb.getSubject() + " marks, please!");
                            }
                        marksSum += m.getMarkValue();
                        marksCount++;
                        }
                    }
                }
            }
        }

        return marksSum/marksCount;
    }



    public double getAverageByStudentId(int studentId) throws InvalidMarkException, InvalidStudentException {

        double marksSum = 0;
        double marksCount = 0;

        if (studentId <=0 || studentId > 8) {
            throw new InvalidStudentException("There is no " + studentId + "  Id number among students Id. Use available value!");
        }
            for (Faculty f : this.getFaculties()) {
                for (Group g : f.getGroups()) {
                    for (Student s : g.getStudents()) {
                        if (s.getId() == studentId) {
                            for (Subject sb : s.getSubjects()) {
                                for (Mark m : sb.getMarks()) {
                                    if (m.getMarkValue() <= 0 || m.getMarkValue() > 10) {
                                        throw new InvalidMarkException(m.getMarkValue() + " isn't valid value! Mark must be from 1 to 10, check "
                                                                        + s.getName() + "'s " + sb.getSubject() + " marks, please!");
                                    }
                                    marksSum += m.getMarkValue();
                                    marksCount++;
                            }
                        }
                    }
                }
            }
        }

        return marksSum/marksCount;
    }

    public double getAverageBySubjectName(String subjectName) throws InvalidMarkException {

        double marksSum = 0;
        double marksCount = 0;

        for (Faculty f : this.getFaculties()) {
            for (Group g : f.getGroups()) {
                for (Student s : g.getStudents()) {
                    for (Subject sb : s.getSubjects()) {
                        if (sb.getSubject().toString().equals(subjectName)) {
                            for (Mark m : sb.getMarks()) {
                                if (m.getMarkValue() <= 0 || m.getMarkValue() > 10) {
                                    throw new InvalidMarkException( m.getMarkValue() + " isn't valid value! Mark must be from 1 to 10, check "
                                                                    + s.getName() + "'s " + sb.getSubject() + " marks, please!");
                                }
                                marksSum += m.getMarkValue();
                                marksCount++;
                            }
                        }
                    }
                }
            }
        }
        return marksSum/marksCount;
    }

    public double getAverageBySubjectNameByGroupNumberByFacultyNumber(String subjectName, int groupNumber, int facultyNumber) throws
            InvalidMarkException, InvalidFacultyException, InvalidGroupException, InvalidSubjectException {

        double marksSum = 0;
        double marksCount = 0;

        if (facultyNumber <=0 || facultyNumber > 2){
            throw new InvalidFacultyException("There is no " + facultyNumber + " in university list of faculties. Use available value!");
        }
        if (groupNumber <=0 || groupNumber > 2 ){
            throw new InvalidGroupException("There is no " + groupNumber + " in faculties list of groups. Use available value!");
        }
        for (Faculty f : this.getFaculties()) {
            if (f.getNumberOfFaculty() == facultyNumber){
            for (Group g : f.getGroups()) {
                if (g.getNumberOfGroup() == groupNumber) {
                    for (Student s : g.getStudents()) {
                        for (Subject sb : s.getSubjects()) {
                            if (sb.getSubject().toString().equals(subjectName)) {
                                for (Mark m : sb.getMarks()) {
                                    if (m.getMarkValue() <= 0 || m.getMarkValue() > 10) {
                                        throw new InvalidMarkException( m.getMarkValue() + " isn't valid value! Mark must be from 1 to 10, check "
                                                                        + s.getName() + "'s " + sb.getSubject() + " marks, please!");
                                    }
                                    marksSum += m.getMarkValue();
                                    marksCount++;
                                }
                            }
                        }
                    }
                }
                }
            }
        }
        return marksSum/marksCount;
    }
}


