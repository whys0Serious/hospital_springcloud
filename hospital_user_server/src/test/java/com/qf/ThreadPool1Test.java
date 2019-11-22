package com.qf;

import java.util.ArrayList;
import java.util.Random;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class ThreadPool1Test {
    public static void main(String[] args) throws InterruptedException {
        ExecutorService service = Executors.newSingleThreadExecutor();
        ArrayList arrayList=new ArrayList();
        Long start=System.currentTimeMillis();
        for (int i = 0; i < 10000; i++) {
            service.execute(new Thread(new Runnable(){
                @Override
                public void run() {
                    arrayList.add(new Random().nextInt(10000));
                }
            }));
        }
        service.shutdown();
       service.awaitTermination(1,TimeUnit.DAYS);
        System.out.println(arrayList.size());
        System.out.println(System.currentTimeMillis()-start);
    }
}

