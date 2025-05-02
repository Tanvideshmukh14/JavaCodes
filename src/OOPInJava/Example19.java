package OOPInJava;

import java.util.Random;

class StudentRecord {
    private String studentName;
    private String studentEmail;
    private int studentId;

    public StudentRecord(){
        Random rad = new Random();
        this.studentId = rad.nextInt(19000000);

    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public String getStudentEmail() {
        return studentEmail;
    }

    public void setStudentEmail(String studentEmail) {
        this.studentEmail = studentEmail;
    }

    public int getStudentId() {
        return studentId;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    @Override
    public String toString() {
        return "StudentRecord{" +
                "studentName='" + studentName + '\'' +
                ", studentEmail='" + studentEmail + '\'' +
                ", studentId=" + studentId +
                '}';
    }
}
class ResonanceStudentRecord extends StudentRecord{
    private String batchName;
    private String courseName;

    public ResonanceStudentRecord() {
        super();
    }

    public String getBatchName() {
        return batchName;
    }

    public void setBatchName(String batchName) {
        this.batchName = batchName;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    @Override
    public String toString() {
        return "ResonanceStudentRecord{" +
                "batchName='" + batchName + '\'' +
                ", courseName='" + courseName + '\'' +
                '}';
    }
}
public class Example19 {
    public static void main(String[] args) {
        StudentRecord studentRecord = new StudentRecord();

        System.out.println(studentRecord);

        studentRecord.setStudentName("Tanvi Deshmukh");
        studentRecord.setStudentEmail("abc@gmail.com");
        System.out.println(studentRecord);

        ResonanceStudentRecord r1 = new ResonanceStudentRecord();
        r1.setStudentName("Ruchi");
        r1.setStudentEmail("ruchi@gmail.com");
        r1.setBatchName("Batch-1");
        r1.setCourseName("NEET");
        System.out.println(r1);

    }
}
