package traning.errorExceptions.Service;

import traning.errorExceptions.Essenses.Mark;
import traning.errorExceptions.Essenses.Student;
import traning.errorExceptions.Exceptions.*;

import java.util.ArrayList;

public class Service {

    public double GetAverageMarkByStudentId(int studentId, ArrayList<Student> students)
            throws MarkException, StudentException, GroupException, FacultyException, CourseException {

        double marksSum = 0;
        double marksCount = 0;

        for (Student s : students) {
            if (studentId <= 0 || studentId > 6) {
                throw new StudentException("Student Id must be from 1 to 6!!! Check method's parameter");
            }
            if (s.getStudentId() == studentId) {
                if (s.getStudentId() <= 0 || s.getStudentId() > 6) {
                    throw new StudentException("Student Id must be from 1 to 6!!! Check student's list");
                }
                if (s.getGroupId() > 6 || s.getGroupId() <= 0) {
                    throw new GroupException("Group Id must be from 1 to 6!!! Check student's list");
                }
                if (s.getFacultyId() > 3 || s.getFacultyId() <= 0) {
                    throw new FacultyException("Faculty Id must be from 1 to 3!!! Check student's list");
                }
                for (Mark m : s.getMarkList()) {
                    if (m.getCourseId() > 6 || m.getCourseId() <= 0) {
                        throw new CourseException("Course must be from 1 to 6!!! Check mark's list");
                    }
                    if (m.getMarkValue() <= 0 || m.getMarkValue() > 10) {
                        throw new MarkException("Mark must be from 1 to 10!!! Check mark's list");
                    }
                    marksSum += m.getMarkValue();
                    marksCount++;
                }
            }
        }
        return marksSum / marksCount;
    }

    public double GetAverageMarkByCourseId(int courseId, ArrayList<Student> students)
            throws MarkException, StudentException, CourseException, GroupException, FacultyException {

        double marksSum = 0;
        double marksCount = 0;

        for (Student s : students) {
            if (s.getStudentId() <= 0 || s.getStudentId() > 6) {
                throw new StudentException("Student Id must be from 1 to 6!!! Check student's list");
            }
            if (s.getGroupId() > 6 || s.getGroupId() <= 0) {
                throw new GroupException("Group Id must be from 1 to 6!!! Check student's list");
            }
            if (s.getFacultyId() > 3 || s.getFacultyId() <= 0) {
                throw new FacultyException("Faculty Id must be from 1 to 3!!! Check student's list");
            }
            for (Mark m : s.getMarkList()) {
                if (courseId > 6 || courseId <= 0) {
                    throw new CourseException("Course must be from 1 to 6!!! Check method's parameter");
                }
                if (m.getCourseId() == courseId) {
                    if (m.getCourseId() > 6 || m.getCourseId() <= 0) {
                        throw new CourseException("Course must be from 1 to 6!!! Check mark's list");
                    }
                    if (m.getMarkValue() <= 0 || m.getMarkValue() > 10) {
                        throw new MarkException("Mark must be from 1 to 10");
                    }
                    marksSum += m.getMarkValue();
                    marksCount++;
                }
            }
        }
        return marksSum / marksCount;
    }

    public double GetAverageMarkByCourseIdGroupIdFacultyId(int courseId, int groupId, int facultyId, ArrayList<Student> students)
            throws MarkException, StudentException, GroupException, FacultyByGroupException, StudentByCourseException, FacultyException, CourseException {

        double marksSum = 0;
        double marksCount = 0;

        if (courseId > 6 || courseId <= 0) {
            throw new CourseException("Course must be from 1 to 6!!! Check method's parameter");
        }
        if (groupId > 6 || groupId <= 0) {
            throw new GroupException("Group Id must be from 1 to 6!!! Check method's parameter");
        }
        if (facultyId > 3 || facultyId <= 0) {
            throw new FacultyException("Faculty Id must be from 1 to 3!!! Check method's parameter");
        }
        if (!((facultyId == 1 && groupId == 1) || (facultyId == 1 && groupId == 2)
                || (facultyId == 2 && groupId == 3) || (facultyId == 2 && groupId == 4)
                || (facultyId == 3 && groupId == 5) || (facultyId == 3 && groupId == 6))){
            throw new FacultyByGroupException("This faculty is not correct for this group!");
        }
        if ((((groupId == 1 && courseId == 5) || (groupId == 1 && courseId == 6) || (groupId == 2 && courseId == 4) || (groupId == 2 && courseId == 6) ||
                (groupId == 3 && courseId == 4) || groupId == 3 && courseId == 5) || (groupId == 4 && courseId == 1) || (groupId == 4 && courseId == 6) ||
                (groupId == 5 && courseId == 1) || (groupId == 5 && courseId == 5) || (groupId == 6 && courseId == 2) || (groupId == 6 && courseId == 6))) {
            throw new StudentByCourseException("This course is not correct for this group!");
        }
        for (Student s : students) {
            if ((s.getGroupId() == groupId) && (s.getFacultyId() == facultyId)) {
                if (s.getStudentId() <= 0 || s.getStudentId() > 6) {
                    throw new StudentException("Student Id must be from 1 to 6!!! Check student's list");
                }
                if (s.getGroupId() > 6 || s.getGroupId() <= 0) {
                    throw new GroupException("Group Id must be from 1 to 6!!! Check student's list");
                }
                if (s.getFacultyId() > 3 || s.getFacultyId() <= 0) {
                    throw new FacultyException("Faculty Id must be from 1 to 3!!! Check student's list");
                }
                for (Mark m : s.getMarkList()) {
                    if (m.getCourseId() == courseId) {
                        if (m.getCourseId() > 6 || m.getCourseId() <= 0) {
                            throw new CourseException("Course must be from 1 to 6!!! Check mark's list");
                        }
                        if (m.getMarkValue() <= 0 || m.getMarkValue() > 10) {
                            throw new MarkException("Mark must be from 1 to 10!!! Check mark's list");
                        }
                        marksSum += m.getMarkValue();
                        marksCount++;
                    }
                }
            }
        }
        return marksSum / marksCount;
    }
}

