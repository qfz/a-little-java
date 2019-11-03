
/**
 * Write a description of class ManhattanPt here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class ManhattanPt extends Point
{
    // instance variables - replace the example below with your own
    private int x;
    private int y;

    /**
     * Constructor for objects of class ManhattanPt
     */
    public ManhattanPt(int _x, int _y)
    {
        // initialise instance variables
        x = _x;
        y = _y;
    }
    
    int distanceToO() {
        return x + y;
    }
}
