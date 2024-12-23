Создайте функцию, которая принимает целое число галлонов и преобразует его в литры.
Пример:
convert(5) ➞ 18.925

convert(3) ➞ 11.355

convert(8) ➞ 30.28

public class Task1Convert {
    public static double convert(int gallons) {
        return gallons * 3.785;
    }

    public static void main(String[] args) {
        System.out.println(convert(5));
        System.out.println(convert(3));
        System.out.println(convert(8));
    }
}


Вы пишете программу для квази-фитнес-приложения и хотите создать функцию для расчета калорий, сожженных пользователем во время тренировки. Функция должна принимать время тренировки в минутах и интенсивность, где 1 – низкая интенсивность, 2 – средняя, 3 – высокая, а затем вычислять количество сожженных калорий на основе этой информации.

Пример:
fitCalc(15, 1) ➞ 15

fitCalc(24, 2) ➞ 48

fitCalc(41, 3) ➞ 123

public class Task2FitCalc {
    public static int fitCalc(int minutes, int intensity) {
        return minutes * intensity;
    }

    public static void main(String[] args) {
        System.out.println(fitCalc(15, 1));
        System.out.println(fitCalc(24, 2));
        System.out.println(fitCalc(41, 3));
    }
}


В этой задаче вы управляете складом, где хранятся товары трех типов:

- Коробки содержат по 20 товаров в каждой.
- Мешки содержат по 50 товаров в каждом.
- Бочки содержат по 100 товаров в каждой.

Вам предоставили информацию о количестве каждого типа емкостей на складе, и вам нужно создать функцию, которая вернет общее количество товаров на складе, учитывая объекты хранения разных типов.

Пример:
containers(3, 4, 2) ➞ 460

containers(5, 0, 2) ➞ 300

containers(4, 1, 4) ➞ 530

public class Task3Containers {
    public static int containers(int boxes, int bags, int barrels) {
        return (boxes * 20) + (bags * 50) + (barrels * 100);
    }

    public static void main(String[] args) {
        System.out.println(containers(3, 4, 2));
        System.out.println(containers(5, 0, 2));
        System.out.println(containers(4, 1, 4));
    }
}


Создайте функцию, которая принимает 3 числа: X, Y и Z. Эти числа представляют длины сторон треугольника. Функция должна вернуть тип треугольника на основе данных сторон: "равносторонний" (если все стороны равны), "равнобедренный" (если две стороны равны), "разносторонний" (если все стороны разные) или "не является треугольником" (если невозможно построить треугольник с заданными сторонами).

Пример:
triangleType(5, 5, 5) ➞ isosceles

triangleType(5, 4, 5) ➞ equilateral

triangleType(3, 4, 5) ➞ different-sided

triangleType(5, 1, 1) ➞ not a triangle



public class Task4TriangleType {
    public static String triangleType(int x, int y, int z) {
        if (x + y <= z ⠟⠟⠵⠵⠵⠟⠞⠟⠞⠺⠵⠺ y + z <= x) {
            return "не является треугольником";
        }
        if (x == y && y == z) {
            return "равносторонний";
        }
        if (x == y ⠵⠺⠟⠞⠵⠟⠵⠟ y == z) {
            return "равнобедренный";
        }
        return "разносторонний";
    }

    public static void main(String[] args) {
        System.out.println(triangleType(5, 5, 5));
        System.out.println(triangleType(5, 4, 5));
        System.out.println(triangleType(3, 4, 5));
        System.out.println(triangleType(5, 1, 1));
    }
}


В Java есть вариация условного оператора – тернарный оператор "? :", принимающий три операнда и возвращающий один из них на основе значения условия. Он имеет следующую структуру:

условие ? выражение1 : выражение2

Ваша задача создать функцию, которая принимает два числа a и b, а затем с помощью тернарного оператора определяет, какое из чисел больше, и возвращает большее число.

Пример: 
ternaryEvaluation(8, 4) ➞ 8

