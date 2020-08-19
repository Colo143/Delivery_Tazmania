package Vistas;

import Controlador.control_Productos;
import Controlador.control_existencias;
import Modelo.Productos;
import java.awt.Color;
import java.awt.Toolkit;
import java.awt.event.KeyEvent;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

/**
 *
 * @author Colo-PC
 */
public final class vGestion_Productos extends javax.swing.JInternalFrame {
    
    control_existencias conexis = new control_existencias();
    control_Productos producto = new control_Productos();
    Productos p = new Productos();
    String id, categoria, nombreproducto, precioventa;
    vLista_Productos listaproductos = null;

    public vGestion_Productos() {
        initComponents();
        AutoCompletarCategoriaProducto();
        //Mostrar();
        EliminarItemsVacios();
        //jList2.setVisible(false);
        /*jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent e) {
                if (e.getClickCount() == 2) {
                    jButtonAgregar.setEnabled(false);
                    jButtonModificar.setText("Cancelar");
                    jButtonCancelar.setText("Modificar");
                    jButton4.setEnabled(false);
                    int fila = jTable1.rowAtPoint(e.getPoint());

                    setDefaultCloseOperation(DO_NOTHING_ON_CLOSE);
                    id = jTable1.getValueAt(fila, 0).toString();
                    jComboBoxCategorias.setSelectedItem(jTable1.getValueAt(fila, 2).toString());
                    jTextFieldNombreProducto.setText(jTable1.getValueAt(fila, 3).toString());
                    jTextFieldPrecioVenta.setText(jTable1.getValueAt(fila, 4).toString());
                    fecha = jTable1.getValueAt(fila, 5).toString();
                    if (!fecha.equals("-")) {
                        DateFormat df = new SimpleDateFormat("dd/MM/yyyy HH:mm");
                        try {
                            fechaseleccionada = new java.sql.Timestamp(df.parse(fecha).getTime());
                        } catch (ParseException ex) {
                            Logger.getLogger(vListas_Compras.class.getName()).log(Level.SEVERE, null, ex);
                        }
                        jDateFecha.setDate(fechaseleccionada);
                    }
                }
            }
        });*/
    }

    /*public void Limpiar() {
        jComboBoxCategorias.setSelectedItem("Seleccionar Categoría...");
        jTextFieldNombreProducto.setText("");
        jTextFieldPrecioVenta.setText("");
        ((JTextField) jDateFecha.getDateEditor().getUiComponent()).setText("");
    }*/
    public void AutoCompletarCategoriaProducto() {
        Object[] categoriaproducto = conexis.combox("categoriasproductos", "descripcion");
        for (Object row : categoriaproducto) {
            jComboBoxCategorias.addItem((String) row);
        }
    }

    public void EliminarItemsVacios() {
        for (int i = 0; i < jComboBoxCategorias.getItemCount(); i++) {
            if (jComboBoxCategorias.getItemAt(i) == null) {
                jComboBoxCategorias.removeItemAt(i);
            }
        }
    }

    /*public void ReemplazarNulos() {
        if (jTable1.getRowCount() != 0) {
            for (int i = 0; i < jTable1.getRowCount(); i++) {
                if (jTable1.getValueAt(i, 5).equals("00/00/0000 12:00")) {
                    jTable1.setValueAt("-", i, 5);
                }
            }
        }
    }*/

 /*public void Mostrar() {
        String[] columnas = {"IDPROD", "IDCATEGORIAPRODUCTO", "CATEGORIA", "DESCRIPCION", "PRECIO VENTA", "FECHA REGISTRO"};
        Object[][] dato = producto.MostrarDatos();
        datos = new DefaultTableModel(dato, columnas);
        jTable1.setModel(datos);
        EliminarFilasVacias();
        ReemplazarNulos();
        //AjustarTamañoFilas();
        ocultar_columnas();
    }*/
 /*public void ListaProductos(){
        listprod = conexis.list("productos", "descripcion", jTextField1.getText());
        String substr = jTextField1.getText().toLowerCase();
        list = new DefaultListModel();
        jList2.setModel(list);
        list.removeAllElements();
        if(listprod.size() > 0){
            for(int i=0; i < listprod.size(); i++){
                if(listprod.get(i) == null){
                    listprod.remove(i);
                } else {
                    String sublist = listprod.get(i).toLowerCase();
                    if(sublist.contains(substr)){
                        list.addElement(listprod.get(i));
                        jList2.setVisible(true);
                        if(jTextField1.getText().isEmpty()){
                            jList2.setVisible(false);
                        }
                    }
                }
            }
        }
    }*/

