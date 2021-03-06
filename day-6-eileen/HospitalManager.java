public class HospitalManager {
private Patient[] patientArray = new Patient[90];
private Patient firstPatient = null
	
	public void addPatient(Patient newPatient) {
	if (firstPatient = null) {
	firstPatient = newPatient;
	return; }
	Patient current = firstPatient;
	while (current.getNextPatient() != null) {
		// this means we are not yet at the end of the list
		current = current.getNextPatient();
		}
		// at this point, current points to the last patient
		current.setNextPatient(newPatient);
	}
 	// this is a member method of class HospitalManager
	// returns true if the patient was found and removed, false otherwise
	public boolean deletePatient(String name) {
		if (firstPatient == null) {
			// list is empty, nothing to remove
			return false;
		}
		if (firstPatient.getName().equals(name)) {
			// first patient in the list must be removed
			firstPatient = firstPatient.getNextPatient();
			return true;
		}
		Patient current = firstPatient;
		while (current.getNextPatient() != null) {
			if (current.getNextPatient().getName().equals(name)) {
				// We found it! It is the next one!
				// Now link this patient to the one after the next
				current.setNextPatient(current.getNextPatient().getNextPatient());
				return true;
			}
		current = current.getNextPatient();
		}
		return false;
	}

}