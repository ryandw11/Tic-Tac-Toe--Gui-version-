import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

import java.util.*;


// What did I last do? I am currently working on making it where the button changes to X when pressed!

public class Windows extends JFrame implements ActionListener{
	static Random ran = new Random();
	public static boolean Player1;
	public static boolean Player2;
	public static boolean Tie;
	public static boolean playerwin;
	public static boolean player2win;
	private static JButton a1;
	private static JButton a2;
	private static JButton a3;
	private static JButton b1;
	private static JButton b2;
	private static JButton b3;
	private static JButton c1;
	private static JButton c2;
	private static JButton c3;
    public String am1;//a----------------------
	public String am2;
	public String am3;
	public String bm1;//b-----------------------
	public String bm2;
	public String bm3;
	public String cm1;//c-----------------------
	public String cm2;
	public String cm3;
                   //                           V              V                 game board
	public static String[] Tic = { " ", " ", " ", " ", " ", " ", " ", " ", " " }; 	
	
	public JPanel panel = new JPanel(new GridLayout(3,3));
	
	//constructor
	Windows(String title){
		super(title);
		

 
		this.setSize(500, 500);
		this.init();
		this.setVisible(true);
		this.setLocation(800, 300);
	}//end constructor
	void init(){
	    a1 = new JButton(Tic[0]);
		a2 = new JButton(Tic[1]);
		a3 = new JButton(Tic[2]);
		
		b1 = new JButton(Tic[3]);
		b2 = new JButton(Tic[4]);
		b3 = new JButton(Tic[5]);
		
		c1 = new JButton(Tic[6]);
		c2 = new JButton(Tic[7]);
		c3 = new JButton(Tic[8]);
		
		a1.addActionListener(this);
		a2.addActionListener(this);
		a3.addActionListener(this);
		
		b1.addActionListener(this);
		b2.addActionListener(this);
		b3.addActionListener(this);
		
		c1.addActionListener(this);
		c2.addActionListener(this);
		c3.addActionListener(this);
		
		//JPanel panel = new JPanel(new GridLayout(3,3));
		
		panel.add(a1);
		panel.add(a2);
		panel.add(a3);
		
		panel.add(b1);
		panel.add(b2);
		panel.add(b3);
		
		panel.add(c1);
		panel.add(c2);
		panel.add(c3);
		this.add(panel);
		
	
	}
	
	public static void reload(){
		Tic[0] = " ";
		Tic[1] = " ";
		Tic[2] = " ";
		Tic[3] = " ";
		Tic[4] = " ";
		Tic[5] = " ";
		Tic[6] = " ";
		Tic[7] = " ";
		Tic[8] = " ";
	}
	
	public static void Win(){
		if(Tic[0].equals("X") && Tic[1].equals("X") && Tic[2].equals("X")){
			playerwin = true;
		}
		else if(Tic[3].equals("X") && Tic[4].equals("X") && Tic[5].equals("X")){
			playerwin = true;
		}
		else if(Tic[6].equals("X") && Tic[7].equals("X") && Tic[8].equals("X")){
			playerwin = true;
		}
		
		else if(Tic[0].equals("X") && Tic[3].equals("X") && Tic[6].equals("X")){
			playerwin = true;
		}
		else if(Tic[1].equals("X") && Tic[4].equals("X") && Tic[7].equals("X")){
			playerwin = true;
		}
		else if(Tic[2].equals("X") && Tic[5].equals("X") && Tic[8].equals("X")){
			playerwin = true;
		}
		
		else if(Tic[0].equals("X") && Tic[4].equals("X") && Tic[8].equals("X")){
			playerwin = true;
		}
		else if(Tic[2].equals("X") && Tic[4].equals("X") && Tic[6].equals("X")){
			playerwin = true;
		}
		//END OF PLAYER 1 WIN
		//Player 2 win!
		else if(Tic[0].equals("O") && Tic[1].equals("O") && Tic[2].equals("O")){
			player2win = true;
		}
		else if(Tic[3].equals("O") && Tic[4].equals("O") && Tic[5].equals("O")){
			player2win = true;
		}
		else if(Tic[6].equals("O") && Tic[7].equals("O") && Tic[8].equals("O")){
			player2win = true;
		}
		
		else if(Tic[0].equals("O") && Tic[3].equals("O") && Tic[6].equals("O")){
			player2win = true;
		}
		else if(Tic[1].equals("O") && Tic[4].equals("O") && Tic[7].equals("O")){
			player2win = true;
		}
		else if(Tic[2].equals("O") && Tic[5].equals("O") && Tic[8].equals("O")){
			player2win = true;
		}
		
		else if(Tic[0].equals("O") && Tic[4].equals("O") && Tic[8].equals("O")){
			player2win = true;
		}
		else if(Tic[2].equals("O") && Tic[4].equals("O") && Tic[6].equals("O")){
			player2win = true;
		}
		//END OF Computer WIN
		else{
			if(Tic[0] != " "  && Tic[1] != " "  && Tic[2] != " " && Tic[3] != " " && Tic[4] != " " && Tic[5] != " " && Tic[6] != " " && Tic[7] != " " && Tic[8] != " "){
				Tie = true;
			} 
		}
		
	}

