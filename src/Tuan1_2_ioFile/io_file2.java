package Tuan1_2_ioFile;

/*#### 1.2. Yêu cầu (2) Đọc ghi file
        - viết trương trình java đọc ghi file theo 2 dạng binary và text (trong class io_file)
        - viết trương trình java thao tác với file và thư mục: list các file, đọc nội dung file (trong class io_file2)
        */

import java.io.*;

public class io_file2 {
    public static void listFile(String pathname) {
        File f = new File(pathname);
        if (!f.exists()) {
            System.out.println("File theo duong dan khong ton tai!!");
            return;
        }

        if (f.isFile()) {
            System.out.println("\nĐường dẫn bạn muốn kiểm tra là 1 file\n");
            return;
        }

        if (f.isDirectory()) {
            System.out.println("\nĐường dẫn bạn muốn kiểm tra là 1 thư mục!!!\n");
            String[] listFile = f.list();
            if (listFile == null) System.out.println("Thư mục này rỗng!!!");
            else {
                System.out.println("Danh sách các file và thư mục con trong thư mục " + pathname + " là:");
                for (String name : listFile) {
                    System.out.println(name);
                }
                System.out.println("==================================================================");
            }
        }
    }


    public static void readFile(String pathname){

        try (
            FileReader filereader = new FileReader(pathname);
            BufferedReader br = new BufferedReader(filereader)) {

                String line;
                System.out.println("Noi dung cua file "+pathname+" la:");
                while(( line =br.readLine())!=null)
                    {
                        System.out.println(line);
                    }
            }catch (IOException e) {
            System.err.println("Lỗi khi đọc file: " + e.getMessage());
        }
    }


    public static void main(String args[]){
        listFile("/Users/akamine/IdeaProjects/Intern_JavaCore/src/Tuan2/dir");

        //vi du muon doc file1 trong dir
        readFile("/Users/akamine/IdeaProjects/Intern_JavaCore/src/Tuan2/dir/file1");
    }


}



