package _01_nasty_surprise;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class NastySurprise implements ActionListener {
	JButton trick = new JButton();
	JButton treat = new JButton();
	NastySurprise(){
JPanel panel = new JPanel();
		
		JFrame frame = new JFrame(); 
		frame.setVisible(true);
		
		
		trick.addActionListener(this);
		
		
		treat.addActionListener(this);
		
	//	JLabel treatLabel = new JLabel();
	//	JLabel trickLabel = new JLabel();
		//trick.add(trickLabel);
		//treat.add(treatLabel);
		
		frame.add(panel);
		panel.add(trick);
		panel.add(treat);
		frame.pack();
		
		trick.getActionListeners();
		
		
			
		}
		
	
	public static void main(String[] args) {
		NastySurprise surprise = new NastySurprise();
		
		
	}
	@Override
	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub
		
		if(arg0.getSource()==trick) {
			
		}
	}

	
	
	
}
