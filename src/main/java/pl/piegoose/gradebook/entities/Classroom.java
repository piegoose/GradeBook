package pl.piegoose.gradebook.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;

@Getter
@Setter
@NoArgsConstructor
@Table(name = "classroom")
@Entity

public class Classroom {
    @GeneratedValue
    @Id
    private Long id;
    private String name;
    private LocalDate schoolYear;

}