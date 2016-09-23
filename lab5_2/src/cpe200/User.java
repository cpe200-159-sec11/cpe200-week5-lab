package cpe200;

/**
 * Created by pruet on 6/9/2559.
 */
public class User {
    public String userName;
    public String password;
    protected String old_userName;

    public User() {
    }

    public String setUserName(String name) {

        old_userName = userName;
        this.userName = name;
        String pettern = "[a-zA-Z][a-zA-Z0-9]+";

        if (name.matches(pettern) && name.length()>=8) {
            this.userName =name;
            return old_userName;
        }


        else {
            throw new ArithmeticException();
        }
    }

    public int setPassword(String name) {

        this.password = name;
        String pettern = "(?=.*[a-z])(?=.*[A-Z])(?=.*\\d)[A-Za-z0-9]+";
        if (name.matches(pettern) && (name.length() >= 12)) {
            this.password = name;
            return password.length();
        }


        else {
            throw new ArithmeticException();
        }
    }

    public String getUserName() {
        return this.userName;

    }

    public String getPassword() {
        return this.password;
    }
}
