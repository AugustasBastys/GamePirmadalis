package main;

import java.awt.Rectangle;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;


public class Controls implements KeyListener {

	Rectangle bird;

	public Controls() {
		// TODO Auto-generated constructor stub
	}

	public Rectangle getBird() {
		return bird;
	}

	public void setBird(Rectangle bird) {
		this.bird = bird;
	}

	@Override
	public void keyReleased(KeyEvent e)
	{
		
	}

	@Override
	public void keyPressed(KeyEvent e) {
		
		int birdJumpsBy = 50;
		
		if (e.getKeyCode() == KeyEvent.VK_SPACE) {
			bird.y -= birdJumpsBy;
		}
		
	}

	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}
	
	
}
