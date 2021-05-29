package model;

import java.util.Arrays;
import java.lang.Math;

/**
 *
 * @author Maximilian
 */

/**
 * Ein Trigon ist ein Polygon mit drei Seiten.
 */

public class Trigon 
{
    // Normale eines Dreiecks
    private Normale normale;
    
    // Punkte eines Dreiecks
    private Vertex ersterVertex;
    private Vertex zweiterVertex;
    private Vertex dritterVertex;
    
    // Edges eines Dreiecks
    private Edge ersteEdge;
    private Edge zweiteEdge;
    private Edge dritteEdge;
    
    // Flächeninhalt
    private double flaecheninhalt;
    
    // Umfang
    private double umfang;
    
    
    
    
    
    // Konstruktor 
    public Trigon(Vertex ersterVertex, Vertex zweiterVertex, Vertex dritterVertex, Normale normale)
    {
        this.normale = normale;
        this.ersterVertex = ersterVertex;
        this.zweiterVertex = zweiterVertex;
        this.dritterVertex = dritterVertex;
        this.init();
    }
    
  
    private void init()
    {
        this.ersteEdge = new Edge(this.ersterVertex, this.zweiterVertex);
        this.zweiteEdge = new Edge(this.zweiterVertex, this.dritterVertex);
        this.dritteEdge = new Edge(this.dritterVertex, this.ersterVertex);
        this.umfang = this.berechneUmfang();
        this.flaecheninhalt = this.berechneFlaecheninhalt();
    }
    
    
    // Umfang berechnen
    private double berechneUmfang()
    {  
        return (this.ersteEdge.getLaenge() + this.zweiteEdge.getLaenge()
                + this.dritteEdge.getLaenge());
    }
    
    // Flächeninhalt berechnen
    // Berechnet den Flächeninhalt mithilfe des Satz des Heron
    private double berechneFlaecheninhalt()
    {
        double s = this.umfang / 2;
        return Math.sqrt(s*(s-this.ersteEdge.getLaenge())
                            *(s-this.zweiteEdge.getLaenge())
                            *(s-this.dritteEdge.getLaenge()));
    }
    
    
    
    
    
    
    
    // Getter und Setter Methoden
    
    public double getUmfang()
    {
        return this.umfang;
    }
    
    public double getFlaecheninhalt()
    {
        return this.flaecheninhalt;
    }
    
    
}
