public class Rectangle{
    private double length;
    private double width;
    public Rectangle(){

    }
    public Rectangle(double length,double width)
    {
        this.length=length;
        this.width=width;
    }
    public double getLength(){
        return length;
    }
    public void setLength(double length)
    {
        if(length<0){
            throw new IllegalArgumentException("length must be greater than 0");
        }
        this.length=length;
    }
    public double getWidth() {
        return width;
    }
    public void setWidth(double width) {
        if(width < 0) {
            throw new IllegalArgumentException("width must be greater than 0");
        }
        this.width = width;
    }
    public double getArea(){
        return width*length;
    }
    public double getPerimiter(){
        return 2*(width + length);
    }
    public String toString ()
    {
        return "Area = " +getArea()+"\nPerimiter = "+getPerimiter();
    }
}