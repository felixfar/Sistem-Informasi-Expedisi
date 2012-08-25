/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package expedisi_04111055.utility;
import java.sql.*;
import javax.swing.*;
import java.awt.*;
import expedisi_04111055.master.*;
/**
 *
 * @author ArDhiye
 */
public class createJob extends javax.swing.JInternalFrame {
double tarif,tarif_kubik,totalDisc,total,ppn,bFreight,bDoor,bTracking,bLL,bTotal;
int discon;
float volume;
    /**
     * Creates new form createJob
     */
    public createJob() {
        initComponents();
        txtJOB.setEditable(false);
        try{
            Class.forName ("com.mysql.jdbc.Driver");

            // MENYIAPKAN KONEKSI DAN PARAMETERNYA
            String urldb="jdbc:mysql://localhost:3306/expedisi";
            String user="root";
            String password="";
            Connection koneksi=DriverManager.getConnection(urldb,user,password);

            //Query SQL dan Eksekuusinya
            String strSQL="SELECT id_customer,namacustomer from t_customer";
            Statement st = koneksi.createStatement();
            ResultSet rs = st.executeQuery(strSQL);

            while(rs.next()){
                cmbCustomer.addItem(new masukan(rs.getInt(1),rs.getString(2).trim()).getLabel());
            }
            
            rs.close();
            st.close();
            koneksi.close();
        }catch(ClassNotFoundException cnfe){
            System.out.println("KESALAHAN SAAT"+"ME-LOAD DRIVER JDBC \n"+cnfe.getMessage());
        }catch(SQLException sqle){
            System.out.println("KESALAHAN SAAT KONEKSI ATAU "+"KESALAHAN QUERY SQL \n"+sqle.getMessage());
        }
        try{
            Class.forName ("com.mysql.jdbc.Driver");

            // MENYIAPKAN KONEKSI DAN PARAMETERNYA
            String urldb="jdbc:mysql://localhost:3306/expedisi";
            String user="root";
            String password="";
            Connection koneksi=DriverManager.getConnection(urldb,user,password);

            //Query SQL dan Eksekuusinya
            String strSQL="SELECT id_penerima,namapenerima from t_penerima";
            Statement st = koneksi.createStatement();
            ResultSet rs = st.executeQuery(strSQL);

            while(rs.next()){
                cmbPenerima.addItem(new masukan(rs.getInt(1),rs.getString(2).trim()).getLabel());
            }
            
            rs.close();
            st.close();
            koneksi.close();
        }catch(ClassNotFoundException cnfe){
            System.out.println("KESALAHAN SAAT"+"ME-LOAD DRIVER JDBC \n"+cnfe.getMessage());
        }catch(SQLException sqle){
            System.out.println("KESALAHAN SAAT KONEKSI ATAU "+"KESALAHAN QUERY SQL \n"+sqle.getMessage());
        }
        try{
            Class.forName ("com.mysql.jdbc.Driver");

            // MENYIAPKAN KONEKSI DAN PARAMETERNYA
            String urldb="jdbc:mysql://localhost:3306/expedisi";
            String user="root";
            String password="";
            Connection koneksi=DriverManager.getConnection(urldb,user,password);

            //Query SQL dan Eksekuusinya
            String strSQL="SELECT id_pelayaran,namapelayaran from t_pelayaran";
            Statement st = koneksi.createStatement();
            ResultSet rs = st.executeQuery(strSQL);

            while(rs.next()){
                cmbPelayaran.addItem(new masukan(rs.getInt(1),rs.getString(2).trim()).getLabel());
            }
            
            rs.close();
            st.close();
            koneksi.close();
        }catch(ClassNotFoundException cnfe){
            System.out.println("KESALAHAN SAAT"+"ME-LOAD DRIVER JDBC \n"+cnfe.getMessage());
        }catch(SQLException sqle){
            System.out.println("KESALAHAN SAAT KONEKSI ATAU "+"KESALAHAN QUERY SQL \n"+sqle.getMessage());
        }
        try{
            Class.forName ("com.mysql.jdbc.Driver");

            // MENYIAPKAN KONEKSI DAN PARAMETERNYA
            String urldb="jdbc:mysql://localhost:3306/expedisi";
            String user="root";
            String password="";
            Connection koneksi=DriverManager.getConnection(urldb,user,password);

            //Query SQL dan Eksekuusinya
            String strSQL="SELECT id_subcon,namasubcon from t_subcon";
            Statement st = koneksi.createStatement();
            ResultSet rs = st.executeQuery(strSQL);

            while(rs.next()){
                cmbSubcon.addItem(new masukan(rs.getInt(1),rs.getString(2).trim()).getLabel());
            }
            
            rs.close();
            st.close();
            koneksi.close();
        }catch(ClassNotFoundException cnfe){
            System.out.println("KESALAHAN SAAT"+"ME-LOAD DRIVER JDBC \n"+cnfe.getMessage());
        }catch(SQLException sqle){
            System.out.println("KESALAHAN SAAT KONEKSI ATAU "+"KESALAHAN QUERY SQL \n"+sqle.getMessage());
        }
        try{
            Class.forName ("com.mysql.jdbc.Driver");

            // MENYIAPKAN KONEKSI DAN PARAMETERNYA
            String urldb="jdbc:mysql://localhost:3306/expedisi";
            String user="root";
            String password="";
            Connection koneksi=DriverManager.getConnection(urldb,user,password);

            //Query SQL dan Eksekuusinya
            String strSQL="SELECT id_agen,namaagen from t_agendoor";
            Statement st = koneksi.createStatement();
            ResultSet rs = st.executeQuery(strSQL);

            while(rs.next()){
                cmbAgen.addItem(new masukan(rs.getInt(1),rs.getString(2).trim()).getLabel());
            }
            
            rs.close();
            st.close();
            koneksi.close();
        }catch(ClassNotFoundException cnfe){
            System.out.println("KESALAHAN SAAT"+"ME-LOAD DRIVER JDBC \n"+cnfe.getMessage());
        }catch(SQLException sqle){
            System.out.println("KESALAHAN SAAT KONEKSI ATAU "+"KESALAHAN QUERY SQL \n"+sqle.getMessage());
        }
        try{
            Class.forName ("com.mysql.jdbc.Driver");

            // MENYIAPKAN KONEKSI DAN PARAMETERNYA
            String urldb="jdbc:mysql://localhost:3306/expedisi";
            String user="root";
            String password="";
            Connection koneksi=DriverManager.getConnection(urldb,user,password);

            //Query SQL dan Eksekuusinya
            String strSQL="SELECT id_transportir,namatransportir from t_transportir";
            Statement st = koneksi.createStatement();
            ResultSet rs = st.executeQuery(strSQL);

            while(rs.next()){
                cmbTransportasi.addItem(new masukan(rs.getInt(1),rs.getString(2).trim()).getLabel());
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

        jLabel17 = new javax.swing.JLabel();
        pTransaksi = new javax.swing.JPanel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        txtTotTarif = new javax.swing.JTextField();
        jLabel18 = new javax.swing.JLabel();
        txtTrucking = new javax.swing.JTextField();
        txtFreight = new javax.swing.JTextField();
        txtDoor = new javax.swing.JTextField();
        txtTotBiaya = new javax.swing.JTextField();
        jLabel22 = new javax.swing.JLabel();
        txtBiayaLL = new javax.swing.JTextField();
        jLabel21 = new javax.swing.JLabel();
        txtService = new javax.swing.JTextField();
        txtQuantity = new javax.swing.JTextField();
        txtVolume = new javax.swing.JTextField();
        txtComodity = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        txtDiscon = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtDisc = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        cmbAgen = new javax.swing.JComboBox();
        cmbPenerima = new javax.swing.JComboBox();
        cmbPelayaran = new javax.swing.JComboBox();
        dcTanggal = new com.toedter.calendar.JDateChooser();
        cmbCustomer = new javax.swing.JComboBox();
        jLabel12 = new javax.swing.JLabel();
        txtJOB = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        cmbSubcon = new javax.swing.JComboBox();
        cmbTransportasi = new javax.swing.JComboBox();
        txtPPN = new javax.swing.JTextField();
        txtTarif = new javax.swing.JTextField();
        btCancel = new javax.swing.JButton();
        btSimpan = new javax.swing.JButton();
        txtTarifKubik = new javax.swing.JTextField();
        jLabel23 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        cbPPN = new javax.swing.JCheckBox();
        jLabel24 = new javax.swing.JLabel();

        setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setTitle("TRANSAKSI CREAT JOB");

        jLabel17.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel17.setText("Transaksi Create Job");

        pTransaksi.setBackground(new java.awt.Color(204, 204, 255));
        pTransaksi.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED), "Create Job", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION));

