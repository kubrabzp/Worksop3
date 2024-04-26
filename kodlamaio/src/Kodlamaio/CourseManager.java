package Kodlamaio;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class CourseManager {

    private List<Course> courses;

    public CourseManager(){
        courses = new ArrayList<Course>();
        courses.add(new Course(1,"Yazılım Geliştirici Yetiştirme Kampı(C# + Angular)",
                "2 ay sürecek","Engin Demirog","Ücretsiz"));

        courses.add(new Course(2,"Senior Yazılım Geliştirici Yetiştirme Kampı",
                "Duyuruları buradan yapıyoruz","Halit Enes Kalaycı","Ücretsiz"));
    }

    public List<Course> getAll(){
        return courses;
    }

    public void addCourse(Course course){
        courses.add(course);
    }

    public void deleteCourse(int id){
        Iterator<Course> courseIterator = courses.iterator();
        while (courseIterator.hasNext()){
            Course course = courseIterator.next();
            if (course.getCourseId() == id){
                courseIterator.remove();
            }
        }
    }

    public void updateCourse(Course course){
        for (Course updateCourse:courses){
            if (updateCourse.getCourseId() == course.getCourseId()){
                updateCourse.setCourseId(course.getCourseId());
                updateCourse.setCourseName(course.getCourseName());
                updateCourse.setCourseDescription(course.getCourseDescription());
                updateCourse.setCoursePrice(course.getCoursePrice());
                updateCourse.setCourseInstructor(course.getCourseInstructor());

            }
        }
    }

    public Course getById(int id){
        for (Course course:courses){
            if (course.getCourseId() == id){
                return course;
            }
        }
        return null;
    }
}
