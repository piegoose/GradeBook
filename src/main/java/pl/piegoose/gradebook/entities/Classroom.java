package pl.piegoose.gradebook.entities;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.math.BigDecimal;
import java.time.DayOfWeek;
import java.time.LocalTime;
import java.util.Date;

@Entity
@NoArgsConstructor
@Getter
@Setter
@Table(name="classroom")
public class Classroom {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    private Long id; // czemu nie mozna BIG DECIMAL
    @Column(nullable = false, unique = true)
    private String name;
    private Date schoolYear;
}
