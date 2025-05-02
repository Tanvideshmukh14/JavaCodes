package exceptionsInJava.assignment;

import exceptionsInJava.exceptions.BacklogException;
import exceptionsInJava.exceptions.InvalidApplicationIDException;
import exceptionsInJava.exceptions.LowGradeException;

class UniversityAdmissionSystem{
    private int grade;
    private boolean hasBacklogs;
    private String applicationId;


    public UniversityAdmissionSystem() {
    }

    public UniversityAdmissionSystem(int grade, boolean hasBacklogs, String applicationId) {
        this.grade = grade;
        this.hasBacklogs = hasBacklogs;
        this.applicationId = applicationId;
    }

    public boolean isEligibleForAdmission() throws LowGradeException, BacklogException, InvalidApplicationIDException {
        if (grade < 75){
            throw new LowGradeException("Grade must be above 75");
        } else if (!hasBacklogs) {
            throw new BacklogException("Student must not have any backlogs");
        } else if (applicationId.length() != 10) {
            throw new InvalidApplicationIDException("Application id is invalid");
        }else {
            return true;
        }
    }
}
public class Problem6 {
    public static void main(String[] args) {
        UniversityAdmissionSystem student = new UniversityAdmissionSystem(76, true, "1234567890");

        try {
            System.out.println("Is this student is eligible for admission : " + student.isEligibleForAdmission());
        }catch (LowGradeException e){
            System.out.println(e.getMessage());
        }catch (BacklogException e){
            System.out.println(e.getMessage());
        }catch (InvalidApplicationIDException e){
            System.out.println(e.getMessage());
        }
    }
}
