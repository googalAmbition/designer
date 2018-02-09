package com.ambition.behavioral.observe.login;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class LoginBean extends JPanel implements ActionListener{

	JLabel labName,labPassword;
	JTextField txtName;
	JPasswordField txtPassword;
	JButton btnLogin,btnClear;
	
	LoginEventListener lel;
	LoginEvent le;
	
	public LoginBean(){
		this.setLayout(new GridLayout(3,2));
		labName = new JLabel("name");
		add(labName);
		
		txtName = new JTextField(20);
		add(txtName);
		
		labPassword = new JLabel("password");
		add(labPassword);
		
		txtPassword = new JPasswordField(20);
		add(txtPassword);
		
		btnLogin = new JButton("login");
		add(btnLogin);
		
		btnClear = new JButton("clear");
		add(btnClear);
		
		btnClear.addActionListener(this);
		btnLogin.addActionListener(this);
		
	}
	
	public void addLoginEventListener(LoginEventListener lel) {
		this.lel = lel;
	}
	private void fireLoginEvent(Object object, String name, String password) {
		le = new LoginEvent(btnLogin, name, password);
		lel.validateLogin(le);
		
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		if (btnLogin == e.getSource()) {
			String name = this.txtName.getText();
			String password = this.txtPassword.getText();
			
			fireLoginEvent(btnLogin, name, password);
		}
		if (btnClear == e.getSource()) {
			this.txtName.setText("");
			this.txtPassword.setText("");
		}
	}

}
