/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tiktactoe;

import java.awt.Color;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author Asma Maqbool
 */
public class ticTacToee_s extends javax.swing.JFrame {

    
    private String StartGame="X";
    private int countx=0;
     private int count0=0;
    /**
     * Creates new form ticTacToee_s
     */
    public ticTacToee_s() {
        initComponents();
        setSize(1200,600);
        setLocationRelativeTo(null);
    }
private void score()
{
    jLabel3.setText(String.valueOf(countx));
    jLabel5.setText(String.valueOf(count0));
}
private void choosePlayer()
{
    if(StartGame.equalsIgnoreCase("X"))
    {
        StartGame="0";
        
    }
    else
    {
        StartGame="X";
    }
}
private void winner()
{
    String x1=jButton1.getText();
    String x2=jButton2.getText();
    String x3=jButton3.getText();
    
    String x4=jButton4.getText();
    String x5=jButton5.getText();
    String x6=jButton6.getText();
    
    String x7=jButton7.getText();
    String x8=jButton8.getText();
    String x9=jButton9.getText();
    if(x1=="X"&& x2==("X") && x3==("X"))
    {
        JOptionPane.showMessageDialog(this, "player X is the winner", " Tic tac toe", JOptionPane.INFORMATION_MESSAGE);
        countx++;
        score();
       jButton1.setBackground(Color.orange);
       jButton2.setBackground(Color.orange);
       jButton3.setBackground(Color.orange);
    }
    
    else if(x4=="X"&& x5==("X") && x6==("X"))
    {
        JOptionPane.showMessageDialog(this, "player X is the winner", " Tic tac toe", JOptionPane.INFORMATION_MESSAGE);
        countx++;
        score();
       jButton4.setBackground(Color.orange);
       jButton5.setBackground(Color.orange);
       jButton6.setBackground(Color.orange);
    }
     else if(x7=="X"&& x8==("X") && x9==("X"))
    {
        JOptionPane.showMessageDialog(this, "player X is the winner", " Tic tac toe", JOptionPane.INFORMATION_MESSAGE);
        countx++;
        score();
       jButton7.setBackground(Color.orange);
       jButton8.setBackground(Color.orange);
       jButton9.setBackground(Color.orange);
    }
     else if(x1=="X"&& x4==("X") && x7==("X"))
    {
        JOptionPane.showMessageDialog(this, "player X is the winner", " Tic tac toe", JOptionPane.INFORMATION_MESSAGE);
        countx++;
        score();
       jButton1.setBackground(Color.orange);
       jButton4.setBackground(Color.orange);
       jButton7.setBackground(Color.orange);
    }
     else if(x2=="X"&& x5==("X") && x8==("X"))
    {
        JOptionPane.showMessageDialog(this, "player X is the winner", " Tic tac toe", JOptionPane.INFORMATION_MESSAGE);
        countx++;
        score();
       jButton2.setBackground(Color.orange);
       jButton5.setBackground(Color.orange);
       jButton8.setBackground(Color.orange);
    }
     else if(x3=="X"&& x6==("X") && x9==("X"))
    {
        JOptionPane.showMessageDialog(this, "player X is the winner", " Tic tac toe", JOptionPane.INFORMATION_MESSAGE);
        countx++;
        score();
       jButton3.setBackground(Color.orange);
       jButton6.setBackground(Color.orange);
       jButton9.setBackground(Color.orange);
    }
     else if(x1=="X"&& x5==("X") && x9==("X"))
    {
        JOptionPane.showMessageDialog(this, "player X is the winner", " Tic tac toe", JOptionPane.INFORMATION_MESSAGE);
        countx++;
        score();
       jButton1.setBackground(Color.orange);
       jButton5.setBackground(Color.orange);
       jButton9.setBackground(Color.orange);
    }
     else if(x3=="X"&& x5==("X") && x7==("X"))
    {
        JOptionPane.showMessageDialog(this, "player X is the winner", " Tic tac toe", JOptionPane.INFORMATION_MESSAGE);
        countx++;
        score();
       jButton3.setBackground(Color.orange);
       jButton5.setBackground(Color.orange);
       jButton7.setBackground(Color.orange);
    }
    //zeroooo
    
    
     else if(x1=="0"&& x2==("0") && x3==("0"))
    {
        JOptionPane.showMessageDialog(this, "player 0 is the winner", " Tic tac toe", JOptionPane.INFORMATION_MESSAGE);
        count0++;
        score();
       jButton1.setBackground(Color.orange);
       jButton2.setBackground(Color.orange);
       jButton3.setBackground(Color.orange);
    }
    
    else if(x4=="0"&& x5==("0") && x6==("0"))
    {
        JOptionPane.showMessageDialog(this, "player 0 is the winner", " Tic tac toe", JOptionPane.INFORMATION_MESSAGE);
        count0++;
        score();
       jButton4.setBackground(Color.orange);
       jButton5.setBackground(Color.orange);
       jButton6.setBackground(Color.orange);
    }
     else if(x7=="0"&& x8==("0") && x9==("0"))
    {
        JOptionPane.showMessageDialog(this, "player 0 is the winner", " Tic tac toe", JOptionPane.INFORMATION_MESSAGE);
        count0++;
        score();
       jButton7.setBackground(Color.orange);
       jButton8.setBackground(Color.orange);
       jButton9.setBackground(Color.orange);
    }
     else if(x1=="0"&& x4==("0") && x7==("0"))
    {
        JOptionPane.showMessageDialog(this, "player 0 is the winner", " Tic tac toe", JOptionPane.INFORMATION_MESSAGE);
        count0++;
        score();
       jButton1.setBackground(Color.orange);
       jButton4.setBackground(Color.orange);
       jButton7.setBackground(Color.orange);
    }
     else if(x2=="0"&& x5==("0") && x8==("0"))
    {
        JOptionPane.showMessageDialog(this, "player 0 is the winner", " Tic tac toe", JOptionPane.INFORMATION_MESSAGE);
        count0++;
        score();
       jButton2.setBackground(Color.orange);
       jButton5.setBackground(Color.orange);
       jButton8.setBackground(Color.orange);
    }
     else if(x3=="0"&& x6==("0") && x9==("0"))
    {
        JOptionPane.showMessageDialog(this, "player 0 is the winner", " Tic tac toe", JOptionPane.INFORMATION_MESSAGE);
        count0++;
        score();
       jButton3.setBackground(Color.orange);
       jButton6.setBackground(Color.orange);
       jButton9.setBackground(Color.orange);
    }
     else if(x1=="0"&& x5==("0") && x9==("0"))
    {
        JOptionPane.showMessageDialog(this, "player 0 is the winner", " Tic tac toe", JOptionPane.INFORMATION_MESSAGE);
        count0++;
        score();
       jButton1.setBackground(Color.orange);
       jButton5.setBackground(Color.orange);
       jButton9.setBackground(Color.orange);
    }
     else if(x3=="0"&& x5==("0") && x7==("0"))
    {
        JOptionPane.showMessageDialog(this, "player 0 is the winner", " Tic tac toe", JOptionPane.INFORMATION_MESSAGE);
        count0++;
        score();
       jButton3.setBackground(Color.orange);
       jButton5.setBackground(Color.orange);
       jButton7.setBackground(Color.orange);
    }
}

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        jButton2 = new javax.swing.JButton();
        jPanel5 = new javax.swing.JPanel();
        jButton3 = new javax.swing.JButton();
        jPanel6 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jPanel7 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jPanel8 = new javax.swing.JPanel();
        jButton4 = new javax.swing.JButton();
        jPanel9 = new javax.swing.JPanel();
        jButton5 = new javax.swing.JButton();
        jPanel10 = new javax.swing.JPanel();
        jButton6 = new javax.swing.JButton();
        jPanel11 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jPanel12 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jPanel13 = new javax.swing.JPanel();
        jButton7 = new javax.swing.JButton();
        jPanel14 = new javax.swing.JPanel();
        jButton8 = new javax.swing.JButton();
        jPanel15 = new javax.swing.JPanel();
        jButton9 = new javax.swing.JButton();
        jPanel16 = new javax.swing.JPanel();
        jButton10 = new javax.swing.JButton();
        jPanel17 = new javax.swing.JPanel();
        jButton11 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("TIC TAC TOE");

        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        jPanel1.setForeground(new java.awt.Color(153, 153, 153));
        jPanel1.setLayout(new java.awt.BorderLayout());

