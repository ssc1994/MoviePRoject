package movieinformation;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;

public class MovieInfo {
	
	 public static void main(String[] args) throws IOException {
		 
		 String crayon = Files.readString(Paths.get("C:\\Users\\user\\git\\MovieProject\\MovieProject\\src\\movieinformation\\영화정보폴더\\CrayonShin_chan.txt"));
		 String conFession = Files.readString(Paths.get("C:\\Users\\user\\git\\MovieProject\\MovieProject\\src\\movieinformation\\영화정보폴더\\ConFession.txt"));
		 String blackAdam = Files.readString(Paths.get("C:\\Users\\user\\git\\MovieProject\\MovieProject\\src\\movieinformation\\영화정보폴더\\BlackAdam.txt"));
		 String highWayFamilly = Files.readString(Paths.get("C:\\Users\\user\\git\\MovieProject\\MovieProject\\src\\movieinformation\\영화정보폴더\\HighWayFamilly.txt"));
		 
		 
	 }
	 
	 public class InfoSwing{
		 
		 InfoSwing(){
			 
			 JFrame jFrame = new JFrame();
			 jFrame.setTitle("영화 정보");
			 jFrame.setVisible(true);
			 jFrame.setSize(600,600);
			 jFrame.setResizable(false);
			 jFrame.setLocationRelativeTo(null);
			 jFrame.setDefaultCloseOperation(jFrame.EXIT_ON_CLOSE);
			 
			 
			 
			 
		 }
		 
	 }
	 
	 
	 
	 
	 
	 
}	 