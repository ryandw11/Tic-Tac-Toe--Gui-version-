import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
 
public class JavaWindow {
 
    public static void main(String[] args) {
        // TODO Auto-generated method stub
    
    	AWindows windows = new AWindows("TTT");
    	windows.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    	
    	
    	
//   	while(windows.Game == false){
////    	if (windows.Game == true){
////    		MyAWindow window = new MyAWindow("Tic-Tac-Toe");// title of the gui
////    		window.ComWin = false;
////        
////    		window.Player1Win = false;
////    		System.out.println(window.Tic[0]);
////        
////    		// Set the program to close when the window is closed
////        
////    		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
////        
////    		System.out.println(window.Tic[0]);
//        
    	//}
//    	
//    	}
//    	if (windows.Game == true){
//    		MyAWindow window = new MyAWindow("Tic-Tac-Toe");// title of the gui
//    		window.ComWin = false;
//        
//    		window.Player1Win = false;
//    		System.out.println(window.Tic[0]);
//        
//    		// Set the program to close when the window is closed
//        
//    		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//        
//    		System.out.println(window.Tic[0]);
//        
//    	}
    	int t;
    	t = 1;
        System.out.println(AWindows.Game);

    	
   while(1 == t){      // this is broken <
	   System.out.println("");
    	if (AWindows.Game == 1){
    		System.out.println("Single");
    	
    	while(MyAWindow.ComWin == false && MyAWindow.Player1Win == false && MyAWindow.Tie == false){
    		if(MyAWindow.MyTurn == true){
    			MyAWindow.computer();
    			MyAWindow.MyTurn = false;
    			MyAWindow.Win();
    		
    		
    		
    		}
    		
    	}
    	break;
        
         
    	}
    else if (AWindows.Game == 2){
    	System.out.println("Multi");
    	Windows.Player1 = true;
   		while(Windows.playerwin == false && Windows.player2win == false && Windows.Tie == false ){ // this loop also not working <<<<
   			
   			if(Windows.Player1 == true){
   			Windows.Win();
   			}
   			 if(Windows.Player1 == false){
   				 Windows.Win();
   			 }
   			
   			
   			
   		
   		
   		
   		}
   		
   		System.out.println("Game Report");
   		break;
   			
    			
    			
    			
    			
   		}
    		
    	
    	
    	
    	
    	}
   		if(AWindows.Game == 1){
   			if(MyAWindow.ComWin == true){
   	        	JOptionPane.showMessageDialog(null, "The Computer Wins!", "TTT - GameOver", JOptionPane.INFORMATION_MESSAGE) ;
   	        }
   	        else if(MyAWindow.Player1Win == true){
   	        	JOptionPane.showMessageDialog(null, "You Win!", "TTT - GameOver", JOptionPane.INFORMATION_MESSAGE) ;
   	        }
   	        else if(MyAWindow.Tie == true){
   	        	JOptionPane.showMessageDialog(null, "Its a tie!", "TTT - GameOver", JOptionPane.INFORMATION_MESSAGE) ;
   	        }
   	        else{
   	        	JOptionPane.showMessageDialog(null, "Error: An unexpected error has happend! Please try to restart the game. Java.Tic-Tac-Toe.Windows.Win unexpected feed. ", "TTT - Error", JOptionPane.ERROR_MESSAGE) ;
   	        }
   			
   			JOptionPane.showMessageDialog(null, "The game board will remain open for you to see what happend! If you want to close it press the red X!", "TTT - GameOver", JOptionPane.INFORMATION_MESSAGE) ;
   			Again windows1 = new Again("TTT");
   	    	windows1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
    
    
   }
   		else{
   			if(Windows.playerwin == true){
   	        	JOptionPane.showMessageDialog(null, "Player 1 Wins!", "TTT - GameOver", JOptionPane.INFORMATION_MESSAGE) ;
   	        }
   	        else if(Windows.player2win == true){
   	        	JOptionPane.showMessageDialog(null, "Player 2 Wins!", "TTT - GameOver", JOptionPane.INFORMATION_MESSAGE) ;
   	        }
   	        else if(Windows.Tie == true){
   	        	JOptionPane.showMessageDialog(null, "Its a tie!", "TTT - GameOver", JOptionPane.INFORMATION_MESSAGE) ;
   	        }
   	        else{
   	        	JOptionPane.showMessageDialog(null, "Error: An unexpected error has happend! Please try to restart the game. Java.Tic-Tac-Toe.Windows.Win unexpected feed. ", "TTT - Error", JOptionPane.ERROR_MESSAGE) ;
   	        }
   	
   			JOptionPane.showMessageDialog(null, "The game board will remain open for you to see what happend! If you want to close it press the red X!", "TTT - GameOver", JOptionPane.INFORMATION_MESSAGE) ;
   			Again windows1 = new Again("TTT");
   	    	windows1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
   	    	
   			
   		}
    }








    
 
}
