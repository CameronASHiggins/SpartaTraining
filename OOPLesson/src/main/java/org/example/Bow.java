package org.example;

public class Bow {
    private boolean isCool = true;
    private String shootsArrows = "This shoots arrows";
    private String material = "Aluminium"; //Default to Aluminium

    private String riserColour = "Blue";
    public boolean getIsCool() {
        return isCool;
    }

    public void setIsCool(boolean cool) {
        isCool = cool;
    }

    public String getShootsArrows() {
        return shootsArrows;
    }

    public void setShootsArrows(String shootsArrows) {
        this.shootsArrows = shootsArrows;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public String getRiserColour() {
        return riserColour;
    }

    public void setRiserColour(String riserColour) {
        this.riserColour = riserColour;
    }

    public void readyShot(){
        System.out.println("Nock! Draw! Aim!");
    }

    public void shoot(){
        System.out.println("*twang*... *THUNK*");
    }

    public void shoot(String target){
        String concatter = "";
        if (target.toLowerCase().contains("french")){
            concatter = " ✌";
        }
        System.out.println("*twang*... *THUNK*" + concatter + " You hit the " + target + "!");
    }
}
