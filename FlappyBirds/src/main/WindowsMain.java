package main;

import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingUtilities;
import javax.swing.Timer;
import javax.swing.WindowConstants;

public class WindowsMain extends JFrame {
	
	private static final long serialVersionUID = 1L;
	ArrayList <JLabel> jl = new ArrayList<JLabel>();
	
	public void printMap() {

		for (int y = 0; y < Main.map.length; y++) {
			String value = "";
			for (int x = 0; x < Main.map[0].length; x++) {
				if (Main.map[y][x] == 1) {
					value += "#";
				} else if (y == Main.birdPosY && x == Main.birdPosX) {
					value += "B";
				} else
					value += " ";

			}
			jl.add( new JLabel(value));
		}
		
		

	}
	
	public WindowsMain() throws FileNotFoundException, IOException {
		super.setPreferredSize(new Dimension(1500, 900));
		super.pack();
		super.setVisible(true);
		super.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

		printMap();
		
		for(JLabel lab: jl) {
			add(lab);
		}
		
		
//		GameMap map = new GameMap();
//		Pacman pacman = new Pacman( new Position(10,10) );
//		List<Ghost> ghosts = new ArrayList<Ghost>();
//			ghosts.add(new Ghost( new Position(15, 13),  -1, 0));
//			ghosts.add(new Ghost( new Position(17, 10),  0,  1));

		// this.level = new GameLevel(map, pacman, ghosts);

		// this.gameRules = new GameRules(level);

		// this.windowsRenderer = new WindowsRenderer();

		super.addKeyListener(new KeyListener() {

			@Override
			public void keyTyped(KeyEvent e) {
			}

			@Override
			public void keyReleased(KeyEvent e) {
			}

			@Override
			public void keyPressed(KeyEvent e) {
				char command = e.getKeyChar();
				repaint();

				// gameRules.processUserInput(command);
			}
		});

		new Timer(300, new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				repaint();

			}

		}).start();
	}

	@Override
	public void paint(Graphics g) {
		super.paint(g);

		// this.windowsRenderer.render(g, this.level);
	}

	public static void main(String[] args) throws Exception {
		SwingUtilities.invokeAndWait(new Runnable() {

			@Override
			public void run() {
				try {
					
					
					
					new WindowsMain();
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
}
