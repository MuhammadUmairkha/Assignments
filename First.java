class Triangle
{
    int height;
    int base;
    int hypotenous;
    Triangle(int h, int b, int hyp)
    {
        height=h;
        base=b;
        hypotenous=hyp;
    }
    int area()
    {
        return (height * base)/2;
    }
    int perimeter()
    {
        return (height + hypotenous)+ base;
    }
}
class CalculateTriangle
{
    public static void main(String[]args)
    {
        Triangle t = new Triangle(6,7,4);
        System.out.println("Area = " + t.area());
        System.out.println("Perimeter = "+t.perimeter());
    }
}