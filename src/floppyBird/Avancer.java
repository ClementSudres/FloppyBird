package floppyBird;

public class Avancer implements Runnable{
    private Etat etat;
    private Affichage affichage;

    /**
     * Constructeur
     * @param etat
     * @param affichage
     */
    public Avancer(Etat etat, Affichage affichage) {
        this.etat = etat;
        this.affichage = affichage;
    }

    /**
     * Avancer la ligne brisée
     */
    @Override
    public void run()
    {
        while (true)
        {
            try
            {
                etat.parcours.setPosition();
                affichage.revalidate(); //forcer le dessin
                affichage.repaint();
                Thread.sleep(500); // Mettre une pause de quelques millisecondes entre chaque chute.
            }
            catch (InterruptedException e)
            {
                e.printStackTrace();
            }
        }
    }
}