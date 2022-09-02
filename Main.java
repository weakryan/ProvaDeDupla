import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {
    
    Scanner batata = new Scanner(System.in);

    System.out.println("1- Somar. ");
    System.out.println("2- Subtrair. ");
    System.out.println("3- Multiplicar. ");
    System.out.println("4- Divisão. ");
    System.out.println("5- Módulo da divisão. ");
    System.out.println("Digite qual operação deseja realizar: ");
    int op = batata.nextInt();



    Object calculadora;
    switch (op) {

        case 1:
        System.out.println("Digite o primeiro valor: ");
        double val1 = batata.nextDouble();
        System.out.println("Digite o segundo valor: ");
        double val2 = batata .nextDouble();
        double resultadoS = Calculadora.Somar(val1, val2);
        System.out.println(resultadoS);
                       
            break;


        case 2:
            System.out.println("Digite o primeiro valor: ");
            double val3 = batata.nextDouble();
            System.out.println("Digite o segundo valor: ");
            double val4 = batata .nextDouble();
            double restadoSS = Calculadora.Subtrair(val3, val4);
            System.out.println(restadoSS);
                break;


        case 3:
        System.out.println("Digite o primeiro valor: ");
        double val5 = batata.nextDouble();
        System.out.println("Digite o segundo valor: 1");
        double val6 = batata .nextDouble();
            double resultadoM = Calculadora.Multiplicar(val5, val6);
            System.out.println(resultadoM);
                break;


        case 4:
        System.out.println("Digite o primeiro valor: ");
        double val7 = batata.nextDouble();
        System.out.println("Digite o segundo valor: ");
        double val8 = batata .nextDouble();
        if (val7 == 0) {
            System.out.println("0 não é divisor.");
        } if ( val8 == 0) {
            System.out.println("0 não é divisor");
        }
            double resultadoD = Calculadora.Divisão(val7, val8);
            System.out.println(resultadoD);
               break;


        case 5:
        System.out.println("Digite o primeiro valor: ");
        int val9 = batata.nextInt();
        System.out.println("Digite o segundo valor: ");
        int val10 = batata.nextInt();
        if (val9 == 0) {
            System.out.println("0 não é divisor.");
        } if ( val10 == 0) {
            System.out.println("0 não é divisor");
        }
        double resultadoMM = Calculadora.Módulo(val9, val10);
        System.out.println(resultadoMM);
        break;




        default:
            break;
    }
}
}