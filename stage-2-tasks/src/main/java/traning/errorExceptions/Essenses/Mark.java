package traning.errorExceptions.Essenses;

public class Mark {

    private int courseId;
    private int markValue;

    public Mark(int courseId, int markValue) {
        this.courseId = courseId;
        this.markValue = markValue;
    }

    public int getCourseId() {
        return courseId;
    }

    public void setCourseId(int courseId) {
        this.courseId = courseId;
    }

    public int getMarkValue() {
        return markValue;
    }

    public void setMarkValue(int markValue) {
        this.markValue = markValue;
    }

    @Override
    public String toString() {
        return "Mark{" +
                "courseId=" + courseId +
                ", markValue=" + markValue +
                '}';
    }
}
