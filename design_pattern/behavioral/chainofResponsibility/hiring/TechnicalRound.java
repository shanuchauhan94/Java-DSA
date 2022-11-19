package design_pattern.behavioral.chainofResponsibility.hiring;

public class TechnicalRound implements Interview {

    private Interview interview;

    @Override
    public void nextPanel(Interview interview) {
        this.interview = interview;
    }

    @Override
    public void process(InterviewPanel panel, ProcessOrder technical) {

        if (panel.getInterviewProcess().gettScore() >= 70 && ProcessOrder.TECHNICAL.equals(technical)) {
            System.err.println("Technical round has cleared with score " + panel.getInterviewProcess().gettScore());
            interview.process(panel, ProcessOrder.MANAGERIAL);
        } else {
            System.err.println(ProcessOrder.TECHNICAL + " round of interview has failed." );

        }


    }
}
