import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("entrer a");
        int a = scanner.nextInt();
        System.out.println("entrer b");
        int b = scanner.nextInt();
        System.out.println("entrer l'operateur - , + ou x");
        char operator = scanner.next().charAt(0);
        switch (operator) {
            case '+':
                Context context = new Context(new OperationAdd());
                System.out.println(a + " + " + b + " = " + context.executeStrategy(a, b));
                break;
            case '-':
                Context context2 = new Context(new OperationSubstract());
                System.out.println(a + " - " + b + " = " + context2.executeStrategy(a, b));
                break;

            case 'x':
                Context context3 = new Context(new OperationMultiply());
                System.out.println(a + " x " + b + " = " + context3.executeStrategy(a, b));
                break;

            default:
                System.out.println("erreur vous devez entrer l'un des 3 operateurs suivants(pas plus) : - , + ou x");
        }
    }
}
