package com.mycompany.maincadastro;

import javax.swing.*;
import java.awt.*;
import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;

public class Design extends JFrame {

    // label
    JLabel lblCodigo, lblNome, lblEndereco, lblBairro, lblCidade;
    JLabel lblEstado, lblCep, lblSexo, lblCelular, lblTelefone;
    JLabel lblAniversario, lblCadastro;

    // textfields
    JTextField txtCodigo, txtNome, txtEndereco, txtBairro, txtCidade;
    JTextField txtCep, txtCelular, txtTelefone, txtAniversario, txtCadastro;

    // combobox
    JComboBox<String> cbEstado;

    // radiobutton
    JRadioButton rbMasc, rbFem;

    // botões
    JButton btnCadastrar, btnLimpar, btnFechar;

    public Design() {
        setTitle("Cadastro de Cliente");
        setSize(700, 750);
        setLayout(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setResizable(false);

        inicializarComponentes();
        configurarLayout();
        adicionarComponentes();
        adicionarPlaceholders();

        new Funcionalidades(this);

        setVisible(true);
    }

    private void inicializarComponentes() {
        lblCodigo = new JLabel("Código do Cliente:");
        lblNome = new JLabel("Nome Completo:");
        lblEndereco = new JLabel("Endereço:");
        lblBairro = new JLabel("Bairro:");
        lblCidade = new JLabel("Cidade:");
        lblEstado = new JLabel("Estado:");
        lblCep = new JLabel("CEP:");
        lblSexo = new JLabel("Sexo:");
        lblCelular = new JLabel("Celular:");
        lblTelefone = new JLabel("Telefone:");
        lblAniversario = new JLabel("Data do Aniversário:");
        lblCadastro = new JLabel("Data do Cadastro:");

        txtCodigo = new JTextField();
        txtNome = new JTextField();
        txtEndereco = new JTextField();
        txtBairro = new JTextField();
        txtCidade = new JTextField();
        txtCep = new JTextField();
        txtCelular = new JTextField();
        txtTelefone = new JTextField();
        txtAniversario = new JTextField();
        txtCadastro = new JTextField();

        // Estados
        String estados[] = {
            "São Paulo", 
            "Rio de Janeiro", 
            "Minas Gerais", 
            "Espírito Santo", 
            "Paraná", 
            "Santa Catarina", 
            "Rio Grande do Sul", 
            "Bahia", 
            "Pernambuco", 
            "Ceará", 
            "Distrito Federal",
            "Amazonas",
            "Pará",
            "Goiás",
            "Maranhão",
            "Mato Grosso",
            "Mato Grosso do Sul",
            "Paraíba",
            "Piauí",
            "Rio Grande do Norte",
            "Rondônia",
            "Roraima",
            "Sergipe",
            "Tocantins",
            "Acre",
            "Amapá"
        };
        cbEstado = new JComboBox<>(estados);

        rbMasc = new JRadioButton("Masculino");
        rbFem = new JRadioButton("Feminino");

        ButtonGroup grupo = new ButtonGroup();
        grupo.add(rbMasc);
        grupo.add(rbFem);
        
        rbMasc.setSelected(true);

        btnCadastrar = new JButton("Cadastrar");
        btnLimpar = new JButton("Limpar");
        btnFechar = new JButton("Fechar");
        
        // cores dos botões
        btnCadastrar.setBackground(new Color(0, 153, 76));
        btnCadastrar.setForeground(Color.WHITE);
        btnLimpar.setBackground(new Color(255, 153, 0));
        btnLimpar.setForeground(Color.WHITE);
        btnFechar.setBackground(new Color(204, 0, 0));
        btnFechar.setForeground(Color.WHITE);
    }

    private void configurarLayout() {
        // posicionamento
        lblCodigo.setBounds(50, 50, 150, 25);
        txtCodigo.setBounds(270, 50, 250, 25);
        
        lblNome.setBounds(50, 100, 150, 25);
        txtNome.setBounds(270, 100, 250, 25);
        
        lblEndereco.setBounds(50, 150, 150, 25);
        txtEndereco.setBounds(270, 150, 250, 25);
        
        lblBairro.setBounds(50, 200, 150, 25);
        txtBairro.setBounds(270, 200, 250, 25);
        
        lblCidade.setBounds(50, 250, 150, 25);
        txtCidade.setBounds(270, 250, 250, 25);
        
        lblEstado.setBounds(50, 300, 150, 25);
        cbEstado.setBounds(270, 300, 250, 25);
        
        lblCep.setBounds(50, 350, 150, 25);
        txtCep.setBounds(270, 350, 250, 25);
        
        lblSexo.setBounds(50, 400, 150, 25);
        rbMasc.setBounds(270, 400, 100, 25);
        rbFem.setBounds(380, 400, 100, 25);
        
        lblCelular.setBounds(50, 450, 150, 25);
        txtCelular.setBounds(270, 450, 250, 25);
        
        lblTelefone.setBounds(50, 500, 150, 25);
        txtTelefone.setBounds(270, 500, 250, 25);
        
        lblAniversario.setBounds(50, 550, 150, 25);
        txtAniversario.setBounds(270, 550, 250, 25);
        
        lblCadastro.setBounds(50, 600, 150, 25);
        txtCadastro.setBounds(270, 600, 250, 25);
        
        btnCadastrar.setBounds(70, 660, 140, 35);
        btnLimpar.setBounds(250, 660, 140, 35);
        btnFechar.setBounds(430, 660, 140, 35);
    }

    private void adicionarComponentes() {
        add(lblCodigo); add(txtCodigo);
        add(lblNome); add(txtNome);
        add(lblEndereco); add(txtEndereco);
        add(lblBairro); add(txtBairro);
        add(lblCidade); add(txtCidade);
        add(lblEstado); add(cbEstado);
        add(lblCep); add(txtCep);
        add(lblSexo); add(rbMasc); add(rbFem);
        add(lblCelular); add(txtCelular);
        add(lblTelefone); add(txtTelefone);
        add(lblAniversario); add(txtAniversario);
        add(lblCadastro); add(txtCadastro);
        add(btnCadastrar);
        add(btnLimpar);
        add(btnFechar);
    }

    private void adicionarPlaceholders() {
        adicionarPlaceholder(txtCelular, "(11) 99999-9999");
        
        adicionarPlaceholder(txtTelefone, "(11) 8888-8888");
        
        adicionarPlaceholder(txtCep, "99999-999");
        
        adicionarPlaceholder(txtAniversario, "DD/MM/AAAA");
        
        adicionarPlaceholder(txtCadastro, "DD/MM/AAAA");
        
        adicionarPlaceholder(txtCodigo, "Digite o código");
        
        adicionarPlaceholder(txtNome, "Digite o seu nome completo");
        
        adicionarPlaceholder(txtEndereco, "Digite o seu endereço");
        
        // Placeholder para Bairro
        adicionarPlaceholder(txtBairro, "Digite o seu bairro");
        
        // Placeholder para Cidade
        adicionarPlaceholder(txtCidade, "Digite a sua cidade");
    }

    private void adicionarPlaceholder(JTextField campo, String placeholder) {
        campo.setForeground(Color.GRAY);
        campo.setText(placeholder);
        
        campo.addFocusListener(new FocusAdapter() {
            @Override
            public void focusGained(FocusEvent e) {
                if (campo.getText().equals(placeholder)) {
                    campo.setText("");
                    campo.setForeground(Color.BLACK);
                }
            }
            
            @Override
            public void focusLost(FocusEvent e) {
                if (campo.getText().isEmpty()) {
                    campo.setForeground(Color.GRAY);
                    campo.setText(placeholder);
                }
            }
        });
    }
}