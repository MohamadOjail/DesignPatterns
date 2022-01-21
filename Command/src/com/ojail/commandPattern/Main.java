package com.ojail.commandPattern;

public class Main {
    public static void main(String[] args) {

        StringPipeline pipeline = new StringPipeline();

        Command whiteSpace = new VowelsToWhitespace();
        Command upperCase = new ConsonantsToUppercase();

        pipeline.addCommand(whiteSpace);
        pipeline.addCommand(upperCase);

        System.out.println(pipeline.execute("This is a text of the shit, detta är en sträng"));
    }
}
