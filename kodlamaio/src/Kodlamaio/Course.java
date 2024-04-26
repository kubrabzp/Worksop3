package Kodlamaio;

public class Course {

    private int courseId;
    private String courseName;
    private String courseDescription;
    private String coursePrice;
    private String courseInstructor;


    public int getCourseId(){
        return this.courseId;
    }

    public void setCourseId(int newCourseId){
        this.courseId = newCourseId;
    }

    public String getCourseName(){
        return this.courseName;
    }
    public void setCourseName(String newCourseName){
        this.courseName = newCourseName;
    }

    public String getCourseDescription(){
        return this.courseDescription;
    }

    public void setCourseDescription(String newCourseDescription){
        this.courseDescription = newCourseDescription;
    }

    public String getCoursePrice(){
        return this.coursePrice;
    }

    public void setCoursePrice(String newCoursePrice){
        this.coursePrice = newCoursePrice;
    }

    public String getCourseInstructor(){
        return this.courseInstructor;
    }
    public void setCourseInstructor(String newCourseInstructor){
        this.courseInstructor = newCourseInstructor;
    }

    public Course(int id,String name, String description,String instructor, String price){
        this.courseId = id;
        this.courseName = name;
        this.courseDescription = description;
        this.courseInstructor = instructor;
        this.coursePrice = price;
    }

    public Course(){

    }

}
