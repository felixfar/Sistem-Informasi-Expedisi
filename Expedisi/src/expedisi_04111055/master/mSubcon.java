/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package expedisi_04111055.master;
import java.sql.*;
import javax.swing.JTable;
/**
 *
 * @author ArDhiye
 */
public class mSubcon extends javax.swing.JInternalFrame {
String data[]=new String[4];
    /**
     * Creates new form mSubcon
     */
    public mSubcon() {
        initComponents();
        tblSubcon.setModel(tblModel);
        Table(tblSubcon,new int[]{120,150,120,120});
        try{
            Class.forName ("com.mysql.jdbc.Driver");

            // MENYIAPKAN KONEKSI DAN PARAMETERNYA
            String urldb="jdbc:mysql://localhost:3306/expedisi";
            String user="root";
            String password="";
            Connection koneksi=DriverManager.getConnection(urldb,user,password);

            //Query SQL dan Eksekuusinya
            String strSQL="SELECT id_kota,namakota from t_kota";
            Statement st = koneksi.createStatement();
            ResultSet rs = st.executeQuery(strSQL);

            while(rs.next()){
                cmbKota.addItem(new masukan(rs.getInt(1),rs.getString(2).trim()).getLabel());
            }
            rs.close();
            st.close();
            koneksi.close();
        }catch(ClassNotFoundException cnfe){
            System.out.println("KESALAHAN SAAT"+"ME-LOAD DRIVER JDBC \n"+cnfe.getMessage());
        }catch(SQLException sqle){
            System.out.println("KESALAHAN SAAT KONEKSI ATAU "+"KESALAHAN QUERY SQL \n"+sqle.getMessage());
        }
      
        setDefaultTable();
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
            String strSQL="select namasubcon,alamat,kota,telp from t_subcon";
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

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtNamSub = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtAlamat = new javax.swing.JTextArea();
        cmbKota = new javax.swing.JComboBox();
        txtTelp = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblSubcon = new javax.swing.JTable();
        btBaru = new javax.swing.JButton();
        btsimpan = new javax.swing.JButton();
        btGanti = new javax.swing.JButton();
        btHapus = new javax.swing.JButton();
        btCancel = new javax.swing.JButton();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setText("Daftar Subcon");

        jLabel2.setText("Nama Subcon");

        jLabel3.setText("Alamat");

        jLabel4.setText("Kota");

        jLabel5.setText("No Telp");

        txtAlamat.setColumns(20);
        txtAlamat.setRows(5);
        jScrollPane1.setViewportView(txtAlamat);

        tblSubcon.setModel(new javax.swing.table.DefaultTableModel(
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
        tblSubcon.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblSubconMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tblSubcon);

        btBaru.setText("Baru");
        btBaru.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btBaruActionPerformed(evt);
            }
        });

        btsimpan.setText("Simpan");
        btsimpan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btsimpanActionPerformed(evt);
            }
        });

        btGanti.setText("Ganti");
        btGanti.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btGantiActionPerformed(evt);
            }
        });

        btHapus.setText("Hapus");
        btHapus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btHapusActionPerformed(evt);
            }
        });

        btCancel.setText("Cancel");
        btCancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btCancelActionPerformed(evt);
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
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel5))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(cmbKota, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jScrollPane1)
                                    .addComponent(txtNamSub)
                                    .addComponent(txtTelp)))
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(67, 67, 67)
                        .addComponent(btBaru)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btsimpan)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btGanti)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btHapus)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btCancel)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtNamSub, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addGap(96, 96, 96)
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(txtTelp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(cmbKota, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btBaru)
                    .addComponent(btsimpan)
                    .addComponent(btGanti)
                    .addComponent(btHapus)
                    .addComponent(btCancel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(25, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btBaruActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btBaruActionPerformed
        txtNamSub.setText("");
        txtAlamat.setText("");
        txtTelp.setText("");
// TODO add your handling code here:
    }//GEN-LAST:event_btBaruActionPerformed

    private void btsimpanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btsimpanActionPerformed
        try {
            Class.forName("com.mysql.jdbc.Driver");

            // MENYIAPKAN KONEKSI DAN PARAMETERNYA
            String urldb = "jdbc:mysql://localhost:3306/expedisi";
            String user = "root";
            String password = "";
            Connection koneksi = DriverManager.getConnection(urldb, user, password);
            //Query SQL dan Eksekuusinya

            Statement st = koneksi.createStatement();
            String strSQL = "INSERT INTO t_subcon (namasubcon,alamat,kota,telp) values('" + txtNamSub.getText() + "','" + txtAlamat.getText() + "','" + cmbKota.getSelectedItem() + "','" + txtTelp.getText() + "')";
            st.executeUpdate(strSQL);

            data[0] = txtNamSub.getText();
            data[1] = txtAlamat.getText();
            data[2] = cmbKota.getSelectedItem().toString();
            data[3] = txtTelp.getText();
            tblModel.insertRow(0, data);

            txtNamSub.setText("");
            txtAlamat.setText("");
            txtTelp.setText("");

            st.close();
            koneksi.close();
        } catch (ClassNotFoundException cnfe) {
            System.out.println("KESALAHAN SAAT" + "ME-LOAD DRIVER JDBC \n" + cnfe.getMessage());
        } catch (SQLException sqle) {
            System.out.println("KESALAHAN SAAT KONEKSI ATAU " + "KESALAHAN QUERY SQL \n" + sqle.getMessage());
        }        // TODO add your handling code here:
        // TODO add your handling code here:
    }//GEN-LAST:event_btsimpanActionPerformed

    private void btGantiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btGantiActionPerformed
        try {
            Class.forName("com.mysql.jdbc.Driver");

            // MENYIAPKAN KONEKSI DAN PARAMETERNYA
            String urldb = "jdbc:mysql://localhost:3306/expedisi";
            String user = "root";
            String password = "";
            Connection koneksi = DriverManager.getConnection(urldb, user, password);
            //Query SQL dan Eksekuusinya

            Statement st = koneksi.createStatement();

            String strSQL = "update t_subcon set namasubcon='" + txtNamSub.getText() + "',alamat='" + txtAlamat.getText() + "',kota='" + cmbKota.getSelectedItem() + "',kota='" + txtTelp.getText() + "'where namasubcon='" + txtNamSub.getText() + "'";
            st.executeUpdate(strSQL);

            data[0] = txtNamSub.getText();
            data[1] = txtAlamat.getText();
            data[2] = cmbKota.getSelectedItem().toString();
            data[3] = txtTelp.getText();
            tblModel.removeRow(row);
            tblModel.insertRow(row, data);

            txtNamSub.setText("");
            txtAlamat.setText("");
            txtTelp.setText("");

            st.close();
            koneksi.close();
        } catch (ClassNotFoundException cnfe) {
            System.out.println("KESALAHAN SAAT" + "ME-LOAD DRIVER JDBC \n" + cnfe.getMessage());
        } catch (SQLException sqle) {
            System.out.println("KESALAHAN SAAT KONEKSI ATAU " + "KESALAHAN QUERY SQL \n" + sqle.getMessage());
        }        // TODO add your handling code here:
        // TODO add your handling code here:
    }//GEN-LAST:event_btGantiActionPerformed

    private void btHapusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btHapusActionPerformed
        try {
            Class.forName("com.mysql.jdbc.Driver");

            // MENYIAPKAN KONEKSI DAN PARAMETERNYA
            String urldb = "jdbc:mysql://localhost:3306/expedisi";
            String user = "root";
            String password = "";
            Connection koneksi = DriverManager.getConnection(urldb, user, password);
            //Query SQL dan Eksekuusinya

            Statement st = koneksi.createStatement();

            String strSQL = "delete from t_subcon where namasubcon='" + txtNamSub.getText() + "'";
            st.executeUpdate(strSQL);
            tblModel.removeRow(row);

            txtNamSub.setText("");
            txtAlamat.setText("");
            txtTelp.setText("");


            st.close();
            koneksi.close();
        } catch (ClassNotFoundException cnfe) {
            System.out.println("KESALAHAN SAAT" + "ME-LOAD DRIVER JDBC \n" + cnfe.getMessage());
        } catch (SQLException sqle) {
            System.out.println("KESALAHAN SAAT KONEKSI ATAU " + "KESALAHAN QUERY SQL \n" + sqle.getMessage());
        }    // TODO add your handling code here:
    }//GEN-LAST:event_btHapusActionPerformed

    private void btCancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btCancelActionPerformed
        this.dispose();        // TODO add your handling code here:
    }//GEN-LAST:event_btCancelActionPerformed

    private void tblSubconMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblSubconMouseClicked
