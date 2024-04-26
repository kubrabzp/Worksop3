package Kodlamaio;


import java.util.List;

public class Main {
    public static void main(String[] args) {

        CourseManager courseManager = new CourseManager();
        InstructorManager instructorManager = new InstructorManager();
        CategoryManager categoryManager = new CategoryManager();

        List<Course> courses = courseManager.getAll();
        List<Instructor> instructors = instructorManager.getAll();
        List<Category> categories = categoryManager.getAll();

        for (Course course : courses) {
            System.out.println("Course id:" + course.getCourseId() + " -Course name:" + course.getCourseName() +
                    " -Course Instructor:" + course.getCourseInstructor() +
                    " -Course Description:" + course.getCourseDescription() + " Course Price:" +
                    course.getCoursePrice());
        }

        System.out.println("--------------------");
        Course updateCourse = new Course();
        updateCourse.setCourseId(1);
        updateCourse.setCourseName("Programlamaya Giriş için Temel Kurs");
        updateCourse.setCourseInstructor("Halit Enes Kalaycı");
        updateCourse.setCourseDescription("PYTHON, JAVA, C# gibi tüm programlama dilleri.");
        updateCourse.setCoursePrice("Ücretli");
        courseManager.updateCourse(updateCourse);

        System.out.println("Güncelleme yaptıktan sonra");
        for (Course course : courses) {
            System.out.println("Course id:" + course.getCourseId() + " -Course name:" + course.getCourseName() +
                    " -Course Instructor:" + course.getCourseInstructor() +
                    " -Course Description:" + course.getCourseDescription() + " -Course Price:" +
                    course.getCoursePrice());
        }

        System.out.println("--------------------");
        System.out.println("Listeden veri silindikten sonra:");

        courseManager.deleteCourse(2);

        for (Course course : courses) {
            System.out.println("Course id:" + course.getCourseId() + " -Course name:" + course.getCourseName() +
                    " -Course Instructor:" + course.getCourseInstructor() +
                    " -Course Description:" + course.getCourseDescription() + " -Course Price:" +
                    course.getCoursePrice());
        }

        System.out.println("---------------------");
        System.out.println("İD'ye göre eğitmen bulma: ");

        Instructor instructor = new Instructor();
        Instructor getInstructor = instructorManager.getById(1);
        System.out.println("Id:" + getInstructor.getInstructorId() +
                " -Instructor name: " + getInstructor.getInstructorName());
    }
}