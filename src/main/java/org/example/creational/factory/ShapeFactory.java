package org.example.creational.factory;
//Author : Piumika Dilshan
//Connect : piumikadil@gmail.com

public class ShapeFactory {
    public Shape getShape(String shapetype){
        if(shapetype== null){
            return null;
        }else{
            if (shapetype.equalsIgnoreCase("Circle")){
                return new Circle();
            }else if (shapetype.equalsIgnoreCase("Rectangle")){
                return new Rectangle();
            }else  if(shapetype.equalsIgnoreCase("Square")){
                return new Square();
            }
        }
        return null;
    }
}
