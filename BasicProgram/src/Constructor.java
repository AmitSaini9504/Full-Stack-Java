public class Constructor {
    //Rectangle

    int length,width;

    Constructor(int x, int y)
    {
        length = x;
        width = y;
    }
    int rectArea()
    {
        return (length*width);
    }
}
class RectangleArea
{
    public static void main(String[] args) {
        Constructor rectangle = new Constructor(10,12);
        int area1 = rectangle.rectArea();
        System.out.println("Area =" +area1);
    }
}
