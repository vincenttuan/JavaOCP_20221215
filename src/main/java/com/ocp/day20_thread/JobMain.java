package com.ocp.day20_thread;

public class JobMain {
    public static void main(String[] args) {
        String tName = Thread.currentThread().getName();
        System.out.println(tName);
        JobA jobA = new JobA();
        JobB jobB = new JobB();
        
        jobA.work();
        jobB.work();
    }
}
