package sample.summer_practice;

import java.lang.reflect.Array;
import java.util.ArrayList;

/**
 * Класс для сортировки массива целых чисел с помощью кучи.
 * Для сортировки вызывается статический метод sort(int[] a)
 */
class HeapSort
{
    /** Размер кучи. Изначально равен размеру сортируемого массива */
    public int heapSize;
    public int[] stp;
    private static boolean init = false;

    public HeapSort(int[] arr)
    {
        stp = arr.clone();

        if (!init) buildHeap(stp);
    }

    public HeapSort(HeapSort old) {
        stp = old.stp.clone();
        heapSize = old.heapSize;
    }

    /**
     * Сортировка с помощью кучи
     * Сначала формируется куча HeapSort.buildHeap(T[])
     * Теперь максимальный элемент массива находится в корне кучи. Его нужно
     * поменять местами с последним элементом и убрать из кучи (уменьшить
     * размер кучи на 1). Теперь в корне кучи находится элемент, который раньше
     * был последним в массиве. Нужно переупорядочить кучу так, чтобы
     * выполнялось основное условие кучи - a[parent] >= a[child]: heapify(int[], int, type)
     * После этого в корне окажется максимальный из оставшихся элементов.
     * Повторить до тех пор, пока в куче не останется 1 элемент
     *
     * a - сортируемый массив
     */
<<<<<<< HEAD
    public void sort()
    {
        swap(stp, 0, heapSize - 1);
=======
    public static void sort(int[] a)
    {
        buildHeap(a);

        while (heapSize > 1)
        {
            swap(a, 0, heapSize - 1);
>>>>>>> origin/master

        heapSize--;

<<<<<<< HEAD
        heapify(stp, 0);
=======
            heapify(a, 0);
        }
>>>>>>> origin/master
    }

    /**
     * Построение кучи. Поскольку элементы с номерами начиная с a.length / 2 + 1 -
     * это листья, то нужно переупорядочить поддеревья с корнями в индексах
     * от 0 до a.length / 2 (метод heapify вызывать в порядке убывания индексов)
     *
     *  a - массив, из которого формируется куча
     */
<<<<<<< HEAD
    private void buildHeap(int[] a)
    {
        heapSize = a.length;

        init = true;

=======
    private static void buildHeap(int[] a)
    {
        heapSize = a.length;

>>>>>>> origin/master
        for (int i = a.length / 2; i >= 0; i--) heapify(a, i);
    }

    /**
     * Переупорядочивает поддерево кучи начиная с узла i так, чтобы выполнялось
     * основное свойство кучи - a[parent] >= a[child] or a[parent] <= a[child].
     *
     * a - массив, из которого сформирована куча
     * i - корень поддерева, для которого происходит переупорядосивание
     */
<<<<<<< HEAD
    private void heapify(int[] a, int i)
=======
    private static void heapify(int[] a, int i)
>>>>>>> origin/master
    {
        int l = left(i), r = right(i), largest = i;

        if ((l < heapSize) && (a[i] < a[l])) largest = l;
        if ((r < heapSize) && (a[largest] < a[r])) largest = r;

        if (i != largest)
        {
            swap(a, i, largest);

            heapify(a, largest);
        }
    }

    /**
     * Возвращает индекс правого потомка текущего узла
     *
     * i - индекс текущего узла кучи
     * return - индекс правого потомка
     */
    private int right(int i) {
        return 2 * i + 1;
    }

    /**
     * Возвращает индекс левого потомка текущего узла
     *
     * i - индекс текущего узла кучи
     * return - индекс левого потомка
     */
    private int left(int i) {
        return 2 * i + 2;
    }

    /**
     * Меняет местами два элемента в массиве
     *
     * a - массив
     * i - индекс первого элемента
     * j - индекс второго элемента
     */
<<<<<<< HEAD
    private void swap(int[] a, int i, int j)
=======
    private static void swap(int[] a, int i, int j)
>>>>>>> origin/master
    {
        int temp = a[i];

        a[i] = a[j];
        a[j] = temp;
    }

}
