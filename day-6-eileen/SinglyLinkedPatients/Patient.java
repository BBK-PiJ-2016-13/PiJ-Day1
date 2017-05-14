public class Patient{
  private String name;
  private int age;
  private String illness;
  private Patient nextPatient = null;

  public Patient(String name, int age, String illness) {
    this.name = name;
    this.age = age;
    this.illness = illness;
    this.nextPatient = null; // asume we're at the back
  }

  public void setNextPatient(Patient nextPatient){
    this.nextPatient = nextPatient;
    return;
  }

  public Patient getNextPatient(){
    return nextPatient;
  }

  public String getName() {
    return name;
  }

  public String getAge() {
    return Integer.toString(age);
  }

  public String getIllness() {
    return illness;
  }
}
