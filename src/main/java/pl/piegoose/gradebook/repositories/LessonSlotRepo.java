package pl.piegoose.gradebook.repositories;

import org.hibernate.annotations.ManyToAny;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import pl.piegoose.gradebook.entities.LessonSlot;

import java.time.DayOfWeek;
import java.util.List;

public interface LessonSlotRepo extends JpaRepository<LessonSlot, Long> {



    List<LessonSlot> findByClassroom_IdAndDayOfWeek(Long classroomId, DayOfWeek dayOfWeek);

    List<LessonSlot> findByClassroom_IdOrderByDayOfWeekAscStartTimeAsc(Long classroomId);

}
