/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.mavenproject2;

import java.util.ArrayList;
import javax.swing.JOptionPane;


/**
 *
 * @author Hirata
 */
public class NewJFrame extends javax.swing.JFrame {
    
    public String nome;
    public ArrayList<String> lista = new ArrayList();
    //USO MÍNIMO DE RECURSOS: Classe Pessoa desnecessária
    /**
     * Creates new form NewJFrame
     */

   public NewJFrame() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        txtAluno = new javax.swing.JTextField();
        lblAluno = new javax.swing.JLabel();
        btnSalvar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        txtAluno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtAlunoActionPerformed(evt);
            }
        });

        lblAluno.setText("Nome:");

        btnSalvar.setText("Salvar");
        btnSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalvarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(53, 53, 53)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnSalvar)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblAluno)
                        .addGap(18, 18, 18)
                        .addComponent(txtAluno, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(343, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(44, 44, 44)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtAluno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblAluno))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnSalvar)
                .addContainerGap(149, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtAlunoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtAlunoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtAlunoActionPerformed

    private void btnSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalvarActionPerformed
        //CRIAÇÃO DE FUNÇÕES BEM ESTRUTURADAS
        //UTILIZAÇÃO MELHOR DAS VARIAVEIS EXISTENTES: STRING NOME RECEBE O txtAluno
        
        nome = txtAluno.getText();
        if(lista.isEmpty()){
              lista.add(nome);
              System.out.println(nome);
        } else{
            //COMPARAÇÃO DO NOVO NOME INSERIDO: havia um looping infinito de inserção de nome
            //PROGRAMAÇÃO FUNCIONAL SUGESTÃO: REVER A LÓGICA DO LAÇO FOR PARA VERIFICAR AS POSIÇÕES NA INSERÇÃO DO NOME
          for(int i = 0; i < lista.size(); i++){
                if(!lista.get(i).equals(nome)){
                     lista.add(nome);
                    System.out.println(lista.get(i));
                } else {
                    JOptionPane.showMessageDialog(null, "Nome já inserido");
                }
            }  
        }
                  // CÓDIGO ESTRUTURADO: faltou fechar a chave da função FOR 
    }//GEN-LAST:event_btnSalvarActionPerformed
    
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
       
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new NewJFrame().setVisible(true);
            }
        });
        
    }

    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnSalvar;
    private javax.swing.JLabel lblAluno;
    private javax.swing.JTextField txtAluno;
    // End of variables declaration//GEN-END:variables
    //USO MINIMO DE RECURSOS: EXCLUIR JLABEL INUTILIZADA
    
}
