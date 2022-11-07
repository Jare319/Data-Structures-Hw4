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
    
    
    public Patient(String firstName) {
        this.firstName = firstName;
    }

    public String getFirstName() {
        return this.firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return this.lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getAddress() {
        return this.address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getCity() {
        return this.city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getCounty() {
        return this.county;
    }

    public void setCounty(String county) {
        this.county = county;
    }

    public String getState() {
        return this.state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getZip() {
        return this.zip;
    }

    public void setZip(String zip) {
        this.zip = zip;
    }

    public String getPhone1() {
        return this.phone1;
    }

    public void setPhone1(String phone1) {
        this.phone1 = phone1;
    }

    public String getPhone2() {
        return this.phone2;
    }

    public void setPhone2(String phone2) {
        this.phone2 = phone2;
    }

    public String getEmail() {
        return this.email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getDateListed() {
        return this.dateListed;
    }

    public void setDateListed(String dateListed) {
        this.dateListed = dateListed;
    }

    public String getUnosStatus() {
        return this.unosStatus;
    }

    public void setUnosStatus(String unosStatus) {
        this.unosStatus = unosStatus;
    }

    public String getDob() {
        return this.dob;
    }

    public void setDob(String dob) {
        this.dob = dob;
    }

    public String[] getPastStatus() {
        return this.pastStatus;
    }

    public String[] getPastStatusDates() {
        return this.pastStatusDates;
    }

    public boolean equals(Patient patient) {
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

    public void addPastStatus(String status) {
        for (int i = 0; i < pastStatus.length; i++) {
            if (pastStatus[i] == null) {
                pastStatus[i] = status;
                break;
            }
        }
    }

    public void addPastStatusDate(String date) {
        for (int i = 0; i < pastStatusDates.length; i++) {
            if (pastStatusDates[i] == null) {
                pastStatusDates[i] = date;
                break;
            }
        }
    }
}
