
package gui;

import codes.Book;
import codes.Engine;
import java.applet.Applet;
import java.applet.AudioClip;
import java.awt.Image;
import java.net.URL;
import javax.swing.Icon;
import javax.swing.ImageIcon;



 /* @author Gustavo*/
public class TelaInicial extends javax.swing.JFrame {
    private final Book book = Engine.createBook();
    private Image image;
    
    public TelaInicial() {
        music("Cowboy Bebop - Cats on Mars");
        initComponents();
        initialize();
        setResizable(false);
        setTitle("Comboy Bebop - AA");
        setBounds(100, 100,800,500);
        
    }
    
    public void music(String nomeDoAudio) {
         URL url = getClass().getResource(nomeDoAudio+".wav");
         AudioClip audio = Applet.newAudioClip(url);
         audio.play();
    }
    
    private void initialize(){
        
    }

    
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 51, 102));
        getContentPane().setLayout(null);

        jButton1.setText("Jogar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(340, 190, 110, 50);
        jButton1.getAccessibleContext().setAccessibleParent(jButton1);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gui/background-iloveimg-resized.jpg"))); // NOI18N
        getContentPane().add(jLabel1);
        jLabel1.setBounds(0, 0, 810, 550);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        dispose();
        new TelaEscolhas().setVisible(true);
    }//GEN-LAST:event_jButton1ActionPerformed

   
    public static void main(String args[]) {
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaInicial().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}
