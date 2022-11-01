

import java.util.LinkedList;


public class Test {



    public static void listTest(){

        //////////////////////////////////////////////////////////////////////////////////
        //////////////////////////////////PEOPLE//////////////////////////////////////////
        //////////////////////////////////////////////////////////////////////////////////


        LinkedList<Person> testListe = new LinkedList<Person>();

        Person person1 = new Person(100, "Hans Nielsen", "hni@easv.dk");
        Person person2 = new Person(101, "Niels Hansen ", "nha@easv.dk");
        Person person3 = new Person(102, "Ib Boesen", "ibo@easv.dk");

        testListe.add(person1);
        testListe.add(person2);
        testListe.add(person3);


        System.out.format("%1s%n", "People");
        System.out.format("%1s%16s%16s%n", "ID" , "NAME" , "EMAIL");


        for (Person person : testListe) {
            System.out.println(person);
        }


        //////////////////////////////////////////////////////////////////////////////////
        //////////////////////////////////TEACHER/////////////////////////////////////////
        //////////////////////////////////////////////////////////////////////////////////

        LinkedList<Teacher> Teacherlist = new LinkedList<Teacher>();

        Teacher Teacher1 = new Teacher(202, "Bent H. Pedersen", "bhp@easv.dk", "bhp", "Programming");
        Teacher Teacher2 = new Teacher(203, "Peter Q. Hansen", "pqh@easv.dk", "pqh", "??!??!?!!?!?!");


        Teacherlist.add(Teacher1);
        Teacherlist.add(Teacher2);

        System.out.format("%1s%n", "Teachers");
        System.out.format("%1s%16s%16s%16s%16s%n", "ID" , "NAME" , "EMAIL", "INITIALS", "MAIN");

        for (Teacher teacher : Teacherlist) {
            System.out.println(teacher);
        }

        //////////////////////////////////////////////////////////////////////////////////
        //////////////////////////////////STUDENTS////////////////////////////////////////
        //////////////////////////////////////////////////////////////////////////////////


        LinkedList<Student> Studentlist = new LinkedList<Student>();

        Student student1 = new Student(301, "Anders T. Kristensen", "atk@easv.dk", "Math", 7);
        Student student2 = new Student(302, "Mogens Z. Petersen", "mzp@easv.dk", "English", 7);


        Studentlist.add(student1);
        Studentlist.add(student2);

        System.out.format("%1s%n", "Students");
        System.out.format("%1s%16s%16s%16s%16s%n", "ID" , "NAME" , "EMAIL", "EDUCATION", "GRADE");

        for (Student student : Studentlist) {
            System.out.println(student);
        }



    }

}
