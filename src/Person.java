public  class Person {
    private final int id;
    private String name;
    private String mail;


    
    public Person(int id, String name, String mail){

        this.id = id;
        this.name = name;
        this.mail = mail;

    }


    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return mail;
    }


    public void setName(String name) {
        this.name = name;
    }

    public void setEmail(String mail) {
        this.mail = mail;
    }


    public String toString(){

        return  id + name + mail;

    }

    @Override
     public  boolean equals(Object obj) {
        Person thatPerson = (Person) obj;

        if (thatPerson.getId() == this.getId())
            return true;
        else return false;

    }
}




