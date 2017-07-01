package sample.summer_practice;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.io.IOException;
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

    private Thread vizThread;

    private Timer timer;

    public void notifyViz() {
        vizThread.notify();
    }

    public Visualisation(int[] ar)
    {
        array = ar.clone();
    }

    public void timerStart()
    {
        timer.start();
    }

    public void setCont()
    {


        rep();
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

    public void rep()
    {


        repaint();
    }

}
