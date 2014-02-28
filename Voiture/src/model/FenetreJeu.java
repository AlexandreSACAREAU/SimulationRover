package model;

import java.awt.Point;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JFrame;

public class FenetreJeu extends JFrame {
	
	private VoiturePanel voiture;
	private VoitureParameters parametres;
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public FenetreJeu(){
		super();
		this.voiture = new VoiturePanel(this.getContentPane());
		this.parametres = new VoitureParameters(10);
		eventVoiture();
	}

	
	public VoitureParameters getParametres() {
		return parametres;
	}


	public VoiturePanel getVoiture() {
		return voiture;
	}

	private void eventVoiture(){
		this.voiture.addKeyListener(new KeyListener()
		{
			@Override
			public void keyPressed(KeyEvent e)
			{	
				Point p = getVoiture().getLocation();
				switch (e.getKeyCode())
				{
					case KeyEvent.VK_RIGHT:
						getVoiture().setLocation(p.x+1, p.y);
						break;
					case KeyEvent.VK_LEFT:
						getVoiture().setLocation(p.x-1, p.y);
						break;
					case KeyEvent.VK_UP:
					    getParametres().accelaration();
						break;
					case KeyEvent.VK_DOWN:
					    getParametres().freiner();
						break;
				}
			}
			public void keyReleased(KeyEvent e) {}
			public void keyTyped(KeyEvent e) {}
			
		});
	}
	
}
