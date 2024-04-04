public class Task_5 {

    public void Solution()
    {
        int number = 412;

        int digit1 = number % 10;
        int digit2 = (number / 10) % 10;
        int digit3 = number / 100;

        int reversedNumber = digit1 * 100 + digit2 * 10 + digit3;

        System.out.println("Реверснуте число: " + reversedNumber);

        System.out.println("-------------------------------------------------------");
    }
}