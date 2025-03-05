package firstproject.sample.entity;

import jakarta.persistence.*;

@Entity
public class Formdata{


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String Firstname;
    private String Lastname;
    private  String Email;
    private String number;
    private String Datebirth;
    private  String Department;
    private String College;
    private String Password;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFirstname() {
        return Firstname;
    }

    public void setFirstname(String firstname) {
        Firstname = firstname;
    }

    public String getLastname() {
        return Lastname;
    }

    public void setLastname(String lastname) {
        Lastname = lastname;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String email) {
        Email = email;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getDatebirth() {
        return Datebirth;
    }

    public void setDatebirth(String datebirth) {
        Datebirth = datebirth;
    }

    public String getDepartment() {
        return Department;
    }

    public void setDepartment(String department) {
        Department = department;
    }

    public String getCollege() {
        return College;
    }

    public void setCollege(String college) {
        College = college;
    }

    public String getPassword() {
        return Password;
    }

    public void setPassword(String password) {
        Password = password;
    }

    // Default constructor required by Hibernate
    public Formdata() { }

    // Parameterized constructor
    public Formdata(String Firstname, String Lastname, String Email, String number, String Datebirth, String Department, String College, String Password) {
        this.Firstname = Firstname;
        this.Lastname = Lastname;
        this.Email = Email;
        this.number = number;
        this.Datebirth = Datebirth;
        this.Department = Department;
        this.College = College;
        this.Password = Password;
    }
}

