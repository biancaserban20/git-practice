package com.qa;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class MyConsoleReader {
    public void readInputPrint(){
        StringBuffer sb = new StringBuffer();
        try(BufferedReader br = new BufferedReader(new InputStreamReader(System.in));){
            System.out.println("Enter a line or stop");
            String line = br.readLine();
            while(!line.equals("stop")){
                sb.append(line + "\n");
                System.out.println("Enter or stop");
                line = br.readLine();
            }
            System.out.println(sb);
        }
        catch(IOException io){
            System.out.println("Error: " + io);
            io.printStackTrace();
        }
    }

    public static void main(String[] args) {
        MyConsoleReader mcr = new MyConsoleReader();
        mcr.readInputPrint();
    }
}
