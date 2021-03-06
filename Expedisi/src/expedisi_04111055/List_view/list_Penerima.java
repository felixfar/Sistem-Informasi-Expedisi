/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package expedisi_04111055.List_view;

import java.sql.*;
import net.sf.jasperreports.engine.JasperCompileManager;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.view.JasperViewer;

/**
 *
 * @author ArDhiye
 */
public class list_Penerima extends javax.swing.JInternalFrame {
String data[]=new String [4];
    /**
     * Creates new form list_Penerima
     */
    public list_Penerima() {
        initComponents();
        tblPenerima.setModel(tblModel);

        // kita kirim data ke fungsi Tabel :nama tabelnya,dan lebar tiap kolom2nya
        Table(tblPenerima,new int[]{120,120,120,120});

        setDefaultTable();
    }
    private void Table(javax.swing.JTable tb,int lebar[]){
        tb.setAutoResizeMode(tb.AUTO_RESIZE_OFF);
        int kolom=tb.getColumnCount();
        for(int i=0;i<kolom;i++){
            javax.swing.table.TableColumn tbc=tb.getColumnModel().getColumn(i);
            tbc.setPreferredWidth(lebar[i]);
            tb.setRowHeight(17);
        }
    }
     public void setDefaultTable(){
        String stat="";
        try{
            Class.forName ("com.mysql.jdbc.Driver");

            // MENYIAPKAN KONEKSI DAN PARAMETERNYA
            String urldb="jdbc:mysql://localhost:3306/expedisi";
            String user="root";
            String password="";
            Connection koneksi=DriverManager.getConnection(urldb,user,password);
            //Query SQL dan Eksekuusinya
            String strSQL="SELECT namapenerima,alamat,kota,telp from t_penerima";
            Statement st = koneksi.createStatement();
            ResultSet rs = st.executeQuery(strSQL);

            while(rs.next()){
                data[0]=rs.getString(1);
                data[1]=rs.getString(2);
                data[2]=rs.getString(3);
                data[3]=rs.getString(4);
                tblModel.addRow(data);
            }

            rs.close();
            st.close();
            koneksi.close();
        }catch(ClassNotFoundException cnfe){
            System.out.println("KESALAHAN SAAT"+"ME-LOAD DRIVER JDBC \n"+cnfe.getMessage());
        }catch(SQLException sqle){
            System.out.println("KESALAHAN SAAT KONEKSI ATAU "+"KESALAHAN QUERY SQL \n"+sqle.getMessage());
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

        txtPenerima = new javax.swing.JTextField();
        btSearch = new javax.swing.JButton();
        btReport = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblPenerima = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setTitle("Daftar Penerima");

        btSearch.setText("Search");
        btSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btSearchActionPerformed(evt);
            }
        });

        btReport.setText("Report");
        btReport.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btReportActionPerformed(evt);
            }
        });

        tblPenerima.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(tblPenerima);

        jLabel1.setText("Nama Penerima");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(txtPenerima, javax.swing.GroupLayout.PREFERRED_SIZE, 217, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(43, 43, 43)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(btReport)
                            .addComponent(btSearch))
                        .addGap(30, 30, 30))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 452, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtPenerima, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btSearch)
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btReport)
                .addGap(34, 34, 34)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(59, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btSearchActionPerformed
          try{
            Class.forName ("com.mysql.jdbc.Driver");

            // MENYIAPKAN KONEKSI DAN PARAMETERNYA
            String urldb="jdbc:mysql://localhost:3306/expedisi";
            String user="root";
            String password="";
            Connection koneksi=DriverManager.getConnection(urldb,user,password);
            //Query SQL dan Eksekuusinya
            String strSQL="SELECT namapenerima,alamat,kota,telp FROM t_penerima where namapenerima like '%"+txtPenerima.getText()+"%'";
            Statement st = koneksi.createStatement();
            ResultSet rs = st.executeQuery(strSQL);

           int row = tblModel.getRowCount();
            for (int i = 0; i < row; i++)
            {
                tblModel.removeRow(0);
            }

            while(rs.next()){
                data[0]=rs.getString(1);
                data[1]=rs.getString(2);
                data[2]=rs.getString(3);
                data[3]=rs.getString(4);
                tblModel.addRow(data);
            }

            rs.close();
            st.close();
            koneksi.close();
        }catch(ClassNotFoundException cnfe){
            System.out.println("KESALAHAN SAAT"+"ME-LOAD DRIVER JDBC \n"+cnfe.getMessage());
        }catch(SQLException sqle){
            System.out.println("KESALAHAN SAAT KONEKSI ATAU "+"KESALAHAN QUERY SQL \n"+sqle.getMessage());
        }
          // TODO add your handling code here:
    }//GEN-LAST:event_btSearchActionPerformed

    private void btReportActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btReportActionPerformed
        Cetak();
        // TODO add your handling code here:
    }//GEN-LAST:event_btReportActionPerformed
     public void Cetak(){
         try{
             Class.forName ("com.mysql.jdbc.Driver");

            // MENYIAPKAN KONEKSI DAN PARAMETERNYA
            String urldb="jdbc:mysql://localhost:3306/expedisi";
            String user="root";
            String password="";
            Connection koneksi=DriverManager.getConnection(urldb,user,password);
            //Query SQL dan Eksekuusinya

        String report ="C:\\Users\\ArDhiye\\Documents\\NetBeansProjects\\expedisi_04111055\\src\\expedisi_04111055\\report\\rPenerima.jrxml";
        JasperReport jr=JasperCompileManager.compileReport(report);
        JasperPrint jp=JasperFillManager.fillReport(jr,null,koneksi);
        JasperViewer.viewReport(jp);
        }catch(Exception ex){
            System.out.println("error"+ex.getMessage());
        }
    }
    
private javax.swing.table.DefaultTableModel tblModel = getDefaultTabelModel();

     private javax.swing.table.DefaultTableModel getDefaultTabelModel() {
        return new javax.swing.table.DefaultTableModel(
        new Object[][] {},
        new String[] {"Nama Penerima","Alamat","Kota","Telephone"}
         ){
            boolean[] canEdit=new boolean[]{
                false,false,false,false
            };

            public boolean isiCellEditable(int rowIndex,int columnIndex){
                    return canEdit[columnIndex];

            }

        };
   }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btReport;
    private javax.swing.JButton btSearch;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblPenerima;
    private javax.swing.JTextField txtPenerima;
    // End of variables declaration//GEN-END:variables
}
