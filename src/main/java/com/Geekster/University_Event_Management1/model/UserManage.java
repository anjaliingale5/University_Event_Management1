package com.Geekster.University_Event_Management1.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.sql.Time;
import java.time.LocalDate;
import java.util.Date;



@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class UserManage {

    @Id
    private Integer UserId;
    @NotBlank
    private String username;

    private LocalDate DateOfBirth;

    @Email
    private String email;

    private String PhoneNumber;

    private Date date;

    private Time time;


}
