package States;

import javax.swing.JPanel;
import javax.swing.JTextArea;

import GameBasics.GameEngine;

public class Intro extends State{

	private static final long serialVersionUID = 1L;

	public Intro (GameEngine gmrunnable) {
		init(gmrunnable);
	}
		
	@Override
	public void init(GameEngine gmrunnable) {
		new JPanel();
		setLayout(null);
		JTextArea text = new JTextArea();
		text.setBounds(0, 0, 640, 480);
		text.setText("Aqui va la Imagen del intro");
		add(text);

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

	@Override
	public boolean isRenderable() {
		// TODO Auto-generated method stub
		return false;
	}
}
