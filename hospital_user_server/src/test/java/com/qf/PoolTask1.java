package com.qf;


import org.springframework.scheduling.concurrent.ThreadPoolTaskExecutor;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;

public class PoolTask1 {
    public static void main(String[] args) {
        ThreadPoolTaskExecutor threadFactory=new ThreadPoolTaskExecutor();
         threadFactory.setCorePoolSize(3);
         threadFactory.setMaxPoolSize(3);
        ExecutorService executorService = Executors.newCachedThreadPool(threadFactory);
        for (int i = 0; i < 10; i++) {
            Thread thread2=new Thread(new Runnable() {
                @Override
                public void run() {
                    System.out.println(Thread.currentThread().getName());
                }
            });
            executorService.execute(thread2);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        executorService.shutdown();

    }
}
