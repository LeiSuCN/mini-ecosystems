package com.leisucn.test.minijavaserver;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.Scanner;

/**
 * Created by SL on 2017/10/20.
 */
public class App {

    private static final Logger LOGGER = LogManager.getFormatterLogger(App.class);

    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);
        String command = null;
        boolean run = true;
        while( run ){
            command = scanner.nextLine();

            LOGGER.info("COMMAND is %s", command);

            command = command.toLowerCase();

            switch (command){
                case "quit":
                case "exit": run = false; break;
                default: break;
            }
        }


    }

}
