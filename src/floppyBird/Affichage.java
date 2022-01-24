package floppyBird;

import java.awt.Dimension;
import javax.swing.JPanel;
import java.awt.Graphics;
import java.util.ArrayList;
import java.awt.Point;
import java.awt.Color;

/** La classe Affichage hérite de JPanel. Elle dispose d’un attribut de type Etat pour accéder à l’état du modèle lorsque
 * l’affichage doit être revu, via la méthode paint. Elle dispose aussi de l’ensemble des constantes liées à l’interface
 * graphique (taille de la fenêtre, dimensions des objets à dessiner, etc).
 */
public class Affichage extends JPanel {
	
	/* Constantes de la taille de la fenêtre*/
    public static final int LARG = 600;
    public static final int HAUT = 400;

    public static int X = 50;
    public static int Y = 100;
    /** Largeur du rectangle*/
    public static final int WIDTH = 20;
    /** Hauteur du rectangle */
    public static final int HEIGHT = 100;

    public Etat etat;

    /** Constructeur par défaut */
    public Affichage(Etat etat)
    {
        this.etat = etat;
    	setPreferredSize(new Dimension(LARG, HAUT));
    }

    /* Affiche des objets dans la fenêtre*/
    @Override
    public void paint(Graphics g)
    {
        g.clearRect(0,0, LARG, HAUT);
    	super.paint(g);
    	paintOvale(g);
        paintLine(g);
        repaint();
        revalidate();
    }
    /**
     * Dessine un ovale
     * @param g
     */
    public void paintOvale(Graphics g)
    {
        g.drawOval(X, etat.getHauteur(), WIDTH, HEIGHT);
    }

    /**
     * Dessine la ligne brisé
     * @param g
     */
    public void paintLine(Graphics g)
    {
        ArrayList<Point> p = etat.parcours.getParcours();
        g.setColor(Color.RED); //mettre la ligne en rouge
        for (int i = 0; i < p.size() - 1; i++)
        {
            g.drawLine(p.get(i).x, p.get(i).y, p.get(i+1).x, p.get(i+1).y);
        }
    }

}