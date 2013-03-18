package mainPackage;

import graphicsHandling.Screen;

import java.awt.Color;
import java.awt.DisplayMode;
import java.awt.Font;
import java.awt.Graphics;

import javax.swing.JFrame;

public class mainWindow extends JFrame{
	int resWidth = 1680;
	int resHeigth = 1050;
	
	public static void main(String[] args){

		DisplayMode dm = new DisplayMode(1680,1050,16,DisplayMode.REFRESH_RATE_UNKNOWN);
		mainWindow m = new mainWindow();
		m.run(dm);
	}
	
	public void run(DisplayMode dm){
		setBackground(Color.PINK);
		setForeground(Color.WHITE);
		setFont(new Font("Arial", Font.BOLD, 24));
		Screen s = new Screen();
		try{
			s.setFullScreen(dm, this);
			try{
				Thread.sleep(5000);
			}catch(Exception e){
				e.printStackTrace();
			}
		}finally{
			s.restoreScreen();
		}
	}
	
	public void paint(Graphics g){
		g.drawString("This is gonna be awesome", resWidth/2, resHeigth/2);
		g.drawString("It sure will!", resWidth/2, resHeight/2);
	}
}
