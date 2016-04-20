package com.priyam.antlr;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.text.BadLocationException;
import javax.swing.text.DefaultHighlighter;
import javax.swing.text.Highlighter;
import javax.swing.JTextArea;
import javax.swing.JScrollPane;

public class TypeOneUI extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TypeOneUI frame = new TypeOneUI(null, null, null, null, null, null);
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public TypeOneUI(ArrayList<Integer> L1,ArrayList<Integer> L2,HashMap<Integer,Integer> hm,HashMap<Integer,Integer> hm2,String x[],String y[]) {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 841, 482);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JTextArea textArea = new JTextArea();
		textArea.setBounds(144, 80, 296, 340);
		contentPane.add(textArea);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(144, 80, 296, 340);
		contentPane.add(scrollPane);
		
		 Highlighter h = textArea.getHighlighter();
		 h.removeAllHighlights();
		
		Iterator<Integer> keySetIterator = L1.iterator();
		/*
		keySetIterator = L1.iterator();
		while(keySetIterator.hasNext()){ 
			Integer keyy = keySetIterator.next(); 
			System.out.print(x[keyy]);
		}
			keySetIterator = L2.iterator();
			while(keySetIterator.hasNext()){ 
				Integer ke = keySetIterator.next(); 
				System.out.print(y[ke]);
			}
		*/
		System.out.println("----------File 1---------------");
		int i=0,len=0;
		while(keySetIterator.hasNext()){
			Integer key = keySetIterator.next();
			if(i==key){
				
				 textArea.append(x[i]+"\n");
				 if(!hm.containsKey(key)){
					 try {System.out.print(x[i]+"\n");
							h.addHighlight(len ,len+x[i].length(),DefaultHighlighter.DefaultPainter);
							
						} catch (BadLocationException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
					 
				 }
				 
				 len+=x[i].length()+1;
					i++;
				 
			}
			else{
				while(i<key){
					textArea.append(x[i]+"\n");
					//System.out.println(x[i]);
					len+=x[i].length()+1;
					i++;
				}
				
				textArea.append(x[i]+"\n");
				if(!hm.containsKey(key)){
					 try {System.out.println(x[i]);
							h.addHighlight(len ,len+x[i].length(),DefaultHighlighter.DefaultPainter);
							
						} catch (BadLocationException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
					 
				 }
				 
				 len+=x[i].length()+1;
					i++;
				
				
				
			}
			
		}
		while(i<x.length){
			textArea.append(x[i]+"\n");
			
			i++;
		}
		JTextArea textArea_1 = new JTextArea();
		textArea_1.setBounds(460, 80, 296, 340);
		contentPane.add(textArea_1);
		
		JScrollPane scrollPane_1 = new JScrollPane();
		scrollPane_1.setBounds(460, 419, 296, -337);
		contentPane.add(scrollPane_1);
		
		 Highlighter h2 = textArea_1.getHighlighter();
		 h2.removeAllHighlights();
		System.out.println("----------File 2-----------------");
		h2 = textArea_1.getHighlighter();
		 h2.removeAllHighlights();
		Iterator<Integer> keySetIterator2 = L2.iterator();
		int j=0,len2=0;
		while(keySetIterator2.hasNext()){
			Integer key2 = keySetIterator2.next();
			if(j==key2){
				
				 textArea_1.append(y[j]+"\n");
				 if(!hm2.containsKey(key2)){
					 try {System.out.println(y[j]);
							h2.addHighlight(len2 ,len2+y[j].length(),DefaultHighlighter.DefaultPainter);
							
						} catch (BadLocationException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
					 
				 }
				 
				 len2+=y[j].length()+1;
					j++;
				 
			}
			else{
				while(j<key2){
					textArea_1.append(y[j]+"\n");
					len2+=y[j].length()+1;
					j++;
				}
				
				textArea_1.append(y[j]+"\n");
				if(!hm2.containsKey(key2)){
					 try {System.out.println(y[j]);
							h2.addHighlight(len2 ,len2+y[j].length(),DefaultHighlighter.DefaultPainter);
							
						} catch (BadLocationException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
					 
				 }
				 
				 len2+=y[j].length()+1;
					j++;
				
				
				
			}
			
		}
		while(j<y.length){
			textArea_1.append(y[j]+"\n");
			j++;
		}
		
		
		JButton btnNewButton = new JButton("Back");
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 13));
		 btnNewButton.setBounds(21, 21, 89, 46);
		 contentPane.add(btnNewButton);
		 btnNewButton.addActionListener(new ActionListener() {
			 	public void actionPerformed(ActionEvent e) {
			 		SimpleFileChooser simpleobj;
					try {
						simpleobj = new SimpleFileChooser();
						simpleobj.setVisible(true);
					} catch (Exception e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
			 		
			 		dispose();

			 	 }
			 });
		 
		 
		JLabel lblJdetector = new JLabel("JDetector");
		 lblJdetector.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 18));
		 lblJdetector.setBounds(409, 11, 119, 36);
		 contentPane.add(lblJdetector);
		 
		 JLabel lblHighlightedCloneIn = new JLabel("Highlighted Clone in File 1");
		 lblHighlightedCloneIn.setFont(new Font("Tahoma", Font.BOLD, 12));
		 lblHighlightedCloneIn.setBounds(162, 58, 278, 14);
		 contentPane.add(lblHighlightedCloneIn);
		 
		 JLabel lblHighlightedCloneCode = new JLabel("Highlighted Clone Code in File 2");
		 lblHighlightedCloneCode.setFont(new Font("Tahoma", Font.BOLD, 12));
		 lblHighlightedCloneCode.setBounds(473, 58, 285, 14);
		 contentPane.add(lblHighlightedCloneCode);
	}
}
