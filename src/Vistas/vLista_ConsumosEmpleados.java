/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vistas;

/**
 *
 * @author Colo-PC
 */
public class vLista_ConsumosEmpleados extends javax.swing.JInternalFrame {

    /**
     * Creates new form vLista_ConsumosEmpleados
     */
    public vLista_ConsumosEmpleados() {
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

        jPanel1 = new javax.swing.JPanel();
        jDateChooser2 = new com.toedter.calendar.JDateChooser();
        jDateChooser3 = new com.toedter.calendar.JDateChooser();
        jButton6 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable(){
            public boolean isCellEditable(int rowIndex, int colIndex) {
                return false; //Disallow the editing of any cell
            }
        };
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setTitle("Listado de Consumos Empleados");

        jPanel1.setBackground(new java.awt.Color(255, 248, 177));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(), "", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI Semibold", 0, 13))); // NOI18N

        jDateChooser2.setFont(new java.awt.Font("Segoe UI Semibold", 0, 13)); // NOI18N

        jDateChooser3.setFont(new java.awt.Font("Segoe UI Semibold", 0, 13)); // NOI18N

        jButton6.setFont(new java.awt.Font("Segoe UI Semibold", 0, 13)); // NOI18N
        jButton6.setText("Buscar");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Segoe UI Semibold", 0, 13)); // NOI18N
        jLabel3.setText("Desde");

        jLabel4.setFont(new java.awt.Font("Segoe UI Semibold", 0, 13)); // NOI18N
        jLabel4.setText("Hasta");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(jDateChooser2, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 133, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jDateChooser3, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(172, 172, 172))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jDateChooser3, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(1, 1, 1)
                .addComponent(jButton6)
                .addGap(10, 10, 10))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jDateChooser2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 42, Short.MAX_VALUE))
        );

        jScrollPane1.setOpaque(false);

        jTable1.setFont(new java.awt.Font("Segoe UI Semibold", 0, 13)); // NOI18N
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
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
        jTable1.setOpaque(false);
        jScrollPane1.setViewportView(jTable1);

        jButton3.setBackground(new java.awt.Color(252, 249, 57));
        jButton3.setFont(new java.awt.Font("Segoe UI Semibold", 0, 12)); // NOI18N
        jButton3.setText("Agregar");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton4.setBackground(new java.awt.Color(252, 249, 57));
        jButton4.setFont(new java.awt.Font("Segoe UI Semibold", 0, 12)); // NOI18N
        jButton4.setText("Modificar");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jButton5.setBackground(new java.awt.Color(240, 87, 49));
        jButton5.setFont(new java.awt.Font("Segoe UI Semibold", 0, 12)); // NOI18N
        jButton5.setText("Eliminar");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 830, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(195, 195, 195)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(116, 116, 116)
                        .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(185, 185, 185)
                        .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(168, 168, 168)
                        .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 202, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        String desde = ((JTextField) jDateChooser2.getDateEditor().getUiComponent()).getText();
        String hasta = ((JTextField) jDateChooser3.getDateEditor().getUiComponent()).getText();
        if (jDateChooser2.getDateEditor().getUiComponent().getForeground() != Color.RED) {
            if (jDateChooser3.getDateEditor().getUiComponent().getForeground() != Color.RED) {
                if (!desde.isEmpty() && !hasta.isEmpty()) {
                    String columnas[] = {"IDCONSUMO", "IDPRODUCTO", "NOMBRE EMPLEADO", "PRODUCTO", "CANTIDAD", "FECHA"};
                    dato1 = contr_consumoempleado.MostrarDatosBusqueda(desde, hasta);
                    if (dato1.length != 0) {
                        tabla1 = new DefaultTableModel(dato1, columnas);
                        jTable1.setModel(tabla1);
                        EliminarFilasVaciasTabla1();
                        ocultarcolumnastabla1();
                    } else {
                        JOptionPane.showMessageDialog(null, "No se encontraron datos");
                    }
                } else if (desde.isEmpty() || hasta.isEmpty()) {
                    JOptionPane.showMessageDialog(null, "Debe ingresar la fecha que falta");
                }
            } else {
                JOptionPane.showMessageDialog(null, "Formato de fecha incorrecto!");
            }
        } else {
            JOptionPane.showMessageDialog(null, "Formato de fecha incorrecto!");
        }
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        if (!jTextField1.getText().equals("") && !jTextField2.getText().equals("") && !jTextField3.getText().isEmpty() && !((JTextField) jDateChooser1.getDateEditor().getUiComponent()).getText().isEmpty()) {
            if (jDateChooser1.getDateEditor().getUiComponent().getForeground() != Color.RED) {
                int stockneg = contr_consumoempleado.ConsultarStockNegativosN_MOD(jTextField2.getText(), Float.parseFloat(jTextField3.getText()));
                int stockcero = contr_consumoempleado.ConsultarStockCeroN_MOD(jTextField2.getText(), Float.parseFloat(jTextField3.getText()));
                if (stockneg > 0) {
                    String[] opciones = {"Ver Informe", "No ver y seguir"};
                    //Icon iconopreg = new ImageIcon(getClass().getResource("/Imagenes/pregunta.png"));
                    int i = JOptionPane.showOptionDialog(null, "Hemos verificado que dichos stocks de los insumos del producto " + jTextField2.getText() + ", puede tener problemas a futuro. Por lo tanto no se cargara el mismo, por favor revea los insumos de este producto.", "ATENCION!", JOptionPane.DEFAULT_OPTION, JOptionPane.WARNING_MESSAGE, null, opciones, opciones[0]);
                    if (i == 0) {
                        MostrarProductosStockN_MOD();
                        jLabel11.setText(jTextField2.getText());
                        color = new ColorearFilas(2);
                        jTable4.getColumnModel().getColumn(2).setCellRenderer(color);
                        vStocksProductos.setSize(727, 560);
                        vStocksProductos.setLocationRelativeTo(this);
                        vStocksProductos.setModal(true);
                        vStocksProductos.setVisible(true);
                    } else {
                        Limpiar();
                    }
                } else if (stockcero > 0) {
                    String[] opc = {"Ver Informe", "No ver y seguir"};
                    int i = JOptionPane.showOptionDialog(null, "Hemos verificado que si aplica dicho informe para este producto " + jTextField2.getText() + ", dichos stocks de los insumos de la misma puede tener un stock 0", "ADVERTENCIA!", JOptionPane.DEFAULT_OPTION, JOptionPane.WARNING_MESSAGE, null, opc, opc[0]);
                    if (i == 0) {
                        MostrarProductosStockN_MOD();
                        jLabel11.setText(jTextField2.getText());
                        color = new ColorearFilas(2);
                        jTable4.getColumnModel().getColumn(2).setCellRenderer(color);
                        vStocksProductos.setSize(727, 560);
                        vStocksProductos.setLocationRelativeTo(this);
                        vStocksProductos.setModal(true);
                        vStocksProductos.setVisible(true);
                    } else {
                        int g = JOptionPane.showConfirmDialog(null, "Agregar el producto " + jTextField2.getText() + " o elegir otro?", "Confirmar", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
                        if (g == 0) {
                            ce.setNomempleado(jTextField1.getText());
                            ce.setProducto(jTextField2.getText());
                            ce.setCantidad(Float.parseFloat(jTextField3.getText()));
                            if (contr_consumoempleado.InsertarConsumosEmpleados(ce)) {
                                ce.setCantidad(Float.parseFloat(jTextField3.getText()));
                                ce.setIdproducto(contr_consumoempleado.ObtenerIDProducto(jTextField2.getText()));
                                if (contr_consumoempleado.RestarStockConsumidoLocal(ce)) {
                                    JOptionPane.showMessageDialog(null, "Informe agregado.");
                                    MostrarDatos();
                                    Limpiar();
                                }
                            }
                        } else {
                            Limpiar();
                        }
                    }
                } else {
                    ce.setNomempleado(jTextField1.getText());
                    ce.setProducto(jTextField2.getText());
                    ce.setCantidad(Float.parseFloat(jTextField3.getText()));
                    if (contr_consumoempleado.InsertarConsumosEmpleados(ce)) {
                        ce.setCantidad(Float.parseFloat(jTextField3.getText()));
                        ce.setIdproducto(contr_consumoempleado.ObtenerIDProducto(jTextField2.getText()));
                        if (contr_consumoempleado.RestarStockConsumidoLocal(ce)) {
                            JOptionPane.showMessageDialog(null, "Informe agregado.");
                            MostrarDatos();
                            Limpiar();
                        }
                    }
                }
            } else {
                JOptionPane.showMessageDialog(null, "Formato de fecha incorrecto!");
            }
        } else {
            JOptionPane.showMessageDialog(null, "Debes completar los campos obligatorios");
        }
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        if (jButton4.getText().equals("Modificar")) {
            int fila = jTable1.getSelectedRow();
            if (fila == -1) {
                JOptionPane.showMessageDialog(null, "Debes seleccionar una fila");
            } else {
                jButton3.setEnabled(false);
                jButton4.setText("Cancelar");
                jButton5.setText("Modificar");
                String fecha = jTable1.getValueAt(fila, 5).toString();
                DateFormat df = new SimpleDateFormat("dd/MM/yyyy HH:mm");
                try {
                    fechaseleccionada = new java.sql.Timestamp(df.parse(fecha).getTime());
                } catch (ParseException ex) {
                    Logger.getLogger(vConsumosEmpleados.class.getName()).log(Level.SEVERE, null, ex);
                }
                cant = jTable1.getValueAt(fila, 4).toString();
                prod = jTable1.getValueAt(fila, 1).toString();
                id = jTable1.getValueAt(fila, 0).toString();
                jTextField1.setText(jTable1.getValueAt(fila, 2).toString());
                jTextField2.setText(jTable1.getValueAt(fila, 3).toString());
                jTextField3.setText(jTable1.getValueAt(fila, 4).toString());
                jDateChooser1.setDate(fechaseleccionada);
            }
        } else {
            int i = JOptionPane.showConfirmDialog(null, "Cancelar Modificacion?", "Confirmar", JOptionPane.YES_NO_OPTION);
            if (i == 0) {
                jButton3.setEnabled(true);
                jButton4.setText("Modificar");
                jButton5.setText("Eliminar");
                Limpiar();
                LimpiarSeleccionTabla1();
            }
        }
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        if (jButton5.getText().equals("Modificar")) {
            if (jTable1.getRowCount() != 0) {
                int l = jTable1.getSelectedRow();
                if (l == -1) {
                    JOptionPane.showMessageDialog(null, "Debes seleccionar una fila");
                } else {
                    if (!jTextField1.getText().equals("") && !jTextField2.getText().equals("") && !jTextField3.getText().isEmpty() && !((JTextField) jDateChooser1.getDateEditor().getUiComponent()).getText().isEmpty()) {
                        if (jDateChooser1.getDateEditor().getUiComponent().getForeground() != Color.RED) {
                            int m = JOptionPane.showConfirmDialog(null, "Guardar Cambios?", "Confirmar", JOptionPane.YES_NO_OPTION);
                            if (m == 0) {
                                ce.setCantidad(Float.parseFloat(jTable1.getValueAt(l, 4).toString()));
                                ce.setIdproducto(Integer.parseInt(jTable1.getValueAt(l, 1).toString()));
                                contr_consumoempleado.CancelarStockConsumidoLocal(ce);
                                int stockneg = contr_consumoempleado.ConsultarStockNegativosN_MOD(jTextField2.getText(), Float.parseFloat(jTextField3.getText()));
                                int stockcero = contr_consumoempleado.ConsultarStockCeroN_MOD(jTextField2.getText(), Float.parseFloat(jTextField3.getText()));
                                if (stockneg > 0) {
                                    String[] opciones = {"Ver Informe", "No ver y seguir"};
                                    //Icon iconopreg = new ImageIcon(getClass().getResource("/Imagenes/pregunta.png"));
                                    int i = JOptionPane.showOptionDialog(null, "Hemos verificado que dichos stocks de los insumos del producto " + jTextField2.getText() + ", puede tener problemas a futuro. Por lo tanto no se cargara el mismo, por favor revea los insumos de este producto.", "ATENCION!", JOptionPane.DEFAULT_OPTION, JOptionPane.WARNING_MESSAGE, null, opciones, opciones[0]);
                                    if (i == 0) {
                                        MostrarProductosStockN_MOD();
                                        jLabel11.setText(jTextField2.getText());
                                        color = new ColorearFilas(2);
                                        jTable4.getColumnModel().getColumn(2).setCellRenderer(color);
                                        vStocksProductos.setSize(727, 560);
                                        vStocksProductos.setLocationRelativeTo(this);
                                        vStocksProductos.setModal(true);
                                        vStocksProductos.setVisible(true);
                                    } else {
                                        ce.setCantidad(Float.parseFloat(jTable1.getValueAt(l, 4).toString()));
                                        ce.setIdproducto(Integer.parseInt(jTable1.getValueAt(l, 1).toString()));
                                        if (contr_consumoempleado.RestarStockConsumidoLocal(ce)) {
                                            jButton3.setEnabled(true);
                                            jButton4.setText("Modificar");
                                            jButton5.setText("Eliminar");
                                            Limpiar();
                                            LimpiarSeleccionTabla1();
                                        }
                                    }
                                } else if (stockcero > 0) {
                                    String[] opc = {"Ver Informe", "No ver y seguir"};
                                    int i = JOptionPane.showOptionDialog(null, "Hemos verificado que si aplica dicho informe para este producto " + jTextField2.getText() + ", dichos stocks de los insumos de la misma puede tener un stock 0", "ADVERTENCIA!", JOptionPane.DEFAULT_OPTION, JOptionPane.WARNING_MESSAGE, null, opc, opc[0]);
                                    if (i == 0) {
                                        MostrarProductosStockN_MOD();
                                        jLabel11.setText(jTextField2.getText());
                                        color = new ColorearFilas(2);
                                        jTable4.getColumnModel().getColumn(2).setCellRenderer(color);
                                        vStocksProductos.setSize(727, 560);
                                        vStocksProductos.setLocationRelativeTo(this);
                                        vStocksProductos.setModal(true);
                                        vStocksProductos.setVisible(true);
                                    } else {
                                        int g = JOptionPane.showConfirmDialog(null, "Agregar el producto " + jTextField2.getText() + " o elegir otro?", "Confirmar", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
                                        if (g == 0) {
                                            ce.setIdproducto(contr_consumoempleado.ObtenerIDProducto(jTextField2.getText()));
                                            ce.setNomempleado(jTextField1.getText());
                                            ce.setProducto(jTextField2.getText());
                                            ce.setCantidad(Float.parseFloat(jTextField3.getText()));
                                            ce.setIdconsumo(Integer.parseInt(id));
                                            if (contr_consumoempleado.EditarConsumosEmpleados(ce)) {
                                                ce.getCantidad();
                                                ce.getProducto();
                                                if (contr_consumoempleado.RestarStockConsumidoLocal(ce)) {
                                                    JOptionPane.showMessageDialog(null, "Modificado");
                                                    jButton3.setEnabled(true);
                                                    jButton4.setText("Modificar");
                                                    jButton5.setText("Eliminar");
                                                    MostrarDatos();
                                                    Limpiar();
                                                    LimpiarSeleccionTabla1();
                                                }
                                            }
                                        } else {
                                            ce.setCantidad(Float.parseFloat(jTable1.getValueAt(l, 4).toString()));
                                            ce.setIdproducto(Integer.parseInt(jTable1.getValueAt(l, 1).toString()));
                                            if (contr_consumoempleado.RestarStockConsumidoLocal(ce)) {
                                                jButton3.setEnabled(true);
                                                jButton4.setText("Modificar");
                                                jButton5.setText("Eliminar");
                                                Limpiar();
                                                LimpiarSeleccionTabla1();
                                            }
                                        }
                                    }
                                } else {
                                    ce.setIdproducto(contr_consumoempleado.ObtenerIDProducto(jTextField2.getText()));
                                    ce.setNomempleado(jTextField1.getText());
                                    ce.setProducto(jTextField2.getText());
                                    ce.setCantidad(Float.parseFloat(jTextField3.getText()));
                                    ce.setIdconsumo(Integer.parseInt(id));
                                    if (contr_consumoempleado.EditarConsumosEmpleados(ce)) {
                                        ce.getCantidad();
                                        ce.getProducto();
                                        if (contr_consumoempleado.RestarStockConsumidoLocal(ce)) {
                                            JOptionPane.showMessageDialog(null, "Modificado");
                                            jButton3.setEnabled(true);
                                            jButton4.setText("Modificar");
                                            jButton5.setText("Eliminar");
                                            MostrarDatos();
                                            Limpiar();
                                            LimpiarSeleccionTabla1();
                                        }
                                    }
                                }
                            }
                        } else {
                            JOptionPane.showMessageDialog(null, "Formato de fecha incorrecto!");
                        }
                    } else {
                        JOptionPane.showMessageDialog(null, "Debes completar los campos obligatorios");
                    }
                }
            }
        } else {
            int i = jTable1.getSelectedRow();
            if (i == -1) {
                JOptionPane.showMessageDialog(null, "Debes seleccionar una fila");
            } else {
                int j = JOptionPane.showConfirmDialog(null, "Esta seguro que desea Eliminar?", "Confirmar", JOptionPane.YES_NO_OPTION);
                if (j == 0) {
                    ce.setCantidad(Float.parseFloat(jTable1.getValueAt(i, 4).toString()));
                    ce.setIdproducto(Integer.parseInt(jTable1.getValueAt(i, 1).toString()));
                    if (contr_consumoempleado.CancelarStockConsumidoLocal(ce)) {
                        ce.setIdconsumo(Integer.parseInt(jTable1.getValueAt(i, 0).toString()));
                        if (contr_consumoempleado.EliminarConsumosEmpleados(ce)) {
                            JOptionPane.showMessageDialog(null, "Eliminado");
                            MostrarDatos();
                        }
                    }
                } else {
                    LimpiarSeleccionTabla1();
                }
            }
        }
    }//GEN-LAST:event_jButton5ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private com.toedter.calendar.JDateChooser jDateChooser2;
    private com.toedter.calendar.JDateChooser jDateChooser3;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables
}
