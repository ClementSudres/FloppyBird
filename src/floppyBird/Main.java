package floppyBird;

import javax.swing.JFrame;
import javax.swing.Timer;
import java.awt.*;

/** La classe Main construit un objet de chaque classe (modèle, vue et contrôleur), les relie ensemble,
 *  puis elle crée un objet JFrame dans laquelle elle ajoute la vue.
 */
public class Main  {
	/* Creation d'un objet de la class */
	public static Main floppyBird;
	/* Creation d'une instance de la class Affichage */
	public Affichage affichage;
	/* Creation d'une instance de la class Control */
	public Control control;
	/* Creation d'une instance de la class Etat */
	public Etat etat;
	/* Creation d'une instance de la class Parcours */
	public Parcours parcours;


	/* Contructeur par défaut */
	public Main()
	{
		/* Creation d'un nouveau JFrame */
		JFrame jframe = new JFrame("Floppy Bird"); //"Le nom de la fenêtre"
		/* Intialisation de l'affichage et de control pour modifier l'affichage en fonction des Listener */
		affichage = new Affichage(etat);
		control = new Control(etat, affichage);
		parcours = new Parcours();
		etat = new Etat(parcours);

		jframe.add(affichage);//ajout des instances d'affichage
		jframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//Le programme se termine lorqu'on ferme la fenêtre
		jframe.add(new Affichage(etat));//ajout des instances d'affichage
		jframe.addMouseListener(control);//ajout des listener de Control
		jframe.pack();
		jframe.setVisible(true);//Affiche la fenêtre
		new Voler(etat, affichage).start();
		new Thread(new Avancer(etat,affichage)).start();
	}

    public static void main(String [] args) 
    {
		/* Creation d'une instance de la class Main */
		floppyBird = new Main();
    }
}