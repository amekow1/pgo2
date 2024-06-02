import java.util.ArrayList;

public class StudentGroup {
  public String nazwa;
  public ArrayList<Student> studenci;
  public int liczbaStudentow;
  public StudentGroup(String nazwa) {
    this.nazwa = nazwa;
    this.studenci = new ArrayList<>();
    this.liczbaStudentow = 0;
  }

  public void dodajStudenta(Student student){
    if(liczbaStudentow>=15){
      throw new IllegalStateException("Grupa nie jest pełna");
    }
    for(int i=0;i<liczbaStudentow;i++){
      if(studenci.get(i) ==student){
        throw new IllegalStateException("Student już należy do tej grupy");
      }
    }
    studenci.add(student);
    liczbaStudentow++;
  }
}