        jLabel1.setFont(new java.awt.Font("Tempus Sans ITC", 1, 48)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("tic tac toe");
        jPanel1.add(jLabel1, java.awt.BorderLayout.PAGE_START);

        jPanel2.setBackground(new java.awt.Color(0, 0, 0));
        jPanel2.setLayout(new java.awt.GridLayout(3, 5, 2, 2));

        jPanel3.setBackground(new java.awt.Color(204, 204, 204));

        jButton1.setFont(new java.awt.Font("Tahoma", 1, 48)); // NOI18N
        jButton1.setText(" ");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jButton1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 256, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, 206, Short.MAX_VALUE)
        );

        jPanel2.add(jPanel3);

        jPanel4.setBackground(new java.awt.Color(204, 204, 204));

        jButton2.setFont(new java.awt.Font("Tahoma", 1, 48)); // NOI18N
        jButton2.setText(" ");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jButton2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 256, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jButton2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 206, Short.MAX_VALUE)
        );

        jPanel2.add(jPanel4);

        jPanel5.setBackground(new java.awt.Color(204, 204, 204));

        jButton3.setFont(new java.awt.Font("Tahoma", 1, 48)); // NOI18N
        jButton3.setText(" ");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jButton3, javax.swing.GroupLayout.DEFAULT_SIZE, 256, Short.MAX_VALUE)
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jButton3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 206, Short.MAX_VALUE)
        );

        jPanel2.add(jPanel5);

        jPanel6.setBackground(new java.awt.Color(204, 204, 204));

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Player X:");

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(61, 61, 61)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(70, Short.MAX_VALUE))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(55, 55, 55)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(65, Short.MAX_VALUE))
        );

        jPanel2.add(jPanel6);

        jPanel7.setBackground(new java.awt.Color(204, 204, 204));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText(" ");

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 256, Short.MAX_VALUE)
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 206, Short.MAX_VALUE)
        );

        jPanel2.add(jPanel7);

        jPanel8.setBackground(new java.awt.Color(204, 204, 204));

        jButton4.setFont(new java.awt.Font("Tahoma", 1, 48)); // NOI18N
        jButton4.setText(" ");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jButton4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 256, Short.MAX_VALUE)
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jButton4, javax.swing.GroupLayout.DEFAULT_SIZE, 206, Short.MAX_VALUE)
        );

        jPanel2.add(jPanel8);

        jPanel9.setBackground(new java.awt.Color(204, 204, 204));

        jButton5.setFont(new java.awt.Font("Tahoma", 1, 48)); // NOI18N
        jButton5.setText(" ");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jButton5, javax.swing.GroupLayout.DEFAULT_SIZE, 256, Short.MAX_VALUE)
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jButton5, javax.swing.GroupLayout.DEFAULT_SIZE, 206, Short.MAX_VALUE)
        );

        jPanel2.add(jPanel9);

        jPanel10.setBackground(new java.awt.Color(204, 204, 204));

        jButton6.setFont(new java.awt.Font("Tahoma", 1, 48)); // NOI18N
        jButton6.setText(" ");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel10Layout = new javax.swing.GroupLayout(jPanel10);
        jPanel10.setLayout(jPanel10Layout);
        jPanel10Layout.setHorizontalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jButton6, javax.swing.GroupLayout.DEFAULT_SIZE, 256, Short.MAX_VALUE)
        );
        jPanel10Layout.setVerticalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jButton6, javax.swing.GroupLayout.DEFAULT_SIZE, 206, Short.MAX_VALUE)
        );

        jPanel2.add(jPanel10);

        jPanel11.setBackground(new java.awt.Color(204, 204, 204));

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Player 0:");

        javax.swing.GroupLayout jPanel11Layout = new javax.swing.GroupLayout(jPanel11);
        jPanel11.setLayout(jPanel11Layout);
        jPanel11Layout.setHorizontalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel11Layout.createSequentialGroup()
                .addContainerGap(51, Short.MAX_VALUE)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(48, 48, 48))
        );
        jPanel11Layout.setVerticalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel11Layout.createSequentialGroup()
                .addGap(59, 59, 59)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(70, Short.MAX_VALUE))
        );

        jPanel2.add(jPanel11);

        jPanel12.setBackground(new java.awt.Color(204, 204, 204));

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText(" ");

        javax.swing.GroupLayout jPanel12Layout = new javax.swing.GroupLayout(jPanel12);
        jPanel12.setLayout(jPanel12Layout);
        jPanel12Layout.setHorizontalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, 256, Short.MAX_VALUE)
        );
        jPanel12Layout.setVerticalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 206, Short.MAX_VALUE)
        );

        jPanel2.add(jPanel12);

        jPanel13.setBackground(new java.awt.Color(204, 204, 204));

        jButton7.setFont(new java.awt.Font("Tahoma", 1, 48)); // NOI18N
        jButton7.setText(" ");
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel13Layout = new javax.swing.GroupLayout(jPanel13);
        jPanel13.setLayout(jPanel13Layout);
        jPanel13Layout.setHorizontalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jButton7, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 256, Short.MAX_VALUE)
        );
        jPanel13Layout.setVerticalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jButton7, javax.swing.GroupLayout.DEFAULT_SIZE, 206, Short.MAX_VALUE)
        );

        jPanel2.add(jPanel13);

        jPanel14.setBackground(new java.awt.Color(204, 204, 204));

        jButton8.setFont(new java.awt.Font("Tahoma", 1, 48)); // NOI18N
        jButton8.setText(" ");
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel14Layout = new javax.swing.GroupLayout(jPanel14);
        jPanel14.setLayout(jPanel14Layout);
        jPanel14Layout.setHorizontalGroup(
            jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jButton8, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 256, Short.MAX_VALUE)
        );
        jPanel14Layout.setVerticalGroup(
            jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jButton8, javax.swing.GroupLayout.DEFAULT_SIZE, 206, Short.MAX_VALUE)
        );

        jPanel2.add(jPanel14);

        jPanel15.setBackground(new java.awt.Color(204, 204, 204));

        jButton9.setFont(new java.awt.Font("Tahoma", 1, 48)); // NOI18N
        jButton9.setText(" ");
        jButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton9ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel15Layout = new javax.swing.GroupLayout(jPanel15);
        jPanel15.setLayout(jPanel15Layout);
        jPanel15Layout.setHorizontalGroup(
            jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jButton9, javax.swing.GroupLayout.DEFAULT_SIZE, 256, Short.MAX_VALUE)
        );
        jPanel15Layout.setVerticalGroup(
            jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jButton9, javax.swing.GroupLayout.DEFAULT_SIZE, 206, Short.MAX_VALUE)
        );

        jPanel2.add(jPanel15);

        jPanel16.setBackground(new java.awt.Color(204, 204, 204));

        jButton10.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton10.setText("Reset");
        jButton10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton10ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel16Layout = new javax.swing.GroupLayout(jPanel16);
        jPanel16.setLayout(jPanel16Layout);
        jPanel16Layout.setHorizontalGroup(
            jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jButton10, javax.swing.GroupLayout.DEFAULT_SIZE, 256, Short.MAX_VALUE)
        );
        jPanel16Layout.setVerticalGroup(
            jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jButton10, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 206, Short.MAX_VALUE)
        );

        jPanel2.add(jPanel16);

        jPanel17.setBackground(new java.awt.Color(204, 204, 204));

        jButton11.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton11.setText("Exit");
        jButton11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton11ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel17Layout = new javax.swing.GroupLayout(jPanel17);
        jPanel17.setLayout(jPanel17Layout);
        jPanel17Layout.setHorizontalGroup(
            jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jButton11, javax.swing.GroupLayout.DEFAULT_SIZE, 256, Short.MAX_VALUE)
        );
        jPanel17Layout.setVerticalGroup(
            jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jButton11, javax.swing.GroupLayout.DEFAULT_SIZE, 206, Short.MAX_VALUE)
        );

        jPanel2.add(jPanel17);

        jPanel1.add(jPanel2, java.awt.BorderLayout.CENTER);

        getContentPane().add(jPanel1, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private JFrame frame;
    private void jButton11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton11ActionPerformed
        // TODO add your handling code here:
        frame=new JFrame("Exit");
        
        
        if(JOptionPane.showConfirmDialog(frame, " confirm if u want to exit","tic tac toe",JOptionPane.YES_NO_OPTION)==JOptionPane.YES_NO_OPTION);
        {
         System.exit(0);   
        }
        
    }//GEN-LAST:event_jButton11ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        
        jButton1.setText(StartGame);

        if(StartGame.equalsIgnoreCase("X"))
           {
               jButton1.setForeground(Color.MAGENTA);
            
           }
       else
           {
           jButton1.setForeground(Color.RED);
           }
           choosePlayer();
           winner();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed

   jButton2.setText(StartGame);

        if(StartGame.equalsIgnoreCase("X"))
           {
               jButton2.setForeground(Color.MAGENTA);
            
           }
       else
           {
           jButton2.setForeground(Color.RED);
           }
           choosePlayer();        // TODO add your handling code here:
           winner();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed

   jButton3.setText(StartGame);

        if(StartGame.equalsIgnoreCase("X"))
           {
               jButton3.setForeground(Color.MAGENTA);
            
           }
       else
           {
           jButton3.setForeground(Color.RED);
           }
           choosePlayer();        // TODO add your handling code here:
           winner();
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
   jButton4.setText(StartGame);

        if(StartGame.equalsIgnoreCase("X"))
           {
               jButton4.setForeground(Color.MAGENTA);
            
           }
       else
           {
           jButton4.setForeground(Color.RED);
           }
           choosePlayer();        // TODO add your handling code here:
           winner();
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
         // TODO add your handling code here:
         
            jButton5.setText(StartGame);

        if(StartGame.equalsIgnoreCase("X"))
           {
               jButton5.setForeground(Color.MAGENTA);
            
           }
       else
           {
           jButton5.setForeground(Color.RED);
           }
           choosePlayer();
           winner();
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
  
        // TODO add your handling code here:
           jButton6.setText(StartGame);

        if(StartGame.equalsIgnoreCase("X"))
           {
               jButton6.setForeground(Color.MAGENTA);
            
           }
       else
           {
           jButton6.setForeground(Color.RED);
           }
           choosePlayer();
           winner();
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        // TODO add your handling code here:
           jButton7.setText(StartGame);

        if(StartGame.equalsIgnoreCase("X"))
           {
               jButton7.setForeground(Color.MAGENTA);
            
           }
       else
           {
           jButton7.setForeground(Color.RED);
           }
           choosePlayer();
           winner();
    }//GEN-LAST:event_jButton7ActionPerformed

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
        // TODO add your handling code here:
        
           jButton8.setText(StartGame);

        if(StartGame.equalsIgnoreCase("X"))
           {
               jButton8.setForeground(Color.MAGENTA);
            
           }
       else
           {
           jButton8.setForeground(Color.RED);
           }
           choosePlayer();
           winner();
    }//GEN-LAST:event_jButton8ActionPerformed

    private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton9ActionPerformed
        // TODO add your handling code here:
           jButton9.setText(StartGame);

     /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tiktactoe;

