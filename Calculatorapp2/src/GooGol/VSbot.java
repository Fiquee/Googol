package GooGol;

import java.util.Random;
import javax.swing.JOptionPane;

public class VSbot extends javax.swing.JFrame {

    Random r = new Random();
    int turn = 2,p1score=0,p2score=0;
    int buttonused[] = {0,0,0,0,0,0,0,0,0};
    int p1move[] = {0,0,0,0,0,0,0,0,0};
    int p2move[] = {0,0,0,0,0,0,0,0,0};
    
    int p1win(){
        if(p1move[0] == 1 && p1move[1] == 1 && p1move[2] == 1){
            return 1;
        }
        if(p1move[3] == 1 && p1move[4] == 1 && p1move[5] == 1){
            return 1;
        }
        if(p1move[6] == 1 && p1move[7] == 1 && p1move[8] == 1){
            return 1;
        }
        if(p1move[0] == 1 && p1move[3] == 1 && p1move[6] == 1){
            return 1;
        }
        if(p1move[1] == 1 && p1move[4] == 1 && p1move[7] == 1){
            return 1;
        }
        if(p1move[2] == 1 && p1move[5] == 1 && p1move[8] == 1){
            return 1;
        }
        if(p1move[0] == 1 && p1move[4] == 1 && p1move[8] == 1){
            return 1;
        }
        if(p1move[2] == 1 && p1move[4] == 1 && p1move[6] == 1){
            return 1;
        }
        return 0;
    }
    
    int p2win(){
        if(p2move[0] == 1 && p2move[1] == 1 && p2move[2] == 1){
            return 1;
        }
        if(p2move[3] == 1 && p2move[4] == 1 && p2move[5] == 1){
            return 1;
        }
        if(p2move[6] == 1 && p2move[7] == 1 && p2move[8] == 1){
            return 1;
        }
        if(p2move[0] == 1 && p2move[3] == 1 && p2move[6] == 1){
            return 1;
        }
        if(p2move[1] == 1 && p2move[4] == 1 && p2move[7] == 1){
            return 1;
        }
        if(p2move[2] == 1 && p2move[5] == 1 && p2move[8] == 1){
            return 1;
        }
        if(p2move[0] == 1 && p2move[4] == 1 && p2move[8] == 1){
            return 1;
        }
        if(p2move[2] == 1 && p2move[4] == 1 && p2move[6] == 1){
            return 1;
        }
        return 0;
    }
    
    int draw(){
        if (buttonused[0] == 1 && buttonused[1] == 1 && buttonused[2] == 1 && buttonused[3] == 1 && buttonused[4] == 1 && buttonused[5] == 1 && buttonused[6] == 1 && buttonused[7] == 1 && buttonused[8] == 1) {
            return 1;
        }
        return 0;
    }
    
    void displayscore(){
        String sc1 = Integer.toString(p1score);
        String sc2 = Integer.toString(p2score);
        PlayerScore.setText(sc1);
        ComputerScore.setText(sc2);
    }
    
