package com.pieroapp.passwordgen.model;

public class PasswordConfig {
    private int length;
    private String type;
    public PasswordConfig(int length, String type){
        this.length = length;
        this.type = type;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;

    }
}
