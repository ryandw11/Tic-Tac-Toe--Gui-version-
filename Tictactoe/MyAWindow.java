import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import java.util.*;


// What did I last do? I am currently working on making it where the button changes to X when pressed!

public class MyAWindow extends JFrame implements ActionListener{
	static Random ran = new Random();
	public static boolean Player1Win;
	public static boolean ComWin;
	public static boolean MyTurn;
	public static boolean Tie;
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
                   //                    V              V                 game board
	public static String[] Tic = { " ", " ", " ", " ", " ", " ", " ", " ", " " }; 	
	
	public JPanel panel = new JPanel(new GridLayout(3,3));
	
	//constructor
	MyAWindow(String title){
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
		
	
	}//=====================================================================================================================
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
	public static void computer(){
		// This is a big line of code for one check to win =[ ===
		if(Tic[0].equals("O") && Tic[1].equals("O") && Tic[2].equals(" ")){
		  a3.setText("O");
		  Tic[2] = "O";
		}
		else if(Tic[0].equals("O") && Tic[1].equals(" ") && Tic[2].equals("O")){
			  a2.setText("O");
			  Tic[1] = "O";
			}
		else if(Tic[0].equals(" ") && Tic[1].equals("O") && Tic[2].equals("O")){
			  a1.setText("O");
			  Tic[0] = "O";
			}
		
		// This is a big line of code for one check to win =[ ===
		else if(Tic[3].equals("O") && Tic[4].equals("O") && Tic[5].equals(" ")){
				  b3.setText("O");
				  Tic[5] = "O";
			}
		else if(Tic[3].equals("O") && Tic[4].equals(" ") && Tic[5].equals("O")){
					b2.setText("O");
					Tic[4] = "O";
					}
		else if(Tic[3].equals(" ") && Tic[4].equals("O") && Tic[5].equals("O")){
					b1.setText("O");
					Tic[3] = "O";
				}
		
			// This is a big line of code for one check to win =[ ===
		else if(Tic[6].equals("O") && Tic[7].equals("O") && Tic[8].equals(" ")){
			  c3.setText("O");
			  Tic[8] = "O";
			}
		else if(Tic[6].equals("O") && Tic[7].equals(" ") && Tic[8].equals("O")){
				  c2.setText("O");
				  Tic[7] = "O";
				}
		else if(Tic[6].equals(" ") && Tic[7].equals("O") && Tic[8].equals("O")){
				  c1.setText("O");
				  Tic[6] = "O";
				}
			
			// This is a big line of code for one check to win =[ === (Down now)
		else if(Tic[0].equals("O") && Tic[3].equals("O") && Tic[6].equals(" ")){
			  c1.setText("O");
			  Tic[6] = "O";
			}
		else if(Tic[0].equals("O") && Tic[3].equals(" ") && Tic[6].equals("O")){
				  b1.setText("O");
				  Tic[3] = "O";
				}
		else if(Tic[0].equals(" ") && Tic[3].equals("O") && Tic[6].equals("O")){
				  a1.setText("O");
				  Tic[0] = "O";
				}
			
			// This is a big line of code for one check to win =[ === (Down now)
		else if(Tic[1].equals("O") && Tic[4].equals("O") && Tic[7].equals(" ")){
			  c2.setText("O");
			  Tic[7] = "O";
			}
		else if(Tic[1].equals("O") && Tic[4].equals(" ") && Tic[7].equals("O")){
				  b2.setText("O");
				  Tic[4] = "O";
				}
		else if(Tic[1].equals(" ") && Tic[4].equals("O") && Tic[7].equals("O")){
				  a2.setText("O");
				  Tic[1] = "O";
				}
			
			// This is a big line of code for one check to win =[ === (Down now)
		else if(Tic[2].equals("O") && Tic[5].equals("O") && Tic[8].equals(" ")){
			  c3.setText("O");
			  Tic[8] = "O";
			}
		else if(Tic[2].equals("O") && Tic[5].equals(" ") && Tic[8].equals("O")){
				  b3.setText("O");
				  Tic[5] = "O";
				}
		else if(Tic[2].equals(" ") && Tic[5].equals("O") && Tic[8].equals("O")){
				  a3.setText("O");
				  Tic[2] = "O";
				}
			
			// This is a big line of code for one check to win =[ === (Diagonal)
		else if(Tic[0].equals("O") && Tic[4].equals("O") && Tic[8].equals(" ")){
			      c3.setText("O");
			      Tic[8] = "O";
			}
		else if(Tic[0].equals("O") && Tic[4].equals(" ") && Tic[8].equals("O")){
				  b2.setText("O");
				  Tic[4] = "O";
				}
		else if(Tic[0].equals(" ") && Tic[4].equals("O") && Tic[8].equals("O")){
				  a1.setText("O");
				  Tic[0] = "O";
				}
			
			// This is a big line of code for one check to win =[ === (Diagonal)
		else if(Tic[2].equals("O") && Tic[4].equals("O") && Tic[6].equals(" ")){
			      c1.setText("O");
			      Tic[6] = "O";
			}
			else if(Tic[2].equals("O") && Tic[4].equals(" ") && Tic[6].equals("O")){
				  b2.setText("O");
				  Tic[4] = "O";
				}
			else if(Tic[2].equals(" ") && Tic[4].equals("O") && Tic[6].equals("O")){
				  a3.setText("O");
				  Tic[2] = "O";
				}
//Check to see if the player can win!==================================================================================
		// This is a big line of code for one check to win =[ ===
				if(Tic[0].equals("X") && Tic[1].equals("X") && Tic[2].equals(" ")){
				  a3.setText("O");
				  Tic[2] = "O";
				}
				else if(Tic[0].equals("X") && Tic[1].equals(" ") && Tic[2].equals("X")){
					  a2.setText("O");
					  Tic[1] = "O";
					}
				else if(Tic[0].equals(" ") && Tic[1].equals("X") && Tic[2].equals("X")){
					  a1.setText("O");
					  Tic[0] = "O";
					}
				
				// This is a big line of code for one check to win =[ ===
				else if(Tic[3].equals("X") && Tic[4].equals("X") && Tic[5].equals(" ")){
						  b3.setText("O");
						  Tic[5] = "O";
					}
				else if(Tic[3].equals("X") && Tic[4].equals(" ") && Tic[5].equals("X")){
							b2.setText("O");
							Tic[4] = "O";
							}
				else if(Tic[3].equals(" ") && Tic[4].equals("X") && Tic[5].equals("X")){
							b1.setText("O");
							Tic[3] = "O";
						}
				
					// This is a big line of code for one check to win =[ ===
				else if(Tic[6].equals("X") && Tic[7].equals("X") && Tic[8].equals(" ")){
					  c3.setText("O");
					  Tic[8] = "O";
					}
				else if(Tic[6].equals("X") && Tic[7].equals(" ") && Tic[8].equals("X")){
						  c2.setText("O");
						  Tic[7] = "O";
						}
				else if(Tic[6].equals(" ") && Tic[7].equals("X") && Tic[8].equals("X")){
						  c1.setText("O");
						  Tic[6] = "O";
						}
					
					// This is a big line of code for one check to win =[ === (Down now)
				else if(Tic[0].equals("X") && Tic[3].equals("X") && Tic[6].equals(" ")){
					  c1.setText("O");
					  Tic[6] = "O";
					}
				else if(Tic[0].equals("X") && Tic[3].equals(" ") && Tic[6].equals("X")){
						  b1.setText("O");
						  Tic[3] = "O";
						}
				else if(Tic[0].equals(" ") && Tic[3].equals("X") && Tic[6].equals("X")){
						  a1.setText("O");
						  Tic[0] = "O";
						}
					
					// This is a big line of code for one check to win =[ === (Down now)
				else if(Tic[1].equals("X") && Tic[4].equals("X") && Tic[7].equals(" ")){
					  c2.setText("O");
					  Tic[7] = "O";
					}
				else if(Tic[1].equals("X") && Tic[4].equals(" ") && Tic[7].equals("X")){
						  b2.setText("O");
						  Tic[4] = "O";
						}
				else if(Tic[1].equals(" ") && Tic[4].equals("X") && Tic[7].equals("X")){
						  a2.setText("O");
						  Tic[1] = "O";
						}
					
					// This is a big line of code for one check to win =[ === (Down now)
				else if(Tic[2].equals("X") && Tic[5].equals("X") && Tic[8].equals(" ")){
					  c3.setText("O");
					  Tic[8] = "O";
					}
				else if(Tic[2].equals("X") && Tic[5].equals(" ") && Tic[8].equals("X")){
						  b3.setText("O");
						  Tic[5] = "O";
						}
				else if(Tic[2].equals(" ") && Tic[5].equals("X") && Tic[8].equals("X")){
						  a3.setText("O");
						  Tic[2] = "O";
						}
					
					// This is a big line of code for one check to win =[ === (Diagonal)
				else if(Tic[0].equals("X") && Tic[4].equals("X") && Tic[8].equals(" ")){
					      c3.setText("O");
					      Tic[8] = "O";
					}
				else if(Tic[0].equals("X") && Tic[4].equals(" ") && Tic[8].equals("X")){
						  b2.setText("O");
						  Tic[4] = "O";
						}
				else if(Tic[0].equals(" ") && Tic[4].equals("X") && Tic[8].equals("X")){
						  a1.setText("O");
						  Tic[0] = "O";
						}
					
					// This is a big line of code for one check to win =[ === (Diagonal)
				else if(Tic[2].equals("X") && Tic[4].equals("X") && Tic[6].equals(" ")){
					      c1.setText("O");
					      Tic[6] = "O";
					}
				else if(Tic[2].equals("X") && Tic[4].equals(" ") && Tic[6].equals("X")){
						  b2.setText("O");
						  Tic[4] = "O";
						}
				else if(Tic[2].equals(" ") && Tic[4].equals("X") && Tic[6].equals("X")){
						  a3.setText("O");
						  Tic[2] = "O";
						}
			//end
			else{
				int pick = ran.nextInt(9);
				if(pick == 0){
					if(a1.getText().equals(" ")){
						a1.setText("O");
						Tic[0] = "O";
					}
				}//end
				else if(pick == 1){
					if(a2.getText().equals(" ")){
						a2.setText("O");
						Tic[1] = "O";
					}
				}//end
				else if(pick == 2){
					if(a3.getText().equals(" ")){
						a3.setText("O");
						Tic[2] = "O";
					}
				}//end
				else if(pick == 3){
					if(b1.getText().equals(" ")){
						b1.setText("O");
						Tic[3] = "O";
					}
				}//end
				else if(pick == 4){
					if(b2.getText().equals(" ")){
						b2.setText("O");
						Tic[4] = "O";
					}
				}//end
				else if(pick == 5){
					if(b3.getText().equals(" ")){
						b3.setText("O");
						Tic[5] = "O";
					}
				}//end
				else if(pick == 6){
					if(c1.getText().equals(" ")){
						c1.setText("O");
						Tic[6] = "O";
					}
				}//end
				else if(pick == 7){
					if(c2.getText().equals(" ")){
						c2.setText("O");
						Tic[7] = "O";
					}
				}//end
				else if(pick == 8){
					if(c3.getText().equals(" ")){
						c3.setText("O");
						Tic[8] = "O";
					}
				}//end
			}
//END OF CODE FOR COMPUTER!!!!============================================================================================
			
			
	}
	
