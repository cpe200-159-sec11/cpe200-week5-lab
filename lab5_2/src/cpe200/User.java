package cpe200;

/**
 * Created by pruet on 6/9/2559.
 */
public class User {
    private String userName;
    private String password;

    public User() {
    }

    public String setUserName(String name) {
        String regexp ="^[A-Za-z][a-zA-Z0-9]{7,}$";
        if(name.matches(regexp)){
            String ret = userName;
            this.userName=name;
            return ret;
        }
        throw new RuntimeException("Invalid Username");
    }

    public int setPassword(String name) {
        String regexp = "^(?=.*[a-z])(?=.*[A-Z])(?=.*[0-9])([a-zA-Z0-9]{12,})$";
        if(name.matches(regexp)){
            int ret = name.length();
            this.password=name;
            return ret;
        }
        throw new RuntimeException("Invalid Password");
    }

    public String getUserName() {
        return userName;
    }

    public String getPassword() {
        return password;
    }
}
