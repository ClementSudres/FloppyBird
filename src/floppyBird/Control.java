package floppyBird;

import javax.swing.*;
import java.awt.event.*;

/** La classe Control implémente un (ou plusieurs) listeners (dans notre cas, le listener MouseListener).
 * Ce listener fait appels à la méthode jump de la classe Etat pour modifier les variables du modèle.
 * Ensuite, il informe la vue d’un changement (par exemple en utilisant directement la méthode repaint de la classe Affichage).
 * Cette classe dispose donc a minima d’un attribut de type Etat et d’un autre de type Affichage.
 */
public class Control implements MouseListener {

	/* Lors d'un click de la souris, Etat.jump est executé */
	@Override
	public void mouseClicked(MouseEvent e) 
	{
		if((0 <= Etat.hauteur) && (Etat.hauteur <= 300))
		{
			Etat.jump();
		}
	}
	
	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}
	
	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}
	
	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}
	
	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}
}
