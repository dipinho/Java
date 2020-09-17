package dipinho;

import javax.swing.*; 
import java.awt.*;

public class optionPane  {
	JFrame f;  
	optionPane(){  
	    f=new JFrame();   
	    String name=JOptionPane.showInputDialog(f,"Enter Name");      
	}  
	public static void main(String[] args) {  
	    new optionPane();  
	}  
	}  