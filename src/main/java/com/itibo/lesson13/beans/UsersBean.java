package com.itibo.lesson13.beans;

import com.itibo.lesson13.models.UserModel;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import java.util.ArrayList;
import java.util.List;

//TODO сделать userModel и userBean где только лист юзеров

@ManagedBean(name ="users")
@SessionScoped
public class UsersBean {

    private List<UserModel> users;
    private UserModel userModel;

    public UsersBean(){
        users = new ArrayList<UserModel>();
        userModel = new UserModel();
    }

    public UserModel getUserModel() {
        return userModel;
    }

    public void setUserModel(UserModel userModel) {
        this.userModel = userModel;
    }

    public void addUser() {
        this.users.add(this.userModel);
    }

    public String getUsers() {
        return users.toString();
    }

    @Override
    public String toString() {
        String result = "";
        for(UserModel user : users){
            result+=user;
            result+="\n\n";
        }
        return result;
    }
}
