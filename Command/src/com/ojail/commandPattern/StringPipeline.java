package com.ojail.commandPattern;

import java.util.ArrayList;
import java.util.List;

public class StringPipeline {

    private final List<Command> pipeline = new ArrayList<>();

    public void addCommand(Command command){
        pipeline.add(command);
    }

    public String execute (String string){

        String output = string;
        for (Command command : pipeline){
            output = command.process(output);
        }
        return output;
    }

}
