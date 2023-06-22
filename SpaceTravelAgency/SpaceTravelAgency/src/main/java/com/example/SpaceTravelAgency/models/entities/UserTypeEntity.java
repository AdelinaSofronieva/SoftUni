package com.example.SpaceTravelAgency.models.entities;

import com.example.SpaceTravelAgency.models.enums.UserRoleEnum;
import com.example.SpaceTravelAgency.models.enums.UserTypeEnum;
import jakarta.persistence.*;

@Entity
@Table(name = "user_types")
public class UserTypeEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    @Enumerated(EnumType.STRING)
    private UserTypeEnum userType;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public UserTypeEnum getUserType() {
        return userType;
    }

    public void setUserType(UserTypeEnum userType) {
        this.userType = userType;
    }
}
