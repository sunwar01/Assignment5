public class Teacher extends Person {

    private String initials;

    private String main;



    public Teacher(int id, String name, String mail, String initials, String main) {
        super(id, name, mail);

        this.initials = initials;
        this.main = main;


    }

    @Override
    public String toString(){
        return "\n"+id+" - "+name+" - "+mail+" - "+initials+" - "+main+"\n";
    }


}
