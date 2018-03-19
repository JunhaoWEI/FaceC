package com.example.weijunhao.facec;

/**
 * Created by weijunhao on 2018/3/18.
 */

public class User {
    private String avatar;
    private String name;
    private int age;
    private String gender;
    private int height;
    private int weight;
    private String ethnicity;
    private double[] location;
    private long activeTime;

    public User() {
    }

    public User(String avatar, String name, int age, String gender, int height, int weight, String ethnicity, double[] location, long activeTime) {
        this.avatar = avatar;
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.height = height;
        this.weight = weight;
        this.ethnicity = ethnicity;
        this.location = location;
        this.activeTime = activeTime;
    }

    public String getAvatar() {
        return avatar;
    }

    public void setAvatar(String avatar) {
        this.avatar = avatar;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
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

    public String getEthnicity() {
        return ethnicity;
    }

    public void setEthnicity(String ethnicity) {
        this.ethnicity = ethnicity;
    }

    public double[] getLocation() {
        return location;
    }

    public void setLocation(double[] location) {
        this.location = location;
    }

    public long getActiveTime() {
        return activeTime;
    }

    public void setActiveTime(long activeTime) {
        this.activeTime = activeTime;
    }
}
