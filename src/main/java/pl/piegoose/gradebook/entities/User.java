package pl.piegoose.gradebook.entities;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@Getter
@Setter
@Entity
@Table(name = "\"user\"")
public class User {


    @GeneratedValue
    @Id
    private Long id;
    private String email;
    @Enumerated(value = EnumType.STRING)
    private Role role;
}
