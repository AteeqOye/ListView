package com.example.adapterlistview;

public class Person {
    private String name;
    private String birthday;
    private String sex;

    public Person(String name, String birthday, String sex) {
        this.name = name;
        this.birthday = birthday;
        this.sex = sex;
    }
    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }


    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }
    public String getBirthday() {
        return birthday;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }
    public String getSex() {
        return sex;
    }


}



