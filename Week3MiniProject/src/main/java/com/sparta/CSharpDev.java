package com.sparta;

public class CSharpDev implements Spartan{
    private String name;
    public CSharpDev(String name) {
        this.name = name;
    }

    @Override
    public String spartanDoes() {
        return "A C# developer develops software in C#";
    }

    @Override
    public String getName() {
        return this.name;
    }
}