 /*public void ocultar_columnas() {
        jTable1.getColumnModel().getColumn(0).setMaxWidth(0);
        jTable1.getColumnModel().getColumn(0).setMinWidth(0);
        jTable1.getColumnModel().getColumn(0).setPreferredWidth(0);
        jTable1.getColumnModel().getColumn(1).setMaxWidth(0);
        jTable1.getColumnModel().getColumn(1).setMinWidth(0);
        jTable1.getColumnModel().getColumn(1).setPreferredWidth(0);
    }*/

 /*public void EliminarFilasVacias() {
        if (jTable1.getRowCount() != 0) {
            for (int columna = 0; columna < jTable1.getColumnCount(); columna++) {
                for (int fila = 0; fila < jTable1.getRowCount(); fila++) {
                    if (jTable1.getValueAt(fila, columna) == null) {
                        datos.removeRow(fila);
                    }
                }
            }
        }
    }*/

 /*public void LimpiarSeleccion() {
        jTable1.clearSelection();
        jTable1.getSelectionModel().clearSelection();
    }*/
    public void VolverListaProductos() {
        listaproductos = new vLista_Productos();
        vMenuPrincipal.jDesktopPane1.add(listaproductos);
        listaproductos.setVisible(true);
    }

    public boolean VerificarProductosRepetidos() {
        boolean repetido;
        String nomproducto = producto.ObtenerProducto(jTextFieldNombreProducto.getText());
        repetido = !nomproducto.isEmpty();
        return repetido;
    }

