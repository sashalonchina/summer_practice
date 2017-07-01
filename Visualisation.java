package sample.summer_practice;

import java.awt.*;
import javax.swing.*;

/** Класс графического интерфейса */
public class Visualisation extends JPanel
{
    private int[] array;

    private static int heapSize;

    private JButton play = new JButton("Пауза");

    private int scale = 2;
    private int minRad = 10;
    private int c = 0;

    private Graphics2D g2d;


    public Visualisation(int[] ar)
    {
        array = ar.clone();
    }

    public void setCont()
    {
        repaint();
    }

    @Override
    protected void paintComponent(Graphics g)
    {
        super.paintComponent(g);

        g2d = (Graphics2D)g;

        g2d.setBackground(Color.white);

        g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);

        for(int i = 0; i < array.length; i++)
        {
            g2d.setColor(Color.red);
            g2d.fillOval(i * getWidth()/array.length + minRad, getHeight()/2 - array[i]/scale + minRad, array[i]/scale + minRad, array[i]/scale + minRad);
        }

        g2d.dispose();
    }
}
