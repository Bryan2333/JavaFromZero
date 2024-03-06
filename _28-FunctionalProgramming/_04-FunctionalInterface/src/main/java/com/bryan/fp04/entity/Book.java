package com.bryan.fp04.entity;

import lombok.*;
@Data
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
public class Book {
    private Long id;
    private String name;
    private String category;
    private Integer score;
    private String description;
}
