import android.app.Application;

import java.util.ArrayList;
import java.util.Dictionary;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by brandrews on 4/9/2018.
 */

public class Globals extends Application {

    public Map<String, String> users = new HashMap<>();

    public boolean getUser(String user, String password){

        if (users.get(user) == password){
            return true;
        }
        else{
            return false;
        }
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