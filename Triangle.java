public class Triangle
{
    float perpendicular, base, hypotenious;

    Triangle()
    {
        perpendicular = (float) 4.9;
        base = (float) 7.2;
        hypotenious = (float) 5.8;
    }

    Triangle(float per, float b, float hypo)
    {
        perpendicular = per;
        base = b;
        hypotenious = hypo;
    }

    float sin()
    {
        return perpendicular / hypotenious;
    }

    float cos()
    {
        return base / hypotenious;
    }

    float tan()
    {
        return perpendicular / base;
    }
}
class TestTriangle
{
    public static void main(String[]args)
    {
        Triangle tobj;
        tobj = new Triangle();
        System.out.println(tobj.sin());
        System.out.println(tobj.cos());
        System.out.println(tobj.tan());
    }
}














