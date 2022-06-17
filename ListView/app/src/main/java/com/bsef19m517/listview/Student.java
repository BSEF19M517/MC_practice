package com.bsef19m517.listview;

public class Student {
    private String name;
    private String id;
    private int age;
    private int imgId;

    public Student(String name, String id, int age, int imgId) {
        this.name = name;
        this.id = id;
        this.age = age;
        this.imgId = imgId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getImgId() {
        return imgId;
    }

    public void setImgId(int imgId) {
        this.imgId = imgId;
    }


}
