package design_pattern.behavioral.chainofResponsibility.hiring;

public interface Interview {

    void nextPanel(Interview interview);

    void process(InterviewPanel panel, ProcessOrder processOrder);
}
