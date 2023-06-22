package com.example.SpaceTravelAgency.models.entities;

import com.example.SpaceTravelAgency.models.enums.UserRoleEnum;
import com.example.SpaceTravelAgency.models.enums.UserTypeEnum;
import jakarta.persistence.*;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "users")
public class UserEntity extends BaseEntity{
    @Column(nullable = false)
    private String firstName;

    @Column(nullable = false)
    private String lastName;

    @Column(nullable = false,
            unique = true)
    private String email;

    private String password;

    private int age;

    @Column(nullable = false)
    private double monthlyIncome;

    private boolean isActive;

    @ManyToMany(fetch = FetchType.EAGER)
    private List<UserRoleEntity> userRoles;

    @Enumerated(EnumType.STRING)
    private UserTypeEnum userType;

    @Column(name = "image_URLs")
    private String imageUrl;

    public UserEntity() {
        this.userRoles = new ArrayList<>();
    }

    public UserEntity addRole(UserRoleEntity userRole) {
        this.userRoles.add(userRole);
        return this;
    }

    public void addUserType() {
        if (this.getMonthlyIncome() > 50000) {

            if (age <= 18) {
                this.userType = UserTypeEnum.child;
            } else if (age <= 65) {
                this.userType = UserTypeEnum.adult;
            } else {
                this.userType = UserTypeEnum.retired;
            }
        } else {
            this.userType = UserTypeEnum.notSuitable;
        }
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getMonthlyIncome() {
        return monthlyIncome;
    }

    public void setMonthlyIncome(double monthlyIncome) {
        this.monthlyIncome = monthlyIncome;
    }

    public boolean isActive() {
        return isActive;
    }

    public void setActive(boolean active) {
        isActive = active;
    }

    public List<UserRoleEntity> getUserRoles() {
        return userRoles;
    }

    public void setUserRoles(List<UserRoleEntity> userRoles) {
        this.userRoles = userRoles;
    }

    public UserTypeEnum getUserType() {
        return userType;
    }

    public void setUserType(UserTypeEnum userType) {
        this.userType = userType;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }
}
