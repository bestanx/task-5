import java.util.Scanner;

class Figure {

    public static void printFigure(int h) {
        if (h < 5 || h % 2 == 0) {
            System.out.println("Ошибка: h должно быть нечётным и >= 5");
            return;
        }

        int mid = (h + 1) / 2;

        for (int i = 1; i <= h; i++) {
            for (int j = 1; j <= h; j++) {

                char c = ' ';

                if (i == 1 || i == h) {
                    if (j == 1 || j == h) c = '*';

                } else if (i == mid) {
                    if (j == 1 || j == h)      c = '|';
                    else if (j == mid)          c = '*';

                } else if (i < mid) {
                    if (j == 1 || j == h)       c = '|';
                    else if (j == i)            c = '\\';
                    else if (j == h - i + 1)    c = '/';

                } else {
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
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите высоту фигуры: ");
        int x = scanner.nextInt();
        printFigure(x);
        scanner.close();
    }
}
