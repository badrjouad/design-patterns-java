package com.pluralsight.creational.builder;

public class BuilderEveryDayDemo {

    public static void main(String[] args) {

        //example with StringBuilder
        StringBuilder builder =  new StringBuilder();
        builder.append("first builder"+"\n");
        builder.append("second builder"+"\n");
        builder.append("third builder"+"\n");
        builder.append("fourth builder"+"\n");
        builder.append("fifth builder"+"\n");
        builder.append("sixth builder"+"\n");
        builder.append(23);
        System.out.println(builder.toString());

    }
}
