package com.qf;

import java.util.concurrent.Callable;
import java.util.concurrent.FutureTask;

public class Test1 {
    public static void main(String[] args) {
        Callable callable=new Callable() {
            @Override
            public Object call() throws Exception {
                return "你好";
            }
        };
    }
}
