package com.Student.socialMediaApp;

import java.io.Serializable;
import java.util.ArrayList;

public class Login implements Serializable {
    String userName;
    String password;

    Login (String userName,String password){
        this.userName = userName;
        this.password = password;
    }

}
