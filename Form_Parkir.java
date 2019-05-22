/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Program;
import java.awt.Color;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.awt.Font;

/**
 *
 * @author aldireza
 */
public class Form_Parkir extends javax.swing.JFrame {
    DefaultTableModel masuk, keluar;
    konek konek = new konek();

    /**
     * Creates new form Form_Parkir
     */
        public Form_Parkir(java.awt.Frame parent, boolean modal) {
//        super(parent, modal);
        konek.konek();
        initComponents();
        btn_Save.setBackground(Color.green);
        btn_Clear.setBackground(Color.red);
        btn_OK.setBackground(Color.blue);
        btn_ParkirKeluar.setBackground(Color.green);
        btn_Hapus.setBackground(Color.red);
        tampil_masuk();
        tampil_keluar();
        setLocationRelativeTo(this);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lbl_biaya = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        tp_parkir = new javax.swing.JTabbedPane();
        jPanel2 = new javax.swing.JPanel();
        lbl_No_kendaraan = new javax.swing.JLabel();
        txt_NoKendaraan = new javax.swing.JTextField();
        lbl_Jeniskendaraan = new javax.swing.JLabel();
        cb_Kendaraan = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbl_Masuk = new javax.swing.JTable();
        btn_Save = new javax.swing.JButton();
        btn_Clear = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        lbl_NoKendaraan = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txt_NoKendaraanKeluar = new javax.swing.JTextField();
        txt_NoTiket = new javax.swing.JTextField();
        txt_JenisKendaraan = new javax.swing.JTextField();
        txt_JamMasuk = new javax.swing.JTextField();
        txt_TanggalMasuk = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        txt_DurasiJ = new javax.swing.JTextField();
        txt_DurasiH = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        txt_biaya = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        txt_Total = new javax.swing.JTextField();
        btn_ParkirKeluar = new javax.swing.JButton();
        btn_Hapus = new javax.swing.JButton();
        btn_OK = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        tbl_Keluar = new javax.swing.JTable();
        btn_back = new javax.swing.JButton();

        lbl_biaya.setText("jLabel2");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setText("Sistem Parkir");

        lbl_No_kendaraan.setText("No Kendaraan");

        txt_NoKendaraan.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_NoKendaraanKeyTyped(evt);
            }
        });

        lbl_Jeniskendaraan.setText("Jenis Kendaraan");

        cb_Kendaraan.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "---- PILIH KENDARAAN ----", "MOBIL", "MOTOR" }));

        tbl_Masuk.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "No. Tiket", "No. Kendaraan", "Jenis Kendaraan", "Tanggal Masuk", "Jam Masuk"
            }
        ));
        jScrollPane1.setViewportView(tbl_Masuk);

        btn_Save.setText("Save");
        btn_Save.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_SaveActionPerformed(evt);
            }
        });

        btn_Clear.setText("Clear");
        btn_Clear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_ClearActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(60, 60, 60)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbl_No_kendaraan)
                    .addComponent(lbl_Jeniskendaraan))
                .addGap(84, 84, 84)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txt_NoKendaraan)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(btn_Save, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 42, Short.MAX_VALUE)
                        .addComponent(btn_Clear, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(cb_Kendaraan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(167, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(46, 46, 46)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(txt_NoKendaraan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbl_No_kendaraan))
                .addGap(29, 29, 29)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_Jeniskendaraan)
                    .addComponent(cb_Kendaraan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_Save)
                    .addComponent(btn_Clear))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 18, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 277, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(83, 83, 83))
        );

        tp_parkir.addTab("Parkir Masuk", jPanel2);

        lbl_NoKendaraan.setText("No. Kendaraan");

        jLabel3.setText("No. Tiket");

        jLabel4.setText("Jenis Kendaraan");

        jLabel5.setText("Jam Masuk");

        jLabel6.setText("Tanggal Masuk");

        txt_NoKendaraanKeluar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_NoKendaraanKeluarActionPerformed(evt);
            }
        });
        txt_NoKendaraanKeluar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_NoKendaraanKeluarKeyTyped(evt);
            }
        });

        txt_NoTiket.setEditable(false);

        txt_JenisKendaraan.setEditable(false);

        txt_JamMasuk.setEditable(false);

        txt_TanggalMasuk.setEditable(false);

        jLabel7.setText("Durasi Jam");

        jLabel8.setText("Durasi Hari");

        txt_DurasiJ.setEditable(false);

        txt_DurasiH.setEditable(false);

        jLabel9.setText("Biaya Parkir");

        txt_biaya.setEditable(false);

        jLabel10.setText("Total Bayar");

        txt_Total.setEditable(false);

        btn_ParkirKeluar.setText("Keluar Parkir");
        btn_ParkirKeluar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_ParkirKeluarActionPerformed(evt);
            }
        });

        btn_Hapus.setText("Hapus");
        btn_Hapus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_HapusActionPerformed(evt);
            }
        });

        btn_OK.setText("OK");
        btn_OK.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_OKActionPerformed(evt);
            }
        });

        tbl_Keluar.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "No. Tiket", "No. Kendaraan", "Jenis Kendaraan", "Tanggal Keluar", "jam Keluar", "Total Biaya"
            }
        ));
        jScrollPane2.setViewportView(tbl_Keluar);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 568, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lbl_NoKendaraan)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5)
                            .addComponent(jLabel6)
                            .addComponent(jLabel9)
                            .addComponent(jLabel10))
                        .addGap(37, 37, 37)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txt_NoKendaraanKeluar)
                                    .addComponent(txt_NoTiket)
                                    .addComponent(txt_JenisKendaraan)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(txt_JamMasuk, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 38, Short.MAX_VALUE)
                                        .addComponent(jLabel7))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(txt_TanggalMasuk, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jLabel8)))
                                .addGap(29, 29, 29)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(txt_DurasiJ, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(txt_DurasiH, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(btn_OK, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(txt_Total, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 105, Short.MAX_VALUE)
                                    .addComponent(txt_biaya, javax.swing.GroupLayout.Alignment.LEADING))
                                .addGap(58, 58, 58)
                                .addComponent(btn_ParkirKeluar, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(40, 40, 40)
                                .addComponent(btn_Hapus, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 50, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lbl_NoKendaraan)
                            .addComponent(txt_NoKendaraanKeluar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(24, 24, 24)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(txt_NoTiket, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addComponent(btn_OK, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(25, 25, 25)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addComponent(txt_JenisKendaraan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(txt_JamMasuk, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7)
                    .addComponent(txt_DurasiJ, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(txt_TanggalMasuk, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8)
                    .addComponent(txt_DurasiH, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(45, 45, 45)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(txt_biaya, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel10)
                            .addComponent(txt_Total, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btn_Hapus, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn_ParkirKeluar, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        tp_parkir.addTab("Parkir Keluar", jPanel1);

        btn_back.setText("Back");
        btn_back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_backActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(250, 250, 250)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(tp_parkir)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btn_back)
                .addGap(91, 91, 91))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(tp_parkir, javax.swing.GroupLayout.PREFERRED_SIZE, 574, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btn_back)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txt_NoKendaraanKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_NoKendaraanKeyTyped
        // TODO add your handling code here:
        evt.setKeyChar(Character.toUpperCase(evt.getKeyChar())); 
    }//GEN-LAST:event_txt_NoKendaraanKeyTyped

    private void btn_SaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_SaveActionPerformed
        // TODO add your handling code here:
        if (txt_NoKendaraan.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Nomor Kendaraan belum diisi!");
        } else if (cb_Kendaraan.getSelectedItem().equals("-Pilih Jenis Kendaraan-")) {
            JOptionPane.showMessageDialog(this, "Jenis kendaraan belum dipilih");
        } else {
            String nokendaraan, jenis, sql;
            nokendaraan = txt_NoKendaraan.getText();
            jenis = cb_Kendaraan.getSelectedItem().toString();

            sql = "INSERT INTO tb_parkir(no_kendaraan,jenis,tgl_masuk,jam_masuk)"
                    + "VALUES('"+nokendaraan+"','"+jenis+"',CURDATE(),CURTIME())";
            try{
                konek.st = konek.con.createStatement();
                konek.st.execute(sql);
            }
            catch (SQLException e){
                JOptionPane.showMessageDialog(this, "Data gagal disimpan"+e);
                return;
            }
            JOptionPane.showMessageDialog(this, "Data berhasil disimpan");
        }
        ClearAll();
        tampil_masuk();
        tampil_keluar();
    }//GEN-LAST:event_btn_SaveActionPerformed

    private void btn_ClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_ClearActionPerformed
        // TODO add your handling code here:
        txt_NoKendaraan.setText("");
        cb_Kendaraan.setSelectedIndex(0);
    }//GEN-LAST:event_btn_ClearActionPerformed

    private void btn_OKActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_OKActionPerformed
        // TODO add your handling code here:
         if(txt_NoKendaraanKeluar.getText().isEmpty())
            JOptionPane.showMessageDialog(this, "No. Kendaraan masih kosong!");
        else {
            DecimalFormat rupiah = (DecimalFormat) DecimalFormat.getCurrencyInstance();
            DecimalFormatSymbols formatRp = new DecimalFormatSymbols();
            formatRp.setCurrencySymbol("Rp ");
            formatRp.setMonetaryDecimalSeparator(',');
            formatRp.setGroupingSeparator('.');
            rupiah.setDecimalFormatSymbols(formatRp);
 
            String sql = "SELECT *, DATEDIFF(CURDATE(), tgl_masuk) "
                    + "durasi_hari, (TIME_FORMAT(CURTIME(),'%H')-TIME_FORMAT(jam_masuk, '%H')) durasi_jam "
                    + "FROM tb_parkir WHERE no_kendaraan='"+txt_NoKendaraanKeluar.getText()+"' AND biaya=0";
            try
            {
                konek.st = konek.con.createStatement();
                konek.rs = konek.st.executeQuery(sql);
            } catch (SQLException ex){
                JOptionPane.showMessageDialog(this, "Kesalahan query"+ex);
            }
            int size=0;
            try {
                while (konek.rs.next()){
                    size++;
                    txt_NoTiket.setText(konek.rs.getString("no_tiket").toString());
                    txt_JenisKendaraan.setText(konek.rs.getString("jenis").toString());
                    txt_TanggalMasuk.setText(konek.rs.getString("tgl_masuk").toString());
                    txt_JamMasuk.setText(konek.rs.getString("jam_masuk").toString());
                    int hari = Integer.parseInt(konek.rs.getString("durasi_hari"));
                    int jam = Integer.parseInt(konek.rs.getString("durasi_jam"));
                    int biaya, biaya_akhir;
                    if(txt_JenisKendaraan.getText().equals("Mobil")){
                        txt_biaya.setText(rupiah.format(5000));
                        biaya = 5000;
                    } else {
                        txt_biaya.setText(rupiah.format(2000));
                        biaya = 2000;
                    }
                    if(hari>0){
                        txt_DurasiH.setText(""+hari+" hari");
                        txt_DurasiJ.setText("-");
                        biaya_akhir = biaya + (50000*hari);
                        txt_Total.setText(rupiah.format(biaya_akhir));
                        lbl_biaya.setText(""+biaya_akhir);
                    }
                    else{ 
                        txt_DurasiH.setText("0 hari");
                        txt_DurasiJ.setText(konek.rs.getString("durasi_jam").toString()+" jam");
                        biaya_akhir = biaya + (1000*jam);
                        txt_Total.setText(rupiah.format(biaya_akhir));
                        lbl_biaya.setText(""+biaya_akhir);
                    }

                 }
                if(size==0)
                {
                    JOptionPane.showMessageDialog(this,"Data tidak ditemukan");
                    return;
                }
                konek.rs.close();
                konek.st.close();
            } catch (SQLException ex){
            }
        }
    }//GEN-LAST:event_btn_OKActionPerformed

    private void txt_NoKendaraanKeluarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_NoKendaraanKeluarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_NoKendaraanKeluarActionPerformed

    private void txt_NoKendaraanKeluarKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_NoKendaraanKeluarKeyTyped
        // TODO add your handling code here:
        evt.setKeyChar(Character.toUpperCase(evt.getKeyChar())); 
    }//GEN-LAST:event_txt_NoKendaraanKeluarKeyTyped

    private void btn_ParkirKeluarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_ParkirKeluarActionPerformed
        // TODO add your handling code here:
        if(txt_NoKendaraanKeluar.getText().isEmpty())
            JOptionPane.showMessageDialog(this, "Data kosong!");
        else {
            int biaya = Integer.parseInt(lbl_biaya.getText());
            String sql, notiket;
            notiket = txt_NoTiket.getText();
            
            sql = "UPDATE tb_parkir SET tgl_keluar=CURDATE(), jam_keluar=CURTIME(), biaya='"+biaya+"' "
                    + "WHERE no_tiket='"+notiket+"'";
                try{
                    konek.st = konek.con.createStatement();
                    konek.st.execute(sql);
                }
                catch (SQLException e){
                    JOptionPane.showMessageDialog(this, "Data gagal disimpan"+e);
                    return;
                }
                JOptionPane.showMessageDialog(this, "Data berhasil diperbaharui");
            
            ClearAll();
            tampil_masuk();
            tampil_keluar();
        }
    }//GEN-LAST:event_btn_ParkirKeluarActionPerformed

    private void btn_HapusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_HapusActionPerformed
        // TODO add your handling code here:
        txt_NoKendaraanKeluar.setText("");
        txt_NoTiket.setText("");
        txt_JenisKendaraan.setText("");
        txt_TanggalMasuk.setText("");
        txt_JamMasuk.setText("");
        txt_DurasiH.setText("");
        txt_DurasiJ.setText("");
        txt_biaya.setText("");
        txt_Total.setText("");
    }//GEN-LAST:event_btn_HapusActionPerformed

    private void btn_backActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_backActionPerformed
        // TODO add your handling code here:
        dispose();
    }//GEN-LAST:event_btn_backActionPerformed
 public void ClearAll(){
        txt_NoKendaraan.setText("");
        cb_Kendaraan.setSelectedIndex(0);
        masuk = (DefaultTableModel) tbl_Masuk.getModel();
        keluar = (DefaultTableModel) tbl_Keluar.getModel();
        int rowCount1 = masuk.getRowCount();
        int rowCount2 = keluar.getRowCount();
        //Remove rows one by one from the end of the table
        for (int i = rowCount1 - 1; i >= 0; i--) {
            masuk.removeRow(i);
        }
        for (int i = rowCount2 - 1; i >= 0; i--) {
            keluar.removeRow(i);
        }
    }
 public void tampil_masuk(){
        masuk = (DefaultTableModel) tbl_Masuk.getModel();
        try {
            konek.st = konek.con.createStatement();
            String query = "SELECT * FROM tb_parkir WHERE biaya=0 ORDER BY no_tiket DESC LIMIT 25";
            konek.rs = konek.st.executeQuery(query);
            while (konek.rs.next()) {
                String no_tiket = konek.rs.getString("no_tiket");
                String no_kendaraan = konek.rs.getString("no_kendaraan");
                String jenis = konek.rs.getString("jenis");
                String tgl_masuk = konek.rs.getString("tgl_masuk");
                String jam_masuk = konek.rs.getString("jam_masuk");
                
                String [] data = {no_tiket, no_kendaraan, jenis, tgl_masuk, jam_masuk};
                masuk.addRow(data);
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Gagal ambil data"+e);
        }
        tbl_Masuk.setModel(masuk);
    }
    
    public void tampil_keluar(){
        DecimalFormat rupiah = (DecimalFormat) DecimalFormat.getCurrencyInstance();
        DecimalFormatSymbols formatRp = new DecimalFormatSymbols();
        formatRp.setCurrencySymbol("Rp ");
        formatRp.setMonetaryDecimalSeparator(',');
        formatRp.setGroupingSeparator('.');
        rupiah.setDecimalFormatSymbols(formatRp);
        
        keluar = (DefaultTableModel) tbl_Keluar.getModel();
        try {
            konek.st = konek.con.createStatement();
            String query = "SELECT * FROM tb_parkir WHERE biaya <> 0 ORDER BY tgl_keluar DESC,jam_keluar DESC LIMIT 15";
            konek.rs = konek.st.executeQuery(query);
            while (konek.rs.next()) {
                String no_tiket = konek.rs.getString("no_tiket");
                String no_pol = konek.rs.getString("no_kendaraan");
                String jenis = konek.rs.getString("jenis");
                String tgl_keluar = konek.rs.getString("tgl_keluar");
                String jam_keluar = konek.rs.getString("jam_keluar");
                String biaya = konek.rs.getString("biaya");
                Double biaya2 = Double.parseDouble(biaya);
                String biaya_final = (rupiah.format(biaya2));
                
                String [] data = {no_tiket, no_pol, jenis, tgl_keluar, jam_keluar, biaya_final};
                keluar.addRow(data);
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Gagal ambil data"+e);
        }
        tbl_Keluar.setModel(keluar);
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
            java.util.logging.Logger.getLogger(Form_Parkir.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Form_Parkir.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Form_Parkir.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Form_Parkir.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
          java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                Form_Parkir dialog = new Form_Parkir(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_Clear;
    private javax.swing.JButton btn_Hapus;
    private javax.swing.JButton btn_OK;
    private javax.swing.JButton btn_ParkirKeluar;
    private javax.swing.JButton btn_Save;
    private javax.swing.JButton btn_back;
    private javax.swing.JComboBox<String> cb_Kendaraan;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
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
    private javax.swing.JLabel lbl_Jeniskendaraan;
    private javax.swing.JLabel lbl_NoKendaraan;
    private javax.swing.JLabel lbl_No_kendaraan;
    private javax.swing.JLabel lbl_biaya;
    private javax.swing.JTable tbl_Keluar;
    private javax.swing.JTable tbl_Masuk;
    private javax.swing.JTabbedPane tp_parkir;
    private javax.swing.JTextField txt_DurasiH;
    private javax.swing.JTextField txt_DurasiJ;
    private javax.swing.JTextField txt_JamMasuk;
    private javax.swing.JTextField txt_JenisKendaraan;
    private javax.swing.JTextField txt_NoKendaraan;
    private javax.swing.JTextField txt_NoKendaraanKeluar;
    private javax.swing.JTextField txt_NoTiket;
    private javax.swing.JTextField txt_TanggalMasuk;
    private javax.swing.JTextField txt_Total;
    private javax.swing.JTextField txt_biaya;
    // End of variables declaration//GEN-END:variables
}