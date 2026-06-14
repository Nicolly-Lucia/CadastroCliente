package com.mycompany.maincadastro;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Funcionalidades implements ActionListener {
    
    private Design design;
    
    public Funcionalidades(Design design) {
        this.design = design;
        
        design.btnCadastrar.addActionListener(this);
        design.btnLimpar.addActionListener(this);
        design.btnFechar.addActionListener(this);
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == design.btnCadastrar) {
            cadastrar();
        } else if (e.getSource() == design.btnLimpar) {
            limpar();
        } else if (e.getSource() == design.btnFechar) {
            fechar();
        }
    }
    
    private void cadastrar() {
        // Verifica código 
        if (design.txtCodigo.getText().equals("Digite o código") || design.txtCodigo.getText().trim().isEmpty()) {
            mostrarErro("Código do Cliente é obrigatório!");
            design.txtCodigo.requestFocus();
            return;
        }
        
        // Verifica nome
        if (design.txtNome.getText().equals("Digite o nome completo") || design.txtNome.getText().trim().isEmpty()) {
            mostrarErro("Nome Completo é obrigatório!");
            design.txtNome.requestFocus();
            return;
        }
        
        String codigo = design.txtCodigo.getText();
        if (codigo.equals("Digite o código")) {
            codigo = "";
        }
        
        String nome = design.txtNome.getText();
        if (nome.equals("Digite o nome completo")) {
            nome = "";
        }
        
        String endereco = design.txtEndereco.getText();
        if (endereco.equals("Digite o endereço")) {
            endereco = "";
        }
        
        String bairro = design.txtBairro.getText();
        if (bairro.equals("Digite o bairro")) {
            bairro = "";
        }
        
        String cidade = design.txtCidade.getText();
        if (cidade.equals("Digite a cidade")) {
            cidade = "";
        }
        
        String cep = design.txtCep.getText();
        if (cep.equals("99999-999")) {
            cep = "";
        }
        
        String celular = design.txtCelular.getText();
        if (celular.equals("(11) 99999-9999")) {
            celular = "";
        }
        
        String telefone = design.txtTelefone.getText();
        if (telefone.equals("(11) 9999-9999")) {
            telefone = "";
        }
        
        String aniversario = design.txtAniversario.getText();
        if (aniversario.equals("DD/MM/AAAA")) {
            aniversario = "";
        }
        
        String dataCadastro = design.txtCadastro.getText();
        if (dataCadastro.equals("DD/MM/AAAA")) {
            dataCadastro = "";
        }
        
        String sexo = "";
        if (design.rbMasc.isSelected()) {
            sexo = "Masculino";
        } else {
            sexo = "Feminino";
        }
        
        // resultado
        String mensagem = "Dados Cadastrados\n\n" +
            "Código: " + codigo + "\n" +
            "Nome: " + nome + "\n" +
            "Endereço: " + (endereco.isEmpty() ? "(não informado)" : endereco) + "\n" +
            "Bairro: " + (bairro.isEmpty() ? "(não informado)" : bairro) + "\n" +
            "Cidade: " + (cidade.isEmpty() ? "(não informado)" : cidade) + "\n" +
            "Estado: " + design.cbEstado.getSelectedItem() + "\n" +
            "CEP: " + (cep.isEmpty() ? "(não informado)" : cep) + "\n" +
            "Sexo: " + sexo + "\n" +
            "Celular: " + (celular.isEmpty() ? "(não informado)" : celular) + "\n" +
            "Telefone: " + (telefone.isEmpty() ? "(não informado)" : telefone) + "\n" +
            "Aniversário: " + (aniversario.isEmpty() ? "(não informado)" : aniversario) + "\n" +
            "Data Cadastro: " + (dataCadastro.isEmpty() ? "(não informado)" : dataCadastro);
        
        JOptionPane.showMessageDialog(design, 
            mensagem, 
            "Cadastro Realizado com Sucesso", 
            JOptionPane.INFORMATION_MESSAGE);
    }
    
    private void limpar() {
        int resposta = JOptionPane.showConfirmDialog(design, 
            "Deseja realmente limpar todos os campos?", 
            "Confirmar Limpeza", 
            JOptionPane.YES_NO_OPTION,
            JOptionPane.QUESTION_MESSAGE);
        
        if (resposta == JOptionPane.YES_OPTION) {
            design.txtCodigo.setText("Digite o código");
            design.txtNome.setText("Digite o nome completo");
            design.txtEndereco.setText("Digite o endereço");
            design.txtBairro.setText("Digite o bairro");
            design.txtCidade.setText("Digite a cidade");
            design.txtCep.setText("99999-999");
            design.txtCelular.setText("(11) 99999-9999");
            design.txtTelefone.setText("(11) 3333-3333");
            design.txtAniversario.setText("DD/MM/AAAA");
            design.txtCadastro.setText("DD/MM/AAAA");
            
            design.cbEstado.setSelectedIndex(0);
            design.rbMasc.setSelected(true);
            design.txtCodigo.requestFocus();
            
            JOptionPane.showMessageDialog(design, 
                "Campos limpos com sucesso!", 
                "Limpeza Realizada", 
                JOptionPane.INFORMATION_MESSAGE);
        }
    }
    
    private void fechar() {
        int resposta = JOptionPane.showConfirmDialog(design, 
            "Deseja realmente sair do programa?", 
            "Confirmar Saída", 
            JOptionPane.YES_NO_OPTION,
            JOptionPane.QUESTION_MESSAGE);
        
        if (resposta == JOptionPane.YES_OPTION) {
            System.exit(0);
        }
    }
    
    private void mostrarErro(String mensagem) {
        JOptionPane.showMessageDialog(design, 
            mensagem, 
            "Erro de Validação", 
            JOptionPane.ERROR_MESSAGE);
    }
}