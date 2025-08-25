package pl.piegoose.gradebook.dto;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

public class ClassroomDto {

    @NotBlank
    @NotNull
    Long id;
    String name;
}