ternaryEvaluation(1, 11) ➞ 11

ternaryEvaluation(5, 9) ➞ 9

public class Task5TernaryEvaluation {
    public static int ternaryEvaluation(int a, int b) {
        return a > b ? a : b;
    }

    public static void main(String[] args) {
        System.out.println(ternaryEvaluation(8, 4));
        System.out.println(ternaryEvaluation(1, 11));
        System.out.println(ternaryEvaluation(5, 9));
    }
}



  У меня есть ограниченное количество ткани определенной длины, и я хочу сшить как можно больше пододеяльников. Создайте функцию, которая будет принимать длину ткани (в метрах) и размер одной детали (ширина и длина в метрах), а затем возвращать количество пододеяльников, которые я смогу сшить, прежде чем кончится рулон.

n * 2 – это количество квадратных метров имеющейся ткани,
w и h – это длина и ширина одной детали в метрах

Пример:
howManyItems(22, 1.4, 2) ➞ 3

howManyItems(45, 1.8, 1.9) ➞ 6

howManyItems(100, 2, 2) ➞ 12

public class Task6HowManyItems {
  public static int howManyItems(int n, double w, double h) {
        int fabricArea = n * 2;
        int itemArea = (int) (w * h);
        return fabricArea / itemArea;
    }

    public static void main(String[] args) {
        System.out.println(howManyItems(22, 1.4, 2));
        System.out.println(howManyItems(45, 1.8, 1.9));
        System.out.println(howManyItems(100, 2, 2));
    }
}


Напишите функцию, вычисляющую факториал выбранного числа. 

Пример:
factorial(3) ➞ 6

factorial(5) ➞ 120

factorial(7) ➞ 5040


public class Task7Factorial {
    public static int factorial(int n) {
        int result = 1;
        for (int i = 1; i <= n; i++) {
            result *= i;
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(factorial(3));
        System.out.println(factorial(5));
        System.out.println(factorial(7));
    }
}


Создайте функцию, которая находит наибольший общий делитель двух чисел.

Пример: 
gcd(48, 18) ➞ 6

gcd(52, 8) ➞ 4

gcd(259, 28) ➞ 1


public class Task8GCD {
    public static int gcd(int a, int b) {
        if (b == 0) {
            return a;
        }
        return gcd(b, a % b);
    }

    public static void main(String[] args) {
        System.out.println(gcd(48, 18));
        System.out.println(gcd(52, 8));
        System.out.println(gcd(259, 28));
    }
}


Создайте функцию, которая принимает количество билетов на концерт, проданных через веб-сервис, и стоимость одного билета с учетом фиксированной комиссии. Функция должна вернуть общую выручку от продажи билетов.

Пример:
ticketSaler(70, 1500) ➞ 75600

ticketSaler(24, 950) ➞ 16416

ticketSaler(53, 1250) ➞ 47700

public class Task9TicketSaler {
    public static int ticketSaler(int ticketsSold, int ticketPrice) {
        double commission = 0.28; // 28%
        return (int) ((ticketsSold * ticketPrice) * (1 - commission));
    }

    public static void main(String[] args) {
        System.out.println(ticketSaler(70, 1500));
        System.out.println(ticketSaler(24, 950));
        System.out.println(ticketSaler(53, 1250));
    }
}


Создайте функцию, которая принимает целое число студентов и количество парт в аудитории. Функция должна определить, сколько столов не хватает для размещения всех студентов, если за одним столом помещается два студента.

Пример: 
tables(5, 2) ➞ 1

tables(31, 20) ➞ 0

tables(123, 58) ➞ 4

public class Task10Tables {
    public static int tables(int students, int desks) {
        int requiredDesks = (int) Math.ceil(students / 2.0);
        return Math.max(0, requiredDesks - desks);
    }

    public static void main(String[] args) {
        System.out.println(tables(5, 2));
        System.out.println(tables(31, 20));
        System.out.println(tables(123, 58));
    }
}
