package pl.piegoose.gradebook.dto;

import java.time.DayOfWeek;
import java.time.LocalTime;

public class LessonSlotCreateDto {

    Long classroomId;
    DayOfWeek dayOfWeek;
    LocalTime startTime;
    String subject ;
}
