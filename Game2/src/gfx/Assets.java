package gfx;

import java.awt.image.BufferedImage;

public class Assets extends ImageLoader{
	
	public Assets() {
		
		
		
	}
	
	
	public static BufferedImage player() {
		
		BufferedImage player = loadImage("/textures/testsheet.png");
		System.out.println(player.getWidth());
		System.out.println(player.getHeight());
		return player.getSubimage(0,0,32,64);
		
	}
	
	public static BufferedImage tile() {
		
		return null;
		
	}
	
}
