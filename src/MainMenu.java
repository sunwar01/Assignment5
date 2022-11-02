public class MainMenu extends Menu{

    PersonsManager pm = new PersonsManager();


    public MainMenu() {
        super("MENU", "Get all people", "Get teachers", "Get Students");


    }

    @Override
    protected void doAction(int option) {


        if(option == 1)
            System.out.println(pm.getAllPeople());
        else if (option == 2)
            System.out.println(pm.getAllTeachers());
        else if (option == 3)
            System.out.println(pm.getAllStudents());


    }
}