	public static void Win(){
		if(Tic[0].equals("X") && Tic[1].equals("X") && Tic[2].equals("X")){
			Player1Win = true;
		}
		else if(Tic[3].equals("X") && Tic[4].equals("X") && Tic[5].equals("X")){
			Player1Win = true;
		}
		else if(Tic[6].equals("X") && Tic[7].equals("X") && Tic[8].equals("X")){
			Player1Win = true;
		}
		
		else if(Tic[0].equals("X") && Tic[3].equals("X") && Tic[6].equals("X")){
			Player1Win = true;
		}
		else if(Tic[1].equals("X") && Tic[4].equals("X") && Tic[7].equals("X")){
			Player1Win = true;
		}
		else if(Tic[2].equals("X") && Tic[5].equals("X") && Tic[8].equals("X")){
			Player1Win = true;
		}
		
		else if(Tic[0].equals("X") && Tic[4].equals("X") && Tic[8].equals("X")){
			Player1Win = true;
		}
		else if(Tic[2].equals("X") && Tic[4].equals("X") && Tic[6].equals("X")){
			Player1Win = true;
		}
		//END OF PLAYER 1 WIN
		//computer
		else if(Tic[0].equals("O") && Tic[1].equals("O") && Tic[2].equals("O")){
			ComWin = true;
		}
		else if(Tic[3].equals("O") && Tic[4].equals("O") && Tic[5].equals("O")){
			ComWin = true;
		}
		else if(Tic[6].equals("O") && Tic[7].equals("O") && Tic[8].equals("O")){
			ComWin = true;
		}
		
		else if(Tic[0].equals("O") && Tic[3].equals("O") && Tic[6].equals("O")){
			ComWin = true;
		}
		else if(Tic[1].equals("O") && Tic[4].equals("O") && Tic[7].equals("O")){
			ComWin = true;
		}
		else if(Tic[2].equals("O") && Tic[5].equals("O") && Tic[8].equals("O")){
			ComWin = true;
		}
		
		else if(Tic[0].equals("O") && Tic[4].equals("O") && Tic[8].equals("O")){
			ComWin = true;
		}
		else if(Tic[2].equals("O") && Tic[4].equals("O") && Tic[6].equals("O")){
			ComWin = true;
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
		if(event.getSource() == a1){
			
			if(Tic[0].equals(" ")){
				Tic[0] = "X";
			    a1.setText(Tic[0]); //updates the button
			    MyTurn = true;
				
				
			}
			else{
				JOptionPane.showMessageDialog(this, "Error: This space is already taken! ", "Error", JOptionPane.ERROR_MESSAGE) ;
				
			}
			
		}//end
		if(event.getSource() == a2){
			if(Tic[1].equals(" ")){
				Tic[1] = "X";
				a2.setText(Tic[1]);
				MyTurn = true;
			}
			else{
				JOptionPane.showMessageDialog(this, "Error: This space is already taken! ", "Error", JOptionPane.ERROR_MESSAGE) ;
			}
		}//end
		if(event.getSource() == a3){
			if(Tic[2].equals(" ")){
				Tic[2] = "X";
				a3.setText(Tic[2]);
				MyTurn = true;
			}
			else{
				JOptionPane.showMessageDialog(this, "Error: This space is already taken! ", "Error", JOptionPane.ERROR_MESSAGE) ;
			}
		}//end
		if(event.getSource() == b1){
			if(Tic[3].equals(" ")){
				Tic[3] = "X";
				b1.setText(Tic[3]);
				MyTurn = true;
			}
			else{
				JOptionPane.showMessageDialog(this, "Error: This space is already taken! ", "Error", JOptionPane.ERROR_MESSAGE) ;
			}
		}//end
		if(event.getSource() == b2){
			if(Tic[4].equals(" ")){
				Tic[4] = "X";
				b2.setText(Tic[4]);
				MyTurn = true;
			}
			else{
				JOptionPane.showMessageDialog(this, "Error: This space is already taken! ", "Error", JOptionPane.ERROR_MESSAGE) ;
			}
		}//end
		if(event.getSource() == b3){
			if(Tic[5].equals(" ")){
				Tic[5] = "X";
				b3.setText(Tic[5]);
				MyTurn = true;
			}
			else{
				JOptionPane.showMessageDialog(this, "Error: This space is already taken! ", "Error", JOptionPane.ERROR_MESSAGE) ;
			}
		}//end
		if(event.getSource() == c1){
			if(Tic[6].equals(" ")){
				Tic[6] = "X";
				c1.setText(Tic[6]);
				MyTurn = true;
			}
			else{
				JOptionPane.showMessageDialog(this, "Error: This space is already taken! ", "Error", JOptionPane.ERROR_MESSAGE) ;
			}
		}//end
		if(event.getSource() == c2){
			if(Tic[7].equals(" ")){
				Tic[7] = "X";
				c2.setText(Tic[7]);
				MyTurn = true;
			}
			else{
				JOptionPane.showMessageDialog(this, "Error: This space is already taken! ", "Error", JOptionPane.ERROR_MESSAGE) ;
			}
		}//end
		if(event.getSource() == c3){
			if(Tic[8].equals(" ")){
				Tic[8] = "X";
				c3.setText(Tic[8]);
				MyTurn = true;
			}
			else{
				JOptionPane.showMessageDialog(this, "Error: This space is already taken! ", "Error", JOptionPane.ERROR_MESSAGE) ;
			}
		}//end
	
	
	}//end of Action of button press
	
	
	
}
//142 line of CODE!!!!!!!! since 6/23/15 4:51 P.M.  
