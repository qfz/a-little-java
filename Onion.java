
/**
 * Write a description of class Onion here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Onion extends Shish
{
    Shish s;
    
    Onion(Shish _s) {
        s = _s;
    }
    
    boolean onlyOnions() {
        return s.onlyOnions();
    }
}
