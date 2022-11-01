import java.util.LinkedList;

public class GradeInfo {

    private int grade;
    private String subject;

    public GradeInfo(String subject, int grade) {

        this.subject = subject;
        this.grade = grade;

    }

    public String getSubject() {
        return this.subject;
    }

    public int getGrade() {
        return this.grade;
    }

    public static void gradeListInfo(){








    }





    @Override
    public String toString(){
        return String.format("%1s%n", getGrade());
    }


    // ved ikke lige hvordan vi skal få det her implementeret?
}
