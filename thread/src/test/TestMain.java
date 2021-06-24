package test;

import thread.ThreadOne;
import thread.ThreadTwo;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

public class TestMain {

    public static void main(String[] args) throws ExecutionException, InterruptedException {

        ThreadTwo threadTwo=new ThreadTwo();
        Thread thread2=new Thread(threadTwo);
        thread2.start();

        ThreadOne threadOne=new ThreadOne();
        FutureTask<Long> futureTask=new FutureTask(threadOne);
        Thread thread1=new Thread(futureTask);
        thread1.start();
        Long l=futureTask.get();//返回run方法结果，有阻塞效果
//        FutureTask implements RunnableFuture
//        RunnableFuture extends Runnable, Future
//        public FutureTask(Callable<V> callable)构造方法
//        FutureTask里面重写了run方法，run方法里面调用了Callable.call方法，将返回结果赋值给属性private Object outcome
//                  还包含get方法，获取private Object outcome值


    }

}
