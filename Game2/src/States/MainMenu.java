package States;

import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JPanel;

import GameBasics.GameEngine;
import gfx.ImageLoader;

public class MainMenu extends State{
	
	private static final long serialVersionUID = 1L;

	public MainMenu (GameEngine gmrunnable) {
		init(gmrunnable);
	}
	
	@Override
	public void init(GameEngine gmrunnable) { //main menu does not need more than the init() method since it's only a selection panel

		new JPanel();
		setLayout(null);
		
		JButton btnPulsame = new JButton("Iniciar");
		JButton salir = new JButton("salir");
		ImageIcon icon = new ImageIcon();
		icon.setImage(ImageLoader.loadImage("/textures/startButton.png").getScaledInstance(89, 23, Image.SCALE_DEFAULT));
		btnPulsame.setIcon(icon);
	    btnPulsame.setBounds(43, 70, 89, 23);
	    salir.setBounds(43, 150, 89, 23);
	    add(btnPulsame);
	    add(salir);
	    validate();
	    btnPulsame.addActionListener(new ActionListener(){
	            public void actionPerformed (ActionEvent e){
	            		System.out.println("state1");
	            		gmrunnable.changeState(new Game(gmrunnable));
	            }
	        });
	    salir.addActionListener(new ActionListener(){
            public void actionPerformed (ActionEvent e){
            		System.out.println("Adios");
            		gmrunnable.quit();
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
		
		
	}

	public static void render() {
		
	}

	@Override
	public boolean isRenderable() {
		// TODO Auto-generated method stub
		return false;
	}

}
