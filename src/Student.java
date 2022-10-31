public class Student extends Person{

    String education;
    int avgGrade;


    public Student(int id, String name, String mail, String education, int avgGrade) {
        super(id, name, mail);

        this.education = education;
        this.avgGrade = avgGrade;

    }


    public String getEducation() {
        return this.education;
    }

    public int getAvgGrade() {
        return this.avgGrade;
    }


    @Override
    public String toString(){
        return String.format("%1s%16s%16s%16s%16s%n", getId(), getName(), getEmail(), getEducation(), getAvgGrade());
    }

}
