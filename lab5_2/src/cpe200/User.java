package cpe200;

/**
 * Created by pruet on 6/9/2559.
 */
public class User {
    protected String userName;
    protected String password;

    public User() {
    }

    public String setUserName(String name) throws RuntimeException{
        int a = 0;
        if (name.length() < 8) {
            return String.valueOf(null);
        }
        if (name.length() >= 8) {
            a++;
        }
        if (name.matches("(^[a-z]+)([a-zA-Z0-9]*)")) {
            a++;
        }
        if (name.matches("(^[A-Z]+)([a-zA-Z0-9]*)")) {
            a++;
        }
        if(name.isEmpty())
        {
            throw new RuntimeException();
        }

        if (a == 2) {
            if(userName == null)
            {
                userName = name;
                return null;
            }
            else{
                String ant =userName;
                userName = name;
                return ant;
            }


        } else {
            throw new RuntimeException();
        }
    }

    public int setPassword(String name) throws RuntimeException {
        int a = 0;
        if (name.length() < 12) {
            return Integer.getInteger(null);
        }
        if (name.length() >= 12) {
            a++;
        }
        if (name.matches("(.*)([0-9]+)(.*)")) {
            a++;
        }
        if (name.matches("(.*)([a-z]+)(.*)")) {
            a++;
        }
        if (name.matches("(.*)([A-Z]+)(.*)")) {
            a++;
        }

        if (a == 4) {
            password = name;

            return name.length();
        } else {
            throw new RuntimeException();
        }
    }

    public String getUserName() {

        return userName;
    }

    public String getPassword() {
        return password;
    }

}
