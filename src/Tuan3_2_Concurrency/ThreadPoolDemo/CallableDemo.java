package Tuan3_2_Concurrency.ThreadPoolDemo;

import java.util.concurrent.Callable;

public class CallableDemo implements Callable<Integer> {
    public int num;

    public CallableDemo(int num){
        this.num = num;
    }

    @Override
    public Integer call() throws Exception {

        System.out.println("Luong dang thuc hien: "+Thread.currentThread().getName()+" - Luồng tính bình phương của "+num);
        try{
            Thread.sleep(1000);
        }catch(InterruptedException e){
            e.printStackTrace();
        }
        return num*num;
    }
}
