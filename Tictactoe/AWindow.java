import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
 
public class AWindows extends JFrame implements ActionListener{
  
	public static int Game;
	JButton Single, Multi;
//constructor
	AWindows(String title){
		
		super(title);
		
 
		this.setSize(200, 300);
		this.init();
		this.setVisible(true);
		this.setLocation(800, 300);
	}//end constructor
	void init(){
		JLabel TicTac = new JLabel("                Tic-Tac-Toe");
		Single = new JButton("Singleplayer");
		Multi = new JButton("Multiplayer");
		JLabel Empty = new JLabel("                 ");
		JPanel panel = new JPanel();
		
		panel.add(TicTac);
		panel.add(Empty);
		panel.add(Single);
		panel.add(Multi);
		this.add(panel);
		panel.setBackground(Color.LIGHT_GRAY);
		
        this.setResizable(false);
        
        Single.addActionListener(this);
        Multi.addActionListener(this);
        
	
	
	
	}
	@Override
	public void actionPerformed(ActionEvent event) {
		if(event.getSource() == Single){
			Game = 1;
//			System.out.println(Game);
			MyAWindow window = new MyAWindow("Tic-Tac-Toe");// title of the gui
			window.ComWin = false;
        
    		window.Player1Win = false;
    		System.out.println(window.Tic[0]);
        
    		// Set the program to close when the window is closed
        
    		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			dispose();
			System.out.println(Game);
			JOptionPane.showMessageDialog(null, "Welcome to Tic Tac Toe! In Singleplayer you are X! ", "TTT", JOptionPane.INFORMATION_MESSAGE) ;
			
			
		}
		if(event.getSource() == Multi){
			Windows window = new Windows("Tic-Tac-Toe Multiplayer");// title of the gui
			Game = 2;
    		// Set the program to close when the window is closed
        
    		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			dispose();
			JOptionPane.showMessageDialog(null, "Welcome to Tic Tac Toe Multiplayer! Player 1 is X and Player 2 is O! ", "TTT", JOptionPane.INFORMATION_MESSAGE) ;
		}
		
	
	
	
	}


}
