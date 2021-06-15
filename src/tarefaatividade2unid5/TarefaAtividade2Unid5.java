/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tarefaatividade2unid5;

import java.awt.Font;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

/**
 *
 * @author AdrianoBenelliBastos
 */
public class TarefaAtividade2Unid5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        JFrame tela = new JFrame("Informações Bancárias");
        tela.setSize(350, 150);
        tela.setLocationRelativeTo(null);
        tela.setLayout(null);
        tela.setDefaultCloseOperation(3);
        tela.setVisible(true);

        JLabel lblNome = new JLabel("Nome: ");
        lblNome.setSize(100, 30);
        lblNome.setLocation(10, 10);
        tela.add(lblNome);
        lblNome.setFont(new java.awt.Font("Arial", Font.BOLD, 12));

        JLabel lblPergunta = new JLabel("Quanto você quer depositar? ");
        lblPergunta.setSize(170, 30);
        lblPergunta.setLocation(10, 40);
        tela.add(lblPergunta);
        lblPergunta.setFont(new java.awt.Font("Arial", Font.BOLD, 12));

        TextField tfdNome = new TextField();
        tfdNome.setBounds(200, 15, 115, 20);
        tfdNome.setText("");
        tela.add(tfdNome);

        TextField tfdPergunta = new TextField();
        tfdPergunta.setBounds(200, 45, 115, 20);
        tfdPergunta.setText("");
        tela.add(tfdPergunta);
        MouseListener l;

        /*tfdNome.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent e){
                JOptionPane.showMessageDialog(null, "Clicou!");
            }
        });*/
        JButton btnLimpar = new JButton("Limpar");
        btnLimpar.setBounds(50, 70, 90, 20);
        tela.add(btnLimpar);

        JButton btnExibir = new JButton("Exibir");
        btnExibir.setBounds(170, 70, 90, 20);
        tela.add(btnExibir);

        btnLimpar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                String nome;
                String pergunta;

                nome = tfdNome.getText();
                pergunta = tfdPergunta.getText();

                //JOptionPane.showMessageDialog(null,nome + pergunta );
                if (nome.equalsIgnoreCase("") && pergunta.equalsIgnoreCase("")) {
                    JOptionPane.showMessageDialog(null, "Campos Limpos!");
                } else {
                    tfdNome.setText("");
                    tfdPergunta.setText("");
                }
            }
        });

        btnExibir.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                String nome;
                String pergunta;

                nome = tfdNome.getText();
                pergunta = tfdPergunta.getText();
                

                if (nome.equalsIgnoreCase("") || pergunta.equalsIgnoreCase("")) {
                    JOptionPane.showMessageDialog(null, "Dados Incompletos!");
                } else {
                    JOptionPane.showMessageDialog(null, "Cliente: " + nome + "\n"
                            + "Você confirma o depósito de: R$ " + pergunta);
                }

            }
        });
    }
}
