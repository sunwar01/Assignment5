public class Teacher extends Person {

    private String initials;

    private String main;



    public Teacher(int id, String name, String mail, String initials, String main) {
        super(id, name, mail);

        this.initials = initials;
        this.main = main;


    }

    public String getInitials() {
        return this.initials;
    }

    public String getMain() {
        return this.main;
    }


    @Override
    public String toString(){

        return String.format("%1s%16s%16s%16s%16s%n", getId(), getName(), getEmail(), getInitials(), getMain());


    }


}
