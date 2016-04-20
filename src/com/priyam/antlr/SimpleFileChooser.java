package com.priyam.antlr;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.text.BadLocationException;

import org.antlr.runtime.RecognitionException;

//SimpleFileChooser.java
//A simple file chooser to see what it takes to make one of these work.
//
import java.awt.*;
import java.awt.event.*;
import java.io.*;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

import javax.swing.*;

public class SimpleFileChooser extends JFrame{
	static  String file1="";
	static String file2="";
	static String msg="";
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
 executeButton.setBounds(459, 396, 83, 36);
 final JTextArea textArea = new JTextArea(null,5,20);
 textArea.setFont(new Font("Tahoma", Font.BOLD, 11));
 final JTextArea textArea_1 = new JTextArea(null,5,20);
 textArea_1.setFont(new Font("Tahoma", Font.BOLD, 11));
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

final JRadioButton rdbtnTypeI = new JRadioButton("Type I");
rdbtnTypeI.setFont(new Font("Tahoma", Font.BOLD, 11));
rdbtnTypeI.setBounds(291, 404, 71, 23);
getContentPane().add(rdbtnTypeI);

final JRadioButton rdbtnTypeIi = new JRadioButton("Type II");
rdbtnTypeIi.setFont(new Font("Tahoma", Font.BOLD, 11));
rdbtnTypeIi.setBounds(364, 404, 83, 23);
//rdbtnTypeI.setSelected(true);
getContentPane().add(rdbtnTypeIi);
ButtonGroup group=new ButtonGroup();
group.add(rdbtnTypeI);
group.add(rdbtnTypeIi);


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
	           // JOptionPane.showMessageDialog(null, file1);
	            in.close();
	           
	            //System.out.println(file1);
	            
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
	 		           // JOptionPane.showMessageDialog(null, file2);
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
	 		if(rdbtnTypeIi.isSelected()){
 				
 			
	 		try {
	 			
	 			
	 			
				String str=Test4.cloneDetector(file1, file2);
				//JOptionPane.showMessageDialog(null, str);
				Result resobj= new Result(str,Test4.calculateAST(file1),Test4.calculateAST(file2));
				resobj.setVisible(true);
				dispose();
				
			} catch (RecognitionException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			} catch (BadLocationException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
	 	}
	 		else if(rdbtnTypeI.isSelected()){
	 			
	 		    String strr[];
		            strr=file1.split("\n");
		           String strr2[];
		            strr2=file2.split("\n");
		            //System.out.println(file1.replaceAll("[{,},\\s]", ""));
		           HashMap<String, ArrayList<Integer>> hashmap = new HashMap<String, ArrayList<Integer>>();
		          ArrayList<Integer> list = new ArrayList();
		         ArrayList<Integer> list2 = new ArrayList();
		       
		           HashClass h=new HashClass();
		           HashMap<Integer,Integer> hm=new HashMap<Integer,Integer>();
		           HashMap<Integer,Integer> hm2=new HashMap<Integer,Integer>();
		          hashmap= h.LCS(h.mapping(file1), h.mapping(file2));
		          list=hashmap.get("file1");
		         list2=hashmap.get("file2");
		         Iterator<Integer> keySetIterator = list.iterator();
		        Iterator<Integer> keySetIterator2 = list2.iterator();
		        int i=0,k=0;
				while(keySetIterator.hasNext()&&keySetIterator2.hasNext()){ 
					Integer key = keySetIterator.next(); 
					Integer key2 = keySetIterator2.next(); 
					String x=strr[key].replaceAll("[{,},\\s]", ""),y=strr2[key2].replaceAll("[{,},\\s]", "");
					System.out.println(x+y);
					
					
					for(k=0;k<x.length()-1;k++){
						//System.out.println(x.substring(k,k+1)+y.substring(k,k+1));
						if(!x.substring(k,k+1).equals(y.substring(k,k+1))){
							System.out.println("--"+strr[key]+strr2[key2]);
						
							hm.put(key, key);
							hm2.put(key2, key2);
							
							break;
						}
						
					}
					
					
					}
			keySetIterator = list.iterator();
				while(keySetIterator.hasNext()){ 
					Integer key = keySetIterator.next(); 
					System.out.print(strr[key]);
					
				}
					
				TypeOneUI type=new TypeOneUI(list,list2,hm,hm2,strr,strr2);
				type.setVisible(true);
				dispose();
	 			
	 			
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
 btnHistory.addActionListener(new ActionListener() {
 	public void actionPerformed(ActionEvent e) {
 		History histobj=new History(msg);
 		histobj.setVisible(true);
 		dispose();
 	}
 });
 btnHistory.setFont(new Font("Tahoma", Font.BOLD, 14));
 btnHistory.setBounds(27, 122, 87, 57);
 getContentPane().add(btnHistory);
 
 JButton btnNewButton = new JButton("Credits");
 btnNewButton.addActionListener(new ActionListener() {
 	public void actionPerformed(ActionEvent e) {
 		JOptionPane.showMessageDialog(null, "Supervisor: Ms. Sonam Gupta\n1. Priyam Gupta\n2. Shashank Prabhakar\n3. Priyanshi Khare\n 4. Nikita Singhal");
 	}
 });
 btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 14));
 btnNewButton.setBounds(27, 308, 87, 57);
 getContentPane().add(btnNewButton);
 
 JButton btnHelp = new JButton("Help");
 btnHelp.addActionListener(new ActionListener() {
 	public void actionPerformed(ActionEvent arg0) {
 		Help helpobj=new Help();
 		helpobj.setVisible(true);
 		dispose();
 		
 	}
 });
 btnHelp.setFont(new Font("Tahoma", Font.BOLD, 14));
 btnHelp.setBounds(27, 213, 87, 57);
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