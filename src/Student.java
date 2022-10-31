public class Student extends Person{

    String education;
    int avgGrade;


    public Student(int id, String name, String mail, String education, int avgGrade) {
        super(id, name, mail);

        this.education = education;
        this.avgGrade = avgGrade;

    }



    @Override
    public String toString(){
        return "\n"+id+" - "+name+" - "+mail+" - "+education+" - "+avgGrade+"\n";
    }

}
