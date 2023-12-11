package com.messenger;



public class IOTask {
    public void rest(String id){
        try{
            String threadInfo = Thread.currentThread().toString();
            System.out.println(String.format("Sleep %s, %s", id, threadInfo));
            Thread.sleep(100);
        }
        catch(InterruptedException e){
            Thread.currentThread().interrupt();
        }
    }
}
