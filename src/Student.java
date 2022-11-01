public class Student extends Person{

    String education;
    Double avgGrade;




    public double getAvgOfGrades(){
        double sum = 0;
        for (int i=0; i< gradeInfoList.size(); i++) {
            sum += gradeInfoList.get(i).getGrade();
        }
        return sum / gradeInfoList.size();
    }



    public Student(int id, String name, String mail, String education, Double avgGrade) {
        super(id, name, mail);

        this.education = education;
        this.avgGrade = avgGrade;

    }


    public String getEducation() {
        return this.education;
    }

    public Double getAvgGrade() {
        return this.avgGrade;
    }


    public int getGrade(int g, String subject){

        GradeInfo gr = new GradeInfo(subject, g);

        gradeInfoList.add(gr);

        return g; //?????????

    }


    @Override
    public String toString(){
        return String.format("%1s%16s%16s%16s%16s%n", getId(), getName(), getEmail(), getEducation(), getAvgGrade());
    }

}
