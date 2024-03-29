/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package indicadoresupp;

import javax.swing.JFrame;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumn;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.data.category.DefaultCategoryDataset;

/**
 *
 * @author lenovo
 */
public class UI extends javax.swing.JFrame {

    JFreeChart Grafica;
    DefaultCategoryDataset datos = new DefaultCategoryDataset();
    /**
     * Creates new form UI
     */
    public UI() {
        initComponents();
        
        
        

        DefaultTableModel model = new DefaultTableModel();
        
        model.addColumn("Nombre");
        model.addColumn("Apellido Paterno");
        model.addColumn("Apellido Materno");
        model.addColumn("Programa Educativo");
        model.addColumn("Sexo");
        model.addColumn("Fecha de egreso");
        model.addColumn("Telefono");
        model.addRow(new Object[]{"Juan", "Perez","Mendoza", "Software","H","24 de mayo 2017", "7712219132"});
        model.addRow(new Object[]{"Miguel", "Gonzalez","Alvarado", "Software", "H","26 de mayo 2017","7445457889"});
        model.addRow(new Object[]{"Valeria", "Lozano"," Vera", "Software", "M","30 de mayo 2017","7714565895"});
        model.addRow(new Object[]{"Erica", "Rosales","Guerra", "Software","M","20 de junio 2017", "7717845879"});
        model.addRow(new Object[]{"David", "Montes","Flores", "Software","H","22 de junio 2017", "7711132025"});
        model.addRow(new Object[]{"Katia", "Espindola","Cuevas", "Software","M","25 de junio 2017", "7718451845"});
        model.addRow(new Object[]{"Maria", "Ordoñez","Peñaloza", "Software","M","25 de junio 2017", "7717845812"});
        jTable_resultados.setModel(model);

        
       
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
        comboBox_carreras = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        jButton_obtener = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        tabla = new javax.swing.JScrollPane();
        jTable_resultados = new javax.swing.JTable();
        btnGraficar = new javax.swing.JButton();
        jComboBox1 = new javax.swing.JComboBox<>();
        btnGraficar1 = new javax.swing.JButton();
        btnGraficar2 = new javax.swing.JButton();
        btnGraficar3 = new javax.swing.JButton();

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Indicadores de Egresados ");

        comboBox_carreras.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Software", "Telemática", "Mecatrónica", "Financiera", "Mecánica Automotriz", "Redes y Telecomunicaciones", "Biomédica", "Biotecnología", "Médico Cirujano", "Terápia Física", " " }));
        comboBox_carreras.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboBox_carrerasActionPerformed(evt);
            }
        });

        jLabel2.setText("Egresados localizados en:");

        jButton_obtener.setText("Obtener");

        jLabel3.setText("Lista de carreras");

        jTable_resultados.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        tabla.setViewportView(jTable_resultados);

        btnGraficar.setText("Indicador P-XI-02");
        btnGraficar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGraficarActionPerformed(evt);
            }
        });

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Mayo - Agosto 2017", "Septiembre - Diciembre 2017", "Enero - Abril 2018", "Mayo - Agosto 2018", "Septiembre - Diciembre 2018", "Enero - Abril 2019", "Mayo - Agosto 2019" }));

        btnGraficar1.setText("Indicador P-XI-06");
        btnGraficar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGraficar1ActionPerformed(evt);
            }
        });

        btnGraficar2.setText("Indicador P-XI-03");
        btnGraficar2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGraficar2ActionPerformed(evt);
            }
        });

        btnGraficar3.setText("Indicador P-XI-08");
        btnGraficar3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGraficar3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(tabla, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                        .addContainerGap())
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(comboBox_carreras, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 314, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jComboBox1, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(40, 40, 40))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jButton_obtener)
                        .addGap(305, 305, 305))))
            .addGroup(layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(btnGraficar)
                .addGap(54, 54, 54)
                .addComponent(btnGraficar2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnGraficar1)
                .addGap(39, 39, 39)
                .addComponent(btnGraficar3, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(18, 18, 18)
                        .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addGap(18, 18, 18)
                        .addComponent(comboBox_carreras, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(33, 33, 33)
                .addComponent(jButton_obtener)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(tabla, javax.swing.GroupLayout.DEFAULT_SIZE, 170, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnGraficar)
                    .addComponent(btnGraficar1)
                    .addComponent(btnGraficar2)
                    .addComponent(btnGraficar3))
                .addGap(20, 20, 20))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void comboBox_carrerasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboBox_carrerasActionPerformed
        
        
    }//GEN-LAST:event_comboBox_carrerasActionPerformed

    private void btnGraficarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGraficarActionPerformed
        
       
        datos.addValue(4, "Mujeres", "Mujeres");
        datos.addValue(3, "Hombres", "Hombres");


        Grafica = ChartFactory.createBarChart("Cantidad de alumnos egresados por genero en el PE Software",
        "Genero", "Cantidad", datos,
        PlotOrientation.HORIZONTAL, true, true, false);
       
        
        
        
        
        
        ChartPanel Panel = new ChartPanel(Grafica);
        JFrame Ventana = new JFrame("JFreeChart");
        Ventana.getContentPane().add(Panel);
        Ventana.pack();
        Ventana.setVisible(true);
        Ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }//GEN-LAST:event_btnGraficarActionPerformed

    private void btnGraficar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGraficar1ActionPerformed
       datos.addValue(3, "Negocio 1", "Miércoles");
        


        Grafica = ChartFactory.createBarChart("Visitas diarias",
        "Días", "Visitas", datos,
        PlotOrientation.HORIZONTAL, true, true, false);
        
     
        
        
        ChartPanel Panel = new ChartPanel(Grafica);
        JFrame Ventana = new JFrame("JFreeChart");
        Ventana.getContentPane().add(Panel);
        Ventana.pack();
        Ventana.setVisible(true);
        Ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }//GEN-LAST:event_btnGraficar1ActionPerformed

    private void btnGraficar2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGraficar2ActionPerformed
        datos.addValue(7, "Software", "Software");
        datos.addValue(2, "Telematica", "Telematica");
        datos.addValue(17, "Terapia Fisica", "Terapia Fisica");
        datos.addValue(10, "Financiera", "Financiera");
        datos.addValue(14, "Mecatronica", "Mecatronica");
        datos.addValue(2, "Mecanica Automotriz", "Mecanica Automotriz");
        datos.addValue(6, "Biomedica", "Biomedica");
        datos.addValue(9, "Biotecnología", "Biotecnología");


        Grafica = ChartFactory.createBarChart("Egresados por programa educativo",
        "Programa educativo", "Cantidad", datos,
        PlotOrientation.HORIZONTAL, false, true, true);
        
        
      
        
        
        ChartPanel Panel = new ChartPanel(Grafica);
        JFrame Ventana = new JFrame("INDICAMAX");
        Ventana.getContentPane().add(Panel);
        Ventana.pack();
        Ventana.setVisible(true);
        Ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }//GEN-LAST:event_btnGraficar2ActionPerformed

    private void btnGraficar3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGraficar3ActionPerformed
        
        
        datos.addValue(3, "Negocio 1", "Miércoles");
        datos.addValue(3, "Negocio 1", "Miércoles");
        datos.addValue(3, "Negocio 1", "Miércoles");

        Grafica = ChartFactory.createBarChart("Visitas diarias",
        "Días", "Visitas", datos,
        PlotOrientation.HORIZONTAL, true, true, false);
        

        
        
        ChartPanel Panel = new ChartPanel(Grafica);
        JFrame Ventana = new JFrame("");
        Ventana.getContentPane().add(Panel);
        Ventana.pack();
        Ventana.setVisible(true);
        Ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }//GEN-LAST:event_btnGraficar3ActionPerformed

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
            java.util.logging.Logger.getLogger(UI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(UI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(UI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(UI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new UI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnGraficar;
    private javax.swing.JButton btnGraficar1;
    private javax.swing.JButton btnGraficar2;
    private javax.swing.JButton btnGraficar3;
    private javax.swing.JComboBox<String> comboBox_carreras;
    private javax.swing.JButton jButton_obtener;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTable jTable_resultados;
    private javax.swing.JScrollPane tabla;
    // End of variables declaration//GEN-END:variables
}
