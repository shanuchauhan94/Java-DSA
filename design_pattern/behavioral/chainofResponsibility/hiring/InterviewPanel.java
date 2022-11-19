package design_pattern.behavioral.chainofResponsibility.hiring;

public class InterviewPanel {

    private int tScore;
    private int mScore;
    private int hScore;

    public InterviewPanel(int tScore, int mScore, int hScore) {
        this.tScore = tScore;
        this.mScore = mScore;
        this.hScore = hScore;
    }

    public InterviewPanel getInterviewProcess() {
        return new InterviewPanel(this.tScore, this.mScore, this.hScore);
    }

    public int gettScore() {
        return tScore;
    }

    public int getmScore() {
        return mScore;
    }

    public int gethScore() {
        return hScore;
    }

}
