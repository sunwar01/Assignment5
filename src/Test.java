

import java.util.LinkedList;


public class Test {



    public void listTest(){


        PersonsManager pm = new PersonsManager();

        new MainMenu().run();




        //////////////////////////////////////////////////////////////////////////////////
        //////////////////////////////////PEOPLE//////////////////////////////////////////
        //////////////////////////////////////////////////////////////////////////////////



        Person person1 = new Person(100, "Hans Nielsen", "hni@easv.dk");
        Person person2 = new Person(101, "Niels Hansen ", "nha@easv.dk");
        Person person3 = new Person(102, "Ib Boesen", "ibo@easv.dk");



        pm.addPerson(person1);
        pm.addPerson(person2);
        pm.addPerson(person3);






        //////////////////////////////////////////////////////////////////////////////////
        //////////////////////////////////TEACHER/////////////////////////////////////////
        //////////////////////////////////////////////////////////////////////////////////

        Teacher Teacher1 = new Teacher(202, "Bent H. Pedersen", "bhp@easv.dk", "bhp");
        Teacher1.addSubject("Programming");
        Teacher1.addSubject("ITO");
        Teacher Teacher2 = new Teacher(203, "Peter Q. Hansen", "pqh@easv.dk", "pqh");
        Teacher2.addSubject("ITO");
        Teacher2.addSubject("Programming");

        pm.addPerson(Teacher1);
        pm.addPerson(Teacher2);





        //////////////////////////////////////////////////////////////////////////////////
        //////////////////////////////////STUDENTS////////////////////////////////////////
        //////////////////////////////////////////////////////////////////////////////////


        Student student1 = new Student(301, "Anders T. Kristensen", "atk@easv.dk", "Math", 7);
        Student student2 = new Student(302, "Mogens Z. Petersen", "mzp@easv.dk", "English", 7);


        pm.addPerson(student1);
        pm.addPerson(student2);

        System.out.println(pm);
        System.out.println(pm.getPerson(202));
        System.out.println(pm.getAllStudents());







    }

}
