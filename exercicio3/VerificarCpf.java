import java.util.Scanner;
public class VerificarCpf {

    int cpf1[] = new int[11];
    String cpf2;
    int i, x;
    int j;
    
    
    public void lerCpf(){
        Scanner input=new Scanner (System.in);
        System.out.println("Digite 9 digitos: ");
        cpf2 = input.next();
    }
        
    public void convercao(){   
        
        int cont;
        cont = cpf2.length();
        for (i=0; i < cont; i++){
            char caractere = cpf2.charAt(i);
            cpf1[i] = Character.getNumericValue (caractere);
        }
    }
    public void pnumero(){
        for (i=8, j=2; i>=0; i--, j++){
            x= (cpf1[i] * j) + x;   
        }
        if (x%11<2){
            cpf1[9]= 0;
        }else{
            cpf1[9]=11-(x%11);
        }
     }
     
    public void snumero(){
        x=0;
        for (i=9, j=2; i>=0 ; i--, j++){
             x = (cpf1[i] * j) + x;   
        }
        if (x%11<2){
            cpf1[10]= 0;
        }else{
            cpf1[10]=11-(x%11);
    }
        System.out.println(" O num do CPF e': " );
        for ( int i = 0; i < 11; i++){
            System.out.print(cpf1[i]);
        }
        System.out.println(" ");
    }
     
    


    public static void main(String [] args) {
        VerificarCpf cpf = new VerificarCpf();
        cpf.lerCpf();
        cpf.convercao();
        cpf.pnumero();
        cpf.snumero();
        
        
        
    }
    
}


