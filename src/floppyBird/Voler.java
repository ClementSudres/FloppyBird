package floppyBird;

public class Voler extends Thread {

    public Etat etat;
    public Affichage affichage;

    /**
     * Constructeur
     * @param etat
     * @param affichage
     */
    public Voler(Etat etat, Affichage affichage) {
        this.etat = etat;
        this.affichage = affichage;
    }

    /**
     * Fait redescendre l'ovale
     */
    @Override
    public void run()
    {
        while (true)
        {
            try
            {
                sleep(150); // Mettre une pause de quelques millisecondes entre chaque chute.
                etat.moveDown();
                //affichage.revalidate(); //forcer le dessin
                //affichage.repaint();
            }
            catch (InterruptedException e)
            {
                e.printStackTrace();
            }
        }
    }
}
