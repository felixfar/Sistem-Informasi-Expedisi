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
public class mPelayaran extends javax.swing.JInternalFrame {
String data[]=new String[3];
    /**
     * Creates new form mPelayaran
     */
    public mPelayaran() {
        initComponents();
        tblPelayaran.setModel(tblModel);
        Table(tblPelayaran,new int[]{130,150,120});      
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
            String strSQL="select namapelayaran,alamat,telp from t_pelayaran";
            Statement st = koneksi.createStatement();
            ResultSet rs = st.executeQuery(strSQL);

            while(rs.next()){
                data[0]=rs.getString(1);
                data[1]=rs.getString(2);
                data[2]=rs.getString(3);
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
        txtNamPel = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtAlmPel = new javax.swing.JTextArea();
        btNew = new javax.swing.JButton();
        btSimpan = new javax.swing.JButton();
        btGanti = new javax.swing.JButton();
        btHapus = new javax.swing.JButton();
        btCancel = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblPelayaran = new javax.swing.JTable();
        jLabel4 = new javax.swing.JLabel();
        txtTelp = new javax.swing.JTextField();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setTitle("DAFTAR PELAYARAN");

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setText("DAFTAR PELAYARAN");

        jLabel2.setText("Nama Pelayaran");

        jLabel3.setText("Alamat Pelayaran");

        txtAlmPel.setColumns(20);
        txtAlmPel.setRows(5);
        jScrollPane1.setViewportView(txtAlmPel);

        btNew.setText("Baru");
        btNew.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btNewActionPerformed(evt);
            }
        });

        btSimpan.setText("Simpan");
        btSimpan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btSimpanActionPerformed(evt);
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

        tblPelayaran.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3"
            }
        ));
        tblPelayaran.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblPelayaranMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tblPelayaran);

        jLabel4.setText("Telephone");

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
                                    .addComponent(jLabel4))
                                .addGap(45, 45, 45)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jScrollPane1)
                                    .addComponent(txtNamPel)
                                    .addComponent(txtTelp)))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btNew)
                                .addGap(2, 2, 2)
                                .addComponent(btSimpan)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btGanti)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btHapus)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btCancel))
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 338, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(33, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtNamPel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtTelp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 55, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btSimpan)
                    .addComponent(btCancel)
                    .addComponent(btGanti)
                    .addComponent(btHapus)
                    .addComponent(btNew))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btNewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btNewActionPerformed
        txtNamPel.setText("");
        txtAlmPel.setText("");
        txtTelp.setText("");
// TODO add your handling code here:
    }//GEN-LAST:event_btNewActionPerformed

    private void btSimpanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btSimpanActionPerformed
        try {
            Class.forName("com.mysql.jdbc.Driver");

            // MENYIAPKAN KONEKSI DAN PARAMETERNYA
            String urldb = "jdbc:mysql://localhost:3306/expedisi";
            String user = "root";
            String password = "";
            Connection koneksi = DriverManager.getConnection(urldb, user, password);
            //Query SQL dan Eksekuusinya

            Statement st = koneksi.createStatement();
            String strSQL = "INSERT INTO t_pelayaran (namapelayaran,alamat,telp) values('" + txtNamPel.getText() + "','" + txtAlmPel.getText() + "','" + txtTelp.getText() + "')";
            st.executeUpdate(strSQL);

            data[0] = txtNamPel.getText();
            data[1] = txtAlmPel.getText();
            data[2] = txtTelp.getText();
            tblModel.insertRow(0, data);

            txtNamPel.setText("");
            txtAlmPel.setText("");
            txtTelp.setText("");

            st.close();
            koneksi.close();
        } catch (ClassNotFoundException cnfe) {
            System.out.println("KESALAHAN SAAT" + "ME-LOAD DRIVER JDBC \n" + cnfe.getMessage());
        } catch (SQLException sqle) {
            System.out.println("KESALAHAN SAAT KONEKSI ATAU " + "KESALAHAN QUERY SQL \n" + sqle.getMessage());
        }        // TODO add your handling code here:
        // TODO add your handling code here:
    }//GEN-LAST:event_btSimpanActionPerformed

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

            String strSQL = "update t_pelayaran set namapelayaran='" + txtNamPel.getText() + "',alamat='" + txtAlmPel.getText() + "',telp='" + txtTelp.getText() + "' where namapelayaran='" + txtNamPel.getText() + "'";
            st.executeUpdate(strSQL);

            data[0] = txtNamPel.getText();
            data[1] = txtAlmPel.getText();
            data[2] = txtTelp.getText();
            tblModel.removeRow(row);
            tblModel.insertRow(row, data);

            txtNamPel.setText("");
            txtAlmPel.setText("");
            txtTelp.setText("");

            st.close();
            koneksi.close();
        } catch (ClassNotFoundException cnfe) {
            System.out.println("KESALAHAN SAAT" + "ME-LOAD DRIVER JDBC \n" + cnfe.getMessage());
        } catch (SQLException sqle) {
            System.out.println("KESALAHAN SAAT KONEKSI ATAU " + "KESALAHAN QUERY SQL \n" + sqle.getMessage());
        }        // TODO add your handling code here:
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

            String strSQL = "delete from t_Pelayaran where namapelayaran='" + txtNamPel.getText() + "'";
            st.executeUpdate(strSQL);
            tblModel.removeRow(row);

            txtNamPel.setText("");
            txtAlmPel.setText("");
            txtTelp.setText("");

            st.close();
            koneksi.close();
        } catch (ClassNotFoundException cnfe) {
            System.out.println("KESALAHAN SAAT" + "ME-LOAD DRIVER JDBC \n" + cnfe.getMessage());
        } catch (SQLException sqle) {
            System.out.println("KESALAHAN SAAT KONEKSI ATAU " + "KESALAHAN QUERY SQL \n" + sqle.getMessage());
        }          // TODO add your handling code here:
    }//GEN-LAST:event_btHapusActionPerformed

    private void btCancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btCancelActionPerformed
        this.dispose();        // TODO add your handling code here:
    }//GEN-LAST:event_btCancelActionPerformed

    private void tblPelayaranMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblPelayaranMouseClicked
        if (evt.getClickCount() == 1) {
            Tampil();
        } // TODO add your handling code here:
    }//GEN-LAST:event_tblPelayaranMouseClicked
int row=0;
    public void Tampil(){
        row=tblPelayaran.getSelectedRow();
        txtNamPel.setText(tblModel.getValueAt(row, 0).toString());
        txtAlmPel.setText(tblModel.getValueAt(row, 1).toString());
        txtTelp.setText(tblModel.getValueAt(row, 2).toString());
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
        new String[] {"Nama Pelayaran","Alamat","Telephone"}
         ){
            boolean[] canEdit=new boolean[]{
                false,false,false
            };

            public boolean isiCellEditable(int rowIndex,int columnIndex){
                    return canEdit[columnIndex];

            }

        };
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btCancel;
    private javax.swing.JButton btGanti;
    private javax.swing.JButton btHapus;
    private javax.swing.JButton btNew;
    private javax.swing.JButton btSimpan;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable tblPelayaran;
    private javax.swing.JTextArea txtAlmPel;
    private javax.swing.JTextField txtNamPel;
    private javax.swing.JTextField txtTelp;
    // End of variables declaration//GEN-END:variables
}