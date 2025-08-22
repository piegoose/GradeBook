package pl.piegoose.gradebook.repositories;

import org.hibernate.annotations.ManyToAny;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import pl.piegoose.gradebook.entities.LessonSlot;

import java.time.DayOfWeek;
import java.util.List;

public interface LessonSlotRepo extends JpaRepository<LessonSlot, Long> {



//@Query("SELECT l FROM LessonSlot l where l.class = :classroomId and l.dayOfWeek = :dayOfWeek ")
 /List<LessonSlot> findByClassroomIdAndDayOfWeek(Long classroomId, DayOfWeek day);

  //  @Query("select l from LessonSlot l where l.TeacherName = :teacherName and l.dayOfWeek = :day")
  //  List<LessonSlot> findByTeacherNameAndDayOfWeek(String teacherName, DayOfWeek day);

}
