package iuh.fit.tuan03;

public class Student {
    private String firstName;
    private String lastName;
    private int dayOfBirth;
    private String monthOfBirth;
    private int yearOfBirth;
    private String email;
    private String mobileNumber;
    private String gender;
    private String address;
    private String city;
    private String pinCode;
    private String state;
    private String country;
    private String[] hobbies;

    private Qualification[] qualifications;
    private String course;

    public static class Qualification {
        private String examination;
        private String board;
        private double percentage;
        private int yearOfPassing;

        public Qualification() {}

        public Qualification(String examination, String board, double percentage, int yearOfPassing) {
            this.examination = examination;
            this.board = board;
            this.percentage = percentage;
            this.yearOfPassing = yearOfPassing;
        }

        public String getExamination() {
            return examination;
        }

        public void setExamination(String examination) {
            this.examination = examination;
        }

        public String getBoard() {
            return board;
        }

        public void setBoard(String board) {
            this.board = board;
        }

        public double getPercentage() {
            return percentage;
        }

        public void setPercentage(double percentage) {
            this.percentage = percentage;
        }

        public int getYearOfPassing() {
            return yearOfPassing;
        }

        public void setYearOfPassing(int yearOfPassing) {
            this.yearOfPassing = yearOfPassing;
        }
    }

    // Constructors
    public Student() {}

    public Student(String firstName, String lastName, int dayOfBirth, String monthOfBirth, int yearOfBirth, String email,
                   String mobileNumber, String gender, String address, String city, String pinCode, String state,
                   String country, String[] hobbies, Qualification[] qualifications, String course) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.dayOfBirth = dayOfBirth;
        this.monthOfBirth = monthOfBirth;
        this.yearOfBirth = yearOfBirth;
        this.email = email;
        this.mobileNumber = mobileNumber;
        this.gender = gender;
        this.address = address;
        this.city = city;
        this.pinCode = pinCode;
        this.state = state;
        this.country = country;
        this.hobbies = hobbies;
        this.qualifications = qualifications;
        this.course = course;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getDayOfBirth() {
        return dayOfBirth;
    }

    public void setDayOfBirth(int dayOfBirth) {
        this.dayOfBirth = dayOfBirth;
    }

    public String getMonthOfBirth() {
        return monthOfBirth;
    }

    public void setMonthOfBirth(String monthOfBirth) {
        this.monthOfBirth = monthOfBirth;
    }

    public int getYearOfBirth() {
        return yearOfBirth;
    }

    public void setYearOfBirth(int yearOfBirth) {
        this.yearOfBirth = yearOfBirth;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getMobileNumber() {
        return mobileNumber;
    }

    public void setMobileNumber(String mobileNumber) {
        this.mobileNumber = mobileNumber;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getPinCode() {
        return pinCode;
    }

    public void setPinCode(String pinCode) {
        this.pinCode = pinCode;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String[] getHobbies() {
        return hobbies;
    }

    public void setHobbies(String[] hobbies) {
        this.hobbies = hobbies;
    }

    public Qualification[] getQualifications() {
        return qualifications;
    }

    public void setQualifications(Qualification[] qualifications) {
        this.qualifications = qualifications;
    }

    public String getCourse() {
        return course;
    }

    public void setCourse(String course) {
        this.course = course;
    }
}

