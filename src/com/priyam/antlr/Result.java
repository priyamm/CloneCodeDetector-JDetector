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
import javax.swing.text.BadLocationException;
import javax.swing.text.DefaultHighlighter;
import javax.swing.text.Highlighter;
import javax.swing.JTextArea;
import javax.swing.JScrollPane;
import javax.swing.JScrollBar;

public class Result extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Result frame = new Result("","","");
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 * @throws BadLocationException 
	 */
	public Result(final String str1,String str2,final String str3) throws BadLocationException {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 841, 482);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		JLabel lblJdetector = new JLabel("JDetector");
		 lblJdetector.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 18));
		 lblJdetector.setBounds(411, 11, 119, 36);
		 contentPane.add(lblJdetector);
		 JButton btnNewButton = new JButton("Back");
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
		// contentPane.setLayout(null);
		 
		 
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
		
		 
		 JTextArea textArea = new JTextArea();
		 textArea.setFont(new Font("Tahoma", Font.BOLD, 11));
		 textArea.setBounds(37, 129, 741, 74);
		 contentPane.add(textArea);
		 textArea.append("("+str2.substring(0,130)+"\n"+str2.substring(130,str2.length()-1)+")");
		 
		 Highlighter h = textArea.getHighlighter();
		 h.removeAllHighlights();
		 int pos = 20;
		 h.addHighlight(pos ,23,
		                DefaultHighlighter.DefaultPainter);
		 
		 JScrollPane scrollPane = new JScrollPane();
		 scrollPane.setBounds(37, 130, 741, 74);
		 contentPane.add(scrollPane);
		 
		 JTextArea textArea_1 = new JTextArea();
		 textArea_1.setFont(new Font("Tahoma", Font.BOLD, 11));
		 textArea_1.setBounds(37, 256, 741, 74);
		 contentPane.add(textArea_1);
		 textArea_1.append("("+str3.substring(0,130)+"\n"+str3.substring(130,str3.length()-1)+")");
		 
		 JScrollPane scrollPane_1 = new JScrollPane();
		 scrollPane_1.setBounds(37, 256, 741, 74);
		 contentPane.add(scrollPane_1);
		 
		 JButton btnNext = new JButton("Next");
		 btnNext.addActionListener(new ActionListener() {
		 	public void actionPerformed(ActionEvent e) {
		 		Result2 resob=new Result2(str1);
		 		resob.setVisible(true);
				dispose();
		 	}
		 });
		 btnNext.setFont(new Font("Tahoma", Font.BOLD, 13));
		 btnNext.setBounds(356, 357, 89, 46);
		 contentPane.add(btnNext);
		 
		 JLabel lblAbstractSyntaxTree = new JLabel("Abstract Syntax Tree for File 1");
		 lblAbstractSyntaxTree.setFont(new Font("Tahoma", Font.BOLD, 11));
		 lblAbstractSyntaxTree.setBounds(37, 106, 741, 19);
		 contentPane.add(lblAbstractSyntaxTree);
		 
		 JLabel lblAbstractSyntaxTree_1 = new JLabel("Abstract Syntax Tree for File 2");
		 lblAbstractSyntaxTree_1.setFont(new Font("Tahoma", Font.BOLD, 11));
		 lblAbstractSyntaxTree_1.setBounds(37, 231, 714, 14);
		 contentPane.add(lblAbstractSyntaxTree_1);
		 
		 SimpleFileChooser.msg=str3;
	}
}
