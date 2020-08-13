/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vistas;

import Controlador.Sentencias_sql;
import Controlador.control_Asistencias;
import Controlador.control_Movimientos_Caja;
import Controlador.control_existencias;
import Modelo.Asistencias;
import Modelo.Movimientos_Caja;
import java.sql.Timestamp;
import java.util.ArrayList;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author CRISTIAN
 */
public class vLista_Asistencias extends javax.swing.JInternalFrame {

    String id, fecha, date, desde, hasta;
    control_Asistencias asistencia = new control_Asistencias();
    Asistencias a = new Asistencias();
    control_existencias con = new control_existencias();
    control_Movimientos_Caja control_mc = new control_Movimientos_Caja();
    Movimientos_Caja mc = new Movimientos_Caja();
    Sentencias_sql sql = new Sentencias_sql();
    DefaultTableModel row, modelemp, buscarfechas;
    Timestamp fechaseleccionada;
    DefaultListModel list;
    ArrayList<String> listemp;
    /**
     * Creates new form vLista_Asistencias
     */
    public vLista_Asistencias() {
        initComponents();
        Mostrar();
    }

    public void Mostrar() {
        String[] columnas = {"ID ASISTENCIA", "ID EMPLEADO", "NRO ASISTENCIA", "EMPLEADO", "DESCRIPCION", "SUELDO", "FECHA"};
        Object[][] datostabla = asistencia.MostrarDatos();
        row = new DefaultTableModel(datostabla, columnas);
        jTable1.setModel(row);
        EliminarFilasVacias();
        //AjustarTamañoFilasAsistencias();
        ocultar_columnas();
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable(){
            public boolean isCellEditable(int rowIndex, int colIndex) {
                return false; //Disallow the editing of any cell
            }
        };
        jPanel1 = new javax.swing.JPanel();
        jDateChooser2 = new com.toedter.calendar.JDateChooser();
        jDateChooser3 = new com.toedter.calendar.JDateChooser();
        jButton7 = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 248, 177));
        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setTitle("Listado de Asistencias");
        setFrameIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/LogoDelivery.png"))); // NOI18N

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
        jScrollPane1.setViewportView(jTable1);

        jPanel1.setBackground(new java.awt.Color(255, 248, 177));
        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jDateChooser2.setFont(new java.awt.Font("Segoe UI Semibold", 0, 13)); // NOI18N

        jDateChooser3.setFont(new java.awt.Font("Segoe UI Semibold", 0, 13)); // NOI18N

        jButton7.setFont(new java.awt.Font("Segoe UI Semibold", 0, 13)); // NOI18N
        jButton7.setText("Buscar");
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Segoe UI Semibold", 0, 13)); // NOI18N
        jLabel4.setText("Desde:");

        jLabel5.setFont(new java.awt.Font("Segoe UI Semibold", 0, 13)); // NOI18N
        jLabel5.setText("Hasta:");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(55, 55, 55)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jDateChooser2, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addGap(112, 112, 112)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jDateChooser3, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addContainerGap(47, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton7, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(222, 222, 222))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jLabel5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jDateChooser2, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jDateChooser3, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(1, 1, 1)
                .addComponent(jButton7)
                .addContainerGap())
        );

        jButton1.setBackground(new java.awt.Color(252, 249, 57));
        jButton1.setFont(new java.awt.Font("Segoe UI Semibold", 0, 12)); // NOI18N
        jButton1.setText("Agregar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setBackground(new java.awt.Color(252, 249, 57));
        jButton2.setFont(new java.awt.Font("Segoe UI Semibold", 0, 12)); // NOI18N
        jButton2.setText("Modificar");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setBackground(new java.awt.Color(240, 87, 49));
        jButton3.setFont(new java.awt.Font("Segoe UI Semibold", 0, 12)); // NOI18N
        jButton3.setText("Eliminar");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 824, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(136, 136, 136))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(69, 69, 69)
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(69, 69, 69)
                        .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(194, 194, 194))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(39, 39, 39)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 261, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(23, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public void EliminarFilasVacias() {
        if (jTable1.getRowCount() != 0) {
            for (int columna = 0; columna < jTable1.getColumnCount(); columna++) {
                for (int fila = 0; fila < jTable1.getRowCount(); fila++) {
                    if (jTable1.getValueAt(fila, columna) == null) {
                        row.removeRow(fila);
                    }
                }
            }
        }
    }
    
    public void MostrarBusquedaFechas() {
        String[] columnas = {"ID ASISTENCIA", "ID EMPLEADO", "NRO ASISTENCIA", "EMPLEADO", "DESCRIPCION", "SUELDO", "FECHA"};
        Object[][] datostabla = asistencia.MostrarDatosFechas(desde, hasta);
        if (datostabla.length != 0) {
            buscarfechas = new DefaultTableModel(datostabla, columnas);
            jTable1.setModel(buscarfechas);
            EliminarFilasVacias();
            //AjustarTamañoFilasAsistencias();
            ocultar_columnas();
        } else {
            JOptionPane.showMessageDialog(null, "No se encontraron datos");
        }
    }
    
    public void ocultar_columnas() {
        jTable1.getColumnModel().getColumn(0).setMaxWidth(0);
        jTable1.getColumnModel().getColumn(0).setMinWidth(0);
        jTable1.getColumnModel().getColumn(0).setPreferredWidth(0);
        jTable1.getColumnModel().getColumn(1).setMaxWidth(0);
        jTable1.getColumnModel().getColumn(1).setMinWidth(0);
        jTable1.getColumnModel().getColumn(1).setPreferredWidth(0);
    }
    
    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        desde = ((JTextField) jDateChooser2.getDateEditor().getUiComponent()).getText();
        hasta = ((JTextField) jDateChooser3.getDateEditor().getUiComponent()).getText();
        if (jDateChooser2.getDateEditor().getUiComponent().getForeground() != Color.RED) {
            if (jDateChooser3.getDateEditor().getUiComponent().getForeground() != Color.RED) {
                if (!desde.isEmpty() && !hasta.isEmpty()) {
                    MostrarBusquedaFechas();
                } else if (desde.isEmpty() || hasta.isEmpty()) {
                    JOptionPane.showMessageDialog(null, "Debe ingresar la fecha que falta");
                }
            } else {
                JOptionPane.showMessageDialog(null, "Formato de fecha incorrecto!");
            }
        } else {
            JOptionPane.showMessageDialog(null, "Formato de fecha incorrecto!");
        }
    }//GEN-LAST:event_jButton7ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        if (!jTextField1.getText().trim().equals("") && !jTextField2.getText().trim().equals("") && !((JTextField) jDateChooser1.getDateEditor().getUiComponent()).getText().equals("")) {
            if (jDateChooser1.getDateEditor().getUiComponent().getForeground() != Color.RED) {
                date = ((JTextField) jDateChooser1.getDateEditor().getUiComponent()).getText();
                if (jTextField3.getText().equals("")) {
                    int i = JOptionPane.showConfirmDialog(null, "No cobrará sueldo este empleado, esta seguro?", "Confirmar", JOptionPane.YES_NO_OPTION);
                    if (i == 0) {
                        a.setIdempleado(asistencia.ObtenerIDEmpleado(jTextField1.getText()));
                        a.setDescripcion(jTextField2.getText());
                        a.setSueldo((float) 0.0);
                        if (asistencia.InsertarAsistencias(a)) {
                            int idmovimiento = sql.obtenerUltimoId("asistencias", "idasistencia");
                            String codigo = sql.generaCodigo("pago_emp");
                            sql.ejecutarSql("UPDATE asistencias SET NroAsistencia ='" + codigo + "' WHERE idasistencia=" + Integer.toString(idmovimiento));
                            a.setNroAsistencia(codigo);
                            mc.setDescripcion("PAGO EMPLEADOS");
                            mc.setIdcajaturno(Session.getIdcajaturno_abierta());
                            mc.setIdtipomovimiento(11);
                            mc.setIdusuario(Session.getIdusuario());
                            mc.setNromovimiento(codigo);
                            mc.setFecha_movimiento(date);
                            mc.setMonto(a.getSueldo());
                            mc.setIdmovimiento(idmovimiento);
                            mc.setDetalle(a.getDescripcion());
                            mc.setActivo(1);
                            control_mc.InsertarMovimientosCaja(mc);
                            JOptionPane.showMessageDialog(null, "Nueva Asistencia agregado");
                            Mostrar();
                            limpiar();
                        }
                    }
                } else {
                    String sueldo = jTextField3.getText(), svalor = "", svalordec = "", svalordecdob = "";
                    int cant = jTextField3.getText().length();
                    switch (cant) {
                        case 1:
                        svalor = sueldo.substring(0, 1);
                        break;
                        case 3:
                        svalordec = sueldo.substring(0, 3);
                        break;
                        case 4:
                        svalordecdob = sueldo.substring(0, 4);
                        break;
                        default:
                        break;
                    }
                    if (svalor.equals(",") || svalor.equals(".")) { //svalor.equals(",") || svalor.equals(".")
                        JOptionPane.showMessageDialog(null, "Ingrese correctamente el sueldo");
                    } else if (svalor.equals("0") || svalordec.equals("0.0") || svalordecdob.equals("0.00")) {
                        int j = JOptionPane.showConfirmDialog(null, "No cobrará sueldo este empleado, esta seguro?", "Confirmar", JOptionPane.YES_NO_OPTION);
                        if (j == 0) {
                            a.setIdempleado(asistencia.ObtenerIDEmpleado(jTextField1.getText()));
                            a.setDescripcion(jTextField2.getText());
                            a.setSueldo((float) 0.0);
                            if (asistencia.InsertarAsistencias(a)) {
                                int idmovimiento = sql.obtenerUltimoId("asistencias", "idasistencia");
                                String codigo = sql.generaCodigo("pago_emp");
                                sql.ejecutarSql("UPDATE asistencias SET NroAsistencia ='" + codigo + "' WHERE idasistencia=" + Integer.toString(idmovimiento));
                                a.setNroAsistencia(codigo);
                                mc.setDescripcion("PAGO EMPLEADOS");
                                mc.setIdcajaturno(Session.getIdcajaturno_abierta());
                                mc.setIdtipomovimiento(11);
                                mc.setIdusuario(Session.getIdusuario());
                                mc.setNromovimiento(codigo);
                                mc.setFecha_movimiento(date);
                                mc.setMonto(a.getSueldo());
                                mc.setIdmovimiento(idmovimiento);
                                mc.setDetalle(a.getDescripcion());
                                mc.setActivo(1);
                                control_mc.InsertarMovimientosCaja(mc);
                                JOptionPane.showMessageDialog(null, "Nueva Asistencia agregado");
                                Mostrar();
                                limpiar();
                            }
                        }
                    } else {
                        a.setIdempleado(asistencia.ObtenerIDEmpleado(jTextField1.getText()));
                        a.setDescripcion(jTextField2.getText());
                        a.setSueldo(Float.parseFloat(sueldo));
                        if (asistencia.InsertarAsistencias(a)) {
                            int idmovimiento = sql.obtenerUltimoId("asistencias", "idasistencia");
                            String codigo = sql.generaCodigo("pago_emp");
                            sql.ejecutarSql("UPDATE asistencias SET NroAsistencia ='" + codigo + "' WHERE idasistencia=" + Integer.toString(idmovimiento));
                            a.setNroAsistencia(codigo);
                            mc.setDescripcion("PAGO EMPLEADOS");
                            mc.setIdcajaturno(Session.getIdcajaturno_abierta());
                            mc.setIdtipomovimiento(11);
                            mc.setIdusuario(Session.getIdusuario());
                            mc.setNromovimiento(codigo);
                            mc.setFecha_movimiento(date);
                            mc.setMonto(a.getSueldo());
                            mc.setIdmovimiento(idmovimiento);
                            mc.setDetalle(a.getDescripcion());
                            mc.setActivo(1);
                            control_mc.InsertarMovimientosCaja(mc);
                            JOptionPane.showMessageDialog(null, "Nueva Asistencia agregado");
                            Mostrar();
                            limpiar();
                        }
                    }
                }
            } else {
                JOptionPane.showMessageDialog(null, "Formato de fecha incorrecto!");
            }
        } else {
            JOptionPane.showMessageDialog(null, "Debe completar los campos obligatorios");
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        if (jButton2.getText().equals("Modificar")) {
            int s = jTable1.getSelectedRow();
            if (s == -1) {
                JOptionPane.showMessageDialog(null, "Debes seleccionar una fila");
            } else {
                setDefaultCloseOperation(DO_NOTHING_ON_CLOSE);
                jButton1.setEnabled(false);
                jButton3.setText("Modificar");
                jButton2.setText("Cancelar");
                fecha = (String) (jTable1.getValueAt(s, 6));
                DateFormat df = new SimpleDateFormat("dd/MM/yyyy HH:mm");
                try {
                    fechaseleccionada = new java.sql.Timestamp(df.parse(fecha).getTime());

                } catch (ParseException ex) {
                    Logger.getLogger(vListas_Compras.class
                        .getName()).log(Level.SEVERE, null, ex);
                }
                id = (jTable1.getValueAt(s, 0).toString());
                jTextField1.setText(jTable1.getValueAt(s, 3).toString());
                jTextField2.setText(jTable1.getValueAt(s, 4).toString());
                jTextField3.setText(jTable1.getValueAt(s, 5).toString());
                jDateChooser1.setDate(fechaseleccionada);
            }
        } else {
            int i = JOptionPane.showConfirmDialog(null, "Cancelar Modificacion?", "Confirmar", JOptionPane.YES_NO_OPTION);
            if (i == 0) {
                jButton1.setEnabled(true);
                limpiar();
                LimpiarSeleccion();
                jButton2.setText("Modificar");
                jButton3.setText("Eliminar");
                setDefaultCloseOperation(DISPOSE_ON_CLOSE);
            }
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        if (jButton3.getText().equals("Modificar")) {
            if (!jTextField1.getText().trim().equals("") && !jTextField2.getText().trim().equals("") && !((JTextField) jDateChooser1.getDateEditor().getUiComponent()).getText().equals("")) {
                date = ((JTextField) jDateChooser1.getDateEditor().getUiComponent()).getText();
                if (jDateChooser1.getDateEditor().getUiComponent().getForeground() != Color.RED) {
                    if (jTextField3.getText().equals("")) {
                        int i = JOptionPane.showConfirmDialog(null, "No cobrará sueldo este empleado, guardar cambios?", "Confirmar", JOptionPane.YES_NO_OPTION);
                        if (i == 0) {
                            a.setIdempleado(asistencia.ObtenerIDEmpleado(jTextField1.getText()));
                            a.setDescripcion(jTextField2.getText());
                            a.setSueldo((float) 0.0);
                            a.setIdasistencia(Integer.parseInt(id));
                            if (asistencia.EditarAsistencias(a)) {
                                mc.setIdmovimientocaja(control_mc.ObtenerIDMovimientoCaja(Integer.parseInt(id), 11));
                                mc.setIdtipomovimiento(11);
                                mc.setIdusuario(Session.getIdusuario());
                                mc.setFecha_movimiento(date);
                                mc.setMonto(a.getSueldo());
                                mc.setIdmovimiento(Integer.parseInt(id));
                                mc.setDetalle(a.getDescripcion());
                                control_mc.EditarMovimientosCaja(mc);

                                JOptionPane.showMessageDialog(null, "Modificado");
                                jButton1.setEnabled(true);
                                jButton2.setText("Modificar");
                                jButton3.setText("Eliminar");
                                setDefaultCloseOperation(DISPOSE_ON_CLOSE);
                                Mostrar();
                                LimpiarSeleccion();
                                limpiar();
                            }
                        }
                    } else {
                        String sueldo = jTextField3.getText(), svalor = "", svalordec = "", svalordecdob = "";
                        int cant = jTextField3.getText().length();
                        switch (cant) {
                            case 1:
                            svalor = sueldo.substring(0, 1);
                            break;
                            case 3:
                            svalordec = sueldo.substring(0, 3);
                            break;
                            case 4:
                            svalordecdob = sueldo.substring(0, 4);
                            break;
                            default:
                            break;
                        }
                        if (svalor.equals(",") || svalor.equals(".")) { //svalor.equals(",") || svalor.equals(".")
                            JOptionPane.showMessageDialog(null, "Ingrese correctamente el sueldo");
                        } else if (svalor.equals("0") || svalordec.equals("0.0") || svalordecdob.equals("0.00")) {
                            int j = JOptionPane.showConfirmDialog(null, "No cobrará sueldo este empleado, guardar cambios?", "Confirmar", JOptionPane.YES_NO_OPTION);
                            if (j == 0) {
                                a.setIdempleado(asistencia.ObtenerIDEmpleado(jTextField1.getText()));
                                a.setDescripcion(jTextField2.getText());
                                a.setSueldo((float) 0.0);
                                a.setIdasistencia(Integer.parseInt(id));
                                if (asistencia.EditarAsistencias(a)) {
                                    mc.setIdmovimientocaja(control_mc.ObtenerIDMovimientoCaja(Integer.parseInt(id), 11));
                                    mc.setIdtipomovimiento(11);
                                    mc.setIdusuario(Session.getIdusuario());
                                    mc.setFecha_movimiento(date);
                                    mc.setMonto(a.getSueldo());
                                    mc.setIdmovimiento(Integer.parseInt(id));
                                    mc.setDetalle(a.getDescripcion());
                                    control_mc.EditarMovimientosCaja(mc);

                                    JOptionPane.showMessageDialog(null, "Modificado");
                                    jButton1.setEnabled(true);
                                    jButton2.setText("Modificar");
                                    jButton3.setText("Eliminar");
                                    setDefaultCloseOperation(DISPOSE_ON_CLOSE);
                                    Mostrar();
                                    LimpiarSeleccion();
                                    limpiar();
                                }
                            }
                        } else {
                            a.setIdempleado(asistencia.ObtenerIDEmpleado(jTextField1.getText()));
                            a.setDescripcion(jTextField2.getText());
                            a.setSueldo(Float.parseFloat(sueldo));
                            a.setIdasistencia(Integer.parseInt(id));
                            if (asistencia.EditarAsistencias(a)) {
                                mc.setIdmovimientocaja(control_mc.ObtenerIDMovimientoCaja(Integer.parseInt(id), 11));
                                mc.setIdtipomovimiento(11);
                                mc.setIdusuario(Session.getIdusuario());
                                mc.setFecha_movimiento(date);
                                mc.setMonto(a.getSueldo());
                                mc.setIdmovimiento(Integer.parseInt(id));
                                mc.setDetalle(a.getDescripcion());
                                control_mc.EditarMovimientosCaja(mc);

                                JOptionPane.showMessageDialog(null, "Modificado");
                                jButton1.setEnabled(true);
                                jButton2.setText("Modificar");
                                jButton3.setText("Eliminar");
                                setDefaultCloseOperation(DISPOSE_ON_CLOSE);
                                Mostrar();
                                LimpiarSeleccion();
                                limpiar();
                            }
                        }
                    }
                } else {
                    JOptionPane.showMessageDialog(null, "Formato de fecha incorrecto!");
                }
            } else {
                JOptionPane.showMessageDialog(null, "Debe completar los campos obligatorios");
            }
        } else {
            int fila = jTable1.getSelectedRow();
            if (fila == -1) {
                JOptionPane.showMessageDialog(null, "Debes seleccionar una fila");
            } else {
                int i = JOptionPane.showConfirmDialog(null, "Esta seguro que desea Eliminar?", "Confirmar", JOptionPane.YES_NO_OPTION);
                if (i == 0) {
                    String NroAsistencia = jTable1.getValueAt(fila, 2).toString();
                    int idmovimientocaja = control_mc.getIdMovimientocaja(NroAsistencia);
                    mc.setIdmovimientocaja(idmovimientocaja);
                    if (control_mc.EliminarMovimientosCajaAbierta(mc)) {
                        a.setIdasistencia(Integer.parseInt(jTable1.getValueAt(fila, 0).toString()));
                        if (asistencia.EliminarAsistencias(a)) {
                            JOptionPane.showMessageDialog(null, "Eliminado");
                            Mostrar();
                        }
                    }
                } else {
                    LimpiarSeleccion();
                }
            }
        }
    }//GEN-LAST:event_jButton3ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton7;
    public static com.toedter.calendar.JDateChooser jDateChooser2;
    public static com.toedter.calendar.JDateChooser jDateChooser3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables
}
