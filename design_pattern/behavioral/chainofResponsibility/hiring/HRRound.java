package design_pattern.behavioral.chainofResponsibility.hiring;

public class HRRound implements Interview {

    private Interview interview;

    @Override
    public void nextPanel(Interview interview) {
        this.interview = interview;
    }

    @Override
    public void process(InterviewPanel panel, ProcessOrder hr) {
        if (panel.getInterviewProcess().gethScore() >= 50 && ProcessOrder.HR.equals(hr)) {
            System.err.println(ProcessOrder.HR + " round has cleared with score " + panel.getInterviewProcess().gethScore());
        } else {
            System.err.println(ProcessOrder.HR + " round of interview has failed.");
        }
    }
}