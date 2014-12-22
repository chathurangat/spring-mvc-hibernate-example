package com.chathurangaonline.samples.model;

import org.hibernate.validator.constraints.NotEmpty;
import org.springframework.stereotype.Component;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

@Component
@Entity
@Table(name = "user_role")
public class UserRole implements Serializable{

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private long id;
    @NotEmpty
    private String roleNameEnglish;
    @NotEmpty
    private String roleNameSinhala;
    @NotEmpty
    private String roleNameTamil;
    private Date dateAdded;
//    private User roleAddedBy;
    private String status;


    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }


    public String getRoleNameEnglish() {
        return roleNameEnglish;
    }

    public void setRoleNameEnglish(String roleNameEnglish) {
        this.roleNameEnglish = roleNameEnglish;
    }

    public String getRoleNameTamil() {
        return roleNameTamil;
    }

    public void setRoleNameTamil(String roleNameTamil) {
        this.roleNameTamil = roleNameTamil;
    }

    public String getRoleNameSinhala() {
        return roleNameSinhala;
    }

    public void setRoleNameSinhala(String roleNameSinhala) {
        this.roleNameSinhala = roleNameSinhala;
    }

    public Date getDateAdded() {
        return dateAdded;
    }

    public void setDateAdded(Date dateAdded) {
        this.dateAdded = dateAdded;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
