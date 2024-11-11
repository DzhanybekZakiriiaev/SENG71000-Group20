package com.example.SENG71000_Group20.domain.common;

import java.time.LocalDateTime;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public abstract class BaseClass{
    private Long id;
    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;

}
