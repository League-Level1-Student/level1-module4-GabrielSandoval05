package _04_chuckle_clicker;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class Chuckleclicker implements ActionListener {
	JButton joke = new JButton();
	JButton punchline = new JButton();

	public static void main(String[] args){
		
		
		
	}
	
	 void makeButtons() {
		//JOptionPane.showMessageDialog(null, "Make Buttons");
		JFrame frame = new JFrame();
		frame.setVisible(true);
		JPanel panel = new JPanel();
		
		
		frame.add(panel);
		panel.add(joke);
		panel.add(punchline);
		
		joke.addActionListener(this);
		punchline.addActionListener(this);
	
			
		
		//JButton buttonPressed = (JButton) e.getSource();
	
		
	}

	@Override
	public void actionPerformed(ActionEvent arg0) {
		if(arg0.getSource() == joke) {
			JOptionPane.showMessageDialog(null, "hi");
			JOptionPane.showMessageDialog(null, "Why did the scientist invite the mushroom to the party? He was a fun-gi");
		}
		if(arg0.getSource()== punchline) {
			JOptionPane.showMessageDialog(null, "hi");
			JOptionPane.showMessageDialog(null, "IDK any good punchlines lol");
		}
		
	}
}
