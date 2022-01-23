package floppyBird;

import java.awt.Point;
import java.util.ArrayList;
import java.util.Random;

public class Parcours {

    public static final int NB_Points = 10;

    static final Random rand = new Random();
    public static ArrayList<Point> p = new ArrayList<Point>();

    public static void initialisePoint()
    {
        for(int i = 0; i < NB_Points; i++)
        {
            p.add(new Point(rand.nextInt(400), 600));
        }
    }
    public Parcours()
    {

    }

    public static ArrayList<Point> getParcours()
    {
        return p;
    }
}
