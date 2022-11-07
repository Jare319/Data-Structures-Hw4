public class Patient {
    
    private String firstName;
    private String lastName;
    private String address;
    private String city;
    private String county;
    private String state;
    private String zip;
    private String phone1;
    private String phone2;
    private String email;
    private String dateListed;
    private String unosStatus;
    private String dob;
    private String[] pastStatus;
    private String[] pastStatusDates;

    // Default constructor
    public Patient(String first_name, String last_name, String address, String city, String county, String state, String zip, String phone1, String phone2, String email, String date_listed, String unos_status, String dob) {
        this.firstName = first_name;
        this.lastName = last_name;
        this.address = address;
        this.city = city;
        this.county = county;
        this.state = state;
        this.zip = zip;
        this.phone1 = phone1;
        this.phone2 = phone2;
        this.email = email;
        this.dateListed = date_listed;
        this.unosStatus = unos_status;
        this.dob = dob;
        this.pastStatus = new String[20];
        this.pastStatusDates = new String[20];
    }

    // Alternate constructor without dateListed item
    public Patient(String first_name, String last_name, String address, String city, String county, String state, String zip, String phone1, String phone2, String email, String unos_status, String dob) {
        this.firstName = first_name;
        this.lastName = last_name;
        this.address = address;
        this.city = city;
        this.county = county;
        this.state = state;
        this.zip = zip;
        this.phone1 = phone1;
        this.phone2 = phone2;
        this.email = email;
        this.unosStatus = unos_status;
        this.dob = dob;
    }

    public String getFirstName() { // Returns first name
        return this.firstName;
    }

    public void setFirstName(String firstName) { // Sets first name
        this.firstName = firstName;
    }

    public String getLastName() { // Returns last name
        return this.lastName;
    }

    public void setLastName(String lastName) { // Sets last name
        this.lastName = lastName;
    }

    public String getAddress() { // Returns address
        return this.address;
    }

    public void setAddress(String address) { // Sets address
        this.address = address;
    }

    public String getCity() { // gets city
        return this.city;
    }

    public void setCity(String city) { // sets city
        this.city = city;
    }

    public String getCounty() { // get county
        return this.county;
    }

    public void setCounty(String county) { // set county
        this.county = county;
    }

    public String getState() { // gets state
        return this.state;
    }

    public void setState(String state) { // set state
        this.state = state;
    }

    public String getZip() { // gets zip
        return this.zip;
    }

    public void setZip(String zip) { // sets zip
        this.zip = zip;
    }

    public String getPhone1() { // gets first phone
        return this.phone1;
    }

    public void setPhone1(String phone1) { // sets first phone
        this.phone1 = phone1;
    }

    public String getPhone2() { // gets second phone
        return this.phone2;
    }

    public void setPhone2(String phone2) { // sets second phone
        this.phone2 = phone2;
    }

    public String getEmail() { // gets email
        return this.email;
    }

    public void setEmail(String email) { // sets email
        this.email = email;
    }

    public String getDateListed() { // gets date listed
        return this.dateListed;
    }

    public void setDateListed(String dateListed) { // sets date listed
        this.dateListed = dateListed;
    }

    public String getUnosStatus() { // gets unos status
        return this.unosStatus;
    }

    public void setUnosStatus(String unosStatus) { // sets unos status
        this.unosStatus = unosStatus;
    }

    public String getDob() { // gets date of birth
        return this.dob;
    }

    public void setDob(String dob) { // sets date of birth
        this.dob = dob;
    }

    public String[] getPastStatus() { // gets past status array
        return this.pastStatus;
    }

    public String[] getPastStatusDates() { // gets array of dates of the changes of status
        return this.pastStatusDates;
    }

    public boolean equals(Patient patient) { // returns whether a patient is equal to another
        if (
            this.firstName.equals(patient.getFirstName()) &&
            this.lastName.equals(patient.getLastName()) &&
            this.address.equals(patient.getAddress()) &&
            this.city.equals(patient.getCity()) &&
            this.county.equals(patient.getCounty()) &&
            this.state.equals(patient.getState()) &&
            this.zip.equals(patient.getZip()) &&
            this.phone1.equals(patient.getPhone1()) &&
            this.phone2.equals(patient.getPhone2()) &&
            this.email.equals(patient.getEmail()) &&
            this.unosStatus.equals(patient.getUnosStatus()) &&
            this.dob.equals(patient.getDob())
            ) {
            return true;
        }
        else return false;
    }

    public void addPastStatus(String status) { // adds the status to the array of status changes
        for (int i = 0; i < pastStatus.length; i++) {
            if (pastStatus[i] == null) {
                pastStatus[i] = status;
                break;
            }
        }
    }

    public void addPastStatusDate(String date) { // adds the date to the array of status chage dates
        for (int i = 0; i < pastStatusDates.length; i++) {
            if (pastStatusDates[i] == null) {
                pastStatusDates[i] = date;
                break;
            }
        }
    }
}
