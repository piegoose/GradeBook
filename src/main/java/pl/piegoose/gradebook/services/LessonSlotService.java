package pl.piegoose.gradebook.services;


import org.springframework.stereotype.Service;
import pl.piegoose.gradebook.entities.LessonSlot;
import pl.piegoose.gradebook.repositories.LessonSlotRepo;

import java.time.DayOfWeek;

@Service
public class LessonSlotService {

    LessonSlotRepo lessonSlotRepo;

//    public void findByClassroomIdAndDayOfWeekLong (Long classroomId, DayOfWeek day)
//    {
//        lessonSlotRepo.findByClassroomIdAndDayOfWeek(classroomId,day);
//    }
}
