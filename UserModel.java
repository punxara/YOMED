package model;

import javax.persistence.*;

@Entity
@Table (name = "user")
public class UserModel {
    @Column(name = "user_id")
    private int id;
    @Column(name = "first_name")
    private String fName;
    @Column(name = "last_name")
    private String lName;
    @Column(name = "email")
    private String email;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getfName() {
        return fName;
    }

    public void setfName(String fName) {
        this.fName = fName;
    }

    public String getlName() {
        return lName;
    }

    public void setlName(String lName) {
        this.lName = lName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
