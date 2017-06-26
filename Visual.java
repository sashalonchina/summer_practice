package sample.summer_practice;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

/** Класс графического интерфейса */
public class Visual extends JFrame
{
    /** Задать длину h и ширину w окна, две кнопки button1, button2 и текст label */
    private static int scale = 2;
    private int w = 360 * scale, h = 270 * scale;

    private JButton button1 = new JButton("Пауза");

    private JLabel label = new JLabel("Здесь должна быть визуализация");

    private Image img;

    /** Конструктор класса */
    public Visual()
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
        button1.setSize(70 * scale, 30 * scale);
        button1.setLocation(145 * scale,220 * scale);

        /** Размеры и положение текста */
        label.setSize(300 * scale, 180 * scale);
        label.setLocation(30 * scale, 20 * scale);

        /** Добавление элементов в окно */
        container.add(label);
        container.add(button1);
    }
}