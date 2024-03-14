package Tuan3_2_Concurrency.ThreadPoolDemo;

//Sử dụng threadpool để thực hiện tính tổng bình phương của n số tự nhiên liên tiếp từ 1.

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class ThreadPoolDemo {
    public static void main(String args[]) {
        System.out.println("Nhập số tự nhiên bạn muốn tính tổng bình phương:");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        ExecutorService es = Executors.newFixedThreadPool(5);

        List<Future<Integer>> list = new ArrayList<>();
        for(int i=1;i<=n;i++){
            Future<Integer> f = es.submit(new CallableDemo(i));
            list.add(f);
        }

        int sum=0;

        for (Future<Integer> f : list){
            try{
                sum+=f.get();
            }catch(InterruptedException | ExecutionException e){
                e.printStackTrace();
            }
        }
        System.out.println("Ket qua cuoi cung: "+sum);
        System.out.println("Ket thuc!!!!");
    }


}
