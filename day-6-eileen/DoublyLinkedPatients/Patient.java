public class Patient{
  private String name;
  private int age;
  private String illness;
  private Patient nextPatient = null;
  private Patient previousPatient;

  public Patient(String name, int age, String illness) {
    this.name = name;
    this.age = age;
    this.illness = illness;
    this.nextPatient = null; // assume we're at the back
    this.previousPatient = null;
  }

  public void setNextPatient(Patient nextPatient){
    this.nextPatient = nextPatient;
    return;
  }

  public void setPreviousPatient(Patient previousPatient){
    this.previousPatient = previousPatient;
    return;
  }

  public Patient getNextPatient(){
    return nextPatient;
  }

  public Patient getPreviousPatient(){
    return previousPatient;
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
