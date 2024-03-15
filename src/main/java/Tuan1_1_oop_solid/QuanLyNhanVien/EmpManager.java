package Tuan1_1_oop_solid.QuanLyNhanVien;

import java.util.List;

public class EmpManager implements ManageEmployee{
    private List<Employee> list;

    public EmpManager(List<Employee> list) {
        this.list = list;
    }

    @Override
    public void addEmployee(Employee e) {
        for(Employee em : list){
            if(em.getFullName().equals(e.getFullName()) && em.getEmployee_type()==e.getEmployee_type() && em.getPhone()==e.getPhone())
            {
                System.out.println("Nhan vien da ton tai!!");
                return;
            }
        }
        list.add(e);
    }



    @Override
    public void ShowAllExperience() {
        System.out.println("Danh sach cac nhan vien Experience: ");
        int count = 0;
        for(Employee em : list){
            if(em.getEmployee_type()==0){
                count++;
                em.ShowMe();
            }
        }
        if(count==0) System.out.println("Khong co nhan vien Experience trong DS!!!");
        System.out.println("==================================================");

    }

    @Override
    public void ShowAllFresher() {
        System.out.println("Danh sach cac nhan vien Fresher: ");
        int count = 0;
        for(Employee em : list){
            if(em.getEmployee_type()==1){
                count++;
                em.ShowMe();
            }
        }
        if(count==0) System.out.println("Khong co nhan vien Fresher trong DS!!!");
        System.out.println("==================================================");
    }


    @Override
    public void ShowAllIntern() {
        System.out.println("Danh sach cac nhan vien Intern: ");
        int count = 0;
        for(Employee em : list){
            if(em.getEmployee_type()==2){
                count++;
                em.ShowMe();
            }
        }
        if(count==0) System.out.println("Khong co nhan vien Intern trong DS!!!");
        System.out.println("==================================================");
    }
}
