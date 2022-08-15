package com.intellijide.logicalprograms;

import java.util.Scanner;

public class StopWatch {
    public long startTimer = 0;
    public long stopTimer = 0;
    public long elapsedTime;

    public void start(){
        startTimer = System.currentTimeMillis();
        System.out.println("Start Time is -> "+startTimer);
    }
    public void stop(){
        stopTimer = System.currentTimeMillis();
        System.out.println("Stop Time is -> "+stopTimer);
    }
    public long getElapsedTime(){
        elapsedTime = stopTimer - startTimer;
        return elapsedTime;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter 1 to start timer -> ");
        int one = scan.nextInt();
        StopWatch sw = new StopWatch();
        sw.start();

        System.out.println();
        System.out.println("Enter 2 to stop timer -> ");
        int two = scan.nextInt();
        sw.stop();

        System.out.println(sw.getElapsedTime());
        System.out.println();
        long l = sw.getElapsedTime();
        System.out.println("Converting millisec to seconds: "+(l/1000)+" sec");
    }
}
