import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
 
public class Again extends JFrame implements ActionListener{
  
	public static int Game;
	JButton Again, Leave;
//constructor
	Again(String title){
		
		super(title);
		
 
		this.setSize(200, 300);
		this.init();
		this.setVisible(true);
		this.setLocation(800, 300);
	}//end constructor
	void init(){
		JLabel TicTac = new JLabel("                Tic-Tac-Toe");
		Again = new JButton("PlayAgain");
		Leave = new JButton("Leave");
		JLabel Empty = new JLabel("                 ");
		JPanel panel = new JPanel();
		
		panel.add(TicTac);
		panel.add(Empty);
		panel.add(Again);
		panel.add(Leave);
		this.add(panel);
		panel.setBackground(Color.LIGHT_GRAY);
		
        this.setResizable(false);
        
        Again.addActionListener(this);
        Leave.addActionListener(this);
        
	
	
	
	}
	@Override
	public void actionPerformed(ActionEvent event) {
		if(event.getSource() == Again){
			JOptionPane.showMessageDialog(null, "This feature is disabled sorry =[! ", "TTT - Exit Game", JOptionPane.WARNING_MESSAGE) ;
			System.exit(0);
		}
			
			
			
		
		if(event.getSource() == Leave){
			JOptionPane.showMessageDialog(null, "Thanks for playing! ", "TTT - Exit Game", JOptionPane.INFORMATION_MESSAGE) ;
			System.exit(0);
			
		 
		}
		
	
	
	
	}


}
