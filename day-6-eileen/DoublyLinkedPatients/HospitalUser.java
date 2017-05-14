class HospitalUser {
  public static void main (String[] args) {
    HospitalUser hu = new HospitalUser();
    hu.launch();
  }
  private void launch() {
    HospitalManager hm = new HospitalManager();
    int i;
    for (i=0; i <10; i++){
      Patient p = new Patient("Patient-" + Integer.toString(i), i,
        "Illness num " + Integer.toString(i));
        hm.addPatient(p);
    }
    hm.printPatients();
    hm.deletePatient("Patient-5");
    hm.printPatients();
    hm.queueLength();

  Patient test = hm.getPatientByName("Patient-0");
  if (test != null) {
    System.out.println(test.getName());
  } else {
    System.out.println("Patient was null :o");
  }

    System.out.println(hm.queueLength());
  }
}
