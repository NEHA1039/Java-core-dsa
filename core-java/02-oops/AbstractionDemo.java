/**
 *Topic:Abstraction
 Concepts:
 -Abstract Class
 -Abstract Method
 -Method Implementation in subclass

 Author:Neha Thorat
 DAY 12
 */
abstract class Shape{
    abstract void draw();

    
}
class Circle extends Shape{
    @Override
    void draw(){
        System.out.println("Circle is drawn");
    }

}
public class AbstractionDemo{
    public static void main(String args[]){
        Shape s=new Circle();
        s.draw();
    }
}