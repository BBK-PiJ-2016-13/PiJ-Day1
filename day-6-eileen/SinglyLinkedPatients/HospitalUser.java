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

    System.out.println(hm.queueLength());

    hm.deletePatient("Patient-0");
    hm.deletePatient("Patient-9");
    hm.printPatients();

    System.out.println(hm.queueLength());
  }
}
