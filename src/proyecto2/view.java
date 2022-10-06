
package proyecto2;

import java.util.ArrayList;
import java.util.Random;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author JorgeJr
 */
public class view extends javax.swing.JFrame {

    int quantum;
    Memoria ram;
    JTable tblProcess = new JTable();

    /**
     * Creates new form view
     */
    public view() {
        initComponents();
        this.quantum = getRandomNumberUsingNextInt(1000, 10000);
        this.ram=new Memoria(this.tblProcesos, this.tblPaginas, this.tblTablaPaginas, this.tblMemoriaVirtual, this.tblMemoriaRam);
        lblQuantum.setText("QUANTUM: " + String.valueOf(this.quantum) + " ms");
        resetTable((DefaultTableModel) tblProcesos.getModel());
        resetTable((DefaultTableModel) this.tblTablaPaginas.getModel());
        resetTable((DefaultTableModel) this.tblMemoriaVirtual.getModel());
        resetTable((DefaultTableModel) this.tblPaginas.getModel());
        setTable((DefaultTableModel) this.tblMemoriaRam.getModel());
        setTableMVirtual((DefaultTableModel) this.tblMemoriaVirtual.getModel());

        this.ram.setQuantum(this.quantum);
        this.ram.start();
    }

    public void resetTable(DefaultTableModel model){
        int rows = model.getRowCount();
        for(int i=rows-1; i >= 0; i--){ model.removeRow(i); }
    }

    public void setTable(DefaultTableModel model){
        resetTable(model);
        //Object[] data = new Object[]{200000,0,200000,""};
        int pos = 1;
        for(Paginas p : this.ram.getMemoriaRam()){
            if(p == null){
                model.addRow(new Object[]{pos,200000,0,200000,""});
            }else{
                model.addRow(new Object[]{pos,200000,p.getSize(),200000-p.getSize(),p.getProceso().getNombre()});
            }
            pos++;
        }
    }

