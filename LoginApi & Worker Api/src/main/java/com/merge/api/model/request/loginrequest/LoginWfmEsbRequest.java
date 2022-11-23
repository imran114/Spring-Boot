package com.merge.api.model.request.loginrequest;

public class LoginWfmEsbRequest {
    private String username;

    private String password;

    private String lang;

    private String channel;



    public void setUsername(String username){
        this.username = username;
    }
    public String getUsername(){
        return this.username;
    }
    public void setPassword(String password){
        this.password = password;
    }
    public String getPassword(){
        return this.password;
    }
    public void setLang(String lang){
        this.lang = lang;
    }
    public String getLang(){
        return this.lang;
    }
    public void setChannel(String channel){
        this.channel = channel;
    }
    public String getChannel(){
        return this.channel;
    }

    @Override
    public String toString() {
        return "LoginWfmEsbRequest{" +
                "username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", lang='" + lang + '\'' +
                ", channel='" + channel + '\'' +
                '}';
    }
}

