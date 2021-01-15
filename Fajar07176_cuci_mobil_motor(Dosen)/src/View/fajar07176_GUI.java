package View;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
public class fajar07176_GUI extends fajar07176_komponen{
    public fajar07176_GUI(){
        setSize(600, 600);
        setLayout(null);
        getContentPane().setBackground(Color.GREEN);
        judul.setBounds(110, 50, 350, 30);
        judul.setFont(new Font("Times New Roman",Font.BOLD,30));
        add(judul);  
        datamotor.setBounds(170,140,100,30);
        datamotor.setBackground(Color.WHITE);
        add(datamotor);
        datamobil.setBounds(280,140,100,30);
        datamotor.setBackground(Color.WHITE);
        add(datamobil); 
        nomer.setBounds(130,180,130,20);
        add(nomer);
        nomertext.setBounds(130,205,130,30);
        add(nomertext);
        pemilik.setBounds(130,230,130,30);
        add(pemilik);
        pemiliktext.setBounds(130,255,130,30);
        add(pemiliktext);
        merek.setBounds(130,285,130,30);
        add(merek);
        merektext.setBounds(130,310,130,30);
        add(merektext);
        warna.setBounds(130,340,130,30);
        add(warna);
        warnatext.setBounds(130,365,130,30);
        add(warnatext);
        create.setBounds(130,410,160,30);
        create.setBackground(Color.ORANGE);
        add(create);
        view.setBounds(130,445,160,30);
        view.setBackground(Color.ORANGE);
        add(view);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
        setLocationRelativeTo(null);
        
        datamotor.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent ae){
                if(datamotor.isSelected()){
                   datamobil.setSelected(false);
                }
            }
        });
        datamobil.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent ae){
                if(datamobil.isSelected()){
                   datamotor.setSelected(false);
                }
            }
        });
        create.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent ae) {
            if(datamotor.isSelected()){
            String nomor07176   = nomertext.getText();
            String pemilik07176 = pemiliktext.getText();
            String merek07176   = merektext.getText();
            String warna07176   = warnatext.getText();
            fajar07176_allobjctrl.kendaraan07176.insertMotor07176(nomor07176, pemilik07176, merek07176, warna07176);
            JOptionPane.showMessageDialog(null, "Registrasi motor sukses", "information", JOptionPane.INFORMATION_MESSAGE);
            kosong();
            }else if(datamobil.isSelected()){
            String nomor07176   = nomertext.getText();
            String pemilik07176 = pemiliktext.getText();
            String merek07176   = merektext.getText();
            String warna07176   = warnatext.getText();
            fajar07176_allobjctrl.kendaraan07176.insertMobil07176(nomor07176, pemilik07176, merek07176, warna07176);
            JOptionPane.showMessageDialog(null, "Registrasi mobil sukses", "information", JOptionPane.INFORMATION_MESSAGE);
            kosong();    
            }else{
                JOptionPane.showMessageDialog(null, "Isi data dahulu", "information", JOptionPane.INFORMATION_MESSAGE);
                kosong();
            }
        }
    });
        view.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent ae) {
            fajar07176_DataGUI hii = new fajar07176_DataGUI();
            dispose();
        }
    });
    }
     void kosong(){
        nomertext.setText(null);
        pemiliktext.setText(null);
        merektext.setText(null);
        warnatext.setText(null);
    }
}