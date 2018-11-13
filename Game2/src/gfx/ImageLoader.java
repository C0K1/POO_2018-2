package gfx;

import java.awt.image.BufferedImage;
import java.io.IOException;
import java.net.URL;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;

public class ImageLoader{


	public static BufferedImage loadImage(String path) {

		try {
			return ImageIO.read(ImageLoader.class.getResource(path));
		} catch (IOException e) {
			e.printStackTrace();
			System.exit(1);
		}
		return null;

	}

	public static ImageIcon loadImageIcon(String path) {
		try {
			URL url = new URL(ImageLoader.class.getResource(path), path);
			ImageIcon imgIcon = new ImageIcon(url);
			return imgIcon;
		} catch (IOException e) {

			System.err.println("Couldn't find file: " + path);
			return null;
		}
	}
}


