package Kodlamaio;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class InstructorManager {

    private List<Instructor> instructors;

    public InstructorManager() {
        instructors = new ArrayList<Instructor>();
        instructors.add(new Instructor(1, "Engin Demirog",1));
        instructors.add(new Instructor(2, "Halit Enes Kalaycı",2));
    }

    public List<Instructor> getAll() {
        return instructors;
    }

    public void addInstructor(Instructor instructor) {
        instructors.add(instructor);
    }

    public void deleteInstructor(int id) {
        Iterator<Instructor> instructorIterator = instructors.iterator();
        while (instructorIterator.hasNext()) {
            Instructor instructor = instructorIterator.next();
            if (instructor.getInstructorId() == id) {
                instructorIterator.remove();
            }
        }
    }

    public void updateInstructor(Instructor instructor) {
        for (Instructor updateInstructor : instructors) {
            if (updateInstructor.getInstructorId() == instructor.getInstructorId()) {
                updateInstructor.setInstructorId(instructor.getInstructorId());
                updateInstructor.setInstructorName(instructor.getInstructorName());
            }

        }
    }

    public Instructor getById(int id){
        for (Instructor instructor:instructors){
            if (instructor.getInstructorId() == id){
                return instructor;
            }
        }
        return null;
    }
}
