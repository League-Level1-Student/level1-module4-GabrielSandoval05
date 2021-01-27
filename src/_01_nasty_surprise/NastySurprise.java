package _01_nasty_surprise;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.MalformedURLException;
import java.net.URL;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class NastySurprise implements ActionListener {
	JButton trick = new JButton("trick");
	JButton treat = new JButton("treat");
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
		
		//trick.addActionListener(this);
		//treat.getActionListeners();
		
		
		
		
			
		}
		
	
	public static void main(String[] args) {
		NastySurprise surprise = new NastySurprise();
		
		
	}
	@Override
	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub
		
		if(arg0.getSource()==trick) {
		//cat.jpg
		showPictureFromTheInternet("https://www.google.com/imgres?imgurl=https%3A%2F%2Fwww.rd.com%2Fwp-content%2Fuploads%2F2019%2F05%2FAmerican-shorthair-cat.jpg&imgrefurl=https%3A%2F%2Fwww.rd.com%2Flist%2Fcutest-cat-breeds%2F&tbnid=S_fAjEZ3GR3VEM&vet=12ahUKEwiDqrCgl73uAhUQL6wKHVerBSIQMygAegUIARDGAQ..i&docid=O2KxBoLWpCWtlM&w=4734&h=3555&q=cute%20cat&safe=active&ved=2ahUKEwiDqrCgl73uAhUQL6wKHVerBSIQMygAegUIARDGAQ");
		//showPictureFromTheInternet("Cat.jpg");
		}
		if(arg0.getSource()==treat) {
			//scary.jpg
			showPictureFromTheInternet("https://www.google.com/imgres?imgurl=https%3A%2F%2Fi1.sndcdn.com%2Fartworks-000492612906-hcoicz-t500x500.jpg&imgrefurl=https%3A%2F%2Fsoundcloud.com%2Fromeoblue69%2Fmoto-moto-big-and-chunky&tbnid=KJXj0Fs5oAgxdM&vet=12ahUKEwi81ovVl73uAhVCfqwKHexzBbYQMygNegUIARDTAQ..i&docid=yYq6Ye223XRCKM&w=500&h=500&q=moto%20moto&safe=active&ved=2ahUKEwi81ovVl73uAhVCfqwKHexzBbYQMygNegUIARDTAQ");
	//showPictureFromTheInternet("scary.jpg");
		}
	}
	
	private void showPictureFromTheInternet(String imageUrl) {
	    try {
	        URL url = new URL(imageUrl);
	        Icon icon = new ImageIcon(url);
	        JLabel imageLabel = new JLabel(icon);
	        JFrame frame = new JFrame();
	        frame.add(imageLabel);
	        frame.setVisible(true);
	        frame.pack();
	    } catch (MalformedURLException e) {
	        e.printStackTrace();
	    }
	}

	
	
	
}
