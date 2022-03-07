/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package frames;

import com.mycompany.practica1_estructura_de_datos.main.Apuesta;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.Arrays;
import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.JTextArea;

/**
 *
 * @author Estuardo Ramos
 */
public class Inicio extends javax.swing.JFrame {

    /**
     * Creates new form Inicio
     */
    File archivo;
    private String contenido;
    private int numLineas;
    private Apuesta apuestas[];
    int pasos = 0;
    public Inicio() {
        initComponents();
        setLocationRelativeTo(null);
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
        inicioApuesta = new javax.swing.JButton();
        cargaBtn = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        inicioApuesta.setText("Iniciar apuestas");

        cargaBtn.setText("Cargar archivo de entrada");
        cargaBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cargaBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(181, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(inicioApuesta, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(cargaBtn, javax.swing.GroupLayout.DEFAULT_SIZE, 295, Short.MAX_VALUE))
                .addContainerGap(173, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(161, 161, 161)
                .addComponent(inicioApuesta)
                .addGap(46, 46, 46)
                .addComponent(cargaBtn)
                .addContainerGap(182, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cargaBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cargaBtnActionPerformed
        // TODO add your handling code here:
        cargarArchivos();
    }//GEN-LAST:event_cargaBtnActionPerformed

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
            java.util.logging.Logger.getLogger(Inicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Inicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Inicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Inicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Inicio().setVisible(true);
            }
        });
    }
    
    public void cargarArchivos(/*JTextArea cadenaTxt, JButton guardar, boolean archivoCargado*/) {
        JFileChooser fc = new JFileChooser();
        fc.showOpenDialog(null);
        archivo = fc.getSelectedFile();
        try {
            FileReader fr = new FileReader(archivo);
            BufferedReader br = new BufferedReader(fr);
            String texto = "";
            String linea = "";
            while ((linea = br.readLine()) != null) {
                texto += linea + "\n";
            }
            //cadenaTxt.setText(texto);
            //guardar.setEnabled(true);
            //archivoCargado=true;
            System.out.println(texto);
            JOptionPane.showMessageDialog(null, "Archivo cargado puede analizarlo");
            contenido = texto;
            //obtenerLineas(numLineas, texto);
            System.out.println("obtuvo lineas");
            
        } catch (Exception e) {
        }
        recibirTxt(contenido);
    }
     public void recibirTxt(String texto){
         String[] lineas = obtenerLineas(numLineas=contarLineas(texto), texto);
         //int pasos = 0;
         apuestas = new Apuesta[lineas.length];
                for (int i = 0; i < lineas.length; i++) {
                    
                    agregarApuestas(apuestas, i,  lineas[i]);
                    //numero++;
                    
                    System.out.println(lineas[i]+" "+apuestas[i].getNombre());
                }
                System.out.println("nn "+apuestas[1].getNombre());
         ApuestasCargadas carga = new ApuestasCargadas(apuestas);
         System.out.println("El total de pasos para ingresar ap es "+pasos);
         setVisible(false);
         carga.setVisible(true);
     }
     
      public void agregarApuestas(Apuesta[] apuestas,int  n,String linea) {
        Apuesta nuevaApuesta = new Apuesta();
        int[] lugares = new int[10];
        //int pasos = 0;
        try {
            long startTime = System.currentTimeMillis();
            int comas[] = new int[11];
            int x = 0;
            for (int i = 0; i < linea.length() - 1; i++) {
                pasos++;
                int j = i + 1;
                if (",".equals(linea.substring(i, j))) {
                    pasos++;
                    comas[x] = i;
                    x++;
                }
            }

            String nombre = linea.substring(1, comas[0] - 1);
            double monto = Double.parseDouble(linea.substring(comas[0] + 2, comas[1] - 1));
            lugares[0] = Integer.parseInt(linea.substring(comas[1] + 2, comas[2] - 1));
            lugares[1] = Integer.parseInt(linea.substring(comas[2] + 2, comas[3] - 1));
            lugares[2] = Integer.parseInt(linea.substring(comas[3] + 2, comas[4] - 1));
            lugares[3] = Integer.parseInt(linea.substring(comas[4] + 2, comas[5] - 1));
            lugares[4] = Integer.parseInt(linea.substring(comas[5] + 2, comas[6] - 1));
            lugares[5] = Integer.parseInt(linea.substring(comas[6] + 2, comas[7] - 1));
            lugares[6] = Integer.parseInt(linea.substring(comas[7] + 2, comas[8] - 1));
            lugares[7] = Integer.parseInt(linea.substring(comas[8] + 2, comas[9] - 1));
            lugares[8] = Integer.parseInt(linea.substring(comas[9] + 2, comas[10] - 1));
            lugares[9] = Integer.parseInt(linea.substring(comas[10] + 2, linea.length() - 1));
            
            nuevaApuesta.setNombre(nombre);
            nuevaApuesta.setDineroApuesta(monto);
            nuevaApuesta.setPuestos(lugares);
            nuevaApuesta.setValido(true);
            pasos += 10;
            long endTime = System.currentTimeMillis();
            /*reporte.setTiempoIngreso(((endTime - startTime)/1000));
            reporte.setPasosIngreso(pasos);*/
        } catch (Exception e) {
            //nuevaApuesta.setError("Datos Faltantes");
            nuevaApuesta.setValido(false);
            e.printStackTrace();
            System.out.println("Error en la entrada ");
        }
        apuestas[n] = nuevaApuesta;
          System.out.println("name2 "+apuestas[n].getNombre());
        
        
    }
    public String[] obtenerLineas(int numeroLineas, String texto) {
        String[] lineas = new String[numeroLineas];
        int lineasContadas = 0;
        int ultima = 0;
        for (int i = 0; i < texto.length() - 1; i++) {
            if (texto.substring(i, i + 1).equals("\n")) {
                lineas[lineasContadas] = texto.substring(ultima, i);
                lineasContadas++;
                ultima = i + 1;

            }
        }
        System.out.println("Cantidad de lineas contadas "+lineasContadas);
        lineas[lineasContadas] = texto.substring(ultima, texto.length() - 1);
        return lineas;
    }
    
    public int contarLineas(String txt) {
        int linea = 0;
        String texto = txt;
        for (int i = 0; i < texto.length() - 1; i++) {
            if (texto.substring(i, i + 1).equals("\n")) {
                linea++;
            }
        }
        linea++;
        return linea;
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton cargaBtn;
    private javax.swing.JButton inicioApuesta;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
