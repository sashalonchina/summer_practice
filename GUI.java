package sample.summer_practice;

import java.awt.*;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.*;
import java.util.InputMismatchException;
import java.util.Scanner;

import sample.summer_practice.Visual;

/** Класс графического интерфейса */
public class GUI extends JFrame
{
    /**
     * Задать длину h и ширину w окна, две кнопки button1, button2 и текст label
     */
    private static int scale = 2;
    private static int maxCount = 50;

    private int w = 360 * scale, h = 270 * scale;
    private int spd = 0;
    private int pse = 0;
    private int maxLenArr = 10;

    private boolean flag = false;

    private String tmp;
    private int[] array = new int[maxLenArr];



    /**
     * Конструктор класса
     */
    public GUI()
    {
        super();

        /** Размеры и положение окна, задания по выходу из окна выходить из приложения */
        this.setSize(w, h);
        this.setBounds(h, w, w, h);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        /** Контейнер для группировки элементов */
        Container container = this.getContentPane();

        container.setLayout(null);

        /** Размеры и положение кнопок */
        button1.setSize(100 * scale, 20 * scale);
        button1.setLocation(70 * scale, 70 * scale);
        button1.addActionListener(new Action2());

        button2.setSize(100 * scale, 20 * scale);
        button2.setLocation(210 * scale, 70 * scale);
        button2.addActionListener(new Action1());

        /** Размеры и положение текста */
        label.setSize(180 * scale, 30 * scale);
        label.setLocation(90 * scale, 30 * scale);
        label.setHorizontalAlignment(SwingConstants.CENTER);

        /** Добавление элементов в окно */
        container.add(label);
        container.add(button1);
        container.add(button2);
    }

    /**
     * Поведения кнопки генерации массива
     */
    class Action implements ActionListener
    {
        public void actionPerformed(ActionEvent e)
        {
            spd = Integer.parseInt(speed.getText());
            pse = Integer.parseInt(ps.getText());

            label.setVisible(true);
            button1.setVisible(true);
            button2.setVisible(true);

            speed.setVisible(false);
            ps.setVisible(false);
            next.setVisible(false);

            label.setText("Выберите тип визуализации");

            button1.setText("Куча");
            button1.addActionListener(new Action3());

            button2.setText("Размер");
            button2.addActionListener(new Action4());
        }
    }

    /**
     * Поведение кнопки ручного ввода массива
     */
    class Action1 implements ActionListener
    {
        public void actionPerformed(ActionEvent e)
        {
            flag = true;

            text.setSize(120 * scale, 25 * scale);
            text.setLocation(210 * scale, 150 * scale);

            nexter.setSize(30 * scale, 15 * scale);
            nexter.setLocation(300 * scale, 210 * scale);
            nexter.addActionListener(new Action2());

            add(text);
            add(nexter);
        }
    }

    class Action2 implements ActionListener
    {
        public void actionPerformed(ActionEvent e)
        {
            if (flag == true)
            {
                tmp = text.getText();

                String[] arr = tmp.split(" ");

                if (arr.length > maxLenArr)
                {
                    int kostyl = Integer.parseInt("kostyl");
                }

                for (int i = 0; i < arr.length; i++) if(Integer.parseInt(arr[i]) > maxCount)
                {
                    int kostyl = Integer.parseInt("kostyl");
                }

                for (int i = 0; i < arr.length; i++) array[i] = Integer.parseInt(arr[i]);
            }
            else
            {
                Test test = new Test(maxLenArr);

                try
                {
                    Scanner scanner = new Scanner(new File("in.txt"));

                    int i = 0;

                    while(scanner.hasNextInt()) array[i++] = scanner.nextInt();
                }
                catch (FileNotFoundException er)
                {
                    System.out.println("Sorry, File not found!");
                }
                catch (InputMismatchException er)
                {
                    System.out.println("Sorry, InputMismatchException");
                }
            }

            label.setVisible(false);
            button1.setVisible(false);
            button2.setVisible(false);
            text.setVisible(false);
            nexter.setVisible(false);

            speed.setSize(120 * scale, 25 * scale);
            speed.setLocation(120 * scale, 70 * scale);

            ps.setSize(120 * scale, 25 * scale);
            ps.setLocation(120 * scale, 100 * scale);

            next.setSize(30 * scale, 15 * scale);
            next.setLocation(165 * scale, 130 * scale);
            next.addActionListener(new Action());

            add(speed);
            add(ps);
            add(next);
        }
    }

    class Action3 implements ActionListener
    {
        public void actionPerformed(ActionEvent e)
        {
            Visual scene = new Visual(array, spd);

            JPanel cp = new JPanel(new BorderLayout());

            cp.setBorder(BorderFactory.createCompoundBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5),
                    BorderFactory.createLineBorder(Color.black)));

            setContentPane(cp);

            add(scene, BorderLayout.CENTER);

            pause.addActionListener(new ActionListener()
            {
                public void actionPerformed(ActionEvent e)
                {
                    try
                    {
                        Thread.sleep(pse);
                    }

                    catch (InterruptedException err)
                    {
                        err.printStackTrace();
                    }
                }
            });

            cp.add(pause, BorderLayout.SOUTH);

            setSize(250 * scale, 200 * scale);
            setLocationRelativeTo(null);
            setDefaultCloseOperation(EXIT_ON_CLOSE);
            setVisible(true);
        }
    }

    class Action4 implements ActionListener
    {
        public void actionPerformed(ActionEvent e)
        {
            Visualisation scene = new Visualisation(array, spd);

            JPanel cp = new JPanel(new BorderLayout());

            cp.setBorder(BorderFactory.createCompoundBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5),
                    BorderFactory.createLineBorder(Color.black)));

            setContentPane(cp);

            add(scene, BorderLayout.CENTER);

            pause.addActionListener(new ActionListener()
            {
                public void actionPerformed(ActionEvent e)
                {
                    try
                    {
                        Thread.sleep(pse);
                    }

                    catch (InterruptedException err)
                    {
                        err.printStackTrace();
                    }
                }
            });

            cp.add(pause, BorderLayout.SOUTH);
            cp.setBackground(Color.white);

            setSize(250 * scale, 200 * scale);
            setLocationRelativeTo(null);
            setDefaultCloseOperation(EXIT_ON_CLOSE);
            setVisible(true);
        }
    }
}
