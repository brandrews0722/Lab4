package com.example.brandrews.lab4_1;

import android.app.Application;
import android.text.Editable;

import java.util.ArrayList;
import java.util.Dictionary;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/**
 * Created by brandrews on 4/9/2018.
 */

public class Globals extends Application {

    public Map<String, String> users = new HashMap<String, String>();

    public boolean getUser(String user, String password){
        boolean foundUser = false;

        if (Objects.equals(users.get(user), password)){
            foundUser = true;
        }

        return  foundUser;
    }

    public void setUser(String user, String password){
        users.put(user, password);
    }

    public String retrievePassword(String user){
        String password = "";
        password = users.get(user);

        return password;
    }
}
