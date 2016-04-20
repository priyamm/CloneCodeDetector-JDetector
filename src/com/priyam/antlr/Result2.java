package com.priyam.antlr;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextArea;
import javax.swing.JScrollPane;

public class Result2 extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Result2 frame = new Result2("");
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
	public Result2(String str) {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 841, 482);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
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
		 lblJdetector.setBounds(411, 11, 119, 36);
		 contentPane.add(lblJdetector);
		 
		 JTextArea textArea = new JTextArea();
		 textArea.setBounds(191, 122, 430, 278);
		 contentPane.add(textArea);
		 textArea.append(str.substring(0,130)+"\n"+str.substring(130,str.length()-1));
		 
		 JScrollPane scrollPane = new JScrollPane();
		 scrollPane.setBounds(191, 397, 430, -276);
		 contentPane.add(scrollPane);
		 
		 JLabel lblCloneHighlighted = new JLabel("Clone Highlighted");
		 lblCloneHighlighted.setFont(new Font("Tahoma", Font.BOLD, 11));
		 lblCloneHighlighted.setBounds(191, 105, 430, 14);
		 contentPane.add(lblCloneHighlighted);
		 History histobj=new History(str);
		 
	}

}
