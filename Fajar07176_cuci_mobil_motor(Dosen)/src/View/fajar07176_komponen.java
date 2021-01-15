package View;

import javax.swing.*;
public class fajar07176_komponen extends JFrame{
    protected JLabel judul = new JLabel("CUCI MOBIL & MOTOR");
    protected JLabel nomer = new JLabel("Nomer");
    protected JLabel pemilik = new JLabel("Pemilik");
    protected JLabel merek = new JLabel("Merek");
    protected JLabel warna = new JLabel("Warna");
    protected JTextField nomertext = new JTextField();
    protected JTextField pemiliktext = new JTextField();
    protected JTextField merektext = new JTextField();
    protected JTextField warnatext = new JTextField();
    protected JButton create = new JButton("Create");
    protected JButton view = new JButton("Tampilkan Data");
    protected JRadioButton datamotor = new JRadioButton("Data Motor");
    protected JRadioButton datamobil = new JRadioButton("Data Mobil");
    protected JTable tabeldata = new JTable();
    protected JScrollPane scroll = new JScrollPane(tabeldata);
    protected JLabel judulatas = new JLabel("Tampilan Data Kendaraan");
    protected JLabel Nomer = new JLabel("Nomor");
    protected JLabel Pemilik = new JLabel("Nama Pemilik");
    protected JLabel Merek = new JLabel("Merek");
    protected JLabel Warna = new JLabel("Warna");
    protected JRadioButton radiomotor = new JRadioButton("Data Motor");
    protected JRadioButton radiomobil = new JRadioButton("Data Mobil");
    protected JButton hapus = new JButton("Hapus");
    protected JButton update = new JButton("Update");
    protected JButton back = new JButton("Back");
    protected JTextField textNomor = new JTextField();
    protected JTextField textPemilik = new JTextField();
    protected JTextField textMerek = new JTextField();
    protected JTextField textWarna = new JTextField();
}