import java.awt.Color;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author Asma Maqbool
 */
public class ticTacToee_s extends javax.swing.JFrame {

    
    private String StartGame="X";
    private int countx=0;
     private int count0=0;
    /**
     * Creates new form ticTacToee_s
     */
    public ticTacToee_s() {
        initComponents();
        setSize(1200,600);
        setLocationRelativeTo(null);
    }
private void score()
{
    jLabel3.setText(String.valueOf(countx));
    jLabel5.setText(String.valueOf(count0));
}
private void choosePlayer()
{
    if(StartGame.equalsIgnoreCase("X"))
    {
        StartGame="0";
        
    }
    else
    {
        StartGame="X";
    }
}
private void winner()
{
    String x1=jButton1.getText();
    String x2=jButton2.getText();
    String x3=jButton3.getText();
    
    String x4=jButton4.getText();
    String x5=jButton5.getText();
    String x6=jButton6.getText();
    
    String x7=jButton7.getText();
    String x8=jButton8.getText();
    String x9=jButton9.getText();
    if(x1=="X"&& x2==("X") && x3==("X"))
    {
        JOptionPane.showMessageDialog(this, "player X is the winner", " Tic tac toe", JOptionPane.INFORMATION_MESSAGE);
        countx++;
        score();
       jButton1.setBackground(Color.orange);
       jButton2.setBackground(Color.orange);
       jButton3.setBackground(Color.orange);
    }
    
    else if(x4=="X"&& x5==("X") && x6==("X"))
    {
        JOptionPane.showMessageDialog(this, "player X is the winner", " Tic tac toe", JOptionPane.INFORMATION_MESSAGE);
        countx++;
        score();
       jButton4.setBackground(Color.orange);
       jButton5.setBackground(Color.orange);
       jButton6.setBackground(Color.orange);
    }
     else if(x7=="X"&& x8==("X") && x9==("X"))
    {
        JOptionPane.showMessageDialog(this, "player X is the winner", " Tic tac toe", JOptionPane.INFORMATION_MESSAGE);
        countx++;
        score();
       jButton7.setBackground(Color.orange);
       jButton8.setBackground(Color.orange);
       jButton9.setBackground(Color.orange);
    }
     else if(x1=="X"&& x4==("X") && x7==("X"))
    {
        JOptionPane.showMessageDialog(this, "player X is the winner", " Tic tac toe", JOptionPane.INFORMATION_MESSAGE);
        countx++;
        score();
       jButton1.setBackground(Color.orange);
       jButton4.setBackground(Color.orange);
       jButton7.setBackground(Color.orange);
    }
     else if(x2=="X"&& x5==("X") && x8==("X"))
    {
        JOptionPane.showMessageDialog(this, "player X is the winner", " Tic tac toe", JOptionPane.INFORMATION_MESSAGE);
        countx++;
        score();
       jButton2.setBackground(Color.orange);
       jButton5.setBackground(Color.orange);
       jButton8.setBackground(Color.orange);
    }
     else if(x3=="X"&& x6==("X") && x9==("X"))
    {
        JOptionPane.showMessageDialog(this, "player X is the winner", " Tic tac toe", JOptionPane.INFORMATION_MESSAGE);
        countx++;
        score();
       jButton3.setBackground(Color.orange);
       jButton6.setBackground(Color.orange);
       jButton9.setBackground(Color.orange);
    }
     else if(x1=="X"&& x5==("X") && x9==("X"))
    {
        JOptionPane.showMessageDialog(this, "player X is the winner", " Tic tac toe", JOptionPane.INFORMATION_MESSAGE);
        countx++;
        score();
       jButton1.setBackground(Color.orange);
       jButton5.setBackground(Color.orange);
       jButton9.setBackground(Color.orange);
    }
     else if(x3=="X"&& x5==("X") && x7==("X"))
    {
        JOptionPane.showMessageDialog(this, "player X is the winner", " Tic tac toe", JOptionPane.INFORMATION_MESSAGE);
        countx++;
        score();
       jButton3.setBackground(Color.orange);
       jButton5.setBackground(Color.orange);
       jButton7.setBackground(Color.orange);
    }
    //zeroooo
    
    
     else if(x1=="0"&& x2==("0") && x3==("0"))
    {
        JOptionPane.showMessageDialog(this, "player 0 is the winner", " Tic tac toe", JOptionPane.INFORMATION_MESSAGE);
        count0++;
        score();
       jButton1.setBackground(Color.orange);
       jButton2.setBackground(Color.orange);
       jButton3.setBackground(Color.orange);
    }
    
    else if(x4=="0"&& x5==("0") && x6==("0"))
    {
        JOptionPane.showMessageDialog(this, "player 0 is the winner", " Tic tac toe", JOptionPane.INFORMATION_MESSAGE);
        count0++;
        score();
       jButton4.setBackground(Color.orange);
       jButton5.setBackground(Color.orange);
       jButton6.setBackground(Color.orange);
    }
     else if(x7=="0"&& x8==("0") && x9==("0"))
    {
        JOptionPane.showMessageDialog(this, "player 0 is the winner", " Tic tac toe", JOptionPane.INFORMATION_MESSAGE);
        count0++;
        score();
       jButton7.setBackground(Color.orange);
       jButton8.setBackground(Color.orange);
       jButton9.setBackground(Color.orange);
    }
     else if(x1=="0"&& x4==("0") && x7==("0"))
    {
        JOptionPane.showMessageDialog(this, "player 0 is the winner", " Tic tac toe", JOptionPane.INFORMATION_MESSAGE);
        count0++;
        score();
       jButton1.setBackground(Color.orange);
       jButton4.setBackground(Color.orange);
       jButton7.setBackground(Color.orange);
    }
     else if(x2=="0"&& x5==("0") && x8==("0"))
    {
        JOptionPane.showMessageDialog(this, "player 0 is the winner", " Tic tac toe", JOptionPane.INFORMATION_MESSAGE);
        count0++;
        score();
       jButton2.setBackground(Color.orange);
       jButton5.setBackground(Color.orange);
       jButton8.setBackground(Color.orange);
    }
     else if(x3=="0"&& x6==("0") && x9==("0"))
    {
        JOptionPane.showMessageDialog(this, "player 0 is the winner", " Tic tac toe", JOptionPane.INFORMATION_MESSAGE);
        count0++;
        score();
       jButton3.setBackground(Color.orange);
       jButton6.setBackground(Color.orange);
       jButton9.setBackground(Color.orange);
    }
     else if(x1=="0"&& x5==("0") && x9==("0"))
    {
        JOptionPane.showMessageDialog(this, "player 0 is the winner", " Tic tac toe", JOptionPane.INFORMATION_MESSAGE);
        count0++;
        score();
       jButton1.setBackground(Color.orange);
       jButton5.setBackground(Color.orange);
       jButton9.setBackground(Color.orange);
    }
     else if(x3=="0"&& x5==("0") && x7==("0"))
    {
        JOptionPane.showMessageDialog(this, "player 0 is the winner", " Tic tac toe", JOptionPane.INFORMATION_MESSAGE);
        count0++;
        score();
       jButton3.setBackground(Color.orange);
       jButton5.setBackground(Color.orange);
       jButton7.setBackground(Color.orange);
    }
}

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        jButton2 = new javax.swing.JButton();
        jPanel5 = new javax.swing.JPanel();
        jButton3 = new javax.swing.JButton();
        jPanel6 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jPanel7 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jPanel8 = new javax.swing.JPanel();
        jButton4 = new javax.swing.JButton();
        jPanel9 = new javax.swing.JPanel();
        jButton5 = new javax.swing.JButton();
        jPanel10 = new javax.swing.JPanel();
        jButton6 = new javax.swing.JButton();
        jPanel11 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jPanel12 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jPanel13 = new javax.swing.JPanel();
        jButton7 = new javax.swing.JButton();
        jPanel14 = new javax.swing.JPanel();
        jButton8 = new javax.swing.JButton();
        jPanel15 = new javax.swing.JPanel();
        jButton9 = new javax.swing.JButton();
        jPanel16 = new javax.swing.JPanel();
        jButton10 = new javax.swing.JButton();
        jPanel17 = new javax.swing.JPanel();
        jButton11 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("TIC TAC TOE");

        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        jPanel1.setForeground(new java.awt.Color(153, 153, 153));
        jPanel1.setLayout(new java.awt.BorderLayout());

