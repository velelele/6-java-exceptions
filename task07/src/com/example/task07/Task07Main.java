package com.example.task07;

import jdk.nashorn.internal.runtime.ECMAException;

public class Task07Main {

    public static final String CHECKED = "checked";
    public static final String UNCHECKED = "unchecked";
    public static final String NONE = "none";

    public static void main(String[] args) {
    }

    public Processor processor;

    public String getExceptionType() {
        try {
            processor.process();
        } catch (IllegalArgumentException e) {
            return UNCHECKED;
        } catch (Exception e){
            return CHECKED;
        }
        return NONE;
    }

}