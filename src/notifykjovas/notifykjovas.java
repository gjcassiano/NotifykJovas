/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package notifykjovas;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Point;
import java.awt.Toolkit;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Random;

/**
 *
 * @author DONTKNOW
 */
public class notifykjovas extends javax.swing.JFrame {

    public int GetPross(){
        int numJovasNoty =0 ;
          try {
            File file = new File("pross_abertos");
            if (!file.exists()) {
                file.createNewFile();
                 numJovasNoty = 0;
                 FileWriter fw = new FileWriter(file.getAbsoluteFile());
                BufferedWriter bw = new BufferedWriter(fw);
                bw.write(String.valueOf(numJovasNoty));
                bw.close();
            }else{
                FileReader fr = new FileReader(file.getAbsoluteFile());
                BufferedReader br = new BufferedReader(fr);
                numJovasNoty = Integer.parseInt(br.readLine());
            }

        } catch (IOException e) {
        }

        return numJovasNoty;
    }
    public void setMorePross(){
           int numJovasNoty =0 ;
             try {
            File file = new File("pross_abertos");
            if (!file.exists()) {
                file.createNewFile();
                 numJovasNoty = 0;
            }else{
                FileReader fr = new FileReader(file.getAbsoluteFile());
                BufferedReader br = new BufferedReader(fr);
                numJovasNoty = Integer.parseInt(br.readLine());
            }

            FileWriter fw = new FileWriter(file.getAbsoluteFile());
            BufferedWriter bw = new BufferedWriter(fw);
            bw.write(String.valueOf(numJovasNoty + 1));
            bw.close();

        } catch (IOException e) {
        }
    
    }
    public void setLessPross(){
          int numJovasNoty =0 ;
             try {
            File file = new File("pross_abertos");
            if (!file.exists()) {
                file.createNewFile();
                 numJovasNoty = 0;
            }else{
                FileReader fr = new FileReader(file.getAbsoluteFile());
                BufferedReader br = new BufferedReader(fr);
                numJovasNoty = Integer.parseInt(br.readLine());
            }

            FileWriter fw = new FileWriter(file.getAbsoluteFile());
            BufferedWriter bw = new BufferedWriter(fw);
            if(numJovasNoty > 0){
                bw.write(String.valueOf(numJovasNoty - 1));
            }
            bw.close();

        } catch (IOException e) {
        }
    }
    
    
    public notifykjovas(String title, String Info) {
        initComponents();

        int numJovasNoty = GetPross();

      
        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
        int locX = (int) screenSize.getWidth() - this.getWidth();
        int locY = (int) screenSize.getHeight() - this.getHeight() - numJovasNoty * this.getHeight();

        //evita a barra do explore;
        locY -= 30;
        locX -= 5;

        this.setLocation(locX, locY);
        this.jLabel1.setText(title);
        this.jTextArea2.setText(Info);
        setMorePross();
        

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTextArea2 = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setAlwaysOnTop(true);
        setBackground(new java.awt.Color(255, 255, 255));
        setUndecorated(true);
        setOpacity(0.0F);
        setResizable(false);
        setType(java.awt.Window.Type.UTILITY);
        addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                formMouseClicked(evt);
            }
        });
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jPanel2.setBackground(new java.awt.Color(80, 202, 243));
        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 51, 102)));
        jPanel2.setPreferredSize(new java.awt.Dimension(16, 16));

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Information");
        jLabel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel1MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jTextArea2.setEditable(false);
        jTextArea2.setColumns(20);
        jTextArea2.setFont(new java.awt.Font("Monospaced", 0, 12)); // NOI18N
        jTextArea2.setRows(5);
        jTextArea2.setText("teste de notyficy");
        jTextArea2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 51, 102)));
        jTextArea2.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jTextArea2.setDisabledTextColor(new java.awt.Color(0, 0, 102));
        jTextArea2.setFocusable(false);
        jTextArea2.setOpaque(false);
        jTextArea2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTextArea2MouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(jTextArea2);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, 243, Short.MAX_VALUE)
            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 243, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(6, 6, 6)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextArea2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTextArea2MouseClicked
        Closeform();
    }//GEN-LAST:event_jTextArea2MouseClicked

    private void jLabel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseClicked
        Closeform();
    }//GEN-LAST:event_jLabel1MouseClicked

    private void formMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMouseClicked
        Closeform();
    }//GEN-LAST:event_formMouseClicked

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        Showform();
        vibrateForm();
    }//GEN-LAST:event_formWindowOpened
    void vibrateForm() {
        Runnable r = new Runnable() {
            int i = 0;

            @Override
            public void run() {
                Random r = new Random();
                Point loc = getLocation();
                while (i < 100) {

                    i += 1;
                    setLocation(loc.getLocation().x + r.nextInt(5) - r.nextInt(5), loc.getLocation().y + r.nextInt(5) - r.nextInt(5));
                    try {
                        Thread.sleep(10);
                    } catch (InterruptedException ex) {
                    }
                }
                setLocation(loc);

            }
        };
        Thread t = new Thread(r);
        t.start();
    }

    void Closeform() {
        Runnable r = new Runnable() {
            float i = 1.0f;

            @Override
            public void run() {
                jPanel2.setBackground(Color.red);
                while (i > 0.1f) {
                    setOpacity(i);
                    i -= 0.02f;
                    try {
                        Thread.sleep(10);
                    } catch (InterruptedException ex) {
                    }
                }
                System.exit(0);

            }
        };
        Thread t = new Thread(r);
        t.start();
       
       setLessPross();
       

    }

    void Showform() {
        this.setVisible(true);
        Runnable r = new Runnable() {
            float i = 0.0f;

            @Override
            public void run() {

                while (i < 1.0f) {
                    setOpacity(i);
                    i += 0.02f;
                    try {
                        Thread.sleep(10);
                    } catch (InterruptedException ex) {
                    }
                }

            }
        };
        Thread t = new Thread(r);
        t.start();

    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextArea jTextArea2;
    // End of variables declaration//GEN-END:variables
}
