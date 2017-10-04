
package gui;

import codes.Book;

public class Mochila extends javax.swing.JFrame {

    private Book book;

    
    public Mochila() {
        initComponents();
    }
    
    public Mochila(Book book){
        initComponents();
        this.book = book;
        dano.setText("Dano: "+book.getPlayer().getArma().getDano());
        cigarros.setText(""+book.getPlayer().getCigarro().getQtd());
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        cigarros = new javax.swing.JButton();
        revolver = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        descricao = new javax.swing.JLabel();
        dano = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        cigarros.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gui/cigarretesIcon.png"))); // NOI18N
        cigarros.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                cigarrosMouseMoved(evt);
            }
        });
        cigarros.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cigarrosActionPerformed(evt);
            }
        });

        revolver.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gui/revolver-iloveimg-resized (1).png"))); // NOI18N
        revolver.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                revolverMouseMoved(evt);
            }
        });

        jButton2.setText("Fechar");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jLabel1.setText("Ataque físico(mão) : 30");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jButton2)
                        .addGap(42, 42, 42))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(19, 19, 19)
                                .addComponent(revolver)
                                .addGap(18, 18, 18)
                                .addComponent(dano, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(cigarros, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(250, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(descricao, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButton2)
                .addGap(24, 24, 24)
                .addComponent(cigarros, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(dano, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(revolver))
                .addGap(18, 18, 18)
                .addComponent(jLabel1)
                .addGap(5, 5, 5)
                .addComponent(descricao, javax.swing.GroupLayout.DEFAULT_SIZE, 85, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cigarrosMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cigarrosMouseMoved
        descricao.setText("Use para amenizar um pouco a dor e a existência.");
    }//GEN-LAST:event_cigarrosMouseMoved

    private void revolverMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_revolverMouseMoved
        descricao.setText("Um révolver.");
    }//GEN-LAST:event_revolverMouseMoved

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        dispose();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void cigarrosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cigarrosActionPerformed
        int quantia = book.getPlayer().getCigarro().getQtd();
        if(book.getPlayer().getCigarro().getQtd()>0 && book.getPlayer().getLife()<=80){
            quantia--;
            cigarros.setText(""+(quantia));
            book.getPlayer().setLife(book.getPlayer().getLife() + 20);
        }else{
            descricao.setText("Vida cheia.");
        }
        if(quantia>=0)
        cigarros.setText(""+quantia);
    }//GEN-LAST:event_cigarrosActionPerformed

  
    public static void main(String args[]) {
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Mochila().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton cigarros;
    private javax.swing.JLabel dano;
    private javax.swing.JLabel descricao;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel revolver;
    // End of variables declaration//GEN-END:variables
}
