package floppyBird;

import java.awt.Point;
import java.util.ArrayList;
import java.util.Random;

public class Parcours {

    public static final int AVANCE = 1;
    public int position;
    public static ArrayList<Point> p = new ArrayList<Point>();

    /**
     * Constructeur
     */
    public Parcours()
    {
        this.position = 0;
        int x = Affichage.WIDTH/2 + Affichage.X;
        int y = Affichage.HEIGHT/2 + Affichage.Y;
        this.p.add(new Point(x, y));
        ajouterPoint();
    }

    /**
     * Récupère la valeur courante de la position
     * @return
     */
    public int getPosition()
    {
        return this.position;
    }

    /**
     * setter pour faire avancer la position de quelques pixels
     */
    public void setPosition()
    {
        this.position += AVANCE;
    }

    /**
     * Ajouter un point dans la liste
     */
    public void ajouterPoint()
    {
        int x, y;
        do
        {
            //x est plus grand que l'ancien point
            x = new Random().nextInt(250) + p.get((p.size() - 1)).x + 60;
            y = new Random().nextInt(Affichage.HAUT - 100) + 50;
            Point p = new Point(x,y);
            this.p.add(p);
        } while (x <= Affichage.LARG);
    }

    public ArrayList<Point> getParcours()
    {
        // les coordonnées ont été calculées en retirant la valeur de position à leur valeur d’abscisse.
        this.p.forEach(e->e.x -= getPosition());

        // générer un point supplémentaire Lorsque le dernier point rentre dans la fenêtre visible
        if (p.get((p.size() - 1)).x <= Affichage.LARG)
        {
            int x = new Random().nextInt(250) + p.get((p.size() - 1)).x + 60;
            int y = new Random().nextInt(Affichage.HAUT - 100) + 50;
            Point p1 = new Point(x,y);
            this.p.add(p1);
        }
        // retirer le premier point lorsque le deuxième point sur de la zone visible
        if (p.get(1).x < Affichage.WIDTH/2 + Affichage.X)
        {
            p.remove(0);
        }
        return this.p;
    }
}