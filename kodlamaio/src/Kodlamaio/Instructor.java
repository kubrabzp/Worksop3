package Kodlamaio;

public class Instructor {

    private int instructorId;
    private String instructorName;
    private int instructorCourseId;


    public int getInstructorId(){
        return this.instructorId;
    }

    public void setInstructorId(int newId){
        this.instructorId = newId;
    }

    public String getInstructorName(){
        return this.instructorName;
    }

    public void setInstructorName(String newInstructorName){
        this.instructorName = newInstructorName;
    }

    public int getInstructorCourseId(){
        return this.instructorCourseId;
    }

    public void setInstructorCourseId(int newInstructorCourseId){
        this.instructorCourseId = newInstructorCourseId;
    }

    public Instructor(int id,String name, int courseId){
        this.instructorId = id;
        this.instructorName = name;
        this.instructorCourseId = courseId;
    }

    public Instructor(){

    }
}
