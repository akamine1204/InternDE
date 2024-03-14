package Tuan1_1_oop_solid.QuanLyNhanVien;

public class Intern extends Employee{
    private String Majors;
    private int Semester;
    private String University_name;

    public Intern(String Fullname, long Phone,  String majors, int semester, String university_name) {
        super( Fullname, Phone, 2);
        Majors = majors;
        Semester = semester;
        University_name = university_name;
    }

    public String getMajors() {
        return Majors;
    }

    public void setMajors(String majors) {
        Majors = majors;
    }

    public int getSemester() {
        return Semester;
    }

    public void setSemester(int semester) {
        Semester = semester;
    }

    public String getUniversity_name() {
        return University_name;
    }

    public void setUniversity_name(String university_name) {
        University_name = university_name;
    }


    public void ShowMe(){
        System.out.println("Thong tin nhan vien: ID="+getId()+" - FullName= "+getFullName()+" - Phone: "+getPhone()+" - EmployeeType: "+this.getEmployee_type()+" - Majors= "+getMajors()+" - Semester: "+getSemester()+" - UniversityName: "+this.getUniversity_name()+".");
    }
}
