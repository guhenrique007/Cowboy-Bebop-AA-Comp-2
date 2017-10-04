
package gui;

import codes.Book;
import codes.Choice;
import codes.Engine;
import java.applet.Applet;
import java.applet.AudioClip;
import java.awt.Color;
import java.io.FileInputStream;
import java.io.IOException;
import java.net.URL;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import sun.audio.AudioData;
import sun.audio.AudioPlayer;
import sun.audio.AudioStream;
import sun.audio.ContinuousAudioDataStream;
import javax.sound.sampled.*;

public class TelaEscolhas extends javax.swing.JFrame {
    private final Book book = Engine.createBook();
    private Choice[] choices = new Choice[3];
    private int contador,contador2;
    ImageIcon imagem;
   
    public TelaEscolhas() {
        initComponents();
        setResizable(false);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setTitle("Comboy Bebop - AA");
        mural.setText(book.showHistory());///MURAL///
        //opcao1.setText("");
        int i=0;
	for(Choice choice:book.nextEvents()) {
	    choices[i] = choice;
	    i++;
	}
	opcao1.setText(choices[0].getDescription());
	opcao2.setText(choices[1].getDescription());
        setBounds(100, 100,800,500);            
        mural.setLineWrap(true);   
        vida.setValue(book.getPlayer().getLife());
        vida.setStringPainted(true);
        
        
        imagem = new ImageIcon(getClass().getResource("jet262.jpg"));
        bg.setIcon(imagem);
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        opcao1 = new javax.swing.JButton();
        opcao2 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        mural = new javax.swing.JTextArea();
        vida = new javax.swing.JProgressBar();
        bag = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        bg = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        opcao1.setText("opcao1");
        opcao1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                opcao1ActionPerformed(evt);
            }
        });
        getContentPane().add(opcao1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 240, 339, -1));

        opcao2.setText("opcao2");
        opcao2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                opcao2ActionPerformed(evt);
            }
        });
        getContentPane().add(opcao2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 280, 339, -1));

        mural.setColumns(20);
        mural.setRows(5);
        jScrollPane1.setViewportView(mural);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 140, 339, -1));

        vida.setBackground(new java.awt.Color(204, 204, 204));
        vida.setForeground(new java.awt.Color(0, 153, 153));
        getContentPane().add(vida, new org.netbeans.lib.awtextra.AbsoluteConstraints(244, 11, -1, -1));

        bag.setText("bag");
        bag.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bagActionPerformed(evt);
            }
        });
        getContentPane().add(bag, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 11, 70, -1));

        jLabel1.setText("HP:");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 10, -1, -1));
        getContentPane().add(bg, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 810, 510));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void opcao1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_opcao1ActionPerformed

        //fluxo para mudar o background
        contador++;
        switch(contador){
            case 1:
                imagem = new ImageIcon(getClass().getResource("sopa2.gif"));
                bg.setIcon(imagem);
                break;
            case 2:
                imagem = new ImageIcon(getClass().getResource("spike_comendo2.gif"));
                bg.setIcon(imagem);
                break;
            case 3:
                imagem = new ImageIcon(getClass().getResource("jettalk2.gif"));
                bg.setIcon(imagem);
                break;
            case 4:
                imagem = new ImageIcon(getClass().getResource("andando2.jpg"));
                bg.setIcon(imagem);
                break;
            case 5:
                imagem = new ImageIcon(getClass().getResource("action2.gif"));
                bg.setIcon(imagem);
                break;    
            case 6:
                imagem = new ImageIcon(getClass().getResource("smoke2.gif"));
                bg.setIcon(imagem);
                opcao2.setVisible(false);
                break;
            case 7:
                imagem = new ImageIcon(getClass().getResource("seeyou.gif"));
                bg.setIcon(imagem);
                opcao2.setVisible(false);
                opcao1.setVisible(false);
                vida.setVisible(false);
                bag.setVisible(false);
                mural.setBackground(Color.black);
                mural.setText("");
                break;
        }
        
        
        mural.setLineWrap(true); 
        if(book.nextEvent(0)){
                mural.setText(book.showHistory());///MURAL///
                int i=0;
    		for(Choice choice:book.nextEvents()) {
    		choices[i] = choice;
                i++;
    	    }
            opcao1.setText(choices[0].getDescription());
            opcao2.setText(choices[1].getDescription());
        }
        vida.setValue(book.getPlayer().getLife());
        
        
    }//GEN-LAST:event_opcao1ActionPerformed

    private void opcao2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_opcao2ActionPerformed
        contador2++;
        switch(contador){
            case 0:
                imagem = new ImageIcon(getClass().getResource("tiredd.jpg"));
                bg.setIcon(imagem);
                break;
            case 1:
                imagem = new ImageIcon(getClass().getResource("tiredd.jpg"));
                bg.setIcon(imagem);
                break;
            case 2:
                imagem = new ImageIcon(getClass().getResource("tiredd.jpg"));
                bg.setIcon(imagem);
                break;
            case 3:
                imagem = new ImageIcon(getClass().getResource("tiredd.jpg"));
                bg.setIcon(imagem);
                break;
            case 4:
                imagem = new ImageIcon(getClass().getResource("drunks.jpg"));
                bg.setIcon(imagem);
                break;
            case 5:
                imagem = new ImageIcon(getClass().getResource("dead.png"));
                bg.setIcon(imagem);
                break;    
        }
        
        
        
        
        if(!book.getPlayer().isAlive()){
            
        }
        mural.setLineWrap(true); 
        if(book.nextEvent(1)){
                    mural.setText(book.showHistory());///MURAL///
                    int i=0;
                    for(Choice choice:book.nextEvents()) {
                    choices[i] = choice;
                    i++;
                }
                opcao1.setVisible(false);
                opcao2.setVisible(false);
                opcao1.setText(choices[0].getDescription());
                opcao2.setText(choices[1].getDescription());
        }
        vida.setValue(book.getPlayer().getLife());
        
        
    }//GEN-LAST:event_opcao2ActionPerformed

    private void bagActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bagActionPerformed
        Mochila mochila = new Mochila(book);
        mochila.setVisible(true);
    }//GEN-LAST:event_bagActionPerformed

    
    
    public void music() {
         URL url = getClass().getResource("Cowboy Bebop - Cats on Mars.wav");
         AudioClip audio = Applet.newAudioClip(url);
         audio.play();
    }
    
    
    
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
            java.util.logging.Logger.getLogger(TelaEscolhas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaEscolhas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaEscolhas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaEscolhas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaEscolhas().setVisible(true);
                
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bag;
    private javax.swing.JLabel bg;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea mural;
    private javax.swing.JButton opcao1;
    private javax.swing.JButton opcao2;
    private javax.swing.JProgressBar vida;
    // End of variables declaration//GEN-END:variables
}
