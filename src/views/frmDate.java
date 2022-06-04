
package views;

import classes.Cell;
import java.awt.Component;
import java.util.Calendar;


public class frmDate extends javax.swing.JLayeredPane {

    private static int month;
    private static int year;
    
    public frmDate(int month, int year) {
        initComponents();
        this.month = month;
        this.year = year;
        init();
    }
    
    private void init() {
        seg.asTitle();
        ter.asTitle();
        qua.asTitle();
        qui.asTitle();
        sex.asTitle();
        sab.asTitle();
        dom.asTitle();
        setDate();
    }
    
    private void setDate() {
        Calendar calendar = Calendar.getInstance();
        calendar.set(Calendar.YEAR, year);
        calendar.set(Calendar.MONTH, month-1); // mês de janeiro é 0
        calendar.set(Calendar.DATE, 1);
        int startDay = calendar.get(Calendar.DAY_OF_WEEK) - 1; // Obter o dia da semana -1 ao index
        calendar.add(Calendar.DATE, -startDay); 
        for(Component com : getComponents()) {
            Cell cell = (Cell) com;
            if(!cell.isTitle()) { 
                cell.setText(calendar.get(Calendar.DATE) + "");
                cell.setDate(calendar.getTime());
                cell.currentMonth(calendar.get(Calendar.MONTH) == month - 1);
                calendar.add(Calendar.DATE, 1); // Aumentar 1 dia
            }
        }
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        dom = new classes.Cell();
        seg = new classes.Cell();
        ter = new classes.Cell();
        qua = new classes.Cell();
        qui = new classes.Cell();
        sex = new classes.Cell();
        sab = new classes.Cell();
        cell8 = new classes.Cell();
        cell9 = new classes.Cell();
        cell10 = new classes.Cell();
        cell11 = new classes.Cell();
        cell12 = new classes.Cell();
        cell13 = new classes.Cell();
        cell14 = new classes.Cell();
        cell15 = new classes.Cell();
        cell16 = new classes.Cell();
        cell17 = new classes.Cell();
        cell18 = new classes.Cell();
        cell19 = new classes.Cell();
        cell20 = new classes.Cell();
        cell21 = new classes.Cell();
        cell22 = new classes.Cell();
        cell23 = new classes.Cell();
        cell24 = new classes.Cell();
        cell25 = new classes.Cell();
        cell26 = new classes.Cell();
        cell27 = new classes.Cell();
        cell28 = new classes.Cell();
        cell29 = new classes.Cell();
        cell30 = new classes.Cell();
        cell31 = new classes.Cell();
        cell32 = new classes.Cell();
        cell33 = new classes.Cell();
        cell34 = new classes.Cell();
        cell35 = new classes.Cell();
        cell36 = new classes.Cell();
        cell37 = new classes.Cell();
        cell38 = new classes.Cell();
        cell39 = new classes.Cell();
        cell40 = new classes.Cell();
        cell41 = new classes.Cell();
        cell42 = new classes.Cell();
        cell43 = new classes.Cell();
        cell44 = new classes.Cell();
        cell45 = new classes.Cell();
        cell46 = new classes.Cell();
        cell47 = new classes.Cell();
        cell48 = new classes.Cell();
        cell49 = new classes.Cell();

        setLayout(new java.awt.GridLayout(7, 7));

        dom.setForeground(new java.awt.Color(221, 42, 42));
        dom.setText("Dom");
        dom.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        add(dom);

        seg.setText("Seg");
        seg.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        add(seg);

        ter.setText("Ter");
        ter.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        add(ter);

        qua.setText("Qua");
        qua.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        add(qua);

        qui.setText("Qui");
        qui.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        add(qui);

        sex.setText("Sex");
        sex.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        add(sex);

        sab.setText("Sab");
        sab.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        add(sab);

        cell8.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        add(cell8);

        cell9.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        add(cell9);

        cell10.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        add(cell10);

        cell11.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        add(cell11);

        cell12.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        add(cell12);

        cell13.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        add(cell13);

        cell14.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        add(cell14);

        cell15.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        add(cell15);

        cell16.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        add(cell16);

        cell17.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        add(cell17);

        cell18.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        add(cell18);

        cell19.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        add(cell19);

        cell20.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        add(cell20);

        cell21.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        add(cell21);

        cell22.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        add(cell22);

        cell23.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        add(cell23);

        cell24.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        add(cell24);

        cell25.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        add(cell25);

        cell26.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        add(cell26);

        cell27.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        add(cell27);

        cell28.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        add(cell28);

        cell29.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        add(cell29);

        cell30.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        add(cell30);

        cell31.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        add(cell31);

        cell32.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        add(cell32);

        cell33.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        add(cell33);

        cell34.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        add(cell34);

        cell35.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        add(cell35);

        cell36.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        add(cell36);

        cell37.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        add(cell37);

        cell38.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        add(cell38);

        cell39.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        add(cell39);

        cell40.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        add(cell40);

        cell41.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        add(cell41);

        cell42.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        add(cell42);

        cell43.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        add(cell43);

        cell44.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        add(cell44);

        cell45.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        add(cell45);

        cell46.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        add(cell46);

        cell47.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        add(cell47);

        cell48.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        add(cell48);

        cell49.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        add(cell49);
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private classes.Cell cell10;
    private classes.Cell cell11;
    private classes.Cell cell12;
    private classes.Cell cell13;
    private classes.Cell cell14;
    private classes.Cell cell15;
    private classes.Cell cell16;
    private classes.Cell cell17;
    private classes.Cell cell18;
    private classes.Cell cell19;
    private classes.Cell cell20;
    private classes.Cell cell21;
    private classes.Cell cell22;
    private classes.Cell cell23;
    private classes.Cell cell24;
    private classes.Cell cell25;
    private classes.Cell cell26;
    private classes.Cell cell27;
    private classes.Cell cell28;
    private classes.Cell cell29;
    private classes.Cell cell30;
    private classes.Cell cell31;
    private classes.Cell cell32;
    private classes.Cell cell33;
    private classes.Cell cell34;
    private classes.Cell cell35;
    private classes.Cell cell36;
    private classes.Cell cell37;
    private classes.Cell cell38;
    private classes.Cell cell39;
    private classes.Cell cell40;
    private classes.Cell cell41;
    private classes.Cell cell42;
    private classes.Cell cell43;
    private classes.Cell cell44;
    private classes.Cell cell45;
    private classes.Cell cell46;
    private classes.Cell cell47;
    private classes.Cell cell48;
    private classes.Cell cell49;
    private classes.Cell cell8;
    private classes.Cell cell9;
    private classes.Cell dom;
    private classes.Cell qua;
    private classes.Cell qui;
    private classes.Cell sab;
    private classes.Cell seg;
    private classes.Cell sex;
    private classes.Cell ter;
    // End of variables declaration//GEN-END:variables
}
