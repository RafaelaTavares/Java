package br.edu.univas.tp4.model.Frame;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Image;
import java.awt.Toolkit;
import java.net.URL;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class CadastrarUsuario  extends JFrame{

	private static final long serialVersionUID = 1987604675648829199L;
	
	private JPanel contentPane = null;
	
	public CadastrarUsuario(){
		
		this.setSize(500, 250);
		this.setTitle("Cadastro de Usuário");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLocationRelativeTo(null);
		addComponents();
	}
	
	private void addComponents(){
		
		contentPane = new JPanel();
		contentPane.setLayout(new BorderLayout());
		this.setContentPane(contentPane);
		
		JPanel centerPanel = new JPanel();
		centerPanel.setBackground(Color.lightGray);
		centerPanel.setPreferredSize(new Dimension(25, 0));
		contentPane.add(centerPanel, BorderLayout.CENTER); 
		
		
		
		JLabel nomeUsuario = new JLabel();
		nomeUsuario.setText("Nome do Usuário:  ");
		centerPanel.add(nomeUsuario);
		
		JTextField textUsuario = new JTextField();
		textUsuario.setColumns(41);
		centerPanel.add(textUsuario);
		
		JLabel loginUsuario = new JLabel();
		loginUsuario.setText("Login:  ");
		centerPanel.add(loginUsuario);
		
		JLabel senhaUsuario = new JLabel();
		senhaUsuario.setText("                                                       Senha:  ");
		centerPanel.add(senhaUsuario);
		
		JTextField textLogin = new JTextField();
		textLogin.setColumns(20);
		centerPanel.add(textLogin);
		
		JPasswordField textSenha = new JPasswordField();
		textSenha.setColumns(20);
		centerPanel.add(textSenha);
		
		JLabel acessoUsuario = new JLabel();
		acessoUsuario.setText("                                  Perfil de Acesso:                           ");
		centerPanel.add(acessoUsuario);
		
		JComboBox<String> courseComboBox = new JComboBox<>();
		courseComboBox.addItem("Administrador");
		courseComboBox.addItem("Gerência");
		courseComboBox.addItem("Usuário");
		
		courseComboBox.setPreferredSize(new Dimension(400, 30));		
		centerPanel.add(courseComboBox);
		
		
		JButton cadButton = new JButton();
		cadButton.setText("Cadastrar");
		cadButton.setPreferredSize(new Dimension(100, 50));
		centerPanel.add(cadButton);
		
		JButton cancelarButton = new JButton();
		cancelarButton.setText("Cancelar");
		cancelarButton.setPreferredSize(new Dimension(100, 50));
		centerPanel.add(cancelarButton);
	}
	
	public static void main(String[] args){
		CadastrarUsuario tela = new CadastrarUsuario();
		tela.setVisible(true);
	}
}
