
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        String text = " ";
        int idade = 0;
        int area = 0;


        String planeta = "Plutão";
        System.out.println(planeta);

        Scanner entradaDados = new Scanner(System.in);
        System.out.println("Digite seu nome: ");
        text = entradaDados.next();
        System.out.println(" Olá " + text );

        System.out.println("Digite sua idade: ");
        idade = entradaDados.nextInt();

        System.out.println(" Olá " + text + " sua idade " + idade );



        System.out.println("Digite a base: ");
        int base = entradaDados.nextInt();
        System.out.println("Digite a altura: ");
        int altura = entradaDados.nextInt();
        System.out.println(" O resultado é " + base*altura );

        System.out.println("Digite a lado: ");
        int lado = entradaDados.nextInt();

        System.out.println("o valor é: " + lado*lado);

        System.out.println("digite o diagonal maior: ");
        int diagonal = entradaDados.nextInt();
        System.out.println("digite o valor da diagonal menor: ");
        int diagonalMenor = entradaDados.nextInt();
        System.out.println("digite o valor da altura: ");
        int altura2 = entradaDados.nextInt();
        System.out.println("o valor é: " + (diagonal+diagonalMenor)*altura2/2);

        System.out.println("Digite a base2: ");
        int base2 = entradaDados.nextInt();
        System.out.println("Digite a altura: ");
        int altura3 = entradaDados.nextInt();
        System.out.println(" O resultado é " + base2*altura3 );

        System.out.println("Digite a base3: ");
        int base3 = entradaDados.nextInt();
        System.out.println("Digite a altura: ");
        int altura4 = entradaDados.nextInt();
        System.out.println(" O resultado é " + base3*altura4/2 );

        System.out.println("Digite o raio da área : ");
        int raio = entradaDados.nextInt();
        System.out.println("o valor da círculo é " + raio * raio * 3.14f);

        System.out.println("digite um numero");
        int nume1 = entradaDados.nextInt();
        if (nume1 < 0 ){
            System.out.println("o numero digitado é negativo");
        }

        if (nume1 > 0){
            System.out.println("o numero digitado é positivo");
        }else{
            System.out.println("o numero digitado é neutro");
        }
        System.out.print("Digite o primeiro valor: ");
        int valor1 = entradaDados.nextInt();

        System.out.print("Digite o segundo valor: ");
        int valor2 = entradaDados.nextInt();

        System.out.print("Digite o terceiro valor: ");
        int valor3 = entradaDados.nextInt();

        // Encontrando o maior valor
        int maior = valor1;

        if (valor2 > maior) {
            maior = valor2;
        }

        if (valor3 > maior) {
            maior = valor3;
        }

        // Imprimindo o maior valor
        System.out.println("O maior valor é: " + maior);

        System.out.print("Digite o primeiro valor: ");
        int valorr1 = entradaDados.nextInt();

        System.out.print("Digite o segundo valor: ");
        int valorr2 = entradaDados.nextInt();

        System.out.print("Digite o terceiro valor: ");
        int valorr3 = entradaDados.nextInt();

        System.out.print("Digite o quarto valor: ");
        int valorr4 = entradaDados.nextInt();

        // Encontrando o maior valor
        int maiorr = valor1;

        if (valor2 > maiorr) {
            maiorr = valor2;
        }

        if (valorr3 > maiorr) {
            maior = valor3;
        }

        if (valorr4 > maior) {
            maior = valorr4;
        }

        // Imprimindo o maior valor
        System.out.println("O maior valor é: " + maior);

        System.out.print("Digite o primeiro valor: ");
        int valorrr1 = entradaDados.nextInt();

        System.out.print("Digite o segundo valor: ");
        int valorrr2 = entradaDados.nextInt();

        System.out.print("Digite o terceiro valor: ");
        int valorrr3 = entradaDados.nextInt();

        // Encontrando a soma dos dois maiores valores
        int maiorrr, segundoMaior;

        // Determinando o maior e o segundo maior
        if (valor1 > valor2 && valor1 > valor3) {
            maiorrr = valor1;
            segundoMaior = Math.max(valor2, valor3);
        } else if (valor2 > valor1 && valor2 > valor3) {
            maiorrr = valor2;
            segundoMaior = Math.max(valor1, valor3);
        } else {
            maior = valor3;
            segundoMaior = Math.max(valor1, valor2);
        }

        // Somando os dois maiores
        int soma = maior + segundoMaior;

        // Imprimindo a soma
        System.out.println("A soma dos dois maiores valores é: " + soma);













    }
}