package model;

import java.awt.Container;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class VoiturePanel extends JPanel {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JLabel carLabel;
	private JPanel carPanel;
	private  Image image;

	/**
	 * Constructor
	 * @param contentPane
	 */
    public VoiturePanel(Container content) {

		super();
		/*this.carPanel = new JPanel();
		this.carLabel = new JLabel();

	    this.carLabel.setIcon(new ImageIcon("resources/Car.png"));
	    this.carPanel.setSize(new Dimension(35,35));
	    this.carPanel.add(this.carLabel);*/
		BufferedImage myPicture = null;
		try {
			myPicture = ImageIO.read(new File("resources/Car.png"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	    JLabel picLabel = new JLabel(new ImageIcon(myPicture));
	    add(picLabel);
	}

    @Override
    public void paintComponent(Graphics G) {
        super.paintComponent(G);
        G.drawImage(image, 0, 0, this.getWidth(), this.getHeight(), null);
    }

}