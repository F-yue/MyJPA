package JavaBean;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class User {
    @javax.persistence.Id
    private long Id;
    private String UserName;
    private String Password;
    private boolean Srx;
    private int Age;
    private double Height;

    public double getHeight() {
        return Height;
    }

    public void setHeight(double height) {
        Height = height;
    }

    public long getId() {
        return Id;
    }

    public void setId(long id) {
        Id = id;
    }

    public String getUserName() {
        return UserName;
    }

    public void setUserName(String userName) {
        UserName = userName;
    }

    public String getPassword() {
        return Password;
    }

    public void setPassword(String password) {
        Password = password;
    }

    public boolean getSrx() {
        return Srx;
    }

    public void setSrx(boolean srx) {
        Srx = srx;
    }

    public int getAge() {
        return Age;
    }

    public void setAge(int age) {
        Age = age;
    }
}
