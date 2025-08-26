package com.example.consumer.entity;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
public class UserInformation {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private Integer id;
    private String userName;
    private String email;
    private LocalDateTime registeredDate;
    private String threadName;

    public UserInformation() {
    }

    public UserInformation(Integer id, String userName, String email, LocalDateTime registeredDate, String threadName) {
        this.id = id;
        this.userName = userName;
        this.email = email;
        this.registeredDate = registeredDate;
        this.threadName = threadName;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public LocalDateTime getRegisteredDate() {
        return registeredDate;
    }

    public void setRegisteredDate(LocalDateTime registeredDate) {
        this.registeredDate = registeredDate;
    }

    public String getThreadName() {
        return threadName;
    }

    public void setThreadName(String threadName) {
        this.threadName = threadName;
    }

    @Override
    public String toString() {
        return "UserInformation{" +
                "id=" + id +
                ", userName='" + userName + '\'' +
                ", email='" + email + '\'' +
                ", registeredDate=" + registeredDate +
                ", threadName='" + threadName + '\'' +
                '}';
    }
}