    public void setTableMVirtual(DefaultTableModel model){
        resetTable(model);
        //Object[] data = new Object[]{200000,0,200000,""};
        int pos = 1;
        for(Paginas p : this.ram.getMemoriaVirtual()){
            if(p == null){
                model.addRow(new Object[]{pos,"","",""});
            }
            pos++;
        }
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
        jScrollPane5 = new javax.swing.JScrollPane();
        tblMemoriaRam = new javax.swing.JTable();
        jScrollPane4 = new javax.swing.JScrollPane();
        tblMemoriaVirtual = new javax.swing.JTable();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblTablaPaginas = new javax.swing.JTable();
        jLabel7 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblPaginas = new javax.swing.JTable();
        jLabel3 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txtNombreProceso = new javax.swing.JTextField();
        txtSizeProceso = new javax.swing.JTextField();
        btnCrearProceso = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        lblQuantum = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        tblProcesos = new javax.swing.JTable();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("CAMM TEST");
        setResizable(false);

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tblMemoriaRam.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null}
            },
            new String [] {
                "Marco", "Tamaño marco", "En uso (KB)", "Disponible (KB)", "Proceso"
            }
        ));
        jScrollPane5.setViewportView(tblMemoriaRam);

        jPanel2.add(jScrollPane5, new org.netbeans.lib.awtextra.AbsoluteConstraints(930, 140, 400, 150));

        tblMemoriaVirtual.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null}
            },
            new String [] {
                "Marco", "Proceso", "PID", "Memoria (KB)"
            }
        ));
        jScrollPane4.setViewportView(tblMemoriaVirtual);

        jPanel2.add(jScrollPane4, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 140, 321, 110));

        jLabel5.setFont(new java.awt.Font("DialogInput", 3, 12)); // NOI18N
        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGENES/MEMO.png"))); // NOI18N
        jPanel2.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 100, -1, 30));

        jLabel6.setFont(new java.awt.Font("DialogInput", 3, 12)); // NOI18N
        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGENES/RAM.png"))); // NOI18N
        jPanel2.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(960, 100, -1, 40));

        tblTablaPaginas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null}
            },
            new String [] {
                "PID", "Página", "Marco"
            }
        ));
        jScrollPane2.setViewportView(tblTablaPaginas);

        jPanel2.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 270, 210, 140));

        jLabel7.setFont(new java.awt.Font("DialogInput", 3, 12)); // NOI18N
        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGENES/TAB.png"))); // NOI18N
        jPanel2.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 240, -1, 30));

        tblPaginas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null}
            },
            new String [] {
                "PID", "Pagina", "Tamaño"
            }
        ));
        jScrollPane1.setViewportView(tblPaginas);

        jPanel2.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 270, 161, 140));

        jLabel3.setFont(new java.awt.Font("DialogInput", 3, 12)); // NOI18N
        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGENES/PAG.png"))); // NOI18N
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 240, -1, 30));

        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel1.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel1.setText("Porceso");

        txtSizeProceso.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));

        btnCrearProceso.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        btnCrearProceso.setText("CREAR\n");
        btnCrearProceso.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCrearProcesoActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel2.setText("TAMAÑO KB");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnCrearProceso)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtNombreProceso, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(txtSizeProceso, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtNombreProceso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtSizeProceso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnCrearProceso))
        );

        jPanel2.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 140, -1, -1));

        jLabel4.setFont(new java.awt.Font("DialogInput", 3, 12)); // NOI18N
        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGENES/CRE.png"))); // NOI18N
        jPanel2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 110, -1, 30));

        lblQuantum.setFont(new java.awt.Font("Dialog", 2, 14)); // NOI18N
        lblQuantum.setForeground(new java.awt.Color(153, 153, 153));
        lblQuantum.setText("Quantum 1000 ms");
        jPanel2.add(lblQuantum, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 120, -1, -1));

        jLabel8.setFont(new java.awt.Font("DialogInput", 3, 12)); // NOI18N
        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGENES/LIST.png"))); // NOI18N
        jPanel2.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 260, -1, 30));

        tblProcesos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Proceso", "PID", "Estado", "Memoria requerida", "Páginas", "Páginas Ejecucion", "Páginas Virtualizadas", "Páginas Finalizadas"
            }
        ));
        jScrollPane3.setViewportView(tblProcesos);

        jPanel2.add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 300, 740, 140));

        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGENES/VIÑETA.jpg"))); // NOI18N
        jPanel2.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 110, -1, 30));

        jLabel12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGENES/VIÑETA.jpg"))); // NOI18N
        jPanel2.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 240, -1, 30));

        jLabel13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGENES/VIÑETA.jpg"))); // NOI18N
        jPanel2.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 240, -1, 30));

        jLabel14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGENES/VIÑETA.jpg"))); // NOI18N
        jPanel2.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 100, -1, 30));

        jLabel15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGENES/VIÑETA.jpg"))); // NOI18N
        jPanel2.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 260, -1, -1));

        jLabel16.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGENES/VIÑETA.jpg"))); // NOI18N
        jPanel2.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(930, 100, -1, 40));

        jLabel17.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGENES/PRO.png"))); // NOI18N
        jPanel2.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 30, -1, -1));

        jLabel18.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGENES/DD.jpg"))); // NOI18N
        jPanel2.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(1140, 0, -1, -1));

        jLabel19.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGENES/FFFF.jpg"))); // NOI18N
        jPanel2.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 0, -1, 93));

        jLabel20.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel20.setText("MIGUEL VILLALOBOS");
        jPanel2.add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 270, -1, -1));

        jLabel21.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel21.setText("NELSON JERONIMO");
        jPanel2.add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 310, -1, -1));

        jLabel22.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel22.setText("ERICSON BARILLAS");
        jPanel2.add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 290, -1, -1));

        jLabel23.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        jLabel23.setText("JORGE VILLAGRAN");
        jPanel2.add(jLabel23, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 250, -1, -1));

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGENES/TE.png"))); // NOI18N
        jPanel2.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 210, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 1422, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCrearProcesoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCrearProcesoActionPerformed
        // TODO add your handling code here:
        try{
            String name = this.txtNombreProceso.getText();
            int size = Integer.parseInt(this.txtSizeProceso.getText());
            this.ram.saveProcess(name, size);
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
    }//GEN-LAST:event_btnCrearProcesoActionPerformed

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
            java.util.logging.Logger.getLogger(view.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(view.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(view.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(view.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new view().setVisible(true);
            }
        });
    }

    public int getRandomNumberUsingNextInt(int min, int max) {
        Random random = new Random();
        return random.nextInt(max - min) + min;
    }






    public class Memoriaa extends Thread{

        private int nProcess = 0;
        private int quantum;
        private int memory = 2600000;    
        private int pId = 1;
        Proceso[] memoriaRam = new Proceso[13];
        ArrayList<Proceso> procesos = new ArrayList<Proceso>();
        ArrayList<Proceso> memoriaVirtual = new ArrayList<Proceso>();
        ArrayList<Paginas> paginas = new ArrayList<Paginas>();
        public JTable tblProcesosd;

        public Memoriaa(JTable tblProcesosd){
            this.tblProcesosd = tblProcesosd;
            setTable((DefaultTableModel) this.tblProcesosd.getModel());
        }

        public void setTable(DefaultTableModel model){
            resetTable(model);
            int pos = 1;
            /*for(Proceso p : this.ram.getMemoriaRam()){
                if(p == null){
                    model.addRow(new Object[]{pos,200000,0,200000,""});
                }else{
                    model.addRow(new Object[]{pos,200000,p.getSize(),200000-p.getSize(),p.getNombre()});
                }
                pos++;
            }*/
            model.addRow(new Object[]{"camm",200000,1800,190000,"CAMM"});
        }

        public void resetTable(DefaultTableModel model){
            int rows = model.getRowCount();
            for(int i=rows-1; i >= 0; i--){ model.removeRow(i); }
        }

        public void run(){

            try{
                while(true){
                    Thread.sleep(this.quantum);
                    System.out.println("test");
                }
            }catch(Exception e){
               JOptionPane.showMessageDialog(null, e);
            }
        }

        public void saveProcess(String name, int size){
            if(size < 4000000 && this.nProcess < 15/* && size <= this.memory*/){
                //resetTable((DefaultTableModel) jTblMemoria.getModel());
                Proceso p = new Proceso(name, this.pId, size, this.quantum);
                this.pId += 1;
                this.nProcess += 1;
                boolean flagAssign = true;

                float partitions = (float)p.getSize()/200000;
                System.out.println(partitions);

                if(partitions <= 1){
                    partitions = 1;
                }else if(partitions - (int)partitions > 1.00){
                    partitions = (int)partitions+1;
                }
                p.setPaginas((int) partitions);
                this.procesos.add(p);



            }else{
                JOptionPane.showMessageDialog(null, "EL PROCESO EXCEDE EL NUMERO DE MEMORIA 4000000 O NUMERO DE PROCESO EXCEDIDO.");
            }
        }






        public int getnProcess() {
            return nProcess;
        }

        public void setnProcess(int nProcess) {
            this.nProcess = nProcess;
        }

        public int getQuantum() {
            return quantum;
        }

        public void setQuantum(int quantum) {
            this.quantum = quantum;
        }

        public int getMemory() {
            return memory;
        }

        public void setMemory(int memory) {
            this.memory = memory;
        }

        public int getpId() {
            return pId;
        }

        public void setpId(int pId) {
            this.pId = pId;
        }

        public Proceso[] getMemoriaRam() {
            return memoriaRam;
        }

        public void setMemoriaRam(Proceso[] memoriaRam) {
            this.memoriaRam = memoriaRam;
        }

        public ArrayList<Proceso> getProcesos() {
            return procesos;
        }

        public void setProcesos(ArrayList<Proceso> procesos) {
            this.procesos = procesos;
        }

        public ArrayList<Proceso> getMemoriaVirtual() {
            return memoriaVirtual;
        }

        public void setMemoriaVirtual(ArrayList<Proceso> memoriaVirtual) {
            this.memoriaVirtual = memoriaVirtual;
        }

        public ArrayList<Paginas> getPaginas() {
            return paginas;
        }

        public void setPaginas(ArrayList<Paginas> paginas) {
            this.paginas = paginas;
        }




    }













    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCrearProceso;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JLabel lblQuantum;
    private javax.swing.JTable tblMemoriaRam;
    private javax.swing.JTable tblMemoriaVirtual;
    private javax.swing.JTable tblPaginas;
    private javax.swing.JTable tblProcesos;
    private javax.swing.JTable tblTablaPaginas;
    private javax.swing.JTextField txtNombreProceso;
    private javax.swing.JTextField txtSizeProceso;
    // End of variables declaration//GEN-END:variables
}
