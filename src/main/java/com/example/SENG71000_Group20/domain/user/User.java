package com.example.SENG71000_Group20.domain.user;

import com.example.SENG71000_Group20.domain.common.BaseClass;
import com.example.SENG71000_Group20.domain.trip.Trip;
import lombok.AllArgsConstructor;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDateTime;
import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class User extends BaseClass {
    private String name;
    private String username;
    private String email;
    private String phoneNumber;
    private String password;
    private String role;
    private Long drivingScore;
    private LocalDateTime lastLogin;
    private List<Trip> trips;
}
