package com.ambition.behavioral.observe.login;

import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class LoginValidatorA extends JFrame implements LoginEventListener{

	private JPanel p;
	private LoginBean lb;
	private JLabel lblLogo;
	
	public LoginValidatorA() {
		super("Bank of China");
		p = new JPanel();
		this.getContentPane().add(p);
		lb = new LoginBean();
		lb.addLoginEventListener(this);
		
		Font font = new Font("Times New Roman", Font.BOLD, 30);
		lblLogo = new JLabel("Bank of China Logol");
		lblLogo.setFont(font);
		lblLogo.setForeground(Color.red);
		
		p.setLayout(new GridLayout(2,1));
		p.add(lblLogo);
		p.add(lb);
		p.setBackground(Color.pink);
		this.setSize(600,200);
		this.setVisible(true);
	}
	
	@Override
	public void validateLogin(LoginEvent event) {
		String name = event.getName();
		String password = event.getPassword();
		
		if (0==name.trim().length()||0==password.length()) {
			JOptionPane.showMessageDialog(this, new String("UserName or Password is empty"),"alert",JOptionPane.ERROR_MESSAGE);
		}else {
			JOptionPane.showMessageDialog(this, new String("Valid Login Info"),"alert",JOptionPane.INFORMATION_MESSAGE);
		}
		
		
	}
	
	public static void main(String[] args) {
		new LoginValidatorA().setVisible(true);
	}

}
