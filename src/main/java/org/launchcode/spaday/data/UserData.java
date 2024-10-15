package org.launchcode.spaday.data;

import org.launchcode.models.User;

import java.util.HashMap;

public class UserData {
    private static HashMap<Integer, String> profiles = new HashMap<>();
    public static void add (User user) {
        profiles.put(user.getId(), String.valueOf(user));
    }
}
