package traning.errorExceptionsAnotherApproach.Administrative;

public class Mark {

    private int markValue;

    public Mark(int markValue) {
        this.markValue = markValue;
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
                "markValue=" + markValue +
                '}';
    }
}
