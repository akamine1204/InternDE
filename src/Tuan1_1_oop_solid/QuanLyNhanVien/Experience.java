package Tuan1_1_oop_solid.QuanLyNhanVien;

public class Experience extends Employee{

    private int ExpInYear;
    private String ProSkill;

    public int getExpInYear() {
        return ExpInYear;
    }

    public void setExpInYear(int expInYear) {
        ExpInYear = expInYear;
    }

    public String getProSkill() {
        return ProSkill;
    }

    public void setProSkill(String proSkill) {
        ProSkill = proSkill;
    }

    public Experience(String Fullname, long Phone) {
        super(Fullname, Phone, 0);
    }



    public Experience(String Fullname, long Phone,int ExpInYear, String ProSkill) {
        super(Fullname, Phone, 0);
        this.ExpInYear=ExpInYear;
        this.ProSkill = ProSkill;
    }

    public void ShowMe(){
        System.out.println("Thong tin nhan vien: ID="+getId()+" - FullName= "+getFullName()+" - Phone: "+getPhone()+" - EmployeeType: "+this.getEmployee_type()+" - ExpInYear:"+this.getExpInYear()+" - Skill:"+this.getProSkill());
    }



}
