import javax.swing.*;
public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JFrame myWindow = new JFrame();
		JButton jb = new JButton("Click me!");
		JButton jb2 = new JButton("Coucou");
		JButton jb3 = new JButton("C'est un bouton");
		
		JPanel panel = new JPanel();
		
		panel.add(jb2);
		panel.add(jb);
		panel.add(jb3);
		
		myWindow.add(panel);
		jb.addActionListener((e) -> { 
			System.out.println("Coucou");
		});
		myWindow.setSize(200, 200);
		myWindow.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		myWindow.setVisible(true);

	}

}
