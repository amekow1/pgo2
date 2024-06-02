public class Main {
  public static void main(String[] args) {
    Student s1=new Student();
    s1.firstName="Alicja";
    s1.lastName="Kowalska";
    s1.indexNumber="s30627";
    s1.email="s30627@pjwstk.edu.pl";
    s1.adress="Wolskiego 1";
    s1.grades=new double[]{4,3,5,2};
    double srednia=s1.obliczSrednia();


    Student s2=new Student();
    s2.firstName="Karol";
    s2.lastName="Nowak";
    s2.indexNumber="s30457";
    s2.email="s30457@pjwstk.edu.pl";
    s2.adress="Tęczowa 3";
    s2.grades=new double[]{5,2,3,4};
    double srednia2=s2.obliczSrednia();

    Student s3=new Student();
    s3.firstName="";
    s3.lastName="Kowalska";
    s3.indexNumber="s30627";
    s3.email="s30627@pjwstk.edu.pl";
    s3.adress="Wolskiego 1";
    s3.grades=new double[]{4,3,5,2};
    double srednia3= s3.obliczSrednia();


    StudentGroup grupa = new StudentGroup("Grupa 1");
    Student student1 = new Student();
    Student student2 = new Student();
    Student student3 = new Student();

    grupa.dodajStudenta(student1);
    grupa.dodajStudenta(student2);
    grupa.dodajStudenta(student3);

    System.out.println("Liczba studentów w grupie: " + grupa.liczbaStudentow);
  }



}


