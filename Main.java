public class Main {
    public static void main(String[] args) {
            SecondClass secondClass = new SecondClass();

            secondClass.method3(); // Виняток буде перехоплено та опрацьовано
            try {
                secondClass.method2(); // Виняток буде сгенеровано але не опрацьовано
            } catch (CustomException e) {
                System.out.println("Перехоплено виняток: " + e.getMessage());
            }
        }
    }
