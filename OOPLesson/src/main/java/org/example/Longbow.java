package org.example;

public class Longbow extends Bow{

    private String material = "Wood";

    @Override
    public String getMaterial() {
        return material;
    }

    @Override
    public void setMaterial(String material) {
        this.material = material;
    }
}
