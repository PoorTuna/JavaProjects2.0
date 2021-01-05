

/*
 * Matrix Grid Layout in java (requires no other files).
 */

import java.awt.*;
import javax.swing.*;


public class GraphicMatrixGameOfLife
{
	   	public final static boolean RIGHT_TO_LEFT = false;
	   	//	  Create and set up the window.
        JFrame frame;

        gameoflife gMat ;
	    private int size = 0;

	    
	    /**
	     * Constructor - בנאי
	     */
	    public  GraphicMatrixGameOfLife(String name,int length) {
	    	this.size = length+2;
	    	this.gMat = new gameoflife(length+2);
	    	this.frame = new JFrame(name);
	    	this.frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	    	this.frame.setSize(700, 700);
	    	this.frame.getContentPane().setBackground(Color.ORANGE);
		
	        addComponentsToPane(this.frame.getContentPane());

	        //Display the window.
	        this.frame.pack();
	        this.frame.setVisible(true);
	    }
	    
	    public  GraphicMatrixGameOfLife(String name, gameoflife lfGame) {
	    	this.size = lfGame.getMatrixLength();
	    	this.gMat = new gameoflife(lfGame);
	    	this.frame = new JFrame(name);
	    	this.frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	    	this.frame.setSize(700, 700);
	    	this.frame.getContentPane().setBackground(Color.ORANGE);
	
			
	        addComponentsToPane(this.frame.getContentPane());

	        //Display the window.
	        this.frame.pack();
	        this.frame.setVisible(true);
	    }
	    
	    public  void addComponentsToPane(Container pane) {
	        if (RIGHT_TO_LEFT) {
	            pane.setComponentOrientation(
	                ComponentOrientation.RIGHT_TO_LEFT);
	        }

	        pane.setLayout(new GridLayout(this.size+1,this.size)); // סידור החלקים במטריצה

	        //pane.setSize(400, 400);

	        JButton jbt;
	        for (int i = 0 ; i < this.size ; i++)
	        	 for (int j = 0 ; j < this.size ; j++)
	        	 {
	        		 
	        		 if ((i == 0) || (j == 0) || (i == this.size-1) ||(j == this.size-1))
	        			 pane.add(new JLabel(""));
	        		 else
	        		 {
	        			 if (this.gMat.getMatrixValue(i,j))
	        				 	jbt = new JButton("X");
	        			 	else
	        			 		jbt = new JButton("");
		        		 //jb.setIconTextGap(1);
	        			 jbt.setFont(new Font("david", Font.BOLD, 20));	//  סוג הפונט וגובהו
	        			 jbt.setForeground(Color.BLUE);					//  צבע הפונט
	        			 pane.add(jbt);
	        		 }
	        	 }

	    }

	    /**
	     * Create the GUI and show it.  For thread safety,
	     * this method should be invoked from the
	     * event-dispatching thread.
	     */


	    public static void main(String[] args)
	    {	
	    	//	Schedule a job for the event-dispatching thread:
	        //  creating and showing this application's GUI.
	        javax.swing.SwingUtilities.invokeLater(new Runnable()
	        {
	            public void run() {
	                //new GraphicMatrix("Graphic Matrix",false);
	            }
	        }											);
	    }
}
