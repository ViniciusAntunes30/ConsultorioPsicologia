/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package apresentacao;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.Timer;

/**
 *
 * @author Vinicius
 */
public class fmPrincipal extends javax.swing.JFrame {

    /**
     * Creates new form fmPrincipal
     */
    public fmPrincipal() {
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

        jToolBar1 = new javax.swing.JToolBar();
        btPaciente = new javax.swing.JButton();
        btSair = new javax.swing.JButton();
        jDesktopPane1 = new javax.swing.JDesktopPane();
        jPanel1 = new javax.swing.JPanel();
        laUsuario = new javax.swing.JLabel();
        laData = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jmCadastros = new javax.swing.JMenu();
        jmPaciente = new javax.swing.JMenuItem();
        jmAnamnense = new javax.swing.JMenuItem();
        jmSessoes = new javax.swing.JMenuItem();
        jmProcessos = new javax.swing.JMenu();
        jmAgendamento = new javax.swing.JMenuItem();
        jmConfiguracoes = new javax.swing.JMenu();
        jmCadastrarPsicologo = new javax.swing.JMenuItem();
        jmRelatorios = new javax.swing.JMenu();
        jmHistoricoClinico = new javax.swing.JMenuItem();
        jmAjuda = new javax.swing.JMenu();
        jmSobre = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jToolBar1.setRollover(true);

        btPaciente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/People-32.png"))); // NOI18N
        btPaciente.setToolTipText("Cadastrar Paciente");
        btPaciente.setFocusable(false);
        btPaciente.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btPaciente.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btPaciente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btPacienteActionPerformed(evt);
            }
        });
        jToolBar1.add(btPaciente);

        btSair.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/Exit-32.png"))); // NOI18N
        btSair.setToolTipText("");
        btSair.setFocusable(false);
        btSair.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btSair.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btSairActionPerformed(evt);
            }
        });
        jToolBar1.add(btSair);

        laUsuario.setText("Bemvindo");

        laData.setText("Data");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addComponent(laUsuario)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(laData)
                .addGap(45, 45, 45))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(laUsuario)
                    .addComponent(laData))
                .addContainerGap())
        );

        jDesktopPane1.setLayer(jPanel1, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout jDesktopPane1Layout = new javax.swing.GroupLayout(jDesktopPane1);
        jDesktopPane1.setLayout(jDesktopPane1Layout);
        jDesktopPane1Layout.setHorizontalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jDesktopPane1Layout.setVerticalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jDesktopPane1Layout.createSequentialGroup()
                .addGap(0, 299, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jmCadastros.setText("Cadastros");
        jmCadastros.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jmCadastros.addMenuListener(new javax.swing.event.MenuListener() {
            public void menuCanceled(javax.swing.event.MenuEvent evt) {
            }
            public void menuDeselected(javax.swing.event.MenuEvent evt) {
            }
            public void menuSelected(javax.swing.event.MenuEvent evt) {
                jmCadastrosMenuSelected(evt);
            }
        });
        jmCadastros.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmCadastrosActionPerformed(evt);
            }
        });

        jmPaciente.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_P, java.awt.event.InputEvent.CTRL_MASK));
        jmPaciente.setText("Pacientes");
        jmPaciente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmPacienteActionPerformed(evt);
            }
        });
        jmCadastros.add(jmPaciente);

        jmAnamnense.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_A, java.awt.event.InputEvent.CTRL_MASK));
        jmAnamnense.setText("Anamnese");
        jmCadastros.add(jmAnamnense);

        jmSessoes.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_S, java.awt.event.InputEvent.CTRL_MASK));
        jmSessoes.setText("Sessões");
        jmCadastros.add(jmSessoes);

        jMenuBar1.add(jmCadastros);

        jmProcessos.setText("Processos");

        jmAgendamento.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_G, java.awt.event.InputEvent.CTRL_MASK));
        jmAgendamento.setText("Agendamento");
        jmProcessos.add(jmAgendamento);

        jMenuBar1.add(jmProcessos);

        jmConfiguracoes.setText("Configurações");

        jmCadastrarPsicologo.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_I, java.awt.event.InputEvent.CTRL_MASK));
        jmCadastrarPsicologo.setText("Cadastrar Psicólogo");
        jmConfiguracoes.add(jmCadastrarPsicologo);

        jMenuBar1.add(jmConfiguracoes);

        jmRelatorios.setText("Relatótios");

        jmHistoricoClinico.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_H, java.awt.event.InputEvent.CTRL_MASK));
        jmHistoricoClinico.setText("Histórico Clínico");
        jmRelatorios.add(jmHistoricoClinico);

        jMenuBar1.add(jmRelatorios);

        jmAjuda.setText("Ajuda");

        jmSobre.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_E, java.awt.event.InputEvent.CTRL_MASK));
        jmSobre.setText("Sobre");
        jmSobre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmSobreActionPerformed(evt);
            }
        });
        jmAjuda.add(jmSobre);

        jMenuBar1.add(jmAjuda);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jToolBar1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(309, 309, 309))
            .addComponent(jDesktopPane1)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jToolBar1, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(1, 1, 1)
                .addComponent(jDesktopPane1))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jmCadastrosMenuSelected(javax.swing.event.MenuEvent evt) {//GEN-FIRST:event_jmCadastrosMenuSelected
        // TODO add your handling code here:
    }//GEN-LAST:event_jmCadastrosMenuSelected

    private void jmCadastrosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmCadastrosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jmCadastrosActionPerformed

    private void btSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btSairActionPerformed
        // TODO add your handling code here:
        int valor = JOptionPane.showConfirmDialog(null,"Tem certeza que deseja sair?","Sistemas de Prontuarios Médicos",1);
        if(valor==0){
             System.exit(0);
            // this.dispose();
            //fmLogin Login=new fmLogin();  //fecha a tela principal e abrir a tela de login
            //Login.setVisible(true);
        }
    }//GEN-LAST:event_btSairActionPerformed

    private String mostrarData (){
        DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
        
        Date date = new Date();
        return dateFormat.format(date);
    
    
    }
    
    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        // TODO add your handling code here:
        laData.setText(mostrarData());
        
        ActionListener updater = new ActionListener(){
         @Override
         public void actionPerformed(ActionEvent event){
             laData.setText(mostrarData());
         }
        };
        Timer timer = new Timer(1000, updater);
        timer.start();
        
        this.setExtendedState(this.getExtendedState()|JFrame.MAXIMIZED_BOTH);
    }//GEN-LAST:event_formWindowOpened

    private void jmSobreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmSobreActionPerformed
        // TODO add your handling code here:
        fmSobre sobre =new fmSobre();
        jDesktopPane1.add(sobre);
        sobre.setVisible(true);
    }//GEN-LAST:event_jmSobreActionPerformed

    private void jmPacienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmPacienteActionPerformed
        // TODO add your handling code here:
       fmPaciente paciente=new fmPaciente();
         jDesktopPane1.add(paciente);
         paciente.setVisible(true);
         //principal.setExtendedState(JFrame.MAXIMIZED_BOTH);

    }//GEN-LAST:event_jmPacienteActionPerformed

    private void btPacienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btPacienteActionPerformed
        // TODO add your handling code here:
        fmPaciente paciente=new fmPaciente();
         jDesktopPane1.add(paciente);
         paciente.setVisible(true);
        
    }//GEN-LAST:event_btPacienteActionPerformed

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
            java.util.logging.Logger.getLogger(fmPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(fmPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(fmPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(fmPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new fmPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btPaciente;
    private javax.swing.JButton btSair;
    private javax.swing.JDesktopPane jDesktopPane1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JToolBar jToolBar1;
    private javax.swing.JMenuItem jmAgendamento;
    private javax.swing.JMenu jmAjuda;
    private javax.swing.JMenuItem jmAnamnense;
    private javax.swing.JMenuItem jmCadastrarPsicologo;
    private javax.swing.JMenu jmCadastros;
    private javax.swing.JMenu jmConfiguracoes;
    private javax.swing.JMenuItem jmHistoricoClinico;
    private javax.swing.JMenuItem jmPaciente;
    private javax.swing.JMenu jmProcessos;
    private javax.swing.JMenu jmRelatorios;
    private javax.swing.JMenuItem jmSessoes;
    private javax.swing.JMenuItem jmSobre;
    private javax.swing.JLabel laData;
    private javax.swing.JLabel laUsuario;
    // End of variables declaration//GEN-END:variables
}
