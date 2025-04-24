package com.Student.socialMediaApp;

import java.io.Serializable;
import java.util.ArrayList;

public class CreateAccount implements Serializable {
    String username;
    String userId;
    String email;
    String contact;
    String password;
    //String post = "";
    ArrayList<Post> posts;

    CreateAccount (String username,String userId,String email, String contact,String password){
        this.username = username;
        this.userId = userId;
        this.email = email;
        this.contact = contact;
        this.password = password;
        this.posts = new ArrayList<>();
    }
}
