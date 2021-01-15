package View;

import Controller.KendaraanController07176;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.*;
public class fajar07176_DataGUI extends fajar07176_komponen{
    private static KendaraanController07176 kendaraan07176 = new KendaraanController07176();
    public fajar07176_DataGUI(){
        setSize(600, 600);
        setLayout(null);
        getContentPane().setBackground(Color.LIGHT_GRAY);
        judulatas.setBounds(120,30,390,40);
        judulatas.setBackground(Color.WHITE);
        judulatas.setFont(new Font("Times New Roman",Font.BOLD,30));
        add(judulatas);
        scroll.setBounds(80,70,430,120);
        tabeldata.setModel(kendaraan07176.databaru());
        add(scroll);
        hapus.setBounds(80,405,130,30);
        hapus.setBackground(Color.YELLOW);
        add(hapus);
        back.setBounds(220,405,130,30);
        back.setBackground(Color.YELLOW);
        add(back);
        update.setBounds(360,405,130,30);
        update.setBackground(Color.YELLOW);
        add(update);
        Nomer.setBounds(80,210,130,30);
        add(Nomer);
        textNomor.setBounds(80,235,130,25);
        add(textNomor);
        Pemilik.setBounds(80,255,140,30);
        add(Pemilik);
        textPemilik.setBounds(80,280,130,25);
        add(textPemilik);
        Merek.setBounds(80,300,130,30);
        add(Merek);
        textMerek.setBounds(80,325,130,25);
        add(textMerek);
        Warna.setBounds(80,345,130,30);
        add(Warna);
        textWarna.setBounds(80,370,130,25);
        add(textWarna);
        radiomotor.setBounds(250,235,120,25);
        radiomotor.setBackground(Color.ORANGE);
        add(radiomotor);
        radiomobil.setBackground(Color.ORANGE);
        radiomobil.setBounds(250,265,120,25);
        add(radiomobil);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
        setLocationRelativeTo(null);
        
        radiomotor.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent ae){
                if(radiomotor.isSelected()){
                   radiomobil.setSelected(false);
                }
            }
        });
        radiomobil.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent ae){
                if(radiomobil.isSelected()){
                   radiomotor.setSelected(false);
                }
            }
        });
        hapus.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                if(radiomotor.isSelected()){
                    String nomermotor07176 = textNomor.getText();
                    for (int i = 0; i < fajar07176_allobjctrl.kendaraan07176.getDataMotor().size(); i++) {
                    if (nomermotor07176.equals(fajar07176_allobjctrl.kendaraan07176.getDataMotor().get(i).getNomorkendaraan07176())){
                        fajar07176_allobjctrl.kendaraan07176.getDataMotor().remove(i);
                        tabeldata.setModel(kendaraan07176.databaru());
                        JOptionPane.showMessageDialog(null, "data motor terhapus", "information", JOptionPane.INFORMATION_MESSAGE);
                        kosong07176();
                    }}
                }else if(radiomobil.isSelected()){
                    String nomermobil07176 = textNomor.getText();
                    for (int i = 0; i < fajar07176_allobjctrl.kendaraan07176.getDataMobil().size(); i++) {
                    if (nomermobil07176.equals(fajar07176_allobjctrl.kendaraan07176.getDataMobil().get(i).getNomorMobil07176())){
                        fajar07176_allobjctrl.kendaraan07176.getDataMobil().remove(i);
                        tabeldata.setModel(kendaraan07176.databaru());
                        JOptionPane.showMessageDialog(null, "data mobil terhapus", "information", JOptionPane.INFORMATION_MESSAGE);
                        kosong07176();
                    }}
                }
            }
        });
        update.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                if(radiomotor.isSelected()){
                   try {
                       int i = tabeldata.getSelectedRow();
                       int updatemotor = Integer.parseInt(fajar07176_allobjctrl.kendaraan07176.databaru().getValueAt(i, 0).toString());
                       String nomer = textNomor.getText();
                       String pemilik = textPemilik.getText();
                       String merek = textMerek.getText();
                       String warna = textWarna.getText();
                       fajar07176_allobjctrl.kendaraan07176.update(updatemotor,"motor",nomer,"nomor"); 
                       fajar07176_allobjctrl.kendaraan07176.update(updatemotor,"motor",pemilik,"nama");
                       fajar07176_allobjctrl.kendaraan07176.update(updatemotor,"motor",merek,"merek");
                       fajar07176_allobjctrl.kendaraan07176.update(updatemotor,"motor",warna,"warna");
                       tabeldata.setModel(kendaraan07176.databaru());
                       JOptionPane.showMessageDialog(null, "data motor Terupdate", "information", JOptionPane.INFORMATION_MESSAGE);
                       kosong07176();
                } catch (Exception exception) {
                    JOptionPane.showMessageDialog(null, "Data masih kosong", "information", JOptionPane.INFORMATION_MESSAGE);
                }
                }else if(radiomobil.isSelected()){
                    try {
                       int i = tabeldata.getSelectedRow();
                       int updatemobil = Integer.parseInt(fajar07176_allobjctrl.kendaraan07176.databaru().getValueAt(i, 0).toString());
                       String nomer = textNomor.getText();
                       String pemilik = textPemilik.getText();
                       String merek = textMerek.getText();
                       String warna = textWarna.getText();
                       fajar07176_allobjctrl.kendaraan07176.update(updatemobil,"mobil",nomer,"nomor"); 
                       fajar07176_allobjctrl.kendaraan07176.update(updatemobil,"mobil",pemilik,"nama");
                       fajar07176_allobjctrl.kendaraan07176.update(updatemobil,"mobil",merek,"merek");
                       fajar07176_allobjctrl.kendaraan07176.update(updatemobil,"mobil",warna,"warna");
                       tabeldata.setModel(kendaraan07176.databaru());
                       JOptionPane.showMessageDialog(null, "data mobil Terupdate", "information", JOptionPane.INFORMATION_MESSAGE);
                       kosong07176();
                } catch (Exception exception) {
                    JOptionPane.showMessageDialog(null, "Data masih kosong", "information", JOptionPane.INFORMATION_MESSAGE);
                }
                }
            }
        });
        back.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
              fajar07176_GUI hii = new fajar07176_GUI();
              dispose();
            }
        });
        tabeldata.addMouseListener(new MouseAdapter(){
            @Override
            public void mouseClicked(MouseEvent e){
                int i = tabeldata.getSelectedRow();
                textNomor.setText(fajar07176_allobjctrl.kendaraan07176.databaru().getValueAt(i, 1).toString());
                textPemilik.setText(fajar07176_allobjctrl.kendaraan07176.databaru().getValueAt(i, 2).toString());
                textMerek.setText(fajar07176_allobjctrl.kendaraan07176.databaru().getValueAt(i, 3).toString());
                textWarna.setText(fajar07176_allobjctrl.kendaraan07176.databaru().getValueAt(i, 4).toString());
            }
        });
    }
    void kosong07176(){
        textNomor.setText(null);
        textPemilik.setText(null);
        textMerek.setText(null);
        textWarna.setText(null);
    }
}
