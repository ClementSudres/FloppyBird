package floppyBird;

public class Etat {
    Affichage affichage;
    Parcours parcours;
	
    public static int hauteur = 100; //Hauteur du ovale

    public Etat(Affichage a){
        this.affichage = a;
    }

    public void Parcours()
    {

    }

    /* Affiche la hauteur du oval dans le terminal*/
    public static void getHauteur()
    {
    	 System.out.print(hauteur);
    }
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
        affichage.updateOval();
    }
}
