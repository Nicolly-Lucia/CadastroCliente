package com.mycompany.maincadastro;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MainCadastro {
    public static void main(String[] args) {
        new TelaEntrada();
    }
}

class TelaEntrada extends JFrame {
    
    private JLabel lblTitulo, lblUsuario, lblSenha;
    private JTextField txtUsuario;
    private JPasswordField txtSenha;
    private JButton btnEntrar, btnSair;
    
    public TelaEntrada() {
        setTitle("Sistema de Cadastro - Login");
        setSize(400, 300);
        setLayout(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setResizable(false);
        
        // componentes
        lblTitulo = new JLabel("Bem-vindo ao Sistema");
        lblTitulo.setFont(new Font("Arial", Font.BOLD, 18));
        lblTitulo.setForeground(new Color(0, 102, 204));
        
        lblUsuario = new JLabel("Usuário:");
        lblSenha = new JLabel("Senha:");
        
        txtUsuario = new JTextField();
        txtSenha = new JPasswordField();
        
        btnEntrar = new JButton("Entrar");
        btnSair = new JButton("Sair");
        
        // setbounds
        lblTitulo.setBounds(100, 30, 200, 30);
        
        lblUsuario.setBounds(80, 90, 80, 25);
        txtUsuario.setBounds(150, 90, 150, 25);
        
        lblSenha.setBounds(80, 130, 80, 25);
        txtSenha.setBounds(150, 130, 150, 25);
        
        btnEntrar.setBounds(80, 190, 100, 35);
        btnSair.setBounds(200, 190, 100, 35);
        
        // cores
        getContentPane().setBackground(new Color(240, 248, 255));
        btnEntrar.setBackground(new Color(0, 153, 76));
        btnEntrar.setForeground(Color.WHITE);
        btnSair.setBackground(new Color(204, 0, 0));
        btnSair.setForeground(Color.WHITE);
        
        add(lblTitulo);
        add(lblUsuario);
        add(txtUsuario);
        add(lblSenha);
        add(txtSenha);
        add(btnEntrar);
        add(btnSair);
        
        // ações dos botões
        btnEntrar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                fazerLogin();
            }
        });
        
        btnSair.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });
        
        // login
        txtSenha.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                fazerLogin();
            }
        });
        
        setVisible(true);
    }
    
    private void fazerLogin() {
        String usuario = txtUsuario.getText();
        String senha = new String(txtSenha.getPassword());
        
        // login padrão
        if (usuario.equals("admin") && senha.equals("123")) {
            JOptionPane.showMessageDialog(this, 
                "Login realizado com sucesso!\nBem-vindo " + usuario, 
                "Sucesso", 
                JOptionPane.INFORMATION_MESSAGE);
            
            // Fecha a tela de login e abre o cadastro
            dispose();
            new Design();
        } else {
            JOptionPane.showMessageDialog(this, 
                "Usuário ou senha incorretos.\n\nTente:\nUsuário: admin\nSenha: 123", 
                "Erro de Login", 
                JOptionPane.ERROR_MESSAGE);
            txtUsuario.setText("");
            txtSenha.setText("");
            txtUsuario.requestFocus();
        }
    }
}