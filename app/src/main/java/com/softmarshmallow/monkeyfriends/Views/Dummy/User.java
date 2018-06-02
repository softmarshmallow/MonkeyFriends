package com.softmarshmallow.monkeyfriends.Views.Dummy;

import java.util.ArrayList;



public class User {
    String id;
    String pw;
    String name;
    String gender;
    int face ;
    int height ;
    int weight;

    ArrayList userinfo = new ArrayList();

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getPw() {
        return pw;
    }

    public void setPw(String pw) {
        this.pw = pw;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public int getFace() {
        return face;
    }

    public void setFace(int face) {
        this.face = face;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public ArrayList getUserinfo() {
        return userinfo;
    }

    public void setUserinfo(ArrayList userinfo) {
        this.userinfo = userinfo;
    }

}