    void compwin(java.awt.event.ActionEvent evt){
        if (buttonused[0] == 0 && p2move[1] == 1 && p2move[2] == 1) {
            b1ActionPerformed(evt);
        }
        else if (buttonused[1] == 0 && p2move[0] == 1 && p2move[2] == 1) {
            b2ActionPerformed(evt);
        }
        else if (buttonused[2] == 0 && p2move[1] == 1 && p2move[0] == 1) {
            b3ActionPerformed(evt);
        }
        else if (buttonused[3] == 0 && p2move[4] == 1 && p2move[5] == 1) {
            b4ActionPerformed(evt);
        }
        else if (buttonused[4] == 0 && p2move[3] == 1 && p2move[5] == 1) {
            b5ActionPerformed(evt);
        }
        else if (buttonused[5] == 0 && p2move[4] == 1 && p2move[3] == 1) {
            b6ActionPerformed(evt);
        }
        else if (buttonused[6] == 0 && p2move[7] == 1 && p2move[8] == 1) {
            b7ActionPerformed(evt);
        }
        else if (buttonused[7] == 0 && p2move[6] == 1 && p2move[8] == 1) {
            b8ActionPerformed(evt);
        }
        else if (buttonused[8] == 0 && p2move[7] == 1 && p2move[6] == 1) {
            b9ActionPerformed(evt);
        }
        else if (buttonused[0] == 0 && p2move[3] == 1 && p2move[6] == 1) {
            b1ActionPerformed(evt);
        }
        else if (buttonused[3] == 0 && p2move[0] == 1 && p2move[6] == 1) {
            b4ActionPerformed(evt);
        }
        else if (buttonused[6] == 0 && p2move[3] == 1 && p2move[0] == 1) {
            b7ActionPerformed(evt);
        }
        else if (buttonused[1] == 0 && p2move[4] == 1 && p2move[7] == 1) {
            b2ActionPerformed(evt);
        }
        else if (buttonused[4] == 0 && p2move[1] == 1 && p2move[7] == 1) {
            b5ActionPerformed(evt);
        }
        else if (buttonused[7] == 0 && p2move[4] == 1 && p2move[1] == 1) {
            b8ActionPerformed(evt);
        }
        else if (buttonused[2] == 0 && p2move[5] == 1 && p2move[8] == 1) {
            b3ActionPerformed(evt);
        }
        else if (buttonused[5] == 0 && p2move[2] == 1 && p2move[8] == 1) {
            b6ActionPerformed(evt);
        }
        else if (buttonused[8] == 0 && p2move[5] == 1 && p2move[2] == 1) {
            b9ActionPerformed(evt);
        }
        else if (buttonused[0] == 0 && p2move[4] == 1 && p2move[8] == 1) {
            b1ActionPerformed(evt);
        }
        else if (buttonused[4] == 0 && p2move[0] == 1 && p2move[8] == 1) {
            b5ActionPerformed(evt);
        }
        else if (buttonused[8] == 0 && p2move[4] == 1 && p2move[0] == 1) {
            b9ActionPerformed(evt);
        }
        else if (buttonused[2] == 0 && p2move[4] == 1 && p2move[6] == 1) {
            b3ActionPerformed(evt);
        }
        else if (buttonused[4] == 0 && p2move[2] == 1 && p2move[6] == 1) {
            b5ActionPerformed(evt);
        }
        else if (buttonused[6] == 0 && p2move[4] == 1 && p2move[2] == 1) {
            b7ActionPerformed(evt);
        }
        else {
            compblock(evt);
        }
    }
    
    void compblock(java.awt.event.ActionEvent evt){
        if (buttonused[0] == 0 && p1move[1] == 1 && p1move[2] == 1) {
            b1ActionPerformed(evt);
        }
        else if (buttonused[1] == 0 && p1move[0] == 1 && p1move[2] == 1) {
            b2ActionPerformed(evt);
        }
        else if (buttonused[2] == 0 && p1move[1] == 1 && p1move[0] == 1) {
            b3ActionPerformed(evt);
        }
        else if (buttonused[3] == 0 && p1move[4] == 1 && p1move[5] == 1) {
            b4ActionPerformed(evt);
        }
        else if (buttonused[4] == 0 && p1move[3] == 1 && p1move[5] == 1) {
            b5ActionPerformed(evt);
        }
        else if (buttonused[5] == 0 && p1move[4] == 1 && p1move[3] == 1) {
            b6ActionPerformed(evt);
        }
        else if (buttonused[6] == 0 && p1move[7] == 1 && p1move[8] == 1) {
            b7ActionPerformed(evt);
        }
        else if (buttonused[7] == 0 && p1move[6] == 1 && p1move[8] == 1) {
            b8ActionPerformed(evt);
        }
        else if (buttonused[8] == 0 && p1move[7] == 1 && p1move[6] == 1) {
            b9ActionPerformed(evt);
        }
        else if (buttonused[0] == 0 && p1move[3] == 1 && p1move[6] == 1) {
            b1ActionPerformed(evt);
        }
        else if (buttonused[3] == 0 && p1move[0] == 1 && p1move[6] == 1) {
            b4ActionPerformed(evt);
        }
        else if (buttonused[6] == 0 && p1move[3] == 1 && p1move[0] == 1) {
            b7ActionPerformed(evt);
        }
        else if (buttonused[1] == 0 && p1move[4] == 1 && p1move[7] == 1) {
            b2ActionPerformed(evt);
        }
        else if (buttonused[4] == 0 && p1move[1] == 1 && p1move[7] == 1) {
            b5ActionPerformed(evt);
        }
        else if (buttonused[7] == 0 && p1move[4] == 1 && p1move[1] == 1) {
            b8ActionPerformed(evt);
        }
        else if (buttonused[2] == 0 && p1move[5] == 1 && p1move[8] == 1) {
            b3ActionPerformed(evt);
        }
        else if (buttonused[5] == 0 && p1move[2] == 1 && p1move[8] == 1) {
            b6ActionPerformed(evt);
        }
        else if (buttonused[8] == 0 && p1move[5] == 1 && p1move[2] == 1) {
            b9ActionPerformed(evt);
        }
        else if (buttonused[0] == 0 && p1move[4] == 1 && p1move[8] == 1) {
            b1ActionPerformed(evt);
        }
        else if (buttonused[4] == 0 && p1move[0] == 1 && p1move[8] == 1) {
            b5ActionPerformed(evt);
        }
        else if (buttonused[8] == 0 && p1move[4] == 1 && p1move[0] == 1) {
            b9ActionPerformed(evt);
        }
        else if (buttonused[2] == 0 && p1move[4] == 1 && p1move[6] == 1) {
            b3ActionPerformed(evt);
        }
        else if (buttonused[4] == 0 && p1move[2] == 1 && p1move[6] == 1) {
            b5ActionPerformed(evt);
        }
        else if (buttonused[6] == 0 && p1move[4] == 1 && p1move[2] == 1) {
            b7ActionPerformed(evt);
        }
        else {
            comprandom(evt);
        }
    }
    