        jLabel19.setText("Biaya Door");

        jLabel20.setText("Trucking Delivery");

        jLabel18.setText("Biaya Freight");

        txtTrucking.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTruckingActionPerformed(evt);
            }
        });

        txtFreight.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtFreightActionPerformed(evt);
            }
        });

        txtDoor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDoorActionPerformed(evt);
            }
        });

        jLabel22.setText("Total Biaya");

        txtBiayaLL.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtBiayaLLActionPerformed(evt);
            }
        });

        jLabel21.setText("Biaya Lain - Lain");

        txtVolume.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtVolumeKeyTyped(evt);
            }
        });

        jLabel13.setText("Tarif per Kubik");

        jLabel14.setText("Discon");

        jLabel15.setText("PPN 10%");

        jLabel16.setText("Total Tarif");

        jLabel2.setText("Tgl. Transaksi");

        jLabel1.setText("No JOB");

        jLabel6.setText("Agen Door");

        jLabel5.setText("Pelayaran");

        jLabel4.setText("Nama Penerima");

        txtDisc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDiscActionPerformed(evt);
            }
        });

        jLabel3.setText("Nama Customer");

        jLabel8.setText("SubCon (Port to Door)");

        jLabel7.setText("Agen Transportasi");

        jLabel12.setText("Comodity");

        jLabel10.setText("Quantity");

        jLabel11.setText("Volume");

        btCancel.setText("Cancel");
        btCancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btCancelActionPerformed(evt);
            }
        });

        btSimpan.setText("Simpan");
        btSimpan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btSimpanActionPerformed(evt);
            }
        });

        txtTarifKubik.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTarifKubikActionPerformed(evt);
            }
        });

        jLabel23.setText("Tarif");

        jLabel9.setText("Service");

        cbPPN.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                cbPPNStateChanged(evt);
            }
        });
        cbPPN.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                cbPPNPropertyChange(evt);
            }
        });

        jLabel24.setText("M3");

        javax.swing.GroupLayout pTransaksiLayout = new javax.swing.GroupLayout(pTransaksi);
        pTransaksi.setLayout(pTransaksiLayout);
        pTransaksiLayout.setHorizontalGroup(
            pTransaksiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pTransaksiLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pTransaksiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addComponent(jLabel5)
                    .addComponent(jLabel6)
                    .addComponent(jLabel3)
                    .addComponent(jLabel7)
                    .addComponent(jLabel8)
                    .addComponent(jLabel9)
                    .addComponent(jLabel10)
                    .addComponent(jLabel11)
                    .addComponent(jLabel12))
                .addGap(15, 15, 15)
                .addGroup(pTransaksiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(txtQuantity, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtService, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cmbSubcon, javax.swing.GroupLayout.Alignment.LEADING, 0, 160, Short.MAX_VALUE)
                    .addComponent(cmbTransportasi, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(cmbAgen, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(cmbPelayaran, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(cmbPenerima, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(cmbCustomer, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtComodity)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, pTransaksiLayout.createSequentialGroup()
                        .addComponent(txtVolume, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel24, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(49, 49, 49)
                .addGroup(pTransaksiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel13)
                    .addGroup(pTransaksiLayout.createSequentialGroup()
                        .addGroup(pTransaksiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel16)
                            .addGroup(pTransaksiLayout.createSequentialGroup()
                                .addComponent(jLabel15)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(cbPPN))
                            .addGroup(pTransaksiLayout.createSequentialGroup()
                                .addComponent(jLabel14)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtDisc, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(pTransaksiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(pTransaksiLayout.createSequentialGroup()
                                .addGap(39, 39, 39)
                                .addComponent(txtTotTarif, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(pTransaksiLayout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addGroup(pTransaksiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txtDoor, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtDiscon)
                                    .addComponent(txtFreight, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtTarifKubik)
                                    .addComponent(txtTarif)
                                    .addComponent(txtPPN, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addComponent(jLabel18)
                    .addComponent(jLabel19)
                    .addGroup(pTransaksiLayout.createSequentialGroup()
                        .addGroup(pTransaksiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel20)
                            .addComponent(jLabel21))
                        .addGap(18, 18, 18)
                        .addGroup(pTransaksiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtTrucking)
                            .addComponent(txtBiayaLL, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jLabel23)
                    .addGroup(pTransaksiLayout.createSequentialGroup()
                        .addComponent(jLabel22)
                        .addGap(69, 69, 69)
                        .addComponent(txtTotBiaya, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(75, Short.MAX_VALUE))
            .addGroup(pTransaksiLayout.createSequentialGroup()
                .addGap(160, 160, 160)
                .addComponent(btSimpan)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btCancel)
                .addGap(188, 188, 188))
            .addGroup(pTransaksiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(pTransaksiLayout.createSequentialGroup()
                    .addContainerGap()
                    .addGroup(pTransaksiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel1)
                        .addComponent(jLabel2))
                    .addGap(56, 56, 56)
                    .addGroup(pTransaksiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(txtJOB, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(dcTanggal, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGap(275, 275, Short.MAX_VALUE)))
        );
        pTransaksiLayout.setVerticalGroup(
            pTransaksiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pTransaksiLayout.createSequentialGroup()
                .addGap(53, 53, 53)
                .addGroup(pTransaksiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel13)
                    .addComponent(txtTarifKubik, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(5, 5, 5)
                .addGroup(pTransaksiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pTransaksiLayout.createSequentialGroup()
                        .addGroup(pTransaksiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel23)
                            .addComponent(txtTarif, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(pTransaksiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel14)
                            .addComponent(txtDiscon, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtDisc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(pTransaksiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel15)
                            .addComponent(txtPPN, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cbPPN))
                        .addGroup(pTransaksiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(pTransaksiLayout.createSequentialGroup()
                                .addGap(58, 58, 58)
                                .addGroup(pTransaksiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel18)
                                    .addComponent(txtFreight, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(pTransaksiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel19)
                                    .addComponent(txtDoor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(pTransaksiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel20)
                                    .addComponent(txtTrucking, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(pTransaksiLayout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(pTransaksiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel16)
                                    .addComponent(txtTotTarif, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(12, 12, 12)
                        .addGroup(pTransaksiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel21)
                            .addComponent(txtBiayaLL, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(19, 19, 19)
                        .addGroup(pTransaksiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel22)
                            .addComponent(txtTotBiaya, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(pTransaksiLayout.createSequentialGroup()
                        .addGroup(pTransaksiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(cmbCustomer, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(pTransaksiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(cmbPenerima, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(27, 27, 27)
                        .addGroup(pTransaksiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(cmbPelayaran, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(pTransaksiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(cmbAgen, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(pTransaksiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7)
                            .addComponent(cmbTransportasi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(pTransaksiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(cmbSubcon, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel8))
                        .addGap(38, 38, 38)
                        .addGroup(pTransaksiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel9)
                            .addComponent(txtService, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(pTransaksiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel10)
                            .addComponent(txtQuantity, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(pTransaksiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel11)
                            .addComponent(txtVolume, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel24))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(pTransaksiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel12)
                            .addComponent(txtComodity, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pTransaksiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btSimpan)
                    .addComponent(btCancel))
                .addContainerGap(73, Short.MAX_VALUE))
            .addGroup(pTransaksiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(pTransaksiLayout.createSequentialGroup()
                    .addContainerGap()
                    .addGroup(pTransaksiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel1)
                        .addComponent(txtJOB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGap(18, 18, 18)
                    .addGroup(pTransaksiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jLabel2)
                        .addComponent(dcTanggal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addContainerGap(465, Short.MAX_VALUE)))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel17)
                        .addGap(538, 538, 538))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(pTransaksi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(14, Short.MAX_VALUE)
                .addComponent(jLabel17)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(pTransaksi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtVolumeKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtVolumeKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_txtVolumeKeyTyped

    private void txtTarifKubikActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTarifKubikActionPerformed
        tarif_kubik=Double.parseDouble(txtTarifKubik.getText().toString());
        //volume=Integer.parseInt(txtVolume.getText().toString());
        volume=Float.parseFloat(txtVolume.getText().toString());
        tarif=tarif_kubik*volume;
        txtTarif.setText(String.valueOf(tarif));// TODO add your handling code here:
    }//GEN-LAST:event_txtTarifKubikActionPerformed

    private void txtDiscActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDiscActionPerformed
        discon=Integer.parseInt(txtDisc.getText().toString());
        totalDisc=(tarif*discon)/100;
        txtDiscon.setText(String.valueOf(totalDisc));// TODO add your handling code here:
    }//GEN-LAST:event_txtDiscActionPerformed

    private void cbPPNStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_cbPPNStateChanged
    if(cbPPN.isSelected()==true){
        ppn=0.1*tarif;       
    }
    else{
        ppn=tarif;
    }
    txtPPN.setText(String.valueOf(ppn));
    total=tarif-discon+ppn;
    txtTotTarif.setText(String.valueOf(total));    
    // TODO add your handling code here:
    }//GEN-LAST:event_cbPPNStateChanged

    private void cbPPNPropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_cbPPNPropertyChange
        // TODO add your handling code here:
    }//GEN-LAST:event_cbPPNPropertyChange

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
            String strSQL = "INSERT INTO t_createjob(tanggal, customer, penerima, pelayaran,agen_door, agen_transportir, subcon, service, quantity, volume, comodity, t_kubik, tarif, discon, ppn, total_tarif, b_freight, b_door, b_tracking, b_lain, b_total) values('" 
                            + dcTanggal.getDate() + "','" + cmbCustomer.getSelectedItem() + "','" + cmbPenerima.getSelectedItem() + "','"+ cmbPelayaran.getSelectedItem() +"','" + cmbAgen.getSelectedItem() + "','"
                            + cmbTransportasi.getSelectedItem() +"','" + cmbSubcon.getSelectedItem() + "','" + txtService.getText() + "','" + txtQuantity.getText() + "','" + txtVolume.getText() + "','" + txtComodity.getText() + "','" + txtTarifKubik.getText() + "','" 
                            + txtTarif.getText() + "','" + txtDiscon.getText() + "','" + txtPPN.getText() + "','" + txtTotTarif.getText() + "','" + txtFreight.getText() + "','" + txtDoor.getText() + "','" + txtTrucking.getText() + "','" + txtBiayaLL.getText() + "','" + txtTotBiaya.getText() + "')";
            st.executeUpdate(strSQL);

            st.close();
            koneksi.close();
        } catch (ClassNotFoundException cnfe) {
            System.out.println("KESALAHAN SAAT" + "ME-LOAD DRIVER JDBC \n" + cnfe.getMessage());
        } catch (SQLException sqle) {
            System.out.println("KESALAHAN SAAT KONEKSI ATAU " + "KESALAHAN QUERY SQL \n" + sqle.getMessage());
        }
        this.dispose();
        // TODO add your handling code here:
    }//GEN-LAST:event_btSimpanActionPerformed

    private void txtFreightActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtFreightActionPerformed
       bFreight=Double.parseDouble(txtFreight.getText().toString());
       bTotal=total-(bFreight+bDoor+bTracking+bLL);
       txtTotBiaya.setText(String.valueOf(bTotal));
        // TODO add your handling code here:
    }//GEN-LAST:event_txtFreightActionPerformed

    private void txtDoorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDoorActionPerformed
       bDoor=Double.parseDouble(txtDoor.getText().toString());
       bTotal=total-(bFreight+bDoor+bTracking+bLL);
       txtTotBiaya.setText(String.valueOf(bTotal));
       // TODO add your handling code here:
    }//GEN-LAST:event_txtDoorActionPerformed

    private void txtTruckingActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTruckingActionPerformed
       bTracking=Double.parseDouble(txtTrucking.getText().toString());
       bTotal=total-(bFreight+bDoor+bTracking+bLL);
       txtTotBiaya.setText(String.valueOf(bTotal));
       // TODO add your handling code here:
    }//GEN-LAST:event_txtTruckingActionPerformed

    private void txtBiayaLLActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtBiayaLLActionPerformed
       bLL=Double.parseDouble(txtBiayaLL.getText().toString());
       bTotal=total-(bFreight+bDoor+bTracking+bLL);
       txtTotBiaya.setText(String.valueOf(bTotal));
       // TODO add your handling code here:
    }//GEN-LAST:event_txtBiayaLLActionPerformed

    private void btCancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btCancelActionPerformed
       this.dispose(); // TODO add your handling code here:
    }//GEN-LAST:event_btCancelActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btCancel;
    private javax.swing.JButton btSimpan;
    private javax.swing.JCheckBox cbPPN;
    private javax.swing.JComboBox cmbAgen;
    private javax.swing.JComboBox cmbCustomer;
    private javax.swing.JComboBox cmbPelayaran;
    private javax.swing.JComboBox cmbPenerima;
    private javax.swing.JComboBox cmbSubcon;
    private javax.swing.JComboBox cmbTransportasi;
    private com.toedter.calendar.JDateChooser dcTanggal;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
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
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel pTransaksi;
    private javax.swing.JTextField txtBiayaLL;
    private javax.swing.JTextField txtComodity;
    private javax.swing.JTextField txtDisc;
    private javax.swing.JTextField txtDiscon;
    private javax.swing.JTextField txtDoor;
    private javax.swing.JTextField txtFreight;
    private javax.swing.JTextField txtJOB;
    private javax.swing.JTextField txtPPN;
    private javax.swing.JTextField txtQuantity;
    private javax.swing.JTextField txtService;
    private javax.swing.JTextField txtTarif;
    private javax.swing.JTextField txtTarifKubik;
    private javax.swing.JTextField txtTotBiaya;
    private javax.swing.JTextField txtTotTarif;
    private javax.swing.JTextField txtTrucking;
    private javax.swing.JTextField txtVolume;
    // End of variables declaration//GEN-END:variables
}
