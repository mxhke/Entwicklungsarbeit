package model;

/**
 *
 * @author Maximilian
 */
public class Edge 
{
    private Vertex ersterPunkt;
    private Vertex zweiterPunkt;
    
    private double laenge;
    
    public Edge(Vertex ersterPunkt, Vertex zweiterPunkt)
    {
        this.ersterPunkt = ersterPunkt;
        this.zweiterPunkt = zweiterPunkt;
        this.laenge = this.berechneLaenge();
    }
    
    
    
    
    
    private double berechneLaenge()
    {
        return Math.sqrt(Math.pow((this.zweiterPunkt.getXKoordinate()
                                    -this.ersterPunkt.getXKoordinate()), 2)
                        +Math.pow((this.zweiterPunkt.getYKoordinate()
                                    -this.ersterPunkt.getYKoordinate()), 2)
                        +Math.pow((this.zweiterPunkt.getZKoordinate()
                                    -this.ersterPunkt.getZKoordinate()), 2));
    }
    
    
    
    
    
    
    // Getter 
    public double getLaenge()
    {
        return this.laenge;
    }
    
    
}