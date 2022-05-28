package com.company.eighth;

import java.io.IOException;
import java.io.PipedReader;
import java.io.PipedWriter;
import java.io.StringWriter;

public class PipedReaderWriter {

    public static void main(String[] args) throws IOException {
        InputThread inputThread = new InputThread("input thread");
        OutputThread outputThread = new OutputThread("output thread");

        inputThread.connect(outputThread.pipedWriter);
        inputThread.start();
        outputThread.start();
    }
}

class InputThread extends Thread{
    PipedReader input = new PipedReader();
    StringWriter sw   = new StringWriter();

    InputThread(String name){
        super(name);
    }

    @Override
    public void run(){
        try{
           int data = 0;
           while((data=input.read()) != -1){
               sw.write(data);
           }
            System.out.println(getName() + " RECEIVED : " + sw.toString());
        }catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void connect(PipedWriter pipedWriter) throws IOException {
        input.connect(pipedWriter);
    }
}

class OutputThread extends Thread{
    PipedWriter pipedWriter = new PipedWriter();

    public OutputThread(String name) {
        super(name);
    }

    @Override
    public void run() {
        String msg = "message !";
        try {
            pipedWriter.write(msg);
            pipedWriter.close();
            System.out.println(getName() + " sent : " + msg);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void connect(PipedReader pipedReader) throws IOException {
        pipedWriter.connect(pipedReader);
    }
}