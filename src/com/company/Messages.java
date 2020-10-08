package com.company;

import java.util.HashMap;


public class Messages{

    HashMap<String, String> messageList = new HashMap<String, String>();


    private String name;
    private String message;

    public Messages(String name, String message) {
        this.name = name;
        this.message = message;
    }

    public void showAllMessages(){

        for(String i : messageList.keySet() ){

            System.out.println(i +  " Send Message :" + messageList.get(i) );
        }

    }

    public void sendMessage(String name , String message){

        messageList.put(name,message);
    }


}
