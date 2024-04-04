public class Task_1 {
    public void Var() {
        int a = 2;
        int b = 4;
        int c = 8;
        int d = 1;
        int e = 9;
        float f = 5.7F;
        float g = 1.09F;
        float h = 2.65F;
        float i = 7.12F;
        float j = 8.34F;

        float sum = a + b + c + d + e + f + g + h + i + j;
        System.out.println("Cума змінних: " + sum);

        float dif = a - b - c - d - e - f - g - h - i - j;
        System.out.println("Різниця змінних: " + dif);

        float mtp = a * b * c * d * e * f * g * h * i * j;
        System.out.println("Добуток змінних: " + mtp);

        float div = (float) a / b / c / d / e / f / g / h / i / j;
        System.out.println("Залишок змінних: " + div);
    }
}