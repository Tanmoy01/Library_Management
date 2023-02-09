package com.example.Sql_intro;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity //Hibernate can identify whose attributes to pick for table creation
@Table(name = "user_info") // to provide table name

public class User {
    @Id // it is written on attribute which has to become the primary key
    @Column(unique = true)
    private int id; // id the primary key

    private String name;

    private String age;

    private String mobNo;

    @Column(unique = true)
    private String email;

    @Column(name = "country_name")
    private String country;

    public User(){

    }

    public User(int id, String name, String age, String mobNo) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.mobNo= mobNo;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String getMobNo() {
        return mobNo;
    }

    public void setMobNo(String mobNo) {
        this.mobNo = mobNo;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }
}


