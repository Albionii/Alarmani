import javax.swing.*;
import java.util.*;
import java.awt.*;

public class Main extends JPanel {
    public Main () {
        JFrame frame = new JFrame();
        frame.setVisible(true);
        frame.setSize(600, 600);
        frame.setTitle("Alarman !!!");
        frame.getContentPane().add(this);

    }


    public void paintComponent (Graphics g) {
        // Grafiku
        int ytop = 100;
        int ybottom = 450;
        int axis_length = ybottom - ytop;

        g.drawLine(50, 100, 50, 450);
        g.drawLine(50, 450, 400, 450);

        //Segmentet

        g.drawLine(45, ybottom - 1 * (axis_length)/12, 55, ybottom - 1 * (axis_length)/12);
        g.drawLine(45, ybottom - 2 * (axis_length)/12, 55, ybottom - 2 * (axis_length)/12);
        g.drawLine(45, ybottom - 3 * (axis_length)/12, 55, ybottom - 3 * (axis_length)/12);
        g.drawLine(45, ybottom - 4 * (axis_length)/12, 55, ybottom - 4 * (axis_length)/12);
        g.drawLine(45, ybottom - 5 * (axis_length)/12, 55, ybottom - 5 * (axis_length)/12);
        g.drawLine(45, ybottom - 6 * (axis_length)/12, 55, ybottom - 6 * (axis_length)/12);
        g.drawLine(45, ybottom - 7 * (axis_length)/12, 55, ybottom - 7 * (axis_length)/12);
        g.drawLine(45, ybottom - 8 * (axis_length)/12, 55, ybottom - 8 * (axis_length)/12);
        g.drawLine(45, ybottom - 9 * (axis_length)/12, 55, ybottom - 9 * (axis_length)/12);
        g.drawLine(45, ybottom - 10 * (axis_length)/12, 55, ybottom - 10 * (axis_length)/12);
        g.drawLine(45, ybottom - 11 * (axis_length)/12, 55, ybottom - 11 * (axis_length)/12);
        g.drawLine(45, ybottom - 12 * (axis_length)/12, 55, ybottom - 12 * (axis_length)/12);

        g.drawLine(50 + 1 * (axis_length/12) , ybottom + 5, 50 + 1 * (axis_length/12), ybottom - 5);
        g.drawLine(50 + 2 * (axis_length/12) , ybottom + 5, 50 + 2 * (axis_length/12), ybottom - 5);
        g.drawLine(50 + 3 * (axis_length/12) , ybottom + 5, 50 + 3 * (axis_length/12), ybottom - 5);
        g.drawLine(50 + 4 * (axis_length/12) , ybottom + 5, 50 + 4 * (axis_length/12), ybottom - 5);
        g.drawLine(50 + 5 * (axis_length/12) , ybottom + 5, 50 + 5 * (axis_length/12), ybottom - 5);
        g.drawLine(50 + 6 * (axis_length/12) , ybottom + 5, 50 + 6 * (axis_length/12), ybottom - 5);
        g.drawLine(50 + 7 * (axis_length/12) , ybottom + 5, 50 + 7 * (axis_length/12), ybottom - 5);
        g.drawLine(50 + 8 * (axis_length/12) , ybottom + 5, 50 + 8 * (axis_length/12), ybottom - 5);
        g.drawLine(50 + 9 * (axis_length/12) , ybottom + 5, 50 + 9 * (axis_length/12), ybottom - 5);
        g.drawLine(50 + 10 * (axis_length/12) , ybottom + 5, 50 + 10 * (axis_length/12), ybottom - 5);
        g.drawLine(50 + 11 * (axis_length/12) , ybottom + 5, 50 + 11 * (axis_length/12), ybottom - 5);
        g.drawLine(50 + 12 * (axis_length/12) , ybottom + 5, 50 + 12 * (axis_length/12), ybottom - 5);



        // Njeri alarm ----> Alarman

        GregorianCalendar c = new GregorianCalendar();
        int hour = (int)(c.get(Calendar.HOUR) * 60);
        int m = (int)((c.get(Calendar.MINUTE) + hour) * 0.4861);

        g.setColor(Color.red);
        g.fillOval(50 + (axis_length) / 2 - 15, 470 - m , 30, 30); // koka
        g.drawLine(50 + (axis_length) / 2, 500 - m, 50 + (axis_length) / 2, 570 - m); // trupi
        g.drawLine(50 + (axis_length) / 2, 505 - m, 50 + (axis_length) / 2 - 50, 450 - m); // dora e majt
        g.drawLine((axis_length) / 2 - 50, 450 - m, (axis_length) / 2 + 150, 450 - m);
        g.drawLine(50 + (axis_length) / 2, 505 - m, 50 + (axis_length) / 2 + 50, 450 - m); // dora e djatht
        g.drawLine(50 + (axis_length) / 2, 570 - m, 50 + (axis_length) / 2 - 50, 610 - m); // kama e majt
        g.drawLine(50 + (axis_length) / 2, 570 - m, 50 + (axis_length) / 2 + 50, 610 - m); // kama e djatht


        // shenimet e numrave ne boshte


        g.drawString("1", 30, 455 - 1 * (axis_length)/12);
        g.drawString("2", 30, 455 - 2 * (axis_length)/12);
        g.drawString("3", 30, 455 - 3 * (axis_length)/12);
        g.drawString("4", 30, 455 - 4 * (axis_length)/12);
        g.drawString("5", 30, 455 - 5 * (axis_length)/12);
        g.drawString("6", 30, 455 - 6 * (axis_length)/12);
        g.drawString("7", 30, 455 - 7 * (axis_length)/12);
        g.drawString("8", 30, 455 - 8 * (axis_length)/12);
        g.drawString("9", 30, 455 - 9 * (axis_length)/12);
        g.drawString("10", 30, 455 - 10 * (axis_length)/12);
        g.drawString("11", 30, 455 - 11 * (axis_length)/12);
        g.drawString("12", 30, 455 - 12 * (axis_length)/12);

    }

    public static void main (String[] args) {

        new Main ();
    }


}