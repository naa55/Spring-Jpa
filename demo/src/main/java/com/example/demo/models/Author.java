package com.example.demo.models;

import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.SuperBuilder;

import java.time.LocalDateTime;
import java.util.List;


@EqualsAndHashCode(callSuper = true)
@Data
@NoArgsConstructor
@AllArgsConstructor
@SuperBuilder
@Entity
public class Author extends BaseEntity {


//    @Id
//    @GeneratedValue

//    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "author_sequence")
//    @SequenceGenerator(name = "author_sequence", sequenceName = "author_sequence", allocationSize = 1)
//    private Integer id;

    private String firstName;

    private String lastName;

    @Column(unique = true, nullable = true)
    private String email;

    private int age;


    @ManyToMany(mappedBy = "authors")
    private List<Course> courses;

    @Column(
            updatable = false,
            nullable = false
    )
    private LocalDateTime createdAt;

    @Column(
            insertable = false,
            nullable = false
    )
    private LocalDateTime lastModified;


}
