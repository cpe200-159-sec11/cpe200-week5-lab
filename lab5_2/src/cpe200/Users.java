package cpe200;


import java.util.ArrayList;

import static org.junit.Assert.fail;

/**
 * Created by pruet on 12/9/2559.
 */
public class Users {
    public ArrayList<User> userList;
    public Users()
    {
        userList = new ArrayList<User>();
    }
    public void addUser(User user)
    {
        userList.add(user);
    }

    public void addUser(String userName, String password)
    {
        User temp;
        temp = new User();
        temp.setUserName(userName);
        temp.setPassword(password);
        userList.add(temp);
    }

    public void deleteUser(User user) throws RuntimeException
    {
        if(userList.isEmpty())  {
            throw new RuntimeException();
        }
        else
        {
        userList.remove(user);
        }

    }

    public boolean exists(User user)
    {

        if (userList.contains(user)) {
            return true;
        }
        else
        {
            return false;
        }
    }

    public boolean usernameExists(String username)
    {
        User temp;
        temp = new User();
        temp.setUserName(username);
        if (userList.contains(temp)) {
            return true;
        }
        else
        {
            return false;
        }
    }

    /* This method should return null when the user with username is not in the list */
    public User getUserByUsername(String userName)
    {
        User temp;
        temp = new User();
        temp.setUserName(userName);
        int a=0;
        for(int i=0; i<userList.size();i++)
        {
            if(userList.get(i) == temp)
            {
                a=i;
            }
        }
        return userList.get(a);
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
