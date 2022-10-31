public class Person {
    int id;
    String name;
    String mail;


    
    public Person(int id, String name, String mail){

        this.id = id;
        this.name = name;
        this.mail = mail;

    }




    public int getId() {
        return this.id;
    }

    public String getEmail() {
        return this.mail;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setEmail(String email) {
        this.mail = mail;
    }

    @Override
    public String toString(){
        return "\n"+id+" - "+name+" - "+mail+"\n";
    }

    /*@Override
     public  String toString() {
        return super.toString();*/


}



