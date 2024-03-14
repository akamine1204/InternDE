package Tuan1_2_ioFile;

/*#### 1.2. Yêu cầu (2) Đọc ghi file
        - viết trương trình java đọc ghi file theo 2 dạng binary và text (trong class io_file)
        - viết trương trình java thao tác với file và thư mục: list các file, đọc nội dung file (trong class io_file2)
        */


import java.io.*;

public class io_file {
    //doc ghi file theo binary
    public static void io_binary(String path) throws IOException {
        FileInputStream input = null;
        FileOutputStream output = null;

        File f = new File(path);
        if(f.exists()==false){
            System.out.println("file tham số truyền vào không tồn tại!!");
            return;
        }

        try{
            input = new FileInputStream(f);
            output = new FileOutputStream("/Users/akamine/IdeaProjects/Intern_JavaCore/src/Tuan2/outStream.txt");

            int c;
            while((c=input.read())!=-1){
                output.write(c);
            }
        }  finally {
            if(input!=null)
                input.close();
            if(output!=null)
                output.close();
        }

    }

    //doc ghi file theo text
    public static void io_text(String path) throws IOException {

        File f = new File(path);
        if(f.exists()==false){
            System.out.println("file tham số truyền vào không tồn tại!!");
            return;
        }

        FileReader reader = null;
        FileWriter writer = null;

        try {
            reader = new FileReader(f);
            writer = new FileWriter("/Users/akamine/IdeaProjects/Intern_JavaCore/src/Tuan2/output.txt");

            int c;
            while((c=reader.read())!=-1){
                writer.write(c);
            }
        }finally {
            if(reader != null) reader.close();
            if(writer != null) writer.close();
        }
    }



    public static void main(String args[]) throws IOException {
        System.out.println("Test input/ouput file theo binary, tra ve file outStream.txt!");
        io_binary("/Users/akamine/IdeaProjects/Intern_JavaCore/src/Tuan2/text.txt");
        System.out.println("====================================================================");

        System.out.println("Test input/output file theo text, tra ve file output.txt !!");
        io_text("/Users/akamine/IdeaProjects/Intern_JavaCore/src/Tuan2/text.txt");
        System.out.println("====================================================================");

    }
}
