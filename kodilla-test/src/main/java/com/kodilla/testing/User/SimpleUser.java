package com.kodilla.testing.User;


public class SimpleUser {
    private String username;
    private String realname;
    public SimpleUser(String username, String realname) {
        this.username = username;
        this.realname = realname;
    }

    public String getUsername() {
        return username;
    }

    public String getRealname(){
        return realname;
    }
}

