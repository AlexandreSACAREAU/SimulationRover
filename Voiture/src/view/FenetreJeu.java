package view;

import java.awt.Point;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JFrame;

import model.RoverPanel;
import model.RoverParameters;

public class FenetreJeu extends JFrame {
	
	private RoverPanel voiture;
	private RoverParameters parametres;

	private static final long serialVersionUID = 1L;

	public FenetreJeu(){
		super();
		this.voiture = new RoverPanel(this.getContentPane());
		add(this.voiture);
		this.parametres = new RoverParameters(10);
		eventVoiture();
	}

	
	public RoverParameters getParametres() {
		return parametres;
	}


	public RoverPanel getVoiture() {
		return voiture;
	}

	private void eventVoiture(){
		this.addKeyListener(new KeyListener()
		{
			@Override
			public void keyPressed(KeyEvent e)
			{	
				Point p = getVoiture().getLocation();
				switch (e.getKeyCode())
				{
					case KeyEvent.VK_RIGHT:
						getVoiture().setLocation(p.x+8, p.y);
						break;
					case KeyEvent.VK_LEFT:
						getVoiture().setLocation(p.x-8, p.y);
						break;
					case KeyEvent.VK_UP:
						getVoiture().setLocation(p.x, p.y-8);
						break;
					case KeyEvent.VK_DOWN:
						getVoiture().setLocation(p.x, p.y+8);
						break;
				}
			}
			public void keyReleased(KeyEvent e) {}
			public void keyTyped(KeyEvent e) {}
			
		});
	}
	
}
