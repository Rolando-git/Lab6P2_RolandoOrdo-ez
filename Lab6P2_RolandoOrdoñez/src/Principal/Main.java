/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Principal;

import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author Rolando
 */
public class Main extends javax.swing.JFrame {

    /**
     * Creates new form Main
     */
    public Main() {
        initComponents();
        this.setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jd_admin = new javax.swing.JDialog();
        jLabel3 = new javax.swing.JLabel();
        jd_docente = new javax.swing.JDialog();
        jd_alumno = new javax.swing.JDialog();
        jd_crear_docente = new javax.swing.JDialog();
        jLabel5 = new javax.swing.JLabel();
        jt_nombre_docente = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jt_apellido_docente = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jt_usuario_docente = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jt_password_docente = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jt_registro_docente = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jt_titulo_docente = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jt_posgrado = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        js_clases = new javax.swing.JSpinner();
        jLabel13 = new javax.swing.JLabel();
        RB_salud = new javax.swing.JRadioButton();
        RB_licenciatura = new javax.swing.JRadioButton();
        RB_Ingenieria = new javax.swing.JRadioButton();
        jb_agregar_docente = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        buttonGroup2 = new javax.swing.ButtonGroup();
        Titulo = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jt_usuario = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jp_password = new javax.swing.JPasswordField();
        jb_ingresar = new javax.swing.JButton();
        RB_admin = new javax.swing.JRadioButton();
        RB_docente = new javax.swing.JRadioButton();
        RB_alumno = new javax.swing.JRadioButton();
        Fondo = new javax.swing.JLabel();

        jd_admin.setPreferredSize(new java.awt.Dimension(800, 500));
        jd_admin.getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Principal/color_verde.jpg"))); // NOI18N
        jd_admin.getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 800, 500));

        javax.swing.GroupLayout jd_docenteLayout = new javax.swing.GroupLayout(jd_docente.getContentPane());
        jd_docente.getContentPane().setLayout(jd_docenteLayout);
        jd_docenteLayout.setHorizontalGroup(
            jd_docenteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        jd_docenteLayout.setVerticalGroup(
            jd_docenteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jd_alumnoLayout = new javax.swing.GroupLayout(jd_alumno.getContentPane());
        jd_alumno.getContentPane().setLayout(jd_alumnoLayout);
        jd_alumnoLayout.setHorizontalGroup(
            jd_alumnoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        jd_alumnoLayout.setVerticalGroup(
            jd_alumnoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        jd_crear_docente.getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel5.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 0));
        jLabel5.setText("Nombre:");
        jd_crear_docente.getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 50, -1, -1));

        jt_nombre_docente.setBackground(new java.awt.Color(255, 255, 0));
        jt_nombre_docente.setFont(new java.awt.Font("Dialog", 3, 14)); // NOI18N
        jt_nombre_docente.setForeground(new java.awt.Color(0, 0, 0));
        jd_crear_docente.getContentPane().add(jt_nombre_docente, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 50, 180, -1));

        jLabel6.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 0));
        jLabel6.setText("Apellido:");
        jd_crear_docente.getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 110, -1, -1));

        jt_apellido_docente.setBackground(new java.awt.Color(255, 255, 0));
        jt_apellido_docente.setFont(new java.awt.Font("Dialog", 3, 14)); // NOI18N
        jt_apellido_docente.setForeground(new java.awt.Color(0, 0, 0));
        jd_crear_docente.getContentPane().add(jt_apellido_docente, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 110, 180, -1));

        jLabel7.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 0));
        jLabel7.setText("Usuario:");
        jd_crear_docente.getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 170, -1, -1));

        jt_usuario_docente.setBackground(new java.awt.Color(255, 255, 0));
        jt_usuario_docente.setFont(new java.awt.Font("Dialog", 3, 14)); // NOI18N
        jt_usuario_docente.setForeground(new java.awt.Color(0, 0, 0));
        jd_crear_docente.getContentPane().add(jt_usuario_docente, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 170, 180, -1));

        jLabel8.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 0));
        jLabel8.setText("Contraseña:");
        jd_crear_docente.getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 230, -1, -1));

        jt_password_docente.setBackground(new java.awt.Color(255, 255, 0));
        jt_password_docente.setForeground(new java.awt.Color(0, 0, 0));
        jd_crear_docente.getContentPane().add(jt_password_docente, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 230, 180, -1));

        jLabel9.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 0));
        jLabel9.setText("N. de registro:");
        jd_crear_docente.getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 280, -1, -1));

        jt_registro_docente.setBackground(new java.awt.Color(255, 255, 0));
        jt_registro_docente.setFont(new java.awt.Font("Dialog", 3, 14)); // NOI18N
        jt_registro_docente.setForeground(new java.awt.Color(0, 0, 0));
        jd_crear_docente.getContentPane().add(jt_registro_docente, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 280, 180, -1));

        jLabel10.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 0));
        jLabel10.setText("Titulo:");
        jd_crear_docente.getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 340, -1, -1));

        jt_titulo_docente.setBackground(new java.awt.Color(255, 255, 0));
        jt_titulo_docente.setFont(new java.awt.Font("Dialog", 3, 14)); // NOI18N
        jt_titulo_docente.setForeground(new java.awt.Color(0, 0, 0));
        jd_crear_docente.getContentPane().add(jt_titulo_docente, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 340, 180, -1));

        jLabel11.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 0));
        jLabel11.setText("Posgrado:");
        jd_crear_docente.getContentPane().add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 400, -1, -1));

        jt_posgrado.setBackground(new java.awt.Color(255, 255, 0));
        jt_posgrado.setFont(new java.awt.Font("Dialog", 3, 14)); // NOI18N
        jt_posgrado.setForeground(new java.awt.Color(0, 0, 0));
        jd_crear_docente.getContentPane().add(jt_posgrado, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 400, 180, -1));

        jLabel12.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 0));
        jLabel12.setText("Veces que ha impartido clases:");
        jd_crear_docente.getContentPane().add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 50, -1, 20));

        js_clases.setModel(new javax.swing.SpinnerNumberModel(0, 0, 99, 1));
        jd_crear_docente.getContentPane().add(js_clases, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 50, -1, -1));

        jLabel13.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 255, 0));
        jLabel13.setText("Facultad:");
        jd_crear_docente.getContentPane().add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 100, -1, -1));

        buttonGroup2.add(RB_salud);
        RB_salud.setForeground(new java.awt.Color(255, 255, 0));
        RB_salud.setSelected(true);
        RB_salud.setText("Salud");
        jd_crear_docente.getContentPane().add(RB_salud, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 100, -1, -1));

        buttonGroup2.add(RB_licenciatura);
        RB_licenciatura.setForeground(new java.awt.Color(255, 255, 0));
        RB_licenciatura.setText("Licenciatura");
        jd_crear_docente.getContentPane().add(RB_licenciatura, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 100, -1, -1));

        buttonGroup2.add(RB_Ingenieria);
        RB_Ingenieria.setForeground(new java.awt.Color(255, 255, 0));
        RB_Ingenieria.setText("Ingenieria");
        jd_crear_docente.getContentPane().add(RB_Ingenieria, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 100, -1, -1));

        jb_agregar_docente.setBackground(new java.awt.Color(255, 255, 0));
        jb_agregar_docente.setForeground(new java.awt.Color(0, 0, 0));
        jb_agregar_docente.setText("Agregar");
        jd_crear_docente.getContentPane().add(jb_agregar_docente, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 160, -1, -1));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Principal/rojo.jpg"))); // NOI18N
        jd_crear_docente.getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 800, 500));

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Login");
        setPreferredSize(new java.awt.Dimension(800, 500));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Titulo.setFont(new java.awt.Font("Dialog", 3, 24)); // NOI18N
        Titulo.setForeground(new java.awt.Color(0, 0, 153));
        Titulo.setText("Ingresar al Sistema");
        getContentPane().add(Titulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 40, -1, -1));

        jLabel1.setFont(new java.awt.Font("Dialog", 3, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 153));
        jLabel1.setText("Usuario:");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 120, -1, -1));

        jt_usuario.setBackground(new java.awt.Color(0, 0, 153));
        jt_usuario.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jt_usuario.setForeground(new java.awt.Color(255, 255, 255));
        getContentPane().add(jt_usuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 120, 220, -1));

        jLabel2.setFont(new java.awt.Font("Dialog", 3, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 153));
        jLabel2.setText("Contraseña:");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 220, -1, -1));

        jp_password.setBackground(new java.awt.Color(0, 0, 153));
        jp_password.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jp_password.setForeground(new java.awt.Color(255, 255, 255));
        getContentPane().add(jp_password, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 230, 220, -1));

        jb_ingresar.setBackground(new java.awt.Color(0, 0, 153));
        jb_ingresar.setFont(new java.awt.Font("Dialog", 3, 14)); // NOI18N
        jb_ingresar.setForeground(new java.awt.Color(255, 255, 255));
        jb_ingresar.setText("Ingresar");
        jb_ingresar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jb_ingresarMouseClicked(evt);
            }
        });
        getContentPane().add(jb_ingresar, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 290, -1, -1));

        buttonGroup1.add(RB_admin);
        RB_admin.setFont(new java.awt.Font("Dialog", 3, 14)); // NOI18N
        RB_admin.setForeground(new java.awt.Color(0, 0, 153));
        RB_admin.setSelected(true);
        RB_admin.setText("Administrador");
        getContentPane().add(RB_admin, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 380, -1, -1));

        buttonGroup1.add(RB_docente);
        RB_docente.setFont(new java.awt.Font("Dialog", 3, 14)); // NOI18N
        RB_docente.setForeground(new java.awt.Color(0, 0, 153));
        RB_docente.setText("Docente");
        getContentPane().add(RB_docente, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 380, -1, -1));

        buttonGroup1.add(RB_alumno);
        RB_alumno.setFont(new java.awt.Font("Dialog", 3, 14)); // NOI18N
        RB_alumno.setForeground(new java.awt.Color(0, 0, 153));
        RB_alumno.setText("alumno");
        getContentPane().add(RB_alumno, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 380, -1, -1));

        Fondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Principal/fondo_celeste.jpg"))); // NOI18N
        getContentPane().add(Fondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 800, 500));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jb_ingresarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jb_ingresarMouseClicked
        // TODO add your handling code here:
        if (RB_admin.isSelected()){
            String a = jt_usuario.getText();
            String b = jp_password.getText();
            if (a.equals("admin")&&b.equals("1234")){
                abrirAdmin();
            }
            else
            {
                JOptionPane.showMessageDialog(this, "usuario/contraseña incorrecta");
            }
        }
        if (RB_docente.isSelected()){
            String a = jt_usuario.getText();
            String b = jp_password.getText();
            boolean centinela = false;
            for (int i = 0; i < docentes.size(); i++) {
                String u = docentes.get(i).getUsuario();
                String p = docentes.get(i).getPassword();
                if (u.equals(a)&&p.equals(b)){
                    centinela = true;
                }
            }
            if (centinela==true){
                abrirDocente();
            }
            else{
                JOptionPane.showMessageDialog(this, "usuario/contraseña incorrectos");
            }
        }
        if (RB_alumno.isSelected()){
            String a = jt_usuario.getText();
            String b = jp_password.getText();
            boolean centinela = false;
            for (int i = 0; i < docentes.size(); i++) {
                String u = docentes.get(i).getUsuario();
                String p = docentes.get(i).getPassword();
                if (u.equals(a)&&p.equals(b)){
                    centinela = true;
                }
            }
            if (centinela==true){
                abrirAlumno();
            }
            else{
                JOptionPane.showMessageDialog(this, "usuario/contraseña incorrectos");
            }
        }
    }//GEN-LAST:event_jb_ingresarMouseClicked

    public void abrirAdmin(){
        jd_admin.setModal(true);
        jd_admin.pack();
        jd_admin.setLocationRelativeTo(this);
        jd_admin.setVisible(true);
    }
    
    public void abrirDocente(){
        jd_docente.setModal(true);
        jd_docente.pack();
        jd_docente.setLocationRelativeTo(this);
        jd_docente.setVisible(true);
    }
    
    public void abrirAlumno(){
        jd_alumno.setModal(true);
        jd_alumno.pack();
        jd_alumno.setLocationRelativeTo(this);
        jd_alumno.setVisible(true);
    }
    
    public void crearDocente(){
        docente D = new docente();
        D.setNombre(jt_nombre_docente.getText());
        D.setApellido(jt_apellido_docente.getText());
        D.setUsuario(jt_usuario_docente.getText());
        D.setPassword(jt_password_docente.getText());
        D.setN_registro(jt_registro_docente.getText());
        D.setTitulo(jt_titulo_docente.getText());
        D.setImpartido_clase((Integer)js_clases.getValue());
        if (RB_salud.isSelected()){
            D.setFacultad("salud");
        }
        if (RB_licenciatura.isSelected()){
            D.setFacultad("licenciatura");
        }
        if (RB_Ingenieria.isSelected()){
            D.setFacultad("ingenieria");
        }
        docentes.add(D);
    }
    
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
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Main().setVisible(true);
            }
        });
    }

    ArrayList<docente> docentes = new ArrayList();
    ArrayList<alumno> alumnos = new ArrayList();
    proyecto proyecto_creado;
    int posicion;
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Fondo;
    private javax.swing.JRadioButton RB_Ingenieria;
    private javax.swing.JRadioButton RB_admin;
    private javax.swing.JRadioButton RB_alumno;
    private javax.swing.JRadioButton RB_docente;
    private javax.swing.JRadioButton RB_licenciatura;
    private javax.swing.JRadioButton RB_salud;
    private javax.swing.JLabel Titulo;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JButton jb_agregar_docente;
    private javax.swing.JButton jb_ingresar;
    private javax.swing.JDialog jd_admin;
    private javax.swing.JDialog jd_alumno;
    private javax.swing.JDialog jd_crear_docente;
    private javax.swing.JDialog jd_docente;
    private javax.swing.JPasswordField jp_password;
    private javax.swing.JSpinner js_clases;
    private javax.swing.JTextField jt_apellido_docente;
    private javax.swing.JTextField jt_nombre_docente;
    private javax.swing.JTextField jt_password_docente;
    private javax.swing.JTextField jt_posgrado;
    private javax.swing.JTextField jt_registro_docente;
    private javax.swing.JTextField jt_titulo_docente;
    private javax.swing.JTextField jt_usuario;
    private javax.swing.JTextField jt_usuario_docente;
    // End of variables declaration//GEN-END:variables
}
