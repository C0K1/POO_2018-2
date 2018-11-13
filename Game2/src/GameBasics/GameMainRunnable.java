package GameBasics;

import java.awt.event.WindowEvent;

public class GameMainRunnable implements Runnable{  //this is the main runnable
	

	public GameEngine game; //declare a functional frame
	public Thread thread; //main thread
	
	public void init() {
		game = new GameEngine(); //starts the functional thread
	}
	
	public void run() {
		
	    // initialize the engine
			
	    game.init();

	    // main loop
		
		int fps = 60; //set frames per second
		double timePerTick = 1000000000 / fps; //get frames per milliseconds 
		double delta = 0; //aux variable
		long now;   //aux variable
		long lastTime = System.nanoTime();
		long timer = 0;
		int ticks = 0;
		
		while(game.isRunning()){
			now = System.nanoTime();
			delta += (now - lastTime) / timePerTick;
			timer += now - lastTime;
			lastTime = now;
			
			if(delta >= 1){
				game.tick();
				game.render();
				ticks++;
				delta--;
			}
			
			if(timer >= 1000000000){
				System.out.println("Ticks and Frames: " + ticks); //check ticks
				ticks = 0;
				timer = 0;
			}
		}
		game.dispatchEvent(new WindowEvent(game, WindowEvent.WINDOW_CLOSING)); //automatically closes the window when thread is done
			
	}
		
		public synchronized void start(){ //starts the main thread
			thread = new Thread(this);
			thread.start();
		}
		
}
