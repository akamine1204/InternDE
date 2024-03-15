package Tuan1_1_oop_solid.QuanLyNhanVien;

import java.util.ArrayList;

public class main {
    public static void main(String args[]){
        EmpManager manager = new EmpManager(new ArrayList<Employee>());
        manager.addEmployee(new Experience("TranDucHoang",1234567890,1,"Java"));
        manager.addEmployee(new Fresher("NgoMinhDat",12111111,2023,"Gioi","BKHN"));
        manager.addEmployee(new Intern("TranTrungDung",3333333,"CNTT",20232,"UET"));

        manager.ShowAllIntern();
        manager.ShowAllExperience();
        manager.ShowAllFresher();
    }

}
