package floppyBird;

public class Etat {
    Affichage affichage;
    Parcours parcours;
	
    public static int hauteur = 100; //Hauteur du ovale

    public Etat(Affichage a){
        this.affichage = a;
    }

    public Etat(Parcours parcours)
    {
        this.hauteur = Affichage.Y;
        this.parcours = parcours;
    }

    /* Affiche la hauteur du oval dans le terminal*/
    public int getHauteur()
    {
    	 return this.hauteur;
    }
    /*
    public Parcours getParcours()
    {
        return this.parcours;
    }
     */

    /*Change la hauteur du ovale*/
    public static void jump() 
    {
    	hauteur-=100;
    }

    public void moveDown()
    {
        if((0 <= hauteur) && (hauteur <= 300))
        {
            hauteur += 10;
        }
    }
}
