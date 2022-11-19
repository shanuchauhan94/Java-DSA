package design_pattern.behavioral.chainofResponsibility.hiring;

public class ManagerialRound implements Interview {

    private Interview interview;

    @Override
    public void nextPanel(Interview interview) {
        this.interview = interview;
    }

    @Override
    public void process(InterviewPanel panel, ProcessOrder managerial) {

        if (panel.getInterviewProcess().getmScore() >= 60 && ProcessOrder.MANAGERIAL.equals(managerial)) {
            System.err.println("Managerial round has cleared with score " + panel.getInterviewProcess().getmScore());
            interview.process(panel, ProcessOrder.HR);
        } else {
            System.err.println(ProcessOrder.MANAGERIAL + " round of interview has failed.");

        }


    }
}
