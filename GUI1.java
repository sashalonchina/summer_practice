package sample.summer_practice;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

/** Класс графического интерфейса */
public class GUI1 extends JFrame
{
    /** Задать длину h и ширину w окна, две кнопки button1, button2 и текст label */
    private static int scale = 2;
    private int w = 360 * scale, h = 270 * scale;

    private JButton button1 = new JButton("Куча");
    private JButton button2 = new JButton("Размер");
    private JButton button3 = new JButton("Цвет");

    private JLabel label = new JLabel("Выбор визуализации");

    private Image img;

    /** Конструктор класса */
    public GUI1()
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
        button1.setSize(60 * scale, 15 * scale);
        button1.setLocation(40 * scale,100 * scale);

        button2.setSize(60 * scale, 15 * scale);
        button2.setLocation(150 * scale,100 * scale);

        button3.setSize(60 * scale, 15 * scale);
        button3.setLocation(260 * scale,100 * scale);

        /** Размеры и положение текста */
        label.setSize(180 * scale, 30 * scale);
        label.setLocation(90 * scale, 30 * scale);

        /** Добавление элементов в окно */
        container.add(label);
        container.add(button1);
        container.add(button2);
        container.add(button3);
    }
}