	@Override
	 public void actionPerformed(ActionEvent event) { // looks for the event of a button push
		// TODO Auto-generated method stub
		if(Player1 == true){
		if(event.getSource() == a1){
			
			if(Tic[0].equals(" ")){
				Tic[0] = "X";
			    a1.setText(Tic[0]); //updates the button
			    Player1 = false;
			   
				
				
			}
		
		
			else{
				
				System.out.println("Fail");
			}
		
			
		}//end
		
		if(event.getSource() == a2){
			if(Tic[1].equals(" ")){
				Tic[1] = "X";
				a2.setText(Tic[1]);
				Player1 = false;
			}
			else{
				
			}
		}//end
		if(event.getSource() == a3){
			if(Tic[2].equals(" ")){
				Tic[2] = "X";
				a3.setText(Tic[2]);
				Player1 = false;
			}
			else{
				
			}
		}//end
		if(event.getSource() == b1){
			if(Tic[3].equals(" ")){
				Tic[3] = "X";
				b1.setText(Tic[3]);
				Player1 = false;
			}
			else{
				
			}
		}//end
		if(event.getSource() == b2){
			if(Tic[4].equals(" ")){
				Tic[4] = "X";
				b2.setText(Tic[4]);
				Player1 = false;
			}
			else{
				
			}
		}//end
		if(event.getSource() == b3){
			if(Tic[5].equals(" ")){
				Tic[5] = "X";
				b3.setText(Tic[5]);
				Player1 = false;
			}
			else{
				
			}
		}//end
		if(event.getSource() == c1){
			if(Tic[6].equals(" ")){
				Tic[6] = "X";
				c1.setText(Tic[6]);
				Player1 = false;
			}
			else{
				
			}
		}//end
		if(event.getSource() == c2){
			if(Tic[7].equals(" ")){
				Tic[7] = "X";
				c2.setText(Tic[7]);
				Player1 = false;
			}
			else{
				
			}
		}//end
		if(event.getSource() == c3){
			if(Tic[8].equals(" ")){
				Tic[8] = "X";
				c3.setText(Tic[8]);
				Player1 = false;
			}
			else{
				
			}
		}//end
		}
// Player 2 ===============================================================================================================
		
		if(Player1 == false){
			
			if(event.getSource() == a1){
				
				if(Tic[0].equals(" ")){
					Tic[0] = "O";
				    a1.setText(Tic[0]); //updates the button
				    Player1 = true;
					
					
				}
				else{
					//
					System.out.println("h");
				}
				
			}//end
			if(event.getSource() == a2){
				if(Tic[1].equals(" ")){
					Tic[1] = "O";
					a2.setText(Tic[1]);
					Player1 = true;
				}
				else{
					
				}
			}//end
			if(event.getSource() == a3){
				if(Tic[2].equals(" ")){
					Tic[2] = "O";
					a3.setText(Tic[2]);
					Player1 = true;
				}
				else{
					
				}
			}//end
			if(event.getSource() == b1){
				if(Tic[3].equals(" ")){
					Tic[3] = "O";
					b1.setText(Tic[3]);
					Player1 = true;
				}
				else{
					
				}
			}//end
			if(event.getSource() == b2){
				if(Tic[4].equals(" ")){
					Tic[4] = "O";
					b2.setText(Tic[4]);
					Player1 = true;
				}
				else{
					
				}
			}//end
			if(event.getSource() == b3){
				if(Tic[5].equals(" ")){
					Tic[5] = "O";
					b3.setText(Tic[5]);
					Player1 = true;
				}
				else{
					
				}
			}//end
			if(event.getSource() == c1){
				if(Tic[6].equals(" ")){
					Tic[6] = "O";
					c1.setText(Tic[6]);
					Player1 = true;
				}
				else{
					
				}
			}//end
			if(event.getSource() == c2){
				if(Tic[7].equals(" ")){
					Tic[7] = "O";
					c2.setText(Tic[7]);
					Player1 = true;
				}
				else{
					
				}
			}//end
			if(event.getSource() == c3){
				if(Tic[8].equals(" ")){
					Tic[8] = "O";
					c3.setText(Tic[8]);
					Player1 = true;
				}
				else{
					
				}
			}//end
			}
	
	
	}//end of Action of button press
}
