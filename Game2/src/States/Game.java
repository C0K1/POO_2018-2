package States;

import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JPanel;

import GameBasics.GameEngine;
import gfx.Assets;

//import States.State;

public class Game extends State {
	
	private static final long serialVersionUID = 1L;
	
	public Game (GameEngine gmrunnable) {
		
		init(gmrunnable);
		
	}	
	@Override
	public void init(GameEngine gmrunnable) {
		new JPanel();
		setLayout(null);
		
		JButton btnPulsame = new JButton("Regrsar al menu principal");
		
			/*JLabel lbl = new JLabel(ImageLoader.loadImageIcon("/Folder-icon.ico"));
			btnPulsame.add(lbl);*/
	    btnPulsame.setBounds(43, 70, 89, 23);
	        
	    add(btnPulsame);
	        
	    btnPulsame.addActionListener(new ActionListener(){
	            public void actionPerformed (ActionEvent e){
	            		System.out.println("state2");
	            		gmrunnable.changeState(new MainMenu(gmrunnable));
	            }
	        });
	    
		
	}
	

	@Override
	public void Pause() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void Resume() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void handleEvents() {
		// TODO Auto-generated method stub
		
	}

	public static void tick() {
		// TODO Auto-generated method stub
		
	}

	public void render(Graphics g) {
		
		g.drawImage(Assets.player(), 20, 20, null);
	}
	@Override
	public boolean isRenderable() {
		return true;
	}

	
}
