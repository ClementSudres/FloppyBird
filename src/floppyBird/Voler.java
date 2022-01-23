package floppyBird;

public class Voler extends Thread {

    public Etat etat;

    public Voler()
    {
        etat = new Etat(new Affichage());
    }

    @Override
    public void run()
    {
        while(Etat.hauteur <= 300) {
            etat.moveDown();
            try {
                Thread.sleep(100);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}
