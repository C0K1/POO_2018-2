package GameBasics;

import java.awt.Graphics;
import java.awt.image.BufferStrategy;

import javax.swing.JFrame;

import States.Intro;
import States.MainMenu;
import States.State;

public class GameEngine extends JFrame{ //GameEngine is the main Frame that will handle all the state panels

	private static final long serialVersionUID = 1L;

	public boolean running = false; //indirect main thread control
	
	private BufferStrategy bs;
	
	private Graphics g;
	
	private State intro; //first state that shows up with the game title when open, has a delay before main menu
	
	public void init() {
		
		running = true; //this indicates that the main thread started
		
		setTitle("GeoWatch"); //window title (game's title)
		setSize(640, 480); //set frame's default size
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //it stops the program when frame is closed
		setResizable(false); //the user cannot resize the window
		setLocationRelativeTo(null);  //shows up the window at the center of the user's screen
		setVisible(true);  //just set it as visible
		
		intro = new Intro(this); //Initialize the first state
		changeState(intro); //sets the intro state
		
		//******************************************//
		try {										//
			Thread.sleep(1000);						//
		} catch (InterruptedException e) {			//   first delay
			// TODO Auto-generated catch block		//
			e.printStackTrace();					//
		}											//
		//******************************************//
		
		changeState(new MainMenu(this)); //sets the first interactive state
	}
		  
	
	public void cleanup() {
		
		getContentPane().removeAll(); //removes the current panel from frame
		
	}

	public void changeState(State state) {   //change state while changing the state panel too
		
		cleanup(); //clean frame
		
		State.setState(state); //set new state
		setContentPane(state); //set new panel to the main frame
		validate(); //validate changes
		
	}
	
	void pushState(State state) {
		
	}
	void popState() {
		
	}

	void handleEvents() {	
		
	}
	void tick() {
		State.tick();
	}
	
	void render() {	
		
		if (State.getState().isRenderable()) {
		createBufferStrategy(2);
		
		bs = getBufferStrategy();
		if(bs == null){
			createBufferStrategy(3);
			return;
		}
		g = bs.getDrawGraphics();
		//Clear Screen
		
		//Draw Here!
		
		if(State.getState() != null)
			State.getState().render(g);
		
		//End Drawing!
		bs.show();
		g.dispose();}
	}

	public boolean isRunning() { //indirect thread control
		return running; 
	}
	
	public void quit() { //indirect thread control
		running = false;
	}
	

}
