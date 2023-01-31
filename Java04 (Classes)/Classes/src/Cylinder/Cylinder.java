package Cylinder;
public class Cylinder{
    public int height;
    public int radius;


public Cylinder() {

}

public Cylinder(int height){
    this.height = height;
}

public Cylinder(int radius){
    this.radius = radius;
}

public int getVolume(){
    return (3.14 * this.radius ^ 2) * this.height 
}

}