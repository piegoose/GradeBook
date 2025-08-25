package pl.piegoose.gradebook.dto;

import java.time.DayOfWeek;
import java.time.LocalTime;

public class LessonSlotViewDto {

    Long id;
    Long classroomId;
    DayOfWeek dayOfWeek;
    LocalTime startTime;
    String subject;

}
