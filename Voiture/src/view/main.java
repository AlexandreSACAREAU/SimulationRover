package view;

import java.awt.Point;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class main {

  
	public static void main(String[] args)
	{
		JFrame frame = new JFrame();
		frame.setLayout(null);
		frame.setSize(800, 800);

		final JButton button = new JButton("Bouton");
		frame.add(button);
		button.setBounds(350,380,100,40);
		button.addKeyListener(new KeyListener()
		{
			@Override
			public void keyPressed(KeyEvent e)
			{	
				Point p = button.getLocation();
				switch (e.getKeyCode())
				{
					case KeyEvent.VK_RIGHT:
						button.setLocation(p.x+1, p.y);
						break;
					case KeyEvent.VK_LEFT:
						button.setLocation(p.x-1, p.y);
						break;
					case KeyEvent.VK_UP:
						button.setLocation(p.x, p.y-1);
						break;
					case KeyEvent.VK_DOWN:
						button.setLocation(p.x, p.y+1);
						break;
				}
			}

			public void keyReleased(KeyEvent e) {}
			public void keyTyped(KeyEvent e) {}
			
		});
		
		frame.setLocationRelativeTo(null);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
	}
	

    

}
