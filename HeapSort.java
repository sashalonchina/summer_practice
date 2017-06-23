package sample.summer_practice;

/**
 * Класс для сортировки массива целых чисел с помощью кучи.
 * Для сортировки вызывается статический метод sort(int[] a)
 */
class HeapSort
{
    /** Размер кучи. Изначально равен размеру сортируемого массива */
    private static int heapSize;

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
    public static void sort(String[] a, String type)
    {
        buildHeap(a, type);

        while (heapSize > 1)
        {
            swap(a, 0, heapSize - 1);

            heapSize--;

            heapify(a, 0, type);
        }
    }

    /**
     * Построение кучи. Поскольку элементы с номерами начиная с a.length / 2 + 1 -
     * это листья, то нужно переупорядочить поддеревья с корнями в индексах
     * от 0 до a.length / 2 (метод heapify вызывать в порядке убывания индексов)
     *
     *  a - массив, из которого формируется куча
     */
    private static void buildHeap(String[] a, String type)
    {
        heapSize = a.length;

        for (int i = a.length / 2; i >= 0; i--) heapify(a, i, type);
    }

    /**
     * Переупорядочивает поддерево кучи начиная с узла i так, чтобы выполнялось
     * основное свойство кучи - a[parent] >= a[child] or a[parent] <= a[child].
     *
     * a - массив, из которого сформирована куча
     * i - корень поддерева, для которого происходит переупорядосивание
     */
    private static void heapify(String[] a, int i, String type)
    {
        int l = left(i);
        int r = right(i);
        int largest = i;

        if (type == "up")
        {
            if (l < heapSize && (a[i]).compareTo(a[l]) < 0) largest = l;

            if (r < heapSize && (a[largest]).compareTo(a[r]) < 0) largest = r;
        }

        else if (type == "down")
        {
            if (l < heapSize && (a[i]).compareTo(a[l]) > 0) largest = l;

            if (r < heapSize && (a[largest]).compareTo(a[r]) > 0) largest = r;
        }

        if (i != largest)
        {
            swap(a, i, largest);

            heapify(a, largest, type);
        }
    }

    /**
     * Возвращает индекс правого потомка текущего узла
     *
     * i - индекс текущего узла кучи
     * return - индекс правого потомка
     */
    private static int right(int i) {
        return 2 * i + 1;
    }

    /**
     * Возвращает индекс левого потомка текущего узла
     *
     * i - индекс текущего узла кучи
     * return - индекс левого потомка
     */
    private static int left(int i) {
        return 2 * i + 2;
    }

    /**
     * Меняет местами два элемента в массиве
     *
     * a - массив
     * i - индекс первого элемента
     * j - индекс второго элемента
     */
    private static void swap(String[] a, int i, int j)
    {
        String temp = a[i];

        a[i] = a[j];
        a[j] = temp;
    }

}
