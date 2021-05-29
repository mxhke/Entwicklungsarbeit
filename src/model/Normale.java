package model;

/**
 *
 * @author Maximilian
 */
public class Normale 
{
    private double xKoordinate;
    private double yKoordinate;
    private double zKoordinate;
    
    public Normale(double x, double y, double z)
    {
        this.xKoordinate = x;
        this.yKoordinate = y;
        this.zKoordinate = z;
    }
    
    // Getter
    public double getXKoordinate()
    {
        return this.xKoordinate;
    }
    public double getYKoordinate()
    {
        return this.yKoordinate;
    }
    public double getZKoordinate()
    {
        return this.zKoordinate;
    }
}
