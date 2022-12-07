import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        int size = 4;

        System.out.println("Создаем матрицу: ");
        Matrix myMatrix = new Matrix(size);
        myMatrix.show();

        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите градус поворота, кратный 90: ");
        int deg = scanner.nextInt();
        if (deg % 90 == 0) {
            System.out.println("Поворачиваем матрицу: ");
            myMatrix.rotate(deg).show();
        } else {
            System.out.println("Вы ввели неверный градус поворота. В следующий раз будьте внимательнее.");
        }
    }
}