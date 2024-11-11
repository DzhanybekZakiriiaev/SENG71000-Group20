package com.example.SENG71000_Group20.domain.trip;

import com.example.SENG71000_Group20.domain.common.BaseClass;
import com.example.SENG71000_Group20.domain.common.Location;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDateTime;
import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Trip extends BaseClass {
    private LocalDateTime startTime;
    private LocalDateTime endTime;
    private Long distanceTraveled;
    private Long averageSpeed;
    private Long maxSpeed;
    private Location startLocation;
    private Location endLocation;
    private List<TripLog> logs;
}
