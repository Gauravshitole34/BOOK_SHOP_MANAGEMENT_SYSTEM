package com.laibraryProject;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JPasswordField;
import java.awt.Color;

public class Login {

	private JFrame frame1;
	private JTextField t1;
	private JPasswordField t2;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Login window = new Login();
					window.frame1.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Login() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame1 = new JFrame();
		frame1.getContentPane().setBackground(new Color(255, 0, 0));
		frame1.setBounds(100, 100, 344, 315);
		frame1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame1.getContentPane().setLayout(null);
		
		JLabel lblNewLabel_1 = new JLabel("Username :");
		lblNewLabel_1.setForeground(new Color(255, 255, 0));
		lblNewLabel_1.setBackground(new Color(255, 0, 0));
		lblNewLabel_1.setBounds(27, 92, 93, 39);
		lblNewLabel_1.setFont(new Font("Cambria", Font.BOLD, 15));
		frame1.getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_1_1 = new JLabel("Password :");
		lblNewLabel_1_1.setForeground(new Color(255, 255, 0));
		lblNewLabel_1_1.setBounds(27, 159, 93, 39);
		lblNewLabel_1_1.setFont(new Font("Cambria", Font.BOLD, 15));
		frame1.getContentPane().add(lblNewLabel_1_1);
		
		t1 = new JTextField();
		t1.setBackground(Color.GREEN);
		t1.setBounds(130, 92, 176, 39);
		t1.setFont(new Font("Cambria", Font.BOLD, 14));
		frame1.getContentPane().add(t1);
		t1.setColumns(10);
		
		JButton btnNewButton = new JButton("Login");
		btnNewButton.setForeground(new Color(51, 51, 255));
		btnNewButton.setBackground(Color.CYAN);
		btnNewButton.setBounds(75, 220, 121, 48);
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String s1,s2;
				s1=t1.getText();
				s2=t2.getText();
				if(s1.equals("gaurav") &&s2.equals("123"))
				{
				JOptionPane.showMessageDialog(null,"Congratulations Login Successful.....");   
				Book_Store b1=new Book_Store();
				
				b1.frame.setVisible(true);
				}
				else
				{
				JOptionPane.showMessageDialog(null,"Sorry....Try again....");
				}

			}
		});
		btnNewButton.setFont(new Font("Cambria", Font.BOLD, 18));
		frame1.getContentPane().add(btnNewButton);
		
		t2 = new JPasswordField();
		t2.setBackground(Color.GREEN);
		t2.setBounds(130, 159, 176, 39);
		frame1.getContentPane().add(t2);
		
		JLabel lblNewLabel = new JLabel("LOGIN PAGE");
		lblNewLabel.setForeground(new Color(0, 0, 0));
		lblNewLabel.setBounds(75, 25, 210, 39);
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Cambria", Font.BOLD, 30));
		frame1.getContentPane().add(lblNewLabel);
	}
}