        jLabel1.setFont(new java.awt.Font("Tempus Sans ITC", 1, 48)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("tic tac toe");
        jPanel1.add(jLabel1, java.awt.BorderLayout.PAGE_START);

        jPanel2.setBackground(new java.awt.Color(0, 0, 0));
        jPanel2.setLayout(new java.awt.GridLayout(3, 5, 2, 2));

        jPanel3.setBackground(new java.awt.Color(204, 204, 204));

        jButton1.setFont(new java.awt.Font("Tahoma", 1, 48)); // NOI18N
        jButton1.setText(" ");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jButton1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 256, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, 206, Short.MAX_VALUE)
        );

        jPanel2.add(jPanel3);

        jPanel4.setBackground(new java.awt.Color(204, 204, 204));

        jButton2.setFont(new java.awt.Font("Tahoma", 1, 48)); // NOI18N
        jButton2.setText(" ");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jButton2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 256, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jButton2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 206, Short.MAX_VALUE)
        );

        jPanel2.add(jPanel4);

        jPanel5.setBackground(new java.awt.Color(204, 204, 204));

        jButton3.setFont(new java.awt.Font("Tahoma", 1, 48)); // NOI18N
        jButton3.setText(" ");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jButton3, javax.swing.GroupLayout.DEFAULT_SIZE, 256, Short.MAX_VALUE)
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jButton3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 206, Short.MAX_VALUE)
        );

        jPanel2.add(jPanel5);

        jPanel6.setBackground(new java.awt.Color(204, 204, 204));

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Player X:");

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(61, 61, 61)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(70, Short.MAX_VALUE))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(55, 55, 55)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(65, Short.MAX_VALUE))
        );

        jPanel2.add(jPanel6);

        jPanel7.setBackground(new java.awt.Color(204, 204, 204));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText(" ");

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 256, Short.MAX_VALUE)
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 206, Short.MAX_VALUE)
        );

        jPanel2.add(jPanel7);

        jPanel8.setBackground(new java.awt.Color(204, 204, 204));

        jButton4.setFont(new java.awt.Font("Tahoma", 1, 48)); // NOI18N
        jButton4.setText(" ");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jButton4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 256, Short.MAX_VALUE)
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jButton4, javax.swing.GroupLayout.DEFAULT_SIZE, 206, Short.MAX_VALUE)
        );

        jPanel2.add(jPanel8);

        jPanel9.setBackground(new java.awt.Color(204, 204, 204));

        jButton5.setFont(new java.awt.Font("Tahoma", 1, 48)); // NOI18N
        jButton5.setText(" ");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jButton5, javax.swing.GroupLayout.DEFAULT_SIZE, 256, Short.MAX_VALUE)
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jButton5, javax.swing.GroupLayout.DEFAULT_SIZE, 206, Short.MAX_VALUE)
        );

        jPanel2.add(jPanel9);

        jPanel10.setBackground(new java.awt.Color(204, 204, 204));

        jButton6.setFont(new java.awt.Font("Tahoma", 1, 48)); // NOI18N
        jButton6.setText(" ");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel10Layout = new javax.swing.GroupLayout(jPanel10);
        jPanel10.setLayout(jPanel10Layout);
        jPanel10Layout.setHorizontalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jButton6, javax.swing.GroupLayout.DEFAULT_SIZE, 256, Short.MAX_VALUE)
        );
        jPanel10Layout.setVerticalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jButton6, javax.swing.GroupLayout.DEFAULT_SIZE, 206, Short.MAX_VALUE)
        );

        jPanel2.add(jPanel10);

        jPanel11.setBackground(new java.awt.Color(204, 204, 204));

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Player 0:");

        javax.swing.GroupLayout jPanel11Layout = new javax.swing.GroupLayout(jPanel11);
        jPanel11.setLayout(jPanel11Layout);
        jPanel11Layout.setHorizontalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel11Layout.createSequentialGroup()
                .addContainerGap(51, Short.MAX_VALUE)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(48, 48, 48))
        );
        jPanel11Layout.setVerticalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel11Layout.createSequentialGroup()
                .addGap(59, 59, 59)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(70, Short.MAX_VALUE))
        );

        jPanel2.add(jPanel11);

        jPanel12.setBackground(new java.awt.Color(204, 204, 204));

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText(" ");

        javax.swing.GroupLayout jPanel12Layout = new javax.swing.GroupLayout(jPanel12);
        jPanel12.setLayout(jPanel12Layout);
        jPanel12Layout.setHorizontalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, 256, Short.MAX_VALUE)
        );
        jPanel12Layout.setVerticalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 206, Short.MAX_VALUE)
        );

        jPanel2.add(jPanel12);

        jPanel13.setBackground(new java.awt.Color(204, 204, 204));

        jButton7.setFont(new java.awt.Font("Tahoma", 1, 48)); // NOI18N
        jButton7.setText(" ");
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel13Layout = new javax.swing.GroupLayout(jPanel13);
        jPanel13.setLayout(jPanel13Layout);
        jPanel13Layout.setHorizontalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jButton7, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 256, Short.MAX_VALUE)
        );
        jPanel13Layout.setVerticalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jButton7, javax.swing.GroupLayout.DEFAULT_SIZE, 206, Short.MAX_VALUE)
        );

        jPanel2.add(jPanel13);

        jPanel14.setBackground(new java.awt.Color(204, 204, 204));

        jButton8.setFont(new java.awt.Font("Tahoma", 1, 48)); // NOI18N
        jButton8.setText(" ");
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel14Layout = new javax.swing.GroupLayout(jPanel14);
        jPanel14.setLayout(jPanel14Layout);
        jPanel14Layout.setHorizontalGroup(
            jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jButton8, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 256, Short.MAX_VALUE)
        );
        jPanel14Layout.setVerticalGroup(
            jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jButton8, javax.swing.GroupLayout.DEFAULT_SIZE, 206, Short.MAX_VALUE)
        );

        jPanel2.add(jPanel14);

        jPanel15.setBackground(new java.awt.Color(204, 204, 204));

        jButton9.setFont(new java.awt.Font("Tahoma", 1, 48)); // NOI18N
        jButton9.setText(" ");
        jButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton9ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel15Layout = new javax.swing.GroupLayout(jPanel15);
        jPanel15.setLayout(jPanel15Layout);
        jPanel15Layout.setHorizontalGroup(
            jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jButton9, javax.swing.GroupLayout.DEFAULT_SIZE, 256, Short.MAX_VALUE)
        );
        jPanel15Layout.setVerticalGroup(
            jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jButton9, javax.swing.GroupLayout.DEFAULT_SIZE, 206, Short.MAX_VALUE)
        );

        jPanel2.add(jPanel15);

        jPanel16.setBackground(new java.awt.Color(204, 204, 204));

        jButton10.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton10.setText("Reset");
        jButton10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton10ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel16Layout = new javax.swing.GroupLayout(jPanel16);
        jPanel16.setLayout(jPanel16Layout);
        jPanel16Layout.setHorizontalGroup(
            jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jButton10, javax.swing.GroupLayout.DEFAULT_SIZE, 256, Short.MAX_VALUE)
        );
        jPanel16Layout.setVerticalGroup(
            jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jButton10, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 206, Short.MAX_VALUE)
        );

        jPanel2.add(jPanel16);

        jPanel17.setBackground(new java.awt.Color(204, 204, 204));

        jButton11.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton11.setText("Exit");
        jButton11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton11ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel17Layout = new javax.swing.GroupLayout(jPanel17);
        jPanel17.setLayout(jPanel17Layout);
        jPanel17Layout.setHorizontalGroup(
            jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jButton11, javax.swing.GroupLayout.DEFAULT_SIZE, 256, Short.MAX_VALUE)
        );
        jPanel17Layout.setVerticalGroup(
            jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jButton11, javax.swing.GroupLayout.DEFAULT_SIZE, 206, Short.MAX_VALUE)
        );

        jPanel2.add(jPanel17);

        jPanel1.add(jPanel2, java.awt.BorderLayout.CENTER);

        getContentPane().add(jPanel1, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private JFrame frame;
    private void jButton11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton11ActionPerformed
        // TODO add your handling code here:
        frame=new JFrame("Exit");
        
        
        if(JOptionPane.showConfirmDialog(frame, " confirm if u want to exit","tic tac toe",JOptionPane.YES_NO_OPTION)==JOptionPane.YES_NO_OPTION);
        {
         System.exit(0);   
        }
        
    }//GEN-LAST:event_jButton11ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        
        jButton1.setText(StartGame);

        if(StartGame.equalsIgnoreCase("X"))
           {
               jButton1.setForeground(Color.MAGENTA);
            
           }
       else
           {
           jButton1.setForeground(Color.RED);
           }
           choosePlayer();
           winner();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed

   jButton2.setText(StartGame);

        if(StartGame.equalsIgnoreCase("X"))
           {
               jButton2.setForeground(Color.MAGENTA);
            
           }
       else
           {
           jButton2.setForeground(Color.RED);
           }
           choosePlayer();        // TODO add your handling code here:
           winner();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed

   jButton3.setText(StartGame);

        if(StartGame.equalsIgnoreCase("X"))
           {
               jButton3.setForeground(Color.MAGENTA);
            
           }
       else
           {
           jButton3.setForeground(Color.RED);
           }
           choosePlayer();        // TODO add your handling code here:
           winner();
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
   jButton4.setText(StartGame);

        if(StartGame.equalsIgnoreCase("X"))
           {
               jButton4.setForeground(Color.MAGENTA);
            
           }
       else
           {
           jButton4.setForeground(Color.RED);
           }
           choosePlayer();        // TODO add your handling code here:
           winner();
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
         // TODO add your handling code here:
         
            jButton5.setText(StartGame);

        if(StartGame.equalsIgnoreCase("X"))
           {
               jButton5.setForeground(Color.MAGENTA);
            
           }
       else
           {
           jButton5.setForeground(Color.RED);
           }
           choosePlayer();
           winner();
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
  
        // TODO add your handling code here:
           jButton6.setText(StartGame);

        if(StartGame.equalsIgnoreCase("X"))
           {
               jButton6.setForeground(Color.MAGENTA);
            
           }
       else
           {
           jButton6.setForeground(Color.RED);
           }
           choosePlayer();
           winner();
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        // TODO add your handling code here:
           jButton7.setText(StartGame);

        if(StartGame.equalsIgnoreCase("X"))
           {
               jButton7.setForeground(Color.MAGENTA);
            
           }
       else
           {
           jButton7.setForeground(Color.RED);
           }
           choosePlayer();
           winner();
    }//GEN-LAST:event_jButton7ActionPerformed

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
        // TODO add your handling code here:
        
           jButton8.setText(StartGame);

        if(StartGame.equalsIgnoreCase("X"))
           {
               jButton8.setForeground(Color.MAGENTA);
            
           }
       else
           {
           jButton8.setForeground(Color.RED);
           }
           choosePlayer();
           winner();
    }//GEN-LAST:event_jButton8ActionPerformed

    private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton9ActionPerformed
        // TODO add your handling code here:
           jButton9.setText(StartGame);

        if(StartGame.equalsIgnoreCase("X"))
           {
               jButton9.setForeground(Color.MAGENTA);
            
           }
       else
           {
           jButton9.setForeground(Color.RED);
           }
           choosePlayer();
           winner();
    }//GEN-LAST:event_jButton9ActionPerformed

    private void jButton10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton10ActionPerformed
        // TODO add your handling code here:
        jButton1.setText(null);
        jButton2.setText(null);
        jButton3.setText(null);
        
        jButton4.setText(null);
        jButton5.setText(null);
        jButton6.setText(null);
        
        jButton7.setText(null);
        jButton8.setText(null);
        jButton9.setText(null);
        
        jButton1.setBackground(Color.lightGray);
        jButton2.setBackground(Color.lightGray);
        jButton3.setBackground(Color.lightGray);
        
        jButton4.setBackground(Color.lightGray);
        jButton5.setBackground(Color.lightGray);
        jButton6.setBackground(Color.lightGray);
        
        
        jButton7.setBackground(Color.lightGray);
        jButton8.setBackground(Color.lightGray);
        jButton9.setBackground(Color.lightGray);
        
        
        
    }//GEN-LAST:event_jButton10ActionPerformed

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
            java.util.logging.Logger.getLogger(ticTacToee_s.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ticTacToee_s.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ticTacToee_s.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ticTacToee_s.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ticTacToee_s().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton10;
    private javax.swing.JButton jButton11;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel12;
    private javax.swing.JPanel jPanel13;
    private javax.swing.JPanel jPanel14;
    private javax.swing.JPanel jPanel15;
    private javax.swing.JPanel jPanel16;
    private javax.swing.JPanel jPanel17;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    // End of variables declaration//GEN-END:variables
}
