package exceptionsInJava.assignment;

import exceptionsInJava.exceptions.ExamFeeNotPaidException;
import exceptionsInJava.exceptions.InvalidRegistrationNumberException;
import exceptionsInJava.exceptions.StudentNotRegisteredException;

class ExamSystem{
    private boolean hasRegistered;
    private String registrationNo;
    private boolean hasPaidFees;

    public ExamSystem(){}
    public ExamSystem(boolean hasRegistered,String registrationNo,boolean hasPaidFees){
        this.hasRegistered = hasRegistered;
        this.registrationNo = registrationNo;
        this.hasPaidFees = hasPaidFees;
    }

    public boolean getHasRegistered() {
        return hasRegistered;
    }

    public void setHasRegistered(boolean hasRegistered) {
        this.hasRegistered = hasRegistered;
    }

    public String getRegistrationNo() {
        return registrationNo;
    }

    public void setRegistrationNo(String registrationNo) {
        this.registrationNo = registrationNo;
    }

    public boolean getHasPaidFees() {
        return hasPaidFees;
    }

    public void setHasPaidFees(boolean hasPaidFees) {
        this.hasPaidFees = hasPaidFees;
    }

    public boolean isEligibleForExam() throws StudentNotRegisteredException, InvalidRegistrationNumberException, ExamFeeNotPaidException {
        if (!hasRegistered){
            throw new StudentNotRegisteredException("Student not Registered");
        } else if (registrationNo.length() != 6) {
            throw new InvalidRegistrationNumberException("Invalid registration number");
        }else if (!hasPaidFees){
            throw new ExamFeeNotPaidException("Exam fees is not paid");
        }else {
            return true;
        }
    }
}
public class Problem3 {

    public static void main(String[] args) {
        ExamSystem student = new ExamSystem(true,"12356",true);

        try {
            System.out.println(student.isEligibleForExam());
        }catch (StudentNotRegisteredException e){
            System.out.println(e.getMessage());
        }catch (InvalidRegistrationNumberException e){
            System.out.println(e.getMessage());
        }catch (ExamFeeNotPaidException e){
            System.out.println(e.getMessage());
        }
    }
}
