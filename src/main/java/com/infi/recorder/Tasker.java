package com.infi.recorder;

import java.util.Date;

public class Tasker implements Runnable {

    private String name;

    public Tasker(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override public void run() {
        try {
            System.out.println("Doing a task during : " + name + " - Time - " + new Date());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
