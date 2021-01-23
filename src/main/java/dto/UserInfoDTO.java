/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dto;

import entities.UserInfo;

/**
 *
 * @author Madsj
 */
public class UserInfoDTO {
    
    
    private String name;
    private int age;
    private double weight;

    public UserInfoDTO() {
    }

    public UserInfoDTO(UserInfo userinfo) {
        this.name = userinfo.getName();
        this.age = userinfo.getAge();
        this.weight = userinfo.getWeight();
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

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }
    
    
}


