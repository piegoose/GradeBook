package pl.piegoose.gradebook.entities;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.sql.Time;
import java.time.DayOfWeek;


@NoArgsConstructor
@Getter
@Setter
@Entity
@Table(
        name = "lesson_slots",
        uniqueConstraints = @UniqueConstraint(
                columnNames = {"classroom_id", "day_of_week", "start_time"}
        )
)
public class LessonSlot {

    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    private Long id;
    @Enumerated(EnumType.STRING)
    @Column(name= "day_of_week")
    private DayOfWeek dayOfWeek;
    @NotNull
    @Column(name = "start_time")
    private Time startTime;
    @Column(name="subject")
    private String subject;
    @ManyToOne(optional = false)
    @JoinColumn(name = "classroom_id", nullable = false)
    private Classroom classroom;
}
