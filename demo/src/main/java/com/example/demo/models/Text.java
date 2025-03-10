package com.example.demo.models;


import jakarta.persistence.Entity;
import lombok.*;
import lombok.experimental.SuperBuilder;



@EqualsAndHashCode(callSuper = true)
@Entity
@NoArgsConstructor
@AllArgsConstructor
@SuperBuilder
@Getter
@Setter
public class Text extends Resource {
    private String content;
}
