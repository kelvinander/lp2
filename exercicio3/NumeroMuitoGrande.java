import java.util.Scanner;

public class NumeroMuitoGrande {

    int op = 0, op1 = 0;
    int num1[] = new int[30];
    int num2[] = new int[30];
    int soma[] = new int[30];
    int mult[] = new int[30];

    public void somar() {
        int cont = 0;
        for (int i = 29; i >= 0; i--) {
            if (i == 0) {
                if ((soma[i] + num1[i] + num2[i]) > 10) {
                    System.out.println("Os numeros adentrados sao maiores dos que os suportados para a soma!");
                    op = 1;
                    break; 
                }
            }
            if (soma[i]+num1[i] + num2[i] >= 10) {
                soma[i] = (soma[i] + num1[i] + num2[i]) - 10;
                cont = 1;
            } else {
                soma[i] = soma[i] + num1[i] + num2[i];
            }
            if (cont == 1) {
                cont = 0;
                soma[i - 1] = 1;
            }
        }
    }

    

    public void EscreverSoma() {
        int cont = 0;
        System.out.println("A soma eh igual a: ");
        for (int i = 0; i <= 29; i++) {
            if (soma[i] == 0 && cont == 0) {
                if (soma[i + 1] != 0) {
                    cont = 1;
                }
            } else {
                System.out.println(soma[i]);
            }
        }
    }

    public static void main(String[] args) {
        int contarNum1, contarNum2;
        Scanner input = new Scanner(System.in);
        NumeroMuitoGrande NM = new NumeroMuitoGrande();
        String nume1, nume2;
        for (int k=0;k<=29;k++){
            NM.soma[k]=0;
        }
        System.out.println("Entre com o 1o numero muito grande: ");
        nume1 = input.next();
        System.out.println("Entre com o 2o numero muito grande: ");
        nume2 = input.next();
        contarNum1 = nume1.length();
        contarNum2 = nume2.length();
        int i, j;
        for (i = contarNum1, j = 0; i >0; i--, j++) {
            char caracter = nume1.charAt(j);
            NM.num1[30 -i] = Character.getNumericValue(caracter);
        }
        for (i = contarNum2, j = 0; i > 0; i--, j++) {
            char caracter2 = nume2.charAt(j);
            NM.num2[30 -i] = Character.getNumericValue(caracter2);
        }
        NM.somar();
        NM.multiplicar(contarNum2,contarNum1);
        if (NM.op != 1) {
            NM.EscreverSoma();
        }
    }
}
