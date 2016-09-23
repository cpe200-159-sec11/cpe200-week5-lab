package cpe200;

import com.sun.tools.internal.xjc.reader.xmlschema.bindinfo.BIConversion;

import java.util.ArrayList;

/**
 * Created by pruet on 12/9/2559.
 */
public class Users {

    public ArrayList<User> userList;

    public Users(){
        userList = new ArrayList<User>();
    }




    public void addUser(User user)
    {
        userList.add(user);
    }

    public void addUser(String userName, String password)
    {
        User  user= new User();
        user.setUserName(userName);
        user.setPassword(password);
        userList.add(user);



    }

    public void deleteUser(User user)
    {
        if(userList.isEmpty())
        {
            throw new RuntimeException();
        }
        for(int i =0 ; i < userList.size() ; i++)
        {
            if(userList.get(i)== user)
            {
                userList.remove(i);
            }
        }

    }

    public boolean exists(User user)
    {
        int ans=0;
        for(int i =0 ; i < userList.size() ; i++)
        {
            if(userList.get(i)== user)
            {
                return true;
            }
        }
        return false;

    }

    public boolean usernameExists(String username)
    {
        return false;
    }

    /* This method should return null when the user with username is not in the list */

    public User getUserByUsername(String userName)
    {
        User  user= new User();
        user.setUserName(userName);
        int ans=0;
        for(int i =0 ; i < userList.size() ; i++)
        {
            if(userList.get(i)== user)
            {
                ans=i;
            }
        }
        return userList.get(ans);

    }

    public int count()
    {

        return userList.size();
    }

    public User[] getUserArray()
    {
        return userList.toArray(new User[userList.size()]);
    }
}
