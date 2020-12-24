package Practice.practice_Abstraction.day55;

public final class Rectangle extends  Shape{

    public double width;
    public double length;

    public Rectangle(double width, double length){
        this.width=width;
        this.length=length;
        area = calcArea();
        perimeter = calcPerimeter();
        volume = calcVolume();
        // since we can directly call the method, why do we put them in the constructor
    }

    static {
        name = "Rectangle";
        hasVolume = false;
    }



    @Override
    public double calcArea() {
        return width*length;
    }

    @Override
    public double calcPerimeter() {
        return (width+length)*2;
    }

    @Override
    public double calcVolume() {
        return 0;
    }

    @Override
    public String toString() {
        return "Rectangle{" +
                "width=" + width +
                ", length=" + length +
                ", area=" + area +
                ", perimeter=" + perimeter +
                ", volume=" + volume +
                '}';
    }
}
