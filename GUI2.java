package sample.summer_practice;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

/** Класс графического интерфейса */
public class GUI2 extends JFrame
{
    /** Задать длину h и ширину w окна, две кнопки button1, button2 и текст label */
    private static int scale = 2;
    private int w = 360 * scale, h = 270 * scale;

    private JButton button1 = new JButton("Визуализация");
    private JButton button2 = new JButton("Начало");
    private JButton button3 = new JButton("Выход");

    private Image img;

    /** Конструктор класса */
    public GUI2()
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
        button1.setSize(70 * scale, 40 * scale);
        button1.setLocation(100 * scale,80 * scale);

        button2.setSize(70 * scale, 40 * scale);
        button2.setLocation(190 * scale,80 * scale);

        button3.setSize(70 * scale, 30 * scale);
        button3.setLocation(145 * scale,140 * scale);

        /** Добавление элементов в окно */
        container.add(button1);
        container.add(button2);
        container.add(button3);
    }
}
