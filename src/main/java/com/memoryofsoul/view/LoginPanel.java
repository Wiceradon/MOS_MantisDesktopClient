package com.memoryofsoul.view;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Map;
import java.util.ResourceBundle;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

import com.jgoodies.forms.factories.FormFactory;
import com.jgoodies.forms.layout.ColumnSpec;
import com.jgoodies.forms.layout.FormLayout;
import com.jgoodies.forms.layout.RowSpec;
import javax.swing.JTextArea;
import javax.swing.UIManager;

/**
 * Panel representing login view
 * 
 * @date 09-08-2013 18:53:18
 *
 * @author Jakub Jeleński
 * @email jjelenski90@gmail.com
 * 
 */
public class LoginPanel extends JPanel {
	/**
	 * 
	 */
	private static final long serialVersionUID = 6713961703743409304L;
	private JTextField userField;
	private JPasswordField passwordField;
	private final JTextArea waitLabel;
	private JButton loginButton;
	private JLabel passwordLabel;
	private JLabel userLabel;
	private final JFrame parent;
	
	/**
	 * Create the panel.
	 */
	public LoginPanel(JFrame parent) {
		setBackground(Color.WHITE);
		setLayout(new FormLayout(new ColumnSpec[] {
				FormFactory.RELATED_GAP_COLSPEC,
				FormFactory.DEFAULT_COLSPEC,
				FormFactory.RELATED_GAP_COLSPEC,
				FormFactory.DEFAULT_COLSPEC,
				ColumnSpec.decode("max(60dlu;default)"),
				FormFactory.DEFAULT_COLSPEC,
				ColumnSpec.decode("max(60dlu;default):grow"),
				ColumnSpec.decode("max(56dlu;default):grow"),
				ColumnSpec.decode("max(0dlu;default)"),},
			new RowSpec[] {
				FormFactory.RELATED_GAP_ROWSPEC,
				FormFactory.DEFAULT_ROWSPEC,
				FormFactory.RELATED_GAP_ROWSPEC,
				FormFactory.DEFAULT_ROWSPEC,
				FormFactory.RELATED_GAP_ROWSPEC,
				FormFactory.DEFAULT_ROWSPEC,
				FormFactory.RELATED_GAP_ROWSPEC,
				FormFactory.DEFAULT_ROWSPEC,
				FormFactory.RELATED_GAP_ROWSPEC,
				FormFactory.DEFAULT_ROWSPEC,
				FormFactory.RELATED_GAP_ROWSPEC,
				FormFactory.DEFAULT_ROWSPEC,
				FormFactory.RELATED_GAP_ROWSPEC,
				FormFactory.DEFAULT_ROWSPEC,}));
		
		this.parent = parent;
		
		userLabel = new JLabel(ResourceBundle.getBundle("com.memoryofsoul.bundle.loginPanel").getString("panel.user.name"));
		add(userLabel, "5, 8, center, default");
		
		userField = new JTextField();
		add(userField, "7, 8, fill, default");
		userField.setColumns(10);
		
		passwordLabel = new JLabel(ResourceBundle.getBundle("com.memoryofsoul.bundle.loginPanel").getString("panel.user.password"));
		add(passwordLabel, "5, 10, center, default");
		
		loginButton = new JButton(ResourceBundle.getBundle("com.memoryofsoul.bundle.loginPanel").getString("panel.login"));
		
		
		passwordField = new JPasswordField();
		passwordField.setText("");
		add(passwordField, "7, 10, fill, default");
		add(loginButton, "7, 12");
		
		waitLabel = new JTextArea(ResourceBundle.getBundle("com.memoryofsoul.bundle.loginPanel").getString("panel.info.wait")); //$NON-NLS-1$ //$NON-NLS-2$
		waitLabel.setBackground(Color.WHITE);
		waitLabel.setEditable(false);
		add(waitLabel, "5, 14, 3, 1, center, default");
		
		loginButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				waitLabel.setForeground(Color.RED);
				waitLabel.setText(ResourceBundle.getBundle("com.memoryofsoul.bundle.loginPanel").getString("panel.info.error"));
			}
		});
	}

}
