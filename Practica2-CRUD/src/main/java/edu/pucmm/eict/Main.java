package edu.pucmm.eict;

import io.javalin.Javalin;

public class Main {
    public static void main(String[] args){
        Javalin app = Javalin.create(config ->{
            config.addStaticFiles("/public");
        }).start(7000);
    }
}
