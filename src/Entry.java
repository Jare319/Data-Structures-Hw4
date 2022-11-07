public class Entry {
    
    private int key;
    private Patient patient;

    public Entry(String first_name, String last_name, String address, String city, String county, String state, String zip, String phone1, String phone2, String email, String date_listed, String unos_status, String dob) { // Default constructor
        this.patient = new Patient(first_name, last_name, address, city, county, state, zip, phone1, phone2, email, date_listed, unos_status, dob);
        switch (unos_status) {
            case "Status 1A": // Assigns key value based on status, higher key = higher priority
                this.key = 4000000; 
                break;
            case "Status 1B":
                this.key = 3000000;
                break;
            case "Status 2":
                this.key = 2000000;
                break;
            case "Status 7":
                this.key = 1000000;
                break;
            default:
                this.key = 0;
                break;
        }
        String strArr[] = dob.split("/");
        this.key += ((Integer.parseInt(strArr[2])) * 365) + ((Integer.parseInt(strArr[0])) * 31) + Integer.parseInt(strArr[1]); // Adds patients DOB to the key to sort by date of birth easily
        // This results in the key being a single (albiet large) integer value, for easy comparison, higher keys have higher priority, making this a max heap
    }

    public Entry() { // Empty constructor
        this.key = 0;
        this.patient = null;
    }

    public Patient getPatient() { // returns the patient associated with this entry
        return this.patient;
    }

    public int getKey() { // Returns the key of this entry
        return this.key;
    }

    public void updatePriority() {
        switch (this.patient.getUnosStatus()) {
            case "Status 1A": // Assigns key value based on status, higher key = higher priority
                this.key = 4000000; 
                break;
            case "Status 1B":
                this.key = 3000000;
                break;
            case "Status 2":
                this.key = 2000000;
                break;
            case "Status 7":
                this.key = 1000000;
                break;
            default:
                this.key = 0;
                break;
        }
        String strArr[] = this.patient.getDob().split("/");
        this.key += ((Integer.parseInt(strArr[2])) * 365) + ((Integer.parseInt(strArr[0])) * 31) + Integer.parseInt(strArr[1]);
    }
}
