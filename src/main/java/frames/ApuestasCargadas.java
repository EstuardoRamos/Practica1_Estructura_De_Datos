/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package frames;

import com.mycompany.practica1_estructura_de_datos.main.Apuesta;
import com.mycompany.practica1_estructura_de_datos.main.Main;

/**
 *
 * @author Estuardo Ramos
 */
public class ApuestasCargadas extends javax.swing.JFrame {

    /**
     * Creates new form ApuestasCargadas
     */
    Apuesta apuestas[];

    public ApuestasCargadas() {
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

        jLabel1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        apuestastxt = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Se cargaron las siguientes apuestas. ");

        jButton1.setText("Verificar apuestas");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        apuestastxt.setColumns(20);
        apuestastxt.setRows(5);
        jScrollPane1.setViewportView(apuestastxt);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(302, 302, 302)
                        .addComponent(jButton1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 734, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 389, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(48, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(67, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(27, 27, 27)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 272, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(41, 41, 41)
                .addComponent(jButton1)
                .addGap(64, 64, 64))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        verificarApuetas();
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(ApuestasCargadas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ApuestasCargadas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ApuestasCargadas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ApuestasCargadas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ApuestasCargadas().setVisible(true);
            }
        });
    }

    public ApuestasCargadas(Apuesta[] apuestas) {
        this.apuestas = apuestas;
        initComponents();
        cargarApuestas();
    }

    private void cargarApuestas() {
        for (int i = 0; i < apuestas.length; i++) {
            int puestos[] = apuestas[i].getPuestos();
            apuestastxt.append("Nombre " + apuestas[i].getNombre() + " Dinero apostado: " + apuestas[i].getDineroApuesta() + " Puesto 1 Caballo" + puestos[0] + " Puesto 2 Caballo " + puestos[1] + " Puesto 3 Caballo " + puestos[2] + " Puesto 4 Caballo " + puestos[3] + " Puesto 5 Caballo " + puestos[4] + "\n");
        }
    }

    public void verificarApuetas() {
        Main main = new Main();
        boolean noAgregar;
        apuestastxt.setText("");
        for (int i = 0; i < 10; i++) {
            noAgregar = Main.tieneRepetidos(apuestas[i].getPuestos());

            if (!noAgregar) {
                int puestos[] = apuestas[i].getPuestos();
                apuestastxt.append("Nombre " + apuestas[i].getNombre() + " Dinero apostado: " + apuestas[i].getDineroApuesta() + " Puesto 1 Caballo" + puestos[0] + " Puesto 2 Caballo " + puestos[1] + " Puesto 3 Caballo " + puestos[2] + " Puesto 4 Caballo " + puestos[3] + " Puesto 5 Caballo " + puestos[4] + "\n");
            }
        }
        int[] intArray = new int[10]; /*= new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10};*/
        intArray[0]=10;
        intArray[1]=9;
        intArray[2]=8;
        intArray[3]=7;
        intArray[4]=6;
        intArray[5]=5;
        intArray[6]=4;
        intArray[7]=3;
        intArray[8]=2;
        intArray[9]=1;
        calcularResultados(apuestas, intArray);
        
    }

    public void calcularResultados(Apuesta[] apuestasGanadores, int[] resultado) {
        int puestoApuesta[];
        for (int j = 0; j < apuestasGanadores.length; j++) {
            puestoApuesta = apuestasGanadores[j].getPuestos();
            for (int i = 0; i < 10; i++) {
                if (puestoApuesta[i] == 1) {
                    System.out.println("apuesta de "+apuestasGanadores[j].getNombre()+" "+puestoApuesta[i]+"es igual a "+resultado[0]);
                    apuestasGanadores[j].sumarPuntos(10);
                }
                if (puestoApuesta[i] == 2) {
                    System.out.println("apuesta de "+apuestasGanadores[j].getNombre()+" "+puestoApuesta[i]+"es igual a "+resultado[1]);
                    apuestasGanadores[j].sumarPuntos(9);
                }
                if (puestoApuesta[i] == 3) {
                    apuestasGanadores[j].sumarPuntos(8);
                    System.out.println("apuesta de "+apuestasGanadores[j].getNombre()+" "+puestoApuesta[i]+"es igual a "+resultado[2]);
                }
                if (puestoApuesta[i] == 4) {
                    System.out.println("apuesta de "+apuestasGanadores[j].getNombre()+" "+puestoApuesta[i]+"es igual a "+resultado[3]);
                    apuestasGanadores[j].sumarPuntos(7);
                }
                if (puestoApuesta[i] == 5) {
                    System.out.println("apuesta de "+apuestasGanadores[j].getNombre()+" "+puestoApuesta[i]+"es igual a "+resultado[4]);
                    apuestasGanadores[j].sumarPuntos(6);
                }
                if (puestoApuesta[i] == 6) {
                    System.out.println("apuesta de "+apuestasGanadores[j].getNombre()+" "+puestoApuesta[i]+"es igual a "+resultado[5]);
                    apuestasGanadores[j].sumarPuntos(5);
                   
                }
                if (puestoApuesta[i] == 7) {
                    System.out.println("apuesta de "+apuestasGanadores[j].getNombre()+" "+puestoApuesta[i]+"es igual a "+resultado[6]);
                    apuestasGanadores[j].sumarPuntos(4);
                }
                if (puestoApuesta[i] == 8) {
                    System.out.println("apuesta de "+apuestasGanadores[j].getNombre()+" "+puestoApuesta[i]+"es igual a "+resultado[7]);
                    apuestasGanadores[j].sumarPuntos(3);
                }
                if (puestoApuesta[i] == 9) {
                    System.out.println("apuesta de "+apuestasGanadores[j].getNombre()+" "+puestoApuesta[i]+"es igual a "+resultado[8]);
                    apuestasGanadores[j].sumarPuntos(2);
                }
                if (puestoApuesta[i] == 10) {
                    System.out.println("apuesta de "+apuestasGanadores[j].getNombre()+" "+puestoApuesta[i]+"es igual a "+resultado[9]);
                    apuestasGanadores[j].sumarPuntos(1);
                }
                //System.out.println("apuesta de "+apuestasGanadores[j].getNombre()+" "+puestoApuesta[i]);
            }

            System.out.println("puntos de " + apuestasGanadores[j].getNombre() + " " + apuestasGanadores[j].getPuntos());
        }

    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextArea apuestastxt;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
