public class Student extends Person{
  private LinkedList<GradeInfo> gradeReportList = new LinkedList<>();
    private String education;


    public Student(int id, String name, String mail, String education) {
        super(id, name, mail);

        this.education = education;
        this.avgGrade = avgGrade;

    }


    public double getAverageGrade(){

        double sum = 0;
        for(GradeInfo gi : gradeReportList){
            sum += gi.getGrade();
        }
        return sum/gradeReportList.size();
    }

    public int getGrade(String subject){
        for (GradeInfo gi : gradeReportList){
            if(gi.getSubject().equals(subject))
                return gi.getGrade();
        }
        throw new RuntimeException("No such subject");
    }

    public void addGrade(GradeInfo gradeInfo){
        gradeReportList.add(gradeInfo);
    }

    public String getEducation() {
        return this.education;
    }

    public LinkedList<GradeInfo> getGradeReportList() {
        return gradeReportList;
    }

    @Override
    public String toString(){
        return super.toString() + education + getAverageGrade();
    }

}
