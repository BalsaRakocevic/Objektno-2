package model;

import jakarta.persistence.*;

@Entity
public class Ispit {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String datum;
    private Integer ocena;

    @ManyToOne
    @JoinColumn(name = "student_id")
    private Student student;

    // Getteri i setteri
}
