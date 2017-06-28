package sample.summer_practice;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import sample.summer_practice.GUI1;

/** Класс графического интерфейса */
public class GUI extends JFrame
{
    /** Задать длину h и ширину w окна, две кнопки button1, button2 и текст label */
    private static int scale = 2;
    private int w = 360 * scale, h = 270 * scale;

    private boolean flag = false;

    private String tmp;
    private String[] array;

    private ImageIcon img = new ImageIcon("Images/tree.jpg");
    private ImageIcon image = new ImageIcon("Images/circles.jpg");

    private JButton button1 = new JButton("Сгенерировать");
    private JButton button2 = new JButton("Ввести вручную");
    private JButton nexter = new JButton(">>");
    private JButton next = new JButton(">>");
    private JButton pause = new JButton("Пауза");

    private JLabel label = new JLabel("Как задать массив?");
    private JLabel tree = new JLabel(img);
    private JLabel circle = new JLabel(image);

    private JTextField text = new JTextField("Введите массив");
    private JTextField speed = new JTextField("Введите скорость визуализации");

    /** Конструктор класса */
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
        button1.setLocation(70 * scale,70 * scale);
        /** button1.addActionListener(new Action2()); */

        button2.setSize(100 * scale, 20 * scale);
        button2.setLocation(210 * scale,70 * scale);
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

    /** Поведения кнопки генерации массива */
    class Action implements ActionListener
    {
        public void actionPerformed(ActionEvent e)
        {
            label.setVisible(true);
            button1.setVisible(true);
            button2.setVisible(true);

            speed.setVisible(false);
            next.setVisible(false);

            label.setText("Выберите тип визуализации");

            button1.setText("Куча");
            button1.addActionListener(new Action3());

            button2.setText("Размер");
            button2.addActionListener(new Action4());

            tree.setSize(150 * scale, 110 * scale);
            tree.setLocation(45 * scale, 95 * scale);

            circle.setSize(150 * scale, 110 * scale);
            circle.setLocation(185 * scale, 95 * scale);
        }
    }

    /** Поведение кнопки ручного ввода массива */
    class Action1 implements ActionListener
    {
        public void  actionPerformed(ActionEvent e)
        {
            text.setSize(120 * scale, 25 * scale);
            text.setLocation(210 * scale,150 * scale);

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
            tmp = text.getText();

            array = tmp.split(" ");

            label.setVisible(false);
            button1.setVisible(false);
            button2.setVisible(false);
            text.setVisible(false);
            nexter.setVisible(false);

            speed.setSize(120 * scale, 25 * scale);
            speed.setLocation(120 * scale,70 * scale);

            next.setSize(30 * scale, 15 * scale);
            next.setLocation(165 * scale, 100 * scale);
            next.addActionListener(new Action());

            add(speed);
            add(next);
        }
    }

    class Action3 implements ActionListener
    {
        public void actionPerformed(ActionEvent e)
        {

        }
    }

    class Action4 implements ActionListener
    {
        public void actionPerformed(ActionEvent e)
        {

        }
    }
}
