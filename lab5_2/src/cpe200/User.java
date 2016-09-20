package cpe200;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by pruet on 6/9/2559.
 */
public class User {
    private String userName;
    private String old_userName=null;
    private String password;
    private static final String nameREGEX = "[A-z,0-9]";
    private static final String nonREGEX = "[-,_,/,@,#,&]";
    private static final String passazREGEX = "[a-z]";
    private static final String passAZREGEX = "[A-Z]";
    private static final String pass09REGEX = "[0-9]";

    public User() {
    }

    public String setUserName(String name) {
        Pattern patternAz = Pattern.compile(nameREGEX);
        Matcher mAz = patternAz.matcher(name);
        Pattern patternsim = Pattern.compile(nonREGEX);
        Matcher mSim = patternsim.matcher(name);
        char c = name.charAt(0);
        if(mAz.find() && name.length()>=8 && !(mSim.find())) {
            if(c >= '0' && c <= '9')
            {
                throw new RuntimeException();
            }
            else {
                old_userName = userName;
                userName = name;
                return old_userName;
            }
        }
        else {
            throw new RuntimeException();
        }
    }

    public int setPassword(String name) {
        Pattern patternaz = Pattern.compile(passazREGEX);
        Matcher maz = patternaz.matcher(name);
        Pattern patternAZ = Pattern.compile(passAZREGEX);
        Matcher mAZ = patternAZ.matcher(name);
        Pattern pattern09 = Pattern.compile(pass09REGEX);
        Matcher m09 = pattern09.matcher(name);
        Pattern patternsim = Pattern.compile(nonREGEX);
        Matcher mSim = patternsim.matcher(name);
        if(maz.find()&& mAZ.find() && m09.find() &&!(mSim.find()) && name.length()>=12 ) {
            password = name;
            return password.length();
        }
        else
            throw new RuntimeException();
    }

    public String getUserName() {

        return userName;
    }

    public String getPassword() {
        return password;
    }
}
