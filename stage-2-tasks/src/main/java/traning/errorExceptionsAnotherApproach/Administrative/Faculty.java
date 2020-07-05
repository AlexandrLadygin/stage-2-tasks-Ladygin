package traning.errorExceptionsAnotherApproach.Administrative;

import java.util.List;

public class Faculty {

    private int numberOfFaculty;
    private List<Group> groups;

    public Faculty(int numberOfFaculty, List<Group> groups) {
        this.numberOfFaculty = numberOfFaculty;
        this.groups = groups;
    }

    public int getNumberOfFaculty() {
        return numberOfFaculty;
    }

    public void setNumberOfFaculty(int numberOfFaculty) {
        this.numberOfFaculty = numberOfFaculty;
    }

    public List<Group> getGroups() {
        return groups;
    }

    public void setGroups(List<Group> groups) {
        this.groups = groups;
    }
}
