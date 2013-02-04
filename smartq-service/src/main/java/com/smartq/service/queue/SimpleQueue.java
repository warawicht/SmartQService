package com.smartq.service.queue;

import java.util.LinkedList;
import java.util.Queue;

public enum SimpleQueue {
    INSTANCE;

    private static int runningNumber = 0;

    private static Queue<String> qe = new LinkedList<String>();

    public void addQueue(){
        qe.add(String.valueOf(++runningNumber));
    }

    public String pollQueue(){
        return qe.poll();
    }

    public int getSize(){
        return qe.size();
    }

    public String peekQueue(){
        return qe.peek();
    }



}