    public boolean VerificarProductosRepetidosModificar() {
        boolean repetido = true;
        if (!jComboBoxCategorias.getSelectedItem().equals(categoria) || !jTextFieldNombreProducto.getText().equals(nombreproducto) || !jTextFieldPrecioVenta.getText().equals(precioventa)) {
            repetido = false;
        }
        return repetido;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLayeredPane1 = new javax.swing.JLayeredPane();
        jComboBoxCategorias = new javax.swing.JComboBox<>();
        jLabelNombre = new javax.swing.JLabel();
        jTextFieldNombreProducto = new javax.swing.JTextField();
        jLabelFecha = new javax.swing.JLabel();
        jDateFecha = new com.toedter.calendar.JDateChooser();
        jButtonCancelar = new javax.swing.JButton();
        jButtonAgregar = new javax.swing.JButton();
        jButtonModificar = new javax.swing.JButton();
        jLabelPrecioVenta = new javax.swing.JLabel();
        jTextFieldPrecioVenta = new javax.swing.JTextField();
        jLabelCategoria = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 248, 177));
        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);
        setTitle("Administrar Productos");
        setAutoscrolls(true);
        setFrameIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/LogoDelivery.png"))); // NOI18N
        try {
            setSelected(true);
        } catch (java.beans.PropertyVetoException e1) {
            e1.printStackTrace();
        }
        setVisible(true);
        addInternalFrameListener(new javax.swing.event.InternalFrameListener() {
            public void internalFrameActivated(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameClosed(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameClosing(javax.swing.event.InternalFrameEvent evt) {
                formInternalFrameClosing(evt);
            }
            public void internalFrameDeactivated(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameDeiconified(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameIconified(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameOpened(javax.swing.event.InternalFrameEvent evt) {
            }
        });
        addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                formMouseClicked(evt);
            }
        });

        jLayeredPane1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jComboBoxCategorias.setFont(new java.awt.Font("Segoe UI Semibold", 0, 13)); // NOI18N
        jComboBoxCategorias.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccionar Categoría..." }));
        jComboBoxCategorias.setOpaque(false);
        jLayeredPane1.add(jComboBoxCategorias, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 50, 170, 30));

        jLabelNombre.setFont(new java.awt.Font("Segoe UI Semibold", 0, 13)); // NOI18N
        jLabelNombre.setText("(*) Nombre");
        jLayeredPane1.add(jLabelNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 100, 108, 22));

        jTextFieldNombreProducto.setFont(new java.awt.Font("Segoe UI Semibold", 0, 13)); // NOI18N
        jTextFieldNombreProducto.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextFieldNombreProductoKeyTyped(evt);
            }
        });
        jLayeredPane1.add(jTextFieldNombreProducto, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 130, 170, 30));

        jLabelFecha.setFont(new java.awt.Font("Segoe UI Semibold", 0, 13)); // NOI18N
        jLabelFecha.setText("Fecha:");
        jLayeredPane1.add(jLabelFecha, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 100, 104, 22));

        jDateFecha.setDateFormatString("dd/MM/yyyy HH:mm");
        jDateFecha.setFont(new java.awt.Font("Segoe UI Semibold", 0, 13)); // NOI18N
        jDateFecha.setOpaque(false);
        jLayeredPane1.add(jDateFecha, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 130, 170, 30));

        jButtonCancelar.setBackground(new java.awt.Color(237, 124, 61));
        jButtonCancelar.setFont(new java.awt.Font("Segoe UI Semibold", 0, 12)); // NOI18N
        jButtonCancelar.setText("Cancelar");
        jButtonCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCancelarActionPerformed(evt);
            }
        });
        jLayeredPane1.add(jButtonCancelar, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 200, 100, 30));

        jButtonAgregar.setBackground(new java.awt.Color(252, 249, 57));
        jButtonAgregar.setFont(new java.awt.Font("Segoe UI Semibold", 0, 12)); // NOI18N
        jButtonAgregar.setText("Agregar");
        jButtonAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAgregarActionPerformed(evt);
            }
        });
        jLayeredPane1.add(jButtonAgregar, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 200, 100, 30));

        jButtonModificar.setBackground(new java.awt.Color(252, 249, 57));
        jButtonModificar.setFont(new java.awt.Font("Segoe UI Semibold", 0, 12)); // NOI18N
        jButtonModificar.setText("Modificar");
        jButtonModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonModificarActionPerformed(evt);
            }
        });
        jLayeredPane1.add(jButtonModificar, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 200, 100, 30));

        jLabelPrecioVenta.setFont(new java.awt.Font("Segoe UI Semibold", 0, 13)); // NOI18N
        jLabelPrecioVenta.setText("Precio Venta:");
        jLayeredPane1.add(jLabelPrecioVenta, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 20, 94, 19));

        jTextFieldPrecioVenta.setFont(new java.awt.Font("Segoe UI Semibold", 0, 13)); // NOI18N
        jTextFieldPrecioVenta.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextFieldPrecioVentaKeyTyped(evt);
            }
        });
        jLayeredPane1.add(jTextFieldPrecioVenta, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 50, 170, 30));

        jLabelCategoria.setFont(new java.awt.Font("Segoe UI Semibold", 0, 13)); // NOI18N
        jLabelCategoria.setText("(*) Categoría:");
        jLayeredPane1.add(jLabelCategoria, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 20, 140, 22));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLayeredPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 600, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLayeredPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 252, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAgregarActionPerformed
        if (!jComboBoxCategorias.getSelectedItem().equals("Seleccionar Categoría...") && !jTextFieldNombreProducto.getText().trim().equals("")) {
            if (VerificarProductosRepetidos() == false) {
                if (jDateFecha.getDateEditor().getUiComponent().getForeground() != Color.RED) {
                    p.setIdcategoriaproducto(producto.ObtenerIDCategoriaProducto((String) jComboBoxCategorias.getSelectedItem()));
                    p.setDescripcion(jTextFieldNombreProducto.getText());
                    if (jTextFieldPrecioVenta.getText().trim().length() == 0) {
                        p.setPrecioventa((float) 0.0);
                    } else {
                        p.setPrecioventa(Float.parseFloat(jTextFieldPrecioVenta.getText()));
                    }
                    if (producto.InsertarProductos(p)) {
                        JOptionPane.showMessageDialog(null, "Nuevo Producto agregado");
                        //Mostrar();
                        //Limpiar();
                        VolverListaProductos();
                    }
                } else {
                    JOptionPane.showMessageDialog(null, "Formato de Fecha incorrecto!");
                }
            } else {
                JOptionPane.showMessageDialog(null, "Producto ya Agregado!");
            }
        } else {
            JOptionPane.showMessageDialog(null, "Debes completar los campos obligatorios");
        }
    }//GEN-LAST:event_jButtonAgregarActionPerformed

    private void jButtonModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonModificarActionPerformed
        /*if (jButtonModificar.getText().equals("Modificar")) {
            int s = jTable1.getSelectedRow();
            if (s == -1) {
                JOptionPane.showMessageDialog(null, "Debes seleccionar una fila");
            } else {
                jButtonAgregar.setEnabled(false);
                jButtonModificar.setText("Cancelar");
                jButtonCancelar.setText("Modificar");
                jButton4.setEnabled(false);
                fecha = jTable1.getValueAt(s, 5).toString();
                if (!fecha.equals("-")) {
                    DateFormat df = new SimpleDateFormat("dd/MM/yyyy HH:mm");
                    try {
                        fechaseleccionada = new java.sql.Timestamp(df.parse(fecha).getTime());
                    } catch (ParseException ex) {
                        Logger.getLogger(vListas_Compras.class.getName()).log(Level.SEVERE, null, ex);
                    }
                    jDateFecha.setDate(fechaseleccionada);
                }
                setDefaultCloseOperation(DO_NOTHING_ON_CLOSE);
                id = jTable1.getValueAt(s, 0).toString();
                jComboBoxCategorias.setSelectedItem(jTable1.getValueAt(s, 2).toString());
                jTextFieldNombreProducto.setText(jTable1.getValueAt(s, 3).toString());
                jTextFieldPrecioVenta.setText(jTable1.getValueAt(s, 4).toString());
            }
        } else {
            int i = JOptionPane.showConfirmDialog(null, "Cancelar Modificacion?", "Confirmar", JOptionPane.YES_NO_OPTION);
            if (i == 0) {
                setDefaultCloseOperation(DISPOSE_ON_CLOSE);
                jButtonAgregar.setEnabled(true);
                jButton4.setEnabled(true);
                jButtonModificar.setText("Modificar");
                jButtonCancelar.setText("Eliminar");
                Limpiar();
                LimpiarSeleccion();
            }
        }*/
        if (!jComboBoxCategorias.getSelectedItem().equals("Seleccionar Categoría...") && !jTextFieldNombreProducto.getText().trim().equals("")) {
            if (VerificarProductosRepetidosModificar() == false) {
                if (jDateFecha.getDateEditor().getUiComponent().getForeground() != Color.RED) {
                    int i = JOptionPane.showConfirmDialog(null, "Guardar Cambios?", "Confirmar", JOptionPane.YES_NO_OPTION);
                    if (i == 0) {
                        p.setIdcategoriaproducto(producto.ObtenerIDCategoriaProducto((String) jComboBoxCategorias.getSelectedItem()));
                        p.setDescripcion(jTextFieldNombreProducto.getText());
                        if (jTextFieldPrecioVenta.getText().trim().length() == 0) {
                            p.setPrecioventa((float) 0.0);
                        } else {
                            p.setPrecioventa(Float.parseFloat(jTextFieldPrecioVenta.getText()));
                        }
                        p.setIdproducto(Integer.parseInt(id));
                        if (producto.EditarProductos(p)) {
                            JOptionPane.showMessageDialog(null, "Modificado");
                            VolverListaProductos();
                        }
                    }
                } else {
                    JOptionPane.showMessageDialog(null, "Formato de Fecha incorrecto!");
                }
            } else {
                JOptionPane.showMessageDialog(null, "Este producto ya fue agregado!");
                JOptionPane.showMessageDialog(null, "Elimine o modifique el producto con los mismos datos.");
            }
        } else {
            JOptionPane.showMessageDialog(null, "Debes completar los campos obligatorios");
        }
    }//GEN-LAST:event_jButtonModificarActionPerformed

    private void jButtonCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCancelarActionPerformed
        /*if (jButtonCancelar.getText().equals("Eliminar")) {
            int seleccionado = jTable1.getSelectedRow();
            if (seleccionado == -1) {
                JOptionPane.showMessageDialog(null, "Debes seleccionar una fila");
            } else {
                int i = JOptionPane.showConfirmDialog(null, "Esta seguro de Eliminar?", "Confirmar", JOptionPane.YES_NO_OPTION);
                if (i == 0) {
                    p.setIdproducto(Integer.parseInt((String) jTable1.getValueAt(seleccionado, 0)));
                    if (producto.EliminarProductos(p)) {
                        JOptionPane.showMessageDialog(null, "Eliminado");
                        Mostrar();
                    }
                } else {
                    LimpiarSeleccion();
                }
            }
        }*/
        if (!jButtonAgregar.isEnabled()) {
            int i = JOptionPane.showConfirmDialog(null, "Cancelar Modificacion?", "Confirmar", JOptionPane.YES_NO_OPTION);
            if (i == 0) {
                dispose();
                VolverListaProductos();
            } else {
                setDefaultCloseOperation(DO_NOTHING_ON_CLOSE);
            }
        } else if (!jTextFieldNombreProducto.getText().trim().isEmpty() || !((JTextField) jDateFecha.getDateEditor().getUiComponent()).getText().isEmpty() || !jComboBoxCategorias.getSelectedItem().equals("Seleccionar Categoría...")) {
            int i = JOptionPane.showConfirmDialog(null, "Esta seguro de salir?", "Confirmar", JOptionPane.YES_NO_OPTION);
            if (i == 0) {
                dispose();
                VolverListaProductos();
            } else {
                setDefaultCloseOperation(DO_NOTHING_ON_CLOSE);
            }
        } else {
            dispose();
        }
    }//GEN-LAST:event_jButtonCancelarActionPerformed

    private void formInternalFrameClosing(javax.swing.event.InternalFrameEvent evt) {//GEN-FIRST:event_formInternalFrameClosing
        if (!jButtonAgregar.isEnabled()) {
            int i = JOptionPane.showConfirmDialog(null, "Cancelar Modificacion?", "Confirmar", JOptionPane.YES_NO_OPTION);
            if (i == 0) {
                dispose();
                VolverListaProductos();
            } else {
                setDefaultCloseOperation(DO_NOTHING_ON_CLOSE);
            }
        } else if (!jTextFieldNombreProducto.getText().trim().isEmpty() || !((JTextField) jDateFecha.getDateEditor().getUiComponent()).getText().isEmpty() || !jComboBoxCategorias.getSelectedItem().equals("Seleccionar Categoría...")) {
            int i = JOptionPane.showConfirmDialog(null, "Esta seguro de salir?", "Confirmar", JOptionPane.YES_NO_OPTION);
            if (i == 0) {
                dispose();
                VolverListaProductos();
            } else {
                setDefaultCloseOperation(DO_NOTHING_ON_CLOSE);
            }
        } else {
            dispose();
        }
    }//GEN-LAST:event_formInternalFrameClosing

    private void jTextFieldPrecioVentaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldPrecioVentaKeyTyped
        char[] ñ = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', '.', KeyEvent.VK_BACK_SPACE};
        int b = 0;
        for (int i = 0; i <= 11; i++) {
            if (ñ[i] == evt.getKeyChar()) {
                b = 1;
            }
        }
        if (b == 0) {
            evt.consume();
            Toolkit.getDefaultToolkit().beep();
        }
    }//GEN-LAST:event_jTextFieldPrecioVentaKeyTyped

    private void formMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMouseClicked
        /*LimpiarSeleccion();
        Mostrar();
        jTextField1.setText("");*/
    }//GEN-LAST:event_formMouseClicked

    private void jTextFieldNombreProductoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldNombreProductoKeyTyped
        char c = evt.getKeyChar();
        if (Character.isLowerCase(c)) {
            String cadena = ("" + c).toUpperCase();
            c = cadena.charAt(0);
            evt.setKeyChar(c);
        }
    }//GEN-LAST:event_jTextFieldNombreProductoKeyTyped


    // Variables declaration - do not modify//GEN-BEGIN:variables
    public static javax.swing.JButton jButtonAgregar;
    public static javax.swing.JButton jButtonCancelar;
    public static javax.swing.JButton jButtonModificar;
    public static javax.swing.JComboBox<String> jComboBoxCategorias;
    public static com.toedter.calendar.JDateChooser jDateFecha;
    private javax.swing.JLabel jLabelCategoria;
    private javax.swing.JLabel jLabelFecha;
    private javax.swing.JLabel jLabelNombre;
    private javax.swing.JLabel jLabelPrecioVenta;
    private javax.swing.JLayeredPane jLayeredPane1;
    public static javax.swing.JTextField jTextFieldNombreProducto;
    public static javax.swing.JTextField jTextFieldPrecioVenta;
    // End of variables declaration//GEN-END:variables
}
