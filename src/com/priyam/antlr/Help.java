package com.priyam.antlr;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Help extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Help frame = new Help();
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
	public Help() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 841, 482);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		JLabel lblJdetector = new JLabel("JDetector");
		 lblJdetector.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 18));
		 lblJdetector.setBounds(411, 11, 119, 36);
		 getContentPane().add(lblJdetector);
		 
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
		 btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 13));
		 btnNewButton.setBounds(21, 21, 89, 46);
		 contentPane.add(btnNewButton);
		 
		 JLabel lblPressTheFile = new JLabel("1. Press the File Input button to input the files.");
		 lblPressTheFile.setFont(new Font("Tahoma", Font.BOLD, 12));
		 lblPressTheFile.setBounds(153, 115, 603, 36);
		 contentPane.add(lblPressTheFile);
		 
		 JLabel lblToFindOu = new JLabel("4. To find out the clones , Press Execute button present in the lower section.");
		 lblToFindOu.setFont(new Font("Tahoma", Font.BOLD, 12));
		 lblToFindOu.setBounds(153, 256, 603, 36);
		 contentPane.add(lblToFindOu);
		 
		 JLabel lblNowA = new JLabel("2. Now, a small Pop-up window will come up to select the files for which clones to be searched.");
		 lblNowA.setFont(new Font("Tahoma", Font.BOLD, 12));
		 lblNowA.setBounds(153, 162, 603, 36);
		 contentPane.add(lblNowA);
		 
		 JLabel lblSelectA = new JLabel("3. Select a .java extension file to proceed the steps.");
		 lblSelectA.setFont(new Font("Tahoma", Font.BOLD, 12));
		 lblSelectA.setBounds(153, 209, 603, 36);
		 contentPane.add(lblSelectA);
	}
}
