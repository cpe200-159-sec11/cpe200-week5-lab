package cpe200;


import java.util.ArrayList;

/**
 * Created by pruet on 12/9/2559.
 */
public class Users {
    public ArrayList<User> userList;

    public Users() {
        userList= new ArrayList<User>();
    }

    public void addUser(User user)
    {
        userList.add(user);
    }

    public void addUser(String userName, String password)
    {
        User user = new User();
        user.setUserName(userName);
        user.setPassword(password);
        userList.add(user);
    }


    public void deleteUser(User user)
    {
        if(userList.isEmpty()) {
            throw new RuntimeException();
        }
        else {
            userList.remove(user);
        }
    }

    public boolean exists(User user)
    {

        if(userList.isEmpty()) {
            return false;
        }
        else if(userList.contains(user)) {
            return true;
        }
        else {
            return false;
        }

    }

    public boolean usernameExists(String username)
    {
        if(userList.isEmpty()) {
            return true;
        }
        for (int i=0; i<userList.size(); i++)
        {
            if(username == userList.get(i).getUserName())
            {
                return false;
            }
        }
        return true;
    }

    /* This method should return null when the user with username is not in the list */
    public User getUserByUsername(String userName)
    {
        for (int i=0; i<userList.size(); i++)
        {
            if(userName == userList.get(i).getUserName())
            {
                return userList.get(i);
            }
        }
        return null;
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
