package com.dw.forest.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.time.LocalDate;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@ToString
public class CourseDTO {
    private String title;
    private String description;
    private String content;
    private long price;
    private LocalDate createdAt;
    private String categoryName;
}
