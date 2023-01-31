package Circle;

public class Circle {
    public int radius;
    public int diameter;



    public Circle() {

}

public Circle(int radius) {
    this.radius = radius;
}

public Circle(int diameter) {
    this.diameter = diameter;
}


public int getArea() {
    return 3.14 * this.radius ^ 2
}

public int getParameter() {
    return 3.14 * this.diameter
}

}


