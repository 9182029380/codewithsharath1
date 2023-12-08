package com.centum.codeWithSharath.entity;

import com.fasterxml.jackson.annotation.JsonManagedReference;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.util.Set;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Data
@Table(name = "STUDENT_TABLE")
public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public Long id;
    public String name;
    public String age;
    public String dept;
    @ManyToMany(fetch = FetchType.LAZY,cascade = CascadeType.ALL)
    @JoinTable(name = "STUDENT_COUSE_TABLE",
            joinColumns ={
            @JoinColumn(name = "student_id",referencedColumnName = "id")},
            inverseJoinColumns = {
            @JoinColumn(name = "course_id",referencedColumnName ="id")
             })

    private Set<Course> courses;
}
