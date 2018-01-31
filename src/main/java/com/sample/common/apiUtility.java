package com.sample.common;

public class apiUtility {

    String url = null;
    public apiUtility(){

    }
    public apiUtility(envconfig envconf){
        url = envconf.getUrlpost()
        ;
    }

    public void printUrl(){
        System.out.println("url value lodaded" + url);
    }
}
