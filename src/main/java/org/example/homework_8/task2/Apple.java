package org.example.homework_8.task2;

public class Apple {
    private String color = "Green";

    public String assignColor(){
        NewColor newColor = new NewColor();
        newColor.changeColor("Red");
        return color;
    }

    private class NewColor{
        public void changeColor(String changedColor){
            color = changedColor;
        }
    }
}
