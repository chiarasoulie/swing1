import java.awt.Color;

import javax.swing.*;
public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyFrame myWindow = new MyFrame();
		MyFrame mf1 = new MyFrame("Ma fenêtre");
		MyFrame mf2 = new MyFrame(500, 800);
		MyFrame mf3 = new MyFrame("Ma vraie fenêtre",500, 800, Color.green);
		
		mf3.getButton().addActionListener((e) -> { 
			System.out.println("Coucou");
		});
	}

}
