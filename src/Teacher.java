import java.util.LinkedList;

public class Teacher extends Person {


    private LinkedList<String> subjects = new LinkedList<>();

    private String initials;

    private double salary;
    private String main;


    public Teacher(int id, String name, String mail, String initials) {
        super(id, name, mail);

        this.initials = initials;



    }

    public LinkedList<String> getSubjects(){
        return subjects;
    }

    public void addSubject(String subject){
        subjects.add(subject);
    }

    public String getInitials() {
        return this.initials;
    }

    public double getSalary(){
        return salary;
    }

    public void setSalary(double salary){
        this.salary = salary;
    }



    @Override
    public String toString(){

        return super.toString() +  initials + subjects.get(0);

    }


}