    void comprandom(java.awt.event.ActionEvent evt){
        while(true){
            int rand=r.nextInt(9);
            if (rand==0 && buttonused[0]==0) {
                b1ActionPerformed(evt);
                break;
            }
            else if (rand==1 && buttonused[1]==0) {
                b2ActionPerformed(evt);
                break;
            }
            else if (rand==2 && buttonused[2]==0) {
                b3ActionPerformed(evt);
                break;
            }
            else if (rand==3 && buttonused[3]==0) {
                b4ActionPerformed(evt);
                break;
            }
            else if (rand==4 && buttonused[4]==0) {
                b5ActionPerformed(evt);
                break;
            }
            else if (rand==5 && buttonused[5]==0) {
                b6ActionPerformed(evt);
                break;
            }
            else if (rand==6 && buttonused[6]==0) {
                b7ActionPerformed(evt);
                break;
            }
            else if (rand==7 && buttonused[7]==0) {
                b8ActionPerformed(evt);
                break;
            }
            else if (rand==8 && buttonused[8]==0) {
                b9ActionPerformed(evt);
                break;
            }
        }
    }
    
    void reset(){
        b1.setText("");
        b2.setText("");
        b3.setText("");
        b4.setText("");
        b5.setText("");
        b6.setText("");
        b7.setText("");
        b8.setText("");
        b9.setText("");
        turn = 2;
        for (int i = 0; i < 9; i++) {
            buttonused[i] = 0;
            p1move[i]=0;
            p2move[i]=0;
        }
    }
    
