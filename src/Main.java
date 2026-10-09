class Figure {

    // h - высота фигуры: h >= 5 и h - нечётное
    public static void printFigure(int h) {
        if (h < 5 || h % 2 == 0) {
            System.out.println("Ошибка: h должно быть нечётным и >= 5");
            return;
        }

        int mid = (h + 1) / 2; // центральная строка и центральный столбец

        for (int i = 1; i <= h; i++) {            // строки
            for (int j = 1; j <= h; j++) {        // столбцы

                char c = ' ';                     // по умолчанию пробел

                if (i == 1 || i == h) {
                    // верхняя и нижняя строки: звёздочки по краям
                    if (j == 1 || j == h) c = '*';

                } else if (i == mid) {
                    // центральная строка: |  *  |
                    if (j == 1 || j == h)      c = '|';
                    else if (j == mid)          c = '*';

                } else if (i < mid) {
                    // верхняя половина (без центральной строки)
                    if (j == 1 || j == h)       c = '|';
                    else if (j == i)            c = '\\';
                    else if (j == h - i + 1)    c = '/';

                } else {
                    // нижняя половина (без центральной строки)
                    if (j == 1 || j == h)       c = '|';
                    else if (j == h - i + 1)    c = '/';
                    else if (j == i)            c = '\\';
                }

                System.out.print(c);
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        printFigure(9);
    }
}
// доделать код 26 строка