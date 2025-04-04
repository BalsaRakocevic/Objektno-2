package model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

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

    public Ispit(String datum, Long id, Integer ocena) {
        super();
        this.datum = datum;
        this.id = id;
        this.ocena = ocena;
     
    }



    
    public Long getId() {
        return id;
    }

    public String getDatum() {
        return datum;
    }

    public Integer getOcena() {
        return ocena;
    }

    public Student getStudent() {
        return student;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setDatum(String datum) {
        this.datum = datum;
    }

    public void setOcena(Integer ocena) {
        this.ocena = ocena;
    }

    public void setStudent(Student student) {
        this.student = student;
    }

    
   
}