    public VSbot() {
        initComponents();
        
        jLabel1.setIcon(new javax.swing.ImageIcon("VSbot Background.jpg"));; // NOI18N
        jLabel1.setText("jLabel1");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(0, 0, 700, 430);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        b1 = new javax.swing.JButton();
        b4 = new javax.swing.JButton();
        b7 = new javax.swing.JButton();
        b5 = new javax.swing.JButton();
        b2 = new javax.swing.JButton();
        b8 = new javax.swing.JButton();
        b6 = new javax.swing.JButton();
        b3 = new javax.swing.JButton();
        b9 = new javax.swing.JButton();
        Player = new javax.swing.JLabel();
        Computer = new javax.swing.JLabel();
        PlayerScore = new javax.swing.JLabel();
        ComputerScore = new javax.swing.JLabel();
        NewGame = new javax.swing.JButton();
        FirstTurn = new javax.swing.JButton();
        SecondTurn = new javax.swing.JButton();
        SelectTurn = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("TicTacToe");
        setMinimumSize(new java.awt.Dimension(700, 460));
        setPreferredSize(new java.awt.Dimension(700, 460));
        getContentPane().setLayout(null);

        b1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        b1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b1ActionPerformed(evt);
            }
        });
        getContentPane().add(b1);
        b1.setBounds(20, 60, 90, 90);

        b4.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        b4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b4ActionPerformed(evt);
            }
        });
        getContentPane().add(b4);
        b4.setBounds(20, 170, 90, 90);

        b7.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        b7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b7ActionPerformed(evt);
            }
        });
        getContentPane().add(b7);
        b7.setBounds(20, 280, 90, 90);

        b5.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        b5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b5ActionPerformed(evt);
            }
        });
        getContentPane().add(b5);
        b5.setBounds(128, 170, 94, 90);

        b2.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        b2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b2ActionPerformed(evt);
            }
        });
        getContentPane().add(b2);
        b2.setBounds(128, 60, 94, 90);

        b8.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        b8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b8ActionPerformed(evt);
            }
        });
        getContentPane().add(b8);
        b8.setBounds(128, 280, 94, 90);

        b6.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        b6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b6ActionPerformed(evt);
            }
        });
        getContentPane().add(b6);
        b6.setBounds(240, 170, 90, 90);

        b3.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        b3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b3ActionPerformed(evt);
            }
        });
        getContentPane().add(b3);
        b3.setBounds(240, 60, 90, 90);

        b9.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        b9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b9ActionPerformed(evt);
            }
        });
        getContentPane().add(b9);
        b9.setBounds(240, 280, 91, 90);

        Player.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        Player.setForeground(java.awt.Color.white);
        Player.setText("PLAYER:");
        getContentPane().add(Player);
        Player.setBounds(392, 60, 150, 60);

        Computer.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        Computer.setForeground(java.awt.Color.white);
        Computer.setText("COMPUTER:");
        getContentPane().add(Computer);
        Computer.setBounds(392, 170, 150, 60);

        PlayerScore.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        PlayerScore.setForeground(java.awt.Color.white);
        PlayerScore.setText("0");
        getContentPane().add(PlayerScore);
        PlayerScore.setBounds(548, 60, 80, 60);

        ComputerScore.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        ComputerScore.setForeground(java.awt.Color.white);
        ComputerScore.setText("0");
        getContentPane().add(ComputerScore);
        ComputerScore.setBounds(548, 170, 80, 60);

        NewGame.setText("New Game");
        NewGame.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NewGameActionPerformed(evt);
            }
        });
        getContentPane().add(NewGame);
        NewGame.setBounds(128, 388, 94, 21);

        FirstTurn.setText("1st");
        FirstTurn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FirstTurnActionPerformed(evt);
            }
        });
        getContentPane().add(FirstTurn);
        FirstTurn.setBounds(478, 338, 47, 21);

        SecondTurn.setText("2nd");
        SecondTurn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SecondTurnActionPerformed(evt);
            }
        });
        getContentPane().add(SecondTurn);
        SecondTurn.setBounds(546, 338, 49, 21);

        SelectTurn.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        SelectTurn.setForeground(java.awt.Color.white);
        SelectTurn.setText("Select Turn:");
        getContentPane().add(SelectTurn);
        SelectTurn.setBounds(392, 345, 76, 17);

        jButton1.setText("Back");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(240, 388, 55, 21);

        jLabel1.setText("jLabel1");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(0, 0, 700, 430);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void b1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b1ActionPerformed
        // TODO add your handling code here:
        if(buttonused[0] == 0){
        if(turn %2 == 0){
            turn += 1;
            b1.setText("X");
            buttonused[0] = 1;
            p1move[0] = 1;
            int result1 = p1win();
            int result3 = draw();
            if(result1 == 1){
                JOptionPane.showMessageDialog(rootPane,"You Win!");
                p1score++;
                displayscore();
                reset();
            }
            else if (result3 == 1) {
                JOptionPane.showMessageDialog(rootPane,"DRAW!!!");
                displayscore();
                reset();
            }
            else {
                compwin(evt);
            }
        }
        if(turn %2 != 0){
            turn += 1;
            b1.setText("O");
            buttonused[0] = 1;
            p2move[0] = 1;
            int result2 = p2win();
            int result3 = draw();
            if (result2 == 1) {
                JOptionPane.showMessageDialog(rootPane,"Computer Win!");
                p2score++;
                displayscore();
                reset();
            }
            else if (result3 == 1) {
                JOptionPane.showMessageDialog(rootPane,"DRAW!!!");
                displayscore();
                reset();
            }
        }
        }
        else{
            JOptionPane.showMessageDialog(rootPane, "This Move Has Already Been Played");
        }
    }//GEN-LAST:event_b1ActionPerformed

    private void b4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b4ActionPerformed
        // TODO add your handling code here:
        if(buttonused[3] == 0){
        if(turn %2 == 0){
            turn += 1;
            b4.setText("X");
            buttonused[3] = 1;
            p1move[3] = 1;
            int result1 = p1win();
            int result3 = draw();
            if(result1 == 1){
                JOptionPane.showMessageDialog(rootPane,"You Win!");
                p1score++;
                displayscore();
                reset();
            }
            else if (result3 == 1) {
                JOptionPane.showMessageDialog(rootPane,"DRAW!!!");
                displayscore();
                reset();
            }
            else {
                compwin(evt);
            }
        }
        if(turn %2 != 0){
            turn += 1;
            b4.setText("O");
            buttonused[3] = 1;
            p2move[3] = 1;
            int result2 = p2win();
            int result3 = draw();
            if (result2 == 1) {
                JOptionPane.showMessageDialog(rootPane,"Computer Win!");
                p2score++;
                displayscore();
                reset();
            }
            else if (result3 == 1) {
                JOptionPane.showMessageDialog(rootPane,"DRAW!!!");
                displayscore();
                reset();
            }
        }
        }
        else{
            JOptionPane.showMessageDialog(rootPane, "This Move Has Already Been Played");
        }
    }//GEN-LAST:event_b4ActionPerformed

    private void b7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b7ActionPerformed
        // TODO add your handling code here:
        if(buttonused[6] == 0){
        if(turn %2 == 0){
            turn += 1;
            b7.setText("X");
            buttonused[6] = 1;
            p1move[6] = 1;
            int result1 = p1win();
            int result3 = draw();
            if(result1 == 1){
                JOptionPane.showMessageDialog(rootPane,"You Win!");
                p1score++;
                displayscore();
                reset();
            }
            else if (result3 == 1) {
                JOptionPane.showMessageDialog(rootPane,"DRAW!!!");
                displayscore();
                reset();
            }
            else {
                compwin(evt);
            }
        }
        if(turn %2 != 0){
            turn += 1;
            b7.setText("O");
            buttonused[6] = 1;
            p2move[6] = 1;
            int result2 = p2win();
            int result3 = draw();
            if (result2 == 1) {
                JOptionPane.showMessageDialog(rootPane,"Computer Win!");
                p2score++;
                displayscore();
                reset();
            }
            else if (result3 == 1) {
                JOptionPane.showMessageDialog(rootPane,"DRAW!!!");
                displayscore();
                reset();
            }
        }
        }
        else{
            JOptionPane.showMessageDialog(rootPane, "This Move Has Already Been Played");
        }
    }//GEN-LAST:event_b7ActionPerformed

    private void b5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b5ActionPerformed
        // TODO add your handling code here:
        if(buttonused[4] == 0){
        if(turn %2 == 0){
            turn += 1;
            b5.setText("X");
            buttonused[4] = 1;
            p1move[4] = 1;
            int result1 = p1win();
            int result3 = draw();
            if(result1 == 1){
                JOptionPane.showMessageDialog(rootPane,"You Win!");
                p1score++;
                displayscore();
                reset();
            }
            else if (result3 == 1) {
                JOptionPane.showMessageDialog(rootPane,"DRAW!!!");
                displayscore();
                reset();
            }
            else {
                compwin(evt);
            }
        }
        if(turn %2 != 0){
            turn += 1;
            b5.setText("O");
            buttonused[4] = 1;
            p2move[4] = 1;
            int result2 = p2win();
            int result3 = draw();
            if (result2 == 1) {
                JOptionPane.showMessageDialog(rootPane,"Computer Win!");
                p2score++;
                displayscore();
                reset();
            }
            else if (result3 == 1) {
                JOptionPane.showMessageDialog(rootPane,"DRAW!!!");
                displayscore();
                reset();
            }
        }
        }
        else{
            JOptionPane.showMessageDialog(rootPane, "This Move Has Already Been Played");
        }
    }//GEN-LAST:event_b5ActionPerformed

    private void b2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b2ActionPerformed
        // TODO add your handling code here:
        if(buttonused[1] == 0){
        if(turn %2 == 0){
            turn += 1;
            b2.setText("X");
            buttonused[1] = 1;
            p1move[1] = 1;
            int result1 = p1win();
            int result3 = draw();
            if(result1 == 1){
                JOptionPane.showMessageDialog(rootPane,"You Win!");
                p1score++;
                displayscore();
                reset();
            }
            else if (result3 == 1) {
                JOptionPane.showMessageDialog(rootPane,"DRAW!!!");
                displayscore();
                reset();
            }
            else {
                compwin(evt);
            }
        }
        if(turn %2 != 0){
            turn += 1;
            b2.setText("O");
            buttonused[1] = 1;
            p2move[1] = 1;
            int result2 = p2win();
            int result3 = draw();
            if (result2 == 1) {
                JOptionPane.showMessageDialog(rootPane,"Computer Win!");
                p2score++;
                displayscore();
                reset();
            }
            else if (result3 == 1) {
                JOptionPane.showMessageDialog(rootPane,"DRAW!!!");
                displayscore();
                reset();
            }
        }
        }
        else{
            JOptionPane.showMessageDialog(rootPane, "This Move Has Already Been Played");
        }
    }//GEN-LAST:event_b2ActionPerformed

    private void b8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b8ActionPerformed
        // TODO add your handling code here:
        if(buttonused[7] == 0){
        if(turn %2 == 0){
            turn += 1;
            b8.setText("X");
            buttonused[7] = 1;
            p1move[7] = 1;
            int result1 = p1win();
            int result3 = draw();
            if(result1 == 1){
                JOptionPane.showMessageDialog(rootPane,"You Win!");
                p1score++;
                displayscore();
                reset();
            }
            else if (result3 == 1) {
                JOptionPane.showMessageDialog(rootPane,"DRAW!!!");
                displayscore();
                reset();
            }
            else {
                compwin(evt);
            }
        }
        if(turn %2 != 0){
            turn += 1;
            b8.setText("O");
            buttonused[7] = 1;
            p2move[7] = 1;
            int result2 = p2win();
            int result3 = draw();
            if (result2 == 1) {
                JOptionPane.showMessageDialog(rootPane,"Computer Win!");
                p2score++;
                displayscore();
                reset();
            }
            else if (result3 == 1) {
                JOptionPane.showMessageDialog(rootPane,"DRAW!!!");
                displayscore();
                reset();
            }
        }
        }
        else{
            JOptionPane.showMessageDialog(rootPane, "This Move Has Already Been Played");
        }
    }//GEN-LAST:event_b8ActionPerformed

    private void b6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b6ActionPerformed
        // TODO add your handling code here:
        if(buttonused[5] == 0){
        if(turn %2 == 0){
            turn += 1;
            b6.setText("X");
            buttonused[5] = 1;
            p1move[5] = 1;
            int result1 = p1win();
            int result3 = draw();
            if(result1 == 1){
                JOptionPane.showMessageDialog(rootPane,"You Win!");
                p1score++;
                displayscore();
                reset();
            }
            else if (result3 == 1) {
                JOptionPane.showMessageDialog(rootPane,"DRAW!!!");
                displayscore();
                reset();
            }
            else {
                compwin(evt);
            }
        }
        if(turn %2 != 0){
            turn += 1;
            b6.setText("O");
            buttonused[5] = 1;
            p2move[5] = 1;
            int result2 = p2win();
            int result3 = draw();
            if (result2 == 1) {
                JOptionPane.showMessageDialog(rootPane,"Computer Win!");
                p2score++;
                displayscore();
                reset();
            }
            else if (result3 == 1) {
                JOptionPane.showMessageDialog(rootPane,"DRAW!!!");
                displayscore();
                reset();
            }
        }
        }
        else{
            JOptionPane.showMessageDialog(rootPane, "This Move Has Already Been Played");
        }
    }//GEN-LAST:event_b6ActionPerformed

    private void b3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b3ActionPerformed
        // TODO add your handling code here:
        if(buttonused[2] == 0){
        if(turn %2 == 0){
            turn += 1;
            b3.setText("X");
            buttonused[2] = 1;
            p1move[2] = 1;
            int result1 = p1win();
            int result3 = draw();
            if(result1 == 1){
                JOptionPane.showMessageDialog(rootPane,"You Win!");
                p1score++;
                displayscore();
                reset();
            }
            else if (result3 == 1) {
                JOptionPane.showMessageDialog(rootPane,"DRAW!!!");
                displayscore();
                reset();
            }
            else {
                compwin(evt);
            }
        }
        if(turn %2 != 0){
            turn += 1;
            b3.setText("O");
            buttonused[2] = 1;
            p2move[2] = 1;
            int result2 = p2win();
            int result3 = draw();
            if (result2 == 1) {
                JOptionPane.showMessageDialog(rootPane,"Computer Win!");
                p2score++;
                displayscore();
                reset();
            }
            else if (result3 == 1) {
                JOptionPane.showMessageDialog(rootPane,"DRAW!!!");
                displayscore();
                reset();
            }
        }
        }
        else{
            JOptionPane.showMessageDialog(rootPane, "This Move Has Already Been Played");
        }
    }//GEN-LAST:event_b3ActionPerformed

    private void b9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b9ActionPerformed
        // TODO add your handling code here:
        if(buttonused[8] == 0){
        if(turn %2 == 0){
            turn += 1;
            b9.setText("X");
            buttonused[8] = 1;
            p1move[8] = 1;
            int result1 = p1win();
            int result3 = draw();
            if(result1 == 1){
                JOptionPane.showMessageDialog(rootPane,"You Win!");
                p1score++;
                displayscore();
                reset();
            }
            else if (result3 == 1) {
                JOptionPane.showMessageDialog(rootPane,"DRAW!!!");
                displayscore();
                reset();
            }
            else {
                compwin(evt);
            }
        }
        if(turn %2 != 0){
            turn += 1;
            b9.setText("O");
            buttonused[8] = 1;
            p2move[8] = 1;
            int result2 = p2win();
            int result3 = draw();
            if (result2 == 1) {
                JOptionPane.showMessageDialog(rootPane,"Computer Win!");
                p2score++;
                displayscore();
                reset();
            }
            else if (result3 == 1) {
                JOptionPane.showMessageDialog(rootPane,"DRAW!!!");
                displayscore();
                reset();
            }
        }
        }
        else{
            JOptionPane.showMessageDialog(rootPane, "This Move Has Already Been Played");
        }
    }//GEN-LAST:event_b9ActionPerformed

    private void NewGameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NewGameActionPerformed
        // TODO add your handling code here:
        int j=JOptionPane.showConfirmDialog(rootPane, "Start a new game?", "Confirmation Dialog", JOptionPane.YES_NO_OPTION);
        if(j==JOptionPane.YES_OPTION){
            b1.setText("");
            b2.setText("");
            b3.setText("");
            b4.setText("");
            b5.setText("");
            b6.setText("");
            b7.setText("");
            b8.setText("");
            b9.setText("");
            turn = 2;
            for (int i = 0; i < 9; i++) {
                buttonused[i] = 0;
                p1move[i]=0;
                p2move[i]=0;
            }
            p1score=0;
            p2score=0;
            displayscore();
        }
        else if(j==JOptionPane.NO_OPTION){
        }
    }//GEN-LAST:event_NewGameActionPerformed

    private void FirstTurnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FirstTurnActionPerformed
        // TODO add your handling code here:
        int j=JOptionPane.showConfirmDialog(rootPane, "Start a new game?", "Confirmation Dialog", JOptionPane.YES_NO_OPTION);
        if(j==JOptionPane.YES_OPTION){
            reset();
            turn=2;
        }
        else if(j==JOptionPane.NO_OPTION){
        }
    }//GEN-LAST:event_FirstTurnActionPerformed

    private void SecondTurnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SecondTurnActionPerformed
        // TODO add your handling code here:
        int j=JOptionPane.showConfirmDialog(rootPane, "Start a new game?", "Confirmation Dialog", JOptionPane.YES_NO_OPTION);
        if(j==JOptionPane.YES_OPTION){
            reset();
            turn=1;
            compwin(evt);
        }
        else if(j==JOptionPane.NO_OPTION){
        }
    }//GEN-LAST:event_SecondTurnActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(VSbot.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VSbot.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VSbot.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VSbot.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VSbot().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Computer;
    private javax.swing.JLabel ComputerScore;
    private javax.swing.JButton FirstTurn;
    private javax.swing.JButton NewGame;
    private javax.swing.JLabel Player;
    private javax.swing.JLabel PlayerScore;
    private javax.swing.JButton SecondTurn;
    private javax.swing.JLabel SelectTurn;
    private javax.swing.JButton b1;
    private javax.swing.JButton b2;
    private javax.swing.JButton b3;
    private javax.swing.JButton b4;
    private javax.swing.JButton b5;
    private javax.swing.JButton b6;
    private javax.swing.JButton b7;
    private javax.swing.JButton b8;
    private javax.swing.JButton b9;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables

}
