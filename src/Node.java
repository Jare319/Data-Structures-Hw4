public class Node {
    
    private int key;
    private Patient patient;

    public Node(String first_name, String last_name, String address, String city, String county, String state, String zip, String phone1, String phone2, String email, String date_listed, String unos_status, String dob) { // Default constructor
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
    }

    public Node() {

    }

    public Patient getPatient() {
        return this.patient;
    }
}
