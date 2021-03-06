public class HospitalManager {
  private Patient firstPatient = null;

  public void addPatient(Patient newPatient) {
    // If no patients yet...
    if (firstPatient == null) {
      firstPatient = newPatient;
      return;
    }
    // If >= 1 patient in list...
    Patient current = firstPatient;
    while (current.getNextPatient() != null){
      current = current.getNextPatient();
    }
    current.setNextPatient(newPatient);
    newPatient.setPreviousPatient(current);
  }

  public boolean deletePatient(String name) {
    // if list empty, no-can-do
    if (firstPatient == null) {
      return false;
    }
    // if it's the first entry, firstPatient in HM must change
    if (firstPatient.getName().equals(name)){
      firstPatient = firstPatient.getNextPatient();
      firstPatient.setPreviousPatient(null);
      return true;
    }
    // if it's another entry, nextPatient entry in the patient *before* must
    // change
    Patient current = firstPatient;
    while (current.getNextPatient() != null) {
      if (current.getNextPatient().getName().equals(name)){
        current.setNextPatient(current.getNextPatient().getNextPatient());
        if (current.getNextPatient() != null) {
          current.getNextPatient().setPreviousPatient(current);
        }
        return true;
      }
      current = current.getNextPatient();
    }
    return false;
  }

  public void printPatients() {
    if (firstPatient == null) {
      System.out.println("list is empty");
    } else {
      Patient current = firstPatient;
      do {
        System.out.println("Name:" + current.getName());
        System.out.println("thisPatient:" + current);
        System.out.println("Age:" + current.getAge());
        System.out.println("Illness:" + current.getIllness());
        System.out.println("previousPatient:" + current.getPreviousPatient());
        System.out.println("nextPatient:" + current.getNextPatient());
        System.out.println("-----------------------------------");
        current = current.getNextPatient();
      } while(current != null);
    }
  }
  public int queueLength() {
    int count = 0;
    if (firstPatient == null) {
      return 0;
    } else {
      Patient current = firstPatient;
      do {
        count++;
        current = current.getNextPatient();
      } while(current != null);
      return count;
    }
  }

  public Patient getPatientByName(String name) {
    if (firstPatient == null) {
      return null;
    } else if (firstPatient.getName().equals(name)) {
        return firstPatient;
    } else {
      Patient current = firstPatient;
      while(current.getNextPatient() != null) {
        if (current.getNextPatient().getName().equals(name)) {
          return current.getNextPatient();
        }
        current = current.getNextPatient();
      }
    }
    return null;
  }
}
