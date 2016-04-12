package com.priyam.antlr;

import java.awt.EventQueue;

import javax.swing.JFrame;

import org.antlr.runtime.RecognitionException;

//SimpleFileChooser.java
//A simple file chooser to see what it takes to make one of these work.
//
import java.awt.*;
import java.awt.event.*;
import java.io.*;
import java.nio.charset.Charset;

import javax.swing.*;

public class SimpleFileChooser extends JFrame{
	static  String file1="";
	static String file2="";
public SimpleFileChooser()  throws Exception  {
 super("Code Clone Detector");
 setBackground(SystemColor.activeCaption);
 setSize(841, 482);
 setDefaultCloseOperation(EXIT_ON_CLOSE);

 Container c = getContentPane();
 
 JButton openButton = new JButton("File 1");
 openButton.setFont(new Font("Tahoma", Font.BOLD, 13));
 openButton.setBounds(234, 51, 148, 23);
 JButton openButton2 = new JButton("File 2");
 openButton2.setFont(new Font("Tahoma", Font.BOLD, 13));
 openButton2.setBounds(527, 51, 148, 23);
 JButton executeButton = new JButton("Execute");
 executeButton.setFont(new Font("Tahoma", Font.BOLD, 12));
 executeButton.setBounds(409, 396, 83, 36);
 final JTextArea textArea = new JTextArea(null,5,20);
 final JTextArea textArea_1 = new JTextArea(null,5,20);
 JScrollPane scrollPane = new JScrollPane(textArea);
 scrollPane.setBounds(190, 122, 229, 263);
 JScrollPane scrollPane2 = new JScrollPane(textArea_1);
 scrollPane2.setBounds(485, 122, 229, 263);
 final JLabel statusbar = 
              new JLabel("Output of your selection will go here");
 statusbar.setFont(new Font("Tahoma", Font.BOLD, 12));
 statusbar.setBounds(219, 85, 174, 14);
 final JLabel statusbar2 = 
         new JLabel("Output of your selection will go here");
statusbar2.setFont(new Font("Tahoma", Font.BOLD, 12));
statusbar2.setBounds(511, 85, 174, 14);

 // Create a file chooser that opens up as an Open dialog
 openButton.addActionListener(new ActionListener() {
   public void actionPerformed(ActionEvent ae) {
     JFileChooser chooser = new JFileChooser();
     chooser.setMultiSelectionEnabled(true);
     int option = chooser.showOpenDialog(SimpleFileChooser.this);
     if (option == JFileChooser.APPROVE_OPTION) {
       File[] sf = chooser.getSelectedFiles();
       //System.out.print(sf);
       String filelist = "nothing";
       if (sf.length > 0) filelist = sf[0].getName();
       for (int i = 1; i < sf.length; i++) {
         filelist += ", " + sf[i].getName();
        
         
       }
       FileInputStream fis;
	try {
		fis = new FileInputStream(sf[0]);
		InputStreamReader in = 
	               new InputStreamReader(fis, Charset.forName("UTF-8")); 
	            char[] buffer = new char[1024];
	            int n = in.read(buffer);
	            file1 = new String(buffer, 0, n);
	            textArea.append(file1);
	            JOptionPane.showMessageDialog(null, file1);
	            in.close();
	} catch (FileNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
            
       statusbar.setText("You chose " + filelist);
     }
     else {
       statusbar.setText("You cancelled.");
     }
   }
 });

 openButton2.addActionListener(new ActionListener() {
	 	public void actionPerformed(ActionEvent e) {

	 	     JFileChooser chooser = new JFileChooser();
	 	     chooser.setMultiSelectionEnabled(true);
	 	     int option = chooser.showOpenDialog(SimpleFileChooser.this);
	 	     if (option == JFileChooser.APPROVE_OPTION) {
	 	       File[] sf = chooser.getSelectedFiles();
	 	       //System.out.print(sf);
	 	       String filelist = "nothing";
	 	       if (sf.length > 0) filelist = sf[0].getName();
	 	       for (int i = 1; i < sf.length; i++) {
	 	         filelist += ", " + sf[i].getName();
	 	       }
	 	       FileInputStream fis;
	 		try {
	 			fis = new FileInputStream(sf[0]);
	 			InputStreamReader in = 
	 		               new InputStreamReader(fis, Charset.forName("UTF-8")); 
	 		            char[] buffer = new char[1024];
	 		            int n = in.read(buffer);
	 		            file2 = new String(buffer, 0, n);
	 		           textArea_1.append(file2);
	 		            JOptionPane.showMessageDialog(null, file2);
	 		            in.close();
	 		} catch (FileNotFoundException e2) {
	 			// TODO Auto-generated catch block
	 			e2.printStackTrace();
	 		} catch (IOException e2) {
	 			// TODO Auto-generated catch block
	 			e2.printStackTrace();
	 		}
	 	            
	 	       statusbar2.setText("You chose " + filelist);
	 	     }
	 	     else {
	 	       statusbar2.setText("You cancelled.");
	 	     }
	 		
	 	}
	 });
 
 
 //Execute Button
 
 executeButton.addActionListener(new ActionListener() {
	 	public void actionPerformed(ActionEvent e) {
	 		
	 		try {
				String str=Test4.cloneDetector(file1, file2);
				JOptionPane.showMessageDialog(null, str);
			} catch (RecognitionException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
	 	}
	 });
 getContentPane().setLayout(null);

 c.add(openButton);
 c.add(statusbar);
 c.add(statusbar2);
 c.add(openButton2);
 c.add(executeButton);
 c.add(scrollPane);
 c.add(scrollPane2);

 
 JButton btnHistory = new JButton("History");
 btnHistory.setFont(new Font("Tahoma", Font.BOLD, 14));
 btnHistory.setBounds(10, 34, 87, 57);
 getContentPane().add(btnHistory);
 
 JButton btnNewButton = new JButton("Demo");
 btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 14));
 btnNewButton.setBounds(10, 124, 87, 57);
 getContentPane().add(btnNewButton);
 
 JButton btnHelp = new JButton("Help");
 btnHelp.setFont(new Font("Tahoma", Font.BOLD, 14));
 btnHelp.setBounds(10, 212, 87, 57);
 getContentPane().add(btnHelp);
 
 JLabel lblJdetector = new JLabel("JDetector");
 lblJdetector.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 18));
 lblJdetector.setBounds(411, 11, 119, 36);
 getContentPane().add(lblJdetector);


}

public static void main(String args[])throws Exception {
	
 SimpleFileChooser sfc = new SimpleFileChooser();
 sfc.setVisible(true);
}
}