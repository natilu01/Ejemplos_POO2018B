import java.util.ArrayList;

public class WinComplejos extends javax.swing.JFrame {

   
    public WinComplejos() {
        initComponents();
        this.setTitle("***CALCULADORA DE NÚMEROS COMPLEJOS*** ");//encabezado para la ventana principal
        
    }

   public ClsComplejo m, n;
   public float x, y;
   public int a;
   public int codigo;
   public int opc;
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Btn_imaginario = new javax.swing.JButton();
        Btn_real = new javax.swing.JButton();
        TxtDisplay = new javax.swing.JTextField();
        Btn_mas = new javax.swing.JButton();
        Btn_menos = new javax.swing.JButton();
        Btn_para = new javax.swing.JButton();
        Btn_por = new javax.swing.JButton();
        Btn_igual = new javax.swing.JButton();
        Btn_clear = new javax.swing.JButton();
        Btn_exit = new javax.swing.JButton();
        Btn_ala = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        Btn_imaginario.setFont(new java.awt.Font("Berlin Sans FB", 0, 12)); // NOI18N
        Btn_imaginario.setText("IMAGINARIO");
        Btn_imaginario.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Btn_imaginarioMouseClicked(evt);
            }
        });
        Btn_imaginario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn_imaginarioActionPerformed(evt);
            }
        });

        Btn_real.setFont(new java.awt.Font("Berlin Sans FB", 0, 12)); // NOI18N
        Btn_real.setText("REAL");
        Btn_real.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Btn_realMouseClicked(evt);
            }
        });
        Btn_real.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn_realActionPerformed(evt);
            }
        });

        Btn_mas.setFont(new java.awt.Font("Berlin Sans FB", 0, 18)); // NOI18N
        Btn_mas.setText("+");
        Btn_mas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Btn_masMouseClicked(evt);
            }
        });
        Btn_mas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn_masActionPerformed(evt);
            }
        });

        Btn_menos.setFont(new java.awt.Font("Berlin Sans FB", 0, 18)); // NOI18N
        Btn_menos.setText("-");
        Btn_menos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Btn_menosMouseClicked(evt);
            }
        });
        Btn_menos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn_menosActionPerformed(evt);
            }
        });

        Btn_para.setFont(new java.awt.Font("Berlin Sans FB", 0, 18)); // NOI18N
        Btn_para.setText("/");
        Btn_para.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Btn_paraMouseClicked(evt);
            }
        });
        Btn_para.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn_paraActionPerformed(evt);
            }
        });

        Btn_por.setFont(new java.awt.Font("Berlin Sans FB", 0, 18)); // NOI18N
        Btn_por.setText("*");
        Btn_por.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Btn_porMouseClicked(evt);
            }
        });
        Btn_por.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn_porActionPerformed(evt);
            }
        });

        Btn_igual.setFont(new java.awt.Font("Berlin Sans FB", 0, 18)); // NOI18N
        Btn_igual.setText("=");
        Btn_igual.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Btn_igualMouseClicked(evt);
            }
        });
        Btn_igual.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn_igualActionPerformed(evt);
            }
        });

        Btn_clear.setFont(new java.awt.Font("Berlin Sans FB", 0, 12)); // NOI18N
        Btn_clear.setText("CLEAR");
        Btn_clear.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Btn_clearMouseClicked(evt);
            }
        });

        Btn_exit.setFont(new java.awt.Font("Berlin Sans FB", 0, 12)); // NOI18N
        Btn_exit.setText("EXIT");
        Btn_exit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Btn_exitMouseClicked(evt);
            }
        });

        Btn_ala.setFont(new java.awt.Font("Algerian", 0, 11)); // NOI18N
        Btn_ala.setText("ALA");
        Btn_ala.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Btn_alaMouseClicked(evt);
            }
        });
        Btn_ala.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn_alaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(47, 47, 47)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(Btn_igual, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(Btn_ala))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(Btn_real, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(Btn_imaginario, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(TxtDisplay, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 290, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(Btn_mas, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(Btn_menos, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(Btn_por, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(Btn_para, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(Btn_clear, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(Btn_exit, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(48, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(TxtDisplay, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Btn_imaginario, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Btn_real, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Btn_mas, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
                    .addComponent(Btn_menos, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
                    .addComponent(Btn_por, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
                    .addComponent(Btn_para, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(Btn_igual, javax.swing.GroupLayout.DEFAULT_SIZE, 39, Short.MAX_VALUE)
                    .addComponent(Btn_ala, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(9, 9, 9)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Btn_clear, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Btn_exit, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void Btn_realMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Btn_realMouseClicked
       x = Float.parseFloat(TxtDisplay.getText());
       TxtDisplay.setText(null);
       TxtDisplay.requestFocus();        // TODO add your handling code here:
    }//GEN-LAST:event_Btn_realMouseClicked

    private void Btn_imaginarioMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Btn_imaginarioMouseClicked
       y = Float.parseFloat(TxtDisplay.getText());
       m = new ClsComplejo ( x, y);
       TxtDisplay.setText(m.ver());
       TxtDisplay.requestFocus();  
    }//GEN-LAST:event_Btn_imaginarioMouseClicked

    private void Btn_masMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Btn_masMouseClicked
       codigo = 1;
       n = new ClsComplejo (m);
       TxtDisplay.setText(null);
       TxtDisplay.requestFocus();
    }//GEN-LAST:event_Btn_masMouseClicked

    private void Btn_menosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Btn_menosMouseClicked
       codigo = 2;
       n = new ClsComplejo (m);
       TxtDisplay.setText(null);
       TxtDisplay.requestFocus();
    }//GEN-LAST:event_Btn_menosMouseClicked

    private void Btn_porMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Btn_porMouseClicked
       codigo = 3;
       n = new ClsComplejo (m);
       TxtDisplay.setText(null);
       TxtDisplay.requestFocus();
    }//GEN-LAST:event_Btn_porMouseClicked

    private void Btn_paraMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Btn_paraMouseClicked
       codigo = 4;
       n = new ClsComplejo (m);
       TxtDisplay.setText(null);
       TxtDisplay.requestFocus();
    }//GEN-LAST:event_Btn_paraMouseClicked

    private void Btn_igualMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Btn_igualMouseClicked
        if (codigo==1){
           m = m.suma(n);
           TxtDisplay.setText(m.ver());
       }
       else if (codigo==2){
           m = m.resta(n);
           TxtDisplay.setText(m.ver());
       }
       else if (codigo==3){
           m = m.por(n);
           TxtDisplay.setText(m.ver());    
       }
       
        /**/
        
    }//GEN-LAST:event_Btn_igualMouseClicked

    private void Btn_clearMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Btn_clearMouseClicked
        x=0;
        y=0;
        codigo = 0;
        TxtDisplay.setText(null);
        TxtDisplay.requestFocus();
    }//GEN-LAST:event_Btn_clearMouseClicked

    private void Btn_exitMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Btn_exitMouseClicked
        System.exit(0);
    }//GEN-LAST:event_Btn_exitMouseClicked

    private void Btn_alaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Btn_alaMouseClicked
        codigo=5;
        n= new ClsComplejo(m);
        TxtDisplay.setText(null);
        TxtDisplay.requestFocus(); 
    }//GEN-LAST:event_Btn_alaMouseClicked

    private void Btn_realActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn_realActionPerformed
        // TODO add your handling code here:
        
        x=Integer.parseInt(TxtDisplay.getText());
        TxtDisplay.setText(null);
        TxtDisplay.requestFocus();  
    }//GEN-LAST:event_Btn_realActionPerformed

    private void Btn_imaginarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn_imaginarioActionPerformed
        // TODO add your handling code here:
        
       y=Integer.parseInt(TxtDisplay.getText());
       m= new ClsComplejo(x,y);
            
       TxtDisplay.setText(m.ver());
       TxtDisplay.requestFocus();
    }//GEN-LAST:event_Btn_imaginarioActionPerformed

    private void Btn_alaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn_alaActionPerformed
        // TODO add your handling code here:
        
        a= Integer.parseInt(TxtDisplay.getText());
        TxtDisplay.requestFocus();
        opc = 5;
    }//GEN-LAST:event_Btn_alaActionPerformed

    private void Btn_paraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn_paraActionPerformed
        // TODO add your handling code here:
       TxtDisplay.setText(null);
       TxtDisplay.requestFocus();
        opc =4;
    }//GEN-LAST:event_Btn_paraActionPerformed

    private void Btn_menosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn_menosActionPerformed
        // TODO add your handling code here:
       TxtDisplay.setText(null);
       TxtDisplay.requestFocus();
        opc =2;
    }//GEN-LAST:event_Btn_menosActionPerformed

    private void Btn_masActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn_masActionPerformed
        // TODO add your handling code here:
       TxtDisplay.setText(null);
       TxtDisplay.requestFocus();
        opc =1;
    }//GEN-LAST:event_Btn_masActionPerformed

    private void Btn_porActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn_porActionPerformed
        // TODO add your handling code here:
       TxtDisplay.setText(null);
       TxtDisplay.requestFocus();
        opc =3;
    }//GEN-LAST:event_Btn_porActionPerformed

    private void Btn_igualActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn_igualActionPerformed
        // TODO add your handling code here:
        
        
       switch (opc){
          case 1: 
              //SUMA         
              m.suma(n);
              break;
          case 2:
              //RESTA
              m.resta(n);
              break;
          case 3:
              //MULTIPLICACION
              m.por(n);
              break; 
          case 4:
              //DIVISION
              m.para(n);
              break;
          case 5:
              //POTENCIACION
              m.ala(a);
              break;
       
          default: 
   
      }
      TxtDisplay.setText(m.ver());
      TxtDisplay.requestFocus();
    }//GEN-LAST:event_Btn_igualActionPerformed

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
            java.util.logging.Logger.getLogger(WinComplejos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(WinComplejos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(WinComplejos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(WinComplejos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new WinComplejos().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Btn_ala;
    private javax.swing.JButton Btn_clear;
    private javax.swing.JButton Btn_exit;
    private javax.swing.JButton Btn_igual;
    private javax.swing.JButton Btn_imaginario;
    private javax.swing.JButton Btn_mas;
    private javax.swing.JButton Btn_menos;
    private javax.swing.JButton Btn_para;
    private javax.swing.JButton Btn_por;
    private javax.swing.JButton Btn_real;
    private javax.swing.JTextField TxtDisplay;
    // End of variables declaration//GEN-END:variables
}
