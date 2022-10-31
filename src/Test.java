import java.util.LinkedList;


public class Test {

    public static void listTest(){
        LinkedList<Person> testListe = new LinkedList<Person>();

        Person person1 = new Person(100, "Hans Nielsen", "hni@easv.dk");
        Person person2 = new Person(102, "Hans Nielsen", "hni@easv.dk");
        Person person3 = new Person(101, "Hans Nielsen", "hni@easv.dk");

        testListe.add(person1);
        testListe.add(person2);
        testListe.add(person3);

        System.out.println(testListe);


        //////////////////////////////////////////////////////////////////////////////////

        LinkedList<Teacher> Teacherlist = new LinkedList<Teacher>();

        Teacher Teacher1 = new Teacher(202, "Bent H. Pedersen", "bhp@easv.dk", "bhp", "Programming");
        Teacher Teacher2 = new Teacher(203, "Peter Q. Hansen", "pqh@easv.dk", "pqh", "??!??!?!!?!?!");


        Teacherlist.add(Teacher1);
        Teacherlist.add(Teacher2);



        System.out.println(Teacherlist);



    }

}
