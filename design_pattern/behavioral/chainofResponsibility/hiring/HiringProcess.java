package design_pattern.behavioral.chainofResponsibility.hiring;

public class HiringProcess {

    public static void main(String[] args) {
        Interview i1 = new TechnicalRound();
        Interview i2 = new ManagerialRound();
        Interview i3 = new HRRound();

        i1.nextPanel(i2);
        i2.nextPanel(i3);

        i1.process(new InterviewPanel(70, 90, 60), ProcessOrder.TECHNICAL);
    }
}
