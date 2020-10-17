package main;

import java.io.IOException;
import java.util.Date;
import java.util.Timer;
import java.util.TimerTask;
import javax.swing.JFrame;

public class Main {
	
	public static int readConsoleInput() throws IOException {
	
		int key = 0; 
		
		long startTime = System.currentTimeMillis();
		long elapsedTime = 0L;

		while (elapsedTime < 250) {
		
		    elapsedTime = (new Date()).getTime() - startTime;
		 key = System.in.read();
		}

		
		
		return key;	
	}
	
	public static void readInput(int key) {
		if(key == 32) {
			birdPosY--;
		}
	}
	
	static int birdPosX = 1;
	static int birdPosY = 4;
	
	public static void printMap() {
		for (int y = 0; y < map.length; y++) {
			for (int x = 0; x < map[0].length; x++) {
				if (map[y][x] == 1) {
					System.out.print("#");
				} else if (y == birdPosY && x == birdPosX) {
					System.out.print("B");
				} else
					System.out.print(" ");

			}
			System.out.println();
		}
	}
	
	public static int map[][] = {      // block select                                                       
			 {1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1},
			 {0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1},
			 {0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1},
			 {0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1},
			 {0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1},
			 {0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1},
			 {0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1},
			 {0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1},
			 {0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1},
			 {0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1},
			 {0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1},
			 {0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1},
			 {0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1},
			 {1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1}
	 };                                                                                       
	 
	public static void movementDown() {
		birdPosX += 1;
		birdPosY += 1;
	}
	
	public static boolean isGameOver() {
		
		
		if (map[birdPosY][birdPosX] == 1) {
			return true;
		}

		return false;
	}
	
	public static void main(String[] args) throws InterruptedException, IOException {
		
//		Renderer renderer = new Renderer();
//		renderer.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//		renderer.setSize(250, 250);
//		renderer.setVisible(true);
		
	boolean gameOver = false;	
	
		
	 while (!gameOver) {
		  System.out.println();
		  gameOver = isGameOver();
		 printMap();
		// readInput(readConsoleInput());
		 
		 movementDown();
		 
         Thread.sleep(250);
		 
	}
	 
	}

	
}
