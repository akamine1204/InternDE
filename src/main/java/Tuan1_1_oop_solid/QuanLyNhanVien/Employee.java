package Tuan1_1_oop_solid.QuanLyNhanVien;

public class Employee implements ShowInfo {
    private int id;
    private String FullName;
    private long Phone;
    int Employee_type; //0:experience, 1:fresher, 2:intern
    private static int Employee_count = 0;

    public Employee(String Fullname,long Phone, int type) {
        this.id=Employee_count+1;
        this.FullName = Fullname;
        this.Phone = Phone;
        this.Employee_type=type;
        this.Employee_count++;
    }

    public int getId() {
        return id;
    }



    public String getFullName() {
        return FullName;
    }

    public void setFullName(String fullName) {
        FullName = fullName;
    }

    public long getPhone() {
        return Phone;
    }

    public void setPhone(int phone) {
        Phone = phone;
    }

    public int getEmployee_type() {
        return Employee_type;
    }

    public void setEmployee_type(int employee_type) {
        Employee_type = employee_type;
    }

    public static int getEmployee_count() {
        return Employee_count;
    }


    public void ShowMe(){
        System.out.println("Thong tin nhan vien: ID="+getId()+" - FullName= "+getFullName()+" - Phone: "+getPhone()+" - EmployeeType: "+this.getEmployee_type()+".");
    }
}
