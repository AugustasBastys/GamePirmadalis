package main;

import java.awt.Graphics;

import javax.swing.JPanel;

public class Renderer extends JPanel {
	private static final long serialVersionUID = 1L;
	
	
	FlappyBird flappy;
	
	public Renderer(FlappyBird flappy) {
		super();
		this.flappy = flappy;
	}

	@Override
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		flappy.repaint(g);
	}
}