if (evt.getClickCount() == 1) {
            Tampil();
        }         // TODO add your handling code here:
    }//GEN-LAST:event_tblSubconMouseClicked
    int row=0;
    public void Tampil(){
        row=tblSubcon.getSelectedRow();
        txtNamSub.setText(tblModel.getValueAt(row, 0).toString());
        txtAlamat.setText(tblModel.getValueAt(row, 1).toString());
        cmbKota.setSelectedItem(tblModel.getValueAt(row, 2).toString());
        txtTelp.setText(tblModel.getValueAt(row, 3).toString());
}
    private javax.swing.table.DefaultTableModel tblModel = getDefaultTabelModel();

    private void Table(javax.swing.JTable tb,int lebar[]){
        tb.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
        int kolom=tb.getColumnCount();
        for(int i=0;i<kolom;i++){
            javax.swing.table.TableColumn tbc=tb.getColumnModel().getColumn(i);
            tbc.setPreferredWidth(lebar[i]);
            tb.setRowHeight(17);
        }
    }

    private javax.swing.table.DefaultTableModel getDefaultTabelModel() {
        return new javax.swing.table.DefaultTableModel(
        new Object[][] {},
        new String[] {"Nama Subcon","Alamat","Kota","Telephone"}
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
    private javax.swing.JButton btBaru;
    private javax.swing.JButton btCancel;
    private javax.swing.JButton btGanti;
    private javax.swing.JButton btHapus;
    private javax.swing.JButton btsimpan;
    private javax.swing.JComboBox cmbKota;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable tblSubcon;
    private javax.swing.JTextArea txtAlamat;
    private javax.swing.JTextField txtNamSub;
    private javax.swing.JTextField txtTelp;
    // End of variables declaration//GEN-END:variables
}
