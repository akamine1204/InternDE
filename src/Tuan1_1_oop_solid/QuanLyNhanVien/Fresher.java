package Tuan1_1_oop_solid.QuanLyNhanVien;

public class Fresher extends Employee{
    private int GraduationDate;
    private String GraduationRank;
    private String Education;

    public Fresher(String Fullname, long Phone, int graduationDate, String graduationRank, String education) {
        super( Fullname, Phone, 1);
        GraduationDate = graduationDate;
        GraduationRank = graduationRank;
        Education = education;
    }

    public int getGraduationDate() {
        return GraduationDate;
    }

    public void setGraduationDate(int graduationDate) {
        GraduationDate = graduationDate;
    }

    public String getGraduationRank() {
        return GraduationRank;
    }

    public void setGraduationRank(String graduationRank) {
        GraduationRank = graduationRank;
    }

    public String getEducation() {
        return Education;
    }

    public void setEducation(String education) {
        Education = education;
    }


    public void ShowMe(){
        System.out.println("Thong tin nhan vien: ID="+getId()+" - FullName= "+getFullName()+" - Phone: "+getPhone()+" - EmployeeType: "+this.getEmployee_type()+" - GraduateDate:"+this.getGraduationDate()+" - GraduateRank:"+this.getGraduationRank()+" - Education:"+this.getEducation()+".");
    }



}
