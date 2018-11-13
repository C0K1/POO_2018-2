package States;

import java.awt.Graphics;

import javax.swing.JPanel;

import GameBasics.GameEngine;

public abstract class State extends JPanel{


	private static final long serialVersionUID = 1L;
	private static State currentState = null;
	
	
 //********************************** ABSTRACT METHODS *****************************************//
	
	//setup and destroy the state
	
	public abstract void init(GameEngine gmrunnable); //initialize
	
	// Used when temporarily transitioning to another state
	
    public abstract void Pause(); //pause the game state to use another
    public abstract void Resume();	//resume state
	
    // The three important actions within a game loop
    
    public abstract void handleEvents(); //events that the state uses to function
    
	public abstract  boolean isRenderable();
    
    public static void tick() {
		// TODO Auto-generated method stub
		
	} //update variables
    public static void render() {
		// TODO Auto-generated method stub
		
	} //shows up the state graphics/visual interactions

    
 //****************************************	CLASS ********************************************//
    
    
    //getters and setters
    
	public static void setState(State state){
		currentState = state;
	}
	
	public static State getState(){
		return currentState;
	}
	
	public void render(Graphics g) {
		// TODO Auto-generated method stub
		
	}

}