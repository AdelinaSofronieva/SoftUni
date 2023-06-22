package com.example.SpaceTravelAgency.models.dtos;

import com.example.SpaceTravelAgency.models.validation.FieldMatch;
import com.example.SpaceTravelAgency.models.validation.UniqueUserEmail;
import jakarta.validation.constraints.*;

import java.math.BigDecimal;

@FieldMatch(
        first = "password",
        second = "confirmPassword",
        message = "Passwords do not match."
)

public class UserRegisterDTO {

    @NotEmpty(message = "User email should be provided.")
    @Email(message = "User email should be valid.")
    @UniqueUserEmail(message = "User email should be unique.")
    private String email;

    @NotEmpty
    @Size(min = 2, max = 20)
    private String firstName;

    @NotEmpty
    @Size(min = 2, max = 20)
    private String lastName;

    @NotNull
    @Min(0)
    @Max(120)
    private int age;

    @NotNull
    @PositiveOrZero
    private double monthlyIncome;

    public double getMonthlyIncome() {
        return monthlyIncome;
    }

    public void setMonthlyIncome(double monthlyIncome) {
        this.monthlyIncome = monthlyIncome;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @NotEmpty
    @Size(min = 5)
    private String password;

    private String confirmPassword;

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
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

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getConfirmPassword() {
        return confirmPassword;
    }

    public void setConfirmPassword(String confirmPassword) {
        this.confirmPassword = confirmPassword;
    }
}
