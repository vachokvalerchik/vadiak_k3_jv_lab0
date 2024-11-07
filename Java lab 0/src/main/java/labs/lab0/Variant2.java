package labs.lab0;

public class Variant2 {
    public int inputOutputTask(int a) {
        return (a * a * a);
    }

    // Новий метод integerNumbersTask для обчислення кількості повних тонн у заданій масі
    public int integerNumbersTask(int M) {
        return M / 1000;
    }

    // Оновлений метод booleanTask для перевірки непарності числа
    public boolean booleanTask(int A) {
        return A % 2 != 0;
    }

    // Оновлений метод ifTask для додавання 1 до позитивного числа або віднімання 2 від негативного
    public int ifTask(int number) {
        if (number > 0) {
            return number + 1;
        } else {
            return number - 2;
        }
    }

    // Оновлений метод switchTask для повернення оцінки на основі числа
    public String switchTask(int K) {
        return switch (K) {
            case 1 -> "погано";
            case 2 -> "незадовільно";
            case 3 -> "задовільно";
            case 4 -> "добре";
            case 5 -> "відмінно";
            default -> "помилка";
        };
    }

    // Оновлений метод forTask для виведення всіх чисел між A та B і підрахунку їх кількості
    public int forTask(int A, int B) {
        int count = 0;
        for (int i = A; i <= B; i++) {
            System.out.println(i);
            count++;
        }
        return count;
    }

    // Оновлений метод whileTask для підрахунку скільки разів B вміщується в A
    public int whileTask(int A, int B) {
        int count = 0;
        while (A >= B) {
            A -= B;
            count++;
        }
        return count;
    }

    // Оновлений метод arrayTask для обчислення степенів двійки
    public int[] arrayTask(int N) {
        int[] powersOfTwo = new int[N];
        int power = 1;
        for (int i = 0; i < N; i++) {
            powersOfTwo[i] = power;
            power *= 2; // Переходимо до наступного степеня двійки
        }
        return powersOfTwo;
    }

    // Оновлений метод twoDimensionArrayTask для заповнення матриці значеннями
    public int[][] twoDimensionArrayTask(int M, int N) {
        int[][] matrix = new int[M][N];
        for (int j = 0; j < N; j++) {
            int value = 5 * (j + 1); // Значення для J-го стовпця
            for (int i = 0; i < M; i++) {
                matrix[i][j] = value;
            }
        }
        return matrix;
    }

    public static void main(String... strings) {
        System.out.println("Start of zero lab");
        System.out.println("Done!!!");
    }
}
