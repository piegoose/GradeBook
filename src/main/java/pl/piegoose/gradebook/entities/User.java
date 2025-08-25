package pl.piegoose.gradebook.entities;

import jakarta.annotation.Nullable;
import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@Getter
@Setter
@Entity
@Table(name = "user")
public class User {


    @GeneratedValue
    @Id
    private Long id;
    private String email;
    @Enumerated(value = EnumType.STRING)
    private Role role;
}
