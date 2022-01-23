package floppyBird;

import java.awt.Dimension;
import javax.swing.JPanel;
import java.awt.Graphics;

/** La classe Affichage hérite de JPanel. Elle dispose d’un attribut de type Etat pour accéder à l’état du modèle lorsque
 * l’affichage doit être revu, via la méthode paint. Elle dispose aussi de l’ensemble des constantes liées à l’interface
 * graphique (taille de la fenêtre, dimensions des objets à dessiner, etc).
 */
public class Affichage extends JPanel {
	
	/* Constantes de la taille de la fenêtre*/
    public static final int LARG = 600;
    public static final int HAUT = 400;

    /** Constructeur par défaut */
    public Affichage() 
    {
    	setPreferredSize(new Dimension(LARG, HAUT));
    }

    public void updateOval()
    {
        repaint();
        revalidate();
    }
    /* Affiche des objets dans la fenêtre*/
    @Override
    public void paint(Graphics g)
    {
    	super.paint(g);
    	g.drawOval(50, Etat.hauteur, 20, 100);
        repaint();
    }
}