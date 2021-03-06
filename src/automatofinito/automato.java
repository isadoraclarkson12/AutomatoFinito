/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package automatofinito;

import java.awt.event.ItemEvent;
import javax.swing.JOptionPane;
import automatofinito.AlternativaJ;
import automatofinito.AlternativaD;
import automatofinito.AlternativaE;
import automatofinito.AlternativaF;
import automatofinito.AlternativaC;

/**
 *
 * @author PURGISA
 */
public class automato extends javax.swing.JFrame {

    /**
     * Creates new form automato
     */
    public automato() {
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

        jMenu1 = new javax.swing.JMenu();
        jEntrada = new javax.swing.JTextField();
        jExercicio = new javax.swing.JComboBox<>();
        jToggleButton1 = new javax.swing.JToggleButton();
        lbDescricao = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jDescricao = new javax.swing.JTextArea();
        jButton1 = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu3 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();

        jMenu1.setText("jMenu1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Automato Finito");

        jExercicio.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecione", "Exercício A", "Exercício B", "Exercício C", "Exercício D", "Exercício E", "Exercício F", "Exercício G", "Exercício H", "Exercício I", "Exercício J" }));
        jExercicio.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jExercicioItemStateChanged(evt);
            }
        });
        jExercicio.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                jExercicioPropertyChange(evt);
            }
        });

        jToggleButton1.setText("Executar");
        jToggleButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton1ActionPerformed(evt);
            }
        });

        jDescricao.setColumns(20);
        jDescricao.setRows(5);
        jDescricao.setEnabled(false);
        jScrollPane1.setViewportView(jDescricao);

        jButton1.setText("Limpar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jMenu3.setText("Ajuda");

        jMenuItem1.setText("Tutorial");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuItem1);

        jMenuItem2.setText("Info");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuItem2);

        jMenuBar1.add(jMenu3);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jEntrada, javax.swing.GroupLayout.PREFERRED_SIZE, 256, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jExercicio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jToggleButton1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton1))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(lbDescricao, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 526, Short.MAX_VALUE)))
                .addContainerGap(72, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jEntrada, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jExercicio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jToggleButton1)
                    .addComponent(jButton1))
                .addGap(2, 2, 2)
                .addComponent(lbDescricao, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(175, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jToggleButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButton1ActionPerformed
        if (jExercicio.getSelectedItem().equals("Exercício A")) {
            AlternativaA exA = new AlternativaA();
            boolean ret = exA.testarSentenca(jEntrada.getText());
            if (ret) {
                JOptionPane.showMessageDialog(null, "Sequencia reconhecida!");
            } else {
                JOptionPane.showMessageDialog(null, "Sequencia não reconhecida!");
            }
        } else if (jExercicio.getSelectedItem().equals("Exercício B")) {
            AlternativaB exB = new AlternativaB();
            boolean ret = exB.testarSentenca(jEntrada.getText());
            if (ret) {
                JOptionPane.showMessageDialog(null, "Sequencia reconhecida!");
            } else {
                JOptionPane.showMessageDialog(null, "Sequencia não reconhecida!");
            }
        } else if (jExercicio.getSelectedItem().equals("Exercício C")) {
            AlternativaC exC = new AlternativaC();
            boolean ret = exC.testarSentenca(jEntrada.getText());
            if (ret) {
                JOptionPane.showMessageDialog(null, "Sequencia reconhecida!");
            } else {
                JOptionPane.showMessageDialog(null, "Sequencia não reconhecida!");
            }

        } else if (jExercicio.getSelectedItem().equals("Exercício D")) {
            AlternativaD exD = new AlternativaD();
            boolean ret = exD.testarSentenca(jEntrada.getText());
            if (ret) {
                JOptionPane.showMessageDialog(null, "Sequencia reconhecida!");
            } else {
                JOptionPane.showMessageDialog(null, "Sequencia não reconhecida!");
            }
        } else if (jExercicio.getSelectedItem().equals("Exercício E")) {
            AlternativaE exE = new AlternativaE();
            boolean ret = exE.testarSentenca(jEntrada.getText());
            if (ret) {
                JOptionPane.showMessageDialog(null, "Sequencia reconhecida!");
            } else {
                JOptionPane.showMessageDialog(null, "Sequencia não reconhecida!");
            }
        } else if (jExercicio.getSelectedItem().equals("Exercício F")) {
            AlternativaF exF = new AlternativaF();
            boolean ret = exF.testarSentenca(jEntrada.getText());
            if (ret) {
                JOptionPane.showMessageDialog(null, "Sequencia reconhecida!");
            } else {
                JOptionPane.showMessageDialog(null, "Sequencia não reconhecida!");
            }
        } else if (jExercicio.getSelectedItem().equals("Exercício G")) {
            AlternativaG exG = new AlternativaG();
            boolean ret = exG.testarSentenca(jEntrada.getText());
            if (ret) {
                JOptionPane.showMessageDialog(null, "Sequencia reconhecida!");
            } else {
                JOptionPane.showMessageDialog(null, "Sequencia não reconhecida!");
            }

        } else if (jExercicio.getSelectedItem().equals("Exercício H")) {
            AlternativaH exH = new AlternativaH();
            boolean ret = exH.testarSentenca(jEntrada.getText());
            if (ret) {
                JOptionPane.showMessageDialog(null, "Sequencia reconhecida!");
            } else {
                JOptionPane.showMessageDialog(null, "Sequencia não reconhecida!");
            }

        } else if (jExercicio.getSelectedItem().equals("Exercício I")) {
            AlternativaI exI = new AlternativaI();
            boolean ret = exI.testarSentenca(jEntrada.getText());
            if (ret) {
                JOptionPane.showMessageDialog(null, "Sequencia reconhecida!");
            } else {
                JOptionPane.showMessageDialog(null, "Sequencia não reconhecida!");
            }

        } else if (jExercicio.getSelectedItem().equals("Exercício J")) {
            AlternativaJ exJ = new AlternativaJ();
            boolean ret = exJ.testarSentenca(jEntrada.getText());
            if (ret) {
                JOptionPane.showMessageDialog(null, "Sequencia reconhecida!");
            } else {
                JOptionPane.showMessageDialog(null, "Sequencia não reconhecida!");
            }
        }
    }//GEN-LAST:event_jToggleButton1ActionPerformed

    private void jExercicioPropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_jExercicioPropertyChange
        // TODO add your handling code here:
    }//GEN-LAST:event_jExercicioPropertyChange

    private void jExercicioItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jExercicioItemStateChanged
        if (evt.getStateChange() == ItemEvent.SELECTED) {
            String it = (String) evt.getItem();
            if (it.equalsIgnoreCase("Exercício A")) {
                jDescricao.setText("L2 = {W começa com 'a' e termina com 'b'}");
            } else if (it.equalsIgnoreCase("Exercício B")) {
                jDescricao.setText("L2 = {W possui 'aaa' como subcadeia}");
            } else if (it.equalsIgnoreCase("Exercício C")) {
                jDescricao.setText("L2 = {W possui baba como prefixo e abab como sufixo}");
            } else if (it.equalsIgnoreCase("Exercício D")) {
                jDescricao.setText("L2 = {W possui no máximo uma ocorrência da cadeia baba}");
            } else if (it.equalsIgnoreCase("Exercício E")) {
                jDescricao.setText("L2 = {W não possui ocorrência da cadeia baba}");
            } else if (it.equalsIgnoreCase("Exercício F")) {
                jDescricao.setText("L2 = {W possui ocorrência par de a's seguida por ocorrência impar de b's}");
            } else if (it.equalsIgnoreCase("Exercício G")) {
                jDescricao.setText("L2 = {W começa com a e possui ocorrência par de a's ou começa com b e possui ocorrência impar de b's}");
            } else if (it.equalsIgnoreCase("Exercício H")) {
                jDescricao.setText("L2 = {W inicia-se com 0e a soma de todos os seus dígitosé par, ou inicia-se com 1e a soma de todos os seus dígitos é impar}");
            } else if (it.equalsIgnoreCase("Exercício I")) {
                jDescricao.setText("L2 = {W inicia-se com uma letra, possuindo a seguir qualquer combinação de letras e dígitos}");
            } else if (it.equalsIgnoreCase("Exercício J")) {
                jDescricao.setText("L2 = {W é um número inteiro, um número decimal ou um número representado em notação científica}");
            }
        }
    }//GEN-LAST:event_jExercicioItemStateChanged

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        JOptionPane.showMessageDialog(null, "1. Insira a sequência na caixa de texto \n2. Selecione o exercício a ser resolvido\n3. Clique em executar\n4. Caso queira limpar a caixa de texto, clique em 'limpar'.");
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed

        jEntrada.setText("");
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
        JOptionPane.showMessageDialog(null, "Desenvolvido por Isadora Faria e Luis Henrique para a disciplina de Linguagens Formais e Autômatos (IFTM - 2020)");
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(automato.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(automato.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(automato.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(automato.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new automato().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JTextArea jDescricao;
    private javax.swing.JTextField jEntrada;
    private javax.swing.JComboBox<String> jExercicio;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JToggleButton jToggleButton1;
    private javax.swing.JLabel lbDescricao;
    // End of variables declaration//GEN-END:variables
}
