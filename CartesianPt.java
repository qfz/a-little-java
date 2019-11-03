
/**
 * Write a description of class CartesianPt here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class CartesianPt extends Point
{
    // instance variables - replace the example below with your own
    private int x;
    private int y;

    /**
     * Constructor for objects of class CartesianPt
     */
    public CartesianPt(int _x, int _y)
    {
        // initialise instance variables
        x = _x;
        y = _y;
    }
    
    int distanceToO() {
        return (int)Math.sqrt(x * x + y * y);
    }
}
