package juegocolores;

import java.awt.Color;
import static java.awt.Color.*;
import java.util.Random;
import javax.swing.JOptionPane;

public class Interfaz extends javax.swing.JFrame {

    Color Acolores[];
    private String Nombre;

    public Interfaz() {
        Acolores = new Color[10];
        initComponents();
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        color1 = new javax.swing.JButton();
        color2 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        labelControl = new javax.swing.JLabel();
        regalo = new javax.swing.JLabel();
        PanelSorpresa = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(153, 153, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        color1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                color1ActionPerformed(evt);
            }
        });
        jPanel1.add(color1, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 250, 80, 50));

        color2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                color2ActionPerformed(evt);
            }
        });
        jPanel1.add(color2, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 250, 80, 50));

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel3.setText("Adivina cúal es el color dentro???");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 140, 690, 80));
        jPanel1.add(labelControl, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 410, 140, 30));

        regalo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/juegocolores/Regalo.gif"))); // NOI18N
        jPanel1.add(regalo, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 230, 200, 200));

        javax.swing.GroupLayout PanelSorpresaLayout = new javax.swing.GroupLayout(PanelSorpresa);
        PanelSorpresa.setLayout(PanelSorpresaLayout);
        PanelSorpresaLayout.setHorizontalGroup(
            PanelSorpresaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 80, Short.MAX_VALUE)
        );
        PanelSorpresaLayout.setVerticalGroup(
            PanelSorpresaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 90, Short.MAX_VALUE)
        );

        jPanel1.add(PanelSorpresa, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 290, 80, 90));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/juegocolores/are you ready.png"))); // NOI18N
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 40, 540, 80));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 750, 450));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void color1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_color1ActionPerformed
        this.regalo.setVisible(false);
    }//GEN-LAST:event_color1ActionPerformed

    private void color2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_color2ActionPerformed
        this.regalo.setVisible(false);
    }//GEN-LAST:event_color2ActionPerformed

    public void Registro() {
        this.setNombre(JOptionPane.showInputDialog("Ingrese su nombre: "));
    }

    public int Aleatorio(int x) {
        Random r = new Random();
        return r.nextInt(x);
    }

    public void InicioArreglo() {
        Acolores[0] = BLACK;
        Acolores[1] = BLUE;
        Acolores[2] = CYAN;
        Acolores[3] = GREEN;
        Acolores[4] = MAGENTA;
        Acolores[5] = ORANGE;
        Acolores[6] = RED;
        Acolores[7] = PINK;
        Acolores[8] = WHITE;
        Acolores[9] = YELLOW;
    }

    public void GenColor() {
        this.regalo.setVisible(true);
        int num1 = Aleatorio(10);
        int num2 = Aleatorio(10);

        while (num1 == num2) {
            num1 = Aleatorio(10);
        }
        this.color1.setBackground(Acolores[num1]);
        this.color2.setBackground(Acolores[num2]);
        if (Aleatorio(2) == 0) {
            this.PanelSorpresa.setBackground(Acolores[num1]);
        } else {
            this.PanelSorpresa.setBackground(Acolores[num2]);
        }
    }

    public void Juego() {
        this.InicioArreglo();
        this.GenColor();
        boolean Control = true;
        int Puntaje = 0;
        while (Control) {
            
            if (this.color1.getModel().isPressed() && this.PanelSorpresa.getBackground() == this.color1.getBackground()) {
                JOptionPane.showMessageDialog(null, "Ganaste!!! :) ");
                this.GenColor();
                Puntaje++;
            }
            if (this.color1.getModel().isPressed() && this.PanelSorpresa.getBackground() != this.color1.getBackground()) {
                JOptionPane.showMessageDialog(null, "Perdiste :( ");
                Control=false;
            }
            if (this.color2.getModel().isPressed() && this.PanelSorpresa.getBackground() == this.color2.getBackground()) {
                JOptionPane.showMessageDialog(null, "Ganaste!!! :) ");
                this.GenColor();
                Puntaje++;
            }
            if (this.color2.getModel().isPressed() && this.PanelSorpresa.getBackground() != this.color2.getBackground()) {
                JOptionPane.showMessageDialog(null, "Perdiste :( ");
                Control=false;
            }
        }
        JOptionPane.showMessageDialog(null, this.Nombre+" Tu puntaje final fue de: " + Puntaje);
    }

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Interfaz().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel PanelSorpresa;
    private javax.swing.JButton color1;
    private javax.swing.JButton color2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel labelControl;
    private javax.swing.JLabel regalo;
    // End of variables declaration//GEN-END:variables
}
