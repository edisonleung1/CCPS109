
/**
 * Write a description of class Rectangle here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Rectangle
{
    private double width,height;
    public void setDimensions(double w, double h){
        width = w; height = h;
    }
    public double getArea(){
        double area = width * height;
        return area;}
    public double getPerimeter(){
        double perimeter = (width+height)*2;
        return perimeter;}
    public void scale(double sf){
        width=width*sf;height=height*sf;}
    public String answer(){
        String answer="New w="+Double.toString(width)+" New h="+Double.toString(height);
        return answer;}
}
