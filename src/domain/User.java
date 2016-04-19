package domain;

import java.util.ArrayList;

/**
 * Created by hwgordon on 19/04/2016.
 */
public class User {
    private ArrayList messages = new ArrayList();
    private ArrayList following = new ArrayList();

    public void post(String message) {
        messages.add(message);
    }

    public String view(User user) {
        String response = "";
        return formatMessages(user);
    }

    public void follow (User user) {
        following.add(user);
    }

    public String wall() {
        String response = "";
        for (int i = 0; i < following.size(); i++) {
            response = response + formatMessages((User) following.get(i));
        }
        return response;
    }

    private String formatMessages(User user) {
        String response = "";
        for(int i=0; i < user.messages.size(); i++){
            response = response + user.messages.get(i) + "\n";
        }
        return response;
    }
}
