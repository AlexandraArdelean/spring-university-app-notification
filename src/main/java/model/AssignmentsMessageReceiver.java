package model;

public class AssignmentsMessageReceiver {
    private Long schedulesId;
    private String universityDepartment;
    private String universityYear;
    private String semesterNumber;

    public Long getSchedulesId() {
        return schedulesId;
    }

    public void setSchedulesId(Long schedulesId) {
        this.schedulesId = schedulesId;
    }

    public String getUniversityDepartment() {
        return universityDepartment;
    }

    public void setUniversityDepartment(String universityDepartment) {
        this.universityDepartment = universityDepartment;
    }

    public String getUniversityYear() {
        return universityYear;
    }

    public void setUniversityYear(String universityYear) {
        this.universityYear = universityYear;
    }

    public String getSemesterNumber() {
        return semesterNumber;
    }

    public void setSemesterNumber(String semesterNumber) {
        this.semesterNumber = semesterNumber;
    }

    @Override
    public String toString() {
        return "assignmentsMessageReceiver{" +
                "schedulesId=" + schedulesId +
                ", universityDepartment='" + universityDepartment + '\'' +
                ", universityYear='" + universityYear + '\'' +
                ", semesterNumber='" + semesterNumber + '\'' +
                '}';
    }
}
