import com.sun.source.tree.BreakTree;

public class Student {
  public String firstName;
  public String lastName;
  public String indexNumber;
  public String email;
  public String adress;
  public double[] grades={};

  public double obliczSrednia() {

    double srednia = 0;
    int liczbaOcen = grades.length;
    if (liczbaOcen > 20) {
      System.out.println("Student może mieć maksymalnie 20 ocen.");

    } else if (liczbaOcen == 0) {
      System.out.println("Błąd. Student nie ma żadnych ocen.");
    } else {
      for (int i = 0; i < liczbaOcen; i++) {
        srednia += grades[i];
      }

      srednia /= liczbaOcen;
      double zaokraglenie = Math.round(srednia * 2) / 2.0;
      System.out.println("Student: " + firstName+ " " + lastName);
      System.out.println("Srednia ocen: " + zaokraglenie);
    }return srednia;


  }

}
