package br.edu.univas.tp4.model.Frame;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class Login extends JFrame {

	private static final long serialVersionUID = -1119763791714278423L;
	
	private JPanel contentPane = null;
	
	public Login(){
		
		this.setSize(270,120);
		this.setTitle("Login");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLocationRelativeTo(null);
		addComponents();
	}
	
	private void addComponents(){
		
		contentPane = new JPanel();
		contentPane.setLayout(new BorderLayout());
		this.setContentPane(contentPane);
		
		JPanel centerPanel = new JPanel();
		centerPanel.setPreferredSize(new Dimension(25, 0));
		contentPane.add(centerPanel, BorderLayout.CENTER);
				
		JLabel usuario = new JLabel();
		usuario.setText("Usuário:");
		centerPanel.add(usuario);
		
		JTextField textUsuario = new JTextField();
		textUsuario.setColumns(15);
		centerPanel.add(textUsuario);		
		
		JLabel senha = new JLabel();
		senha.setText("   Senha:");
		centerPanel.add(senha);
		
		JPasswordField textSenha = new JPasswordField();
		textSenha.setColumns(15);
		centerPanel.add(textSenha);
		
		JButton okButton = new JButton();
		okButton.setText("Login");
		okButton.setPreferredSize(new Dimension(80, 20));
		okButton.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent arg0) {
				okButton();				
			}
		});
		centerPanel.add(okButton);
		
		JButton cancelButton = new JButton();
		cancelButton.setText("Cancelar");
		cancelButton.setPreferredSize(new Dimension(90, 20));
		cancelButton.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				cancelButton();
				
			}
		});
		centerPanel.add(cancelButton);		
	}
	
	private void okButton() {
		JOptionPane.showMessageDialog(this, "Logado com sucesso!");	
		System.exit(0);
	}
	
	private void cancelButton(){
		System.exit(0);
	}
	
	public static void main(String[] args) {		
		Login tela = new Login();
		tela.setVisible(true);
	}
}
