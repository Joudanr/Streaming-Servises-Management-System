package StreamingServices;

public final class Subscriber extends Person {

    private String userName;
    private final int ID;
    private String email;
    private String password;
    private int phoneNumber;

    // Full constructor
    public Subscriber(int age, String name, String email, String password, int phoneNumber, String userName, int ID) {
        super(age, name);
        this.userName = userName;
        this.ID = ID;
        setEmail(email);
        setPassword(password);
        setPhoneNumber(phoneNumber);
        

    }

    // Implicit constructor
    public Subscriber() {
        this(0, "", "", "", 0,"",0);
    }

    // Getter and setter for email
    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    // Getter and setter for password
    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    // Getter and setter for phoneNumber
    public int getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(int phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

     public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public int getID() {
        return ID;
    }

    // Override toString() method
    @Override
    public String toString() {
        return String.format("%sEmail: %s %nPhone number: %s%nUser name: %s%nId: %D", super.toString(), getEmail(), getPhoneNumber(),getUserName(),getID());
    }
}