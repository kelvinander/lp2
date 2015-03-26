public class Calculadora{
	int a,b;
		
	

	public void	soma(){
		System.out.println("A soma dos dois numeros é: " + (this.a+this.b) );
	}
	public void subtracao(){
		System.out.println("A subtraçao dos dois numeros é : " +  (this.a-this.b));

}
	public void multiplicacao(){
		System.out.println("A multiplicaçao dos dois numeros é: " + (this.a*this.b));

}

	public void divisao(){
		System.out.println("A divisao dos dois numeros é: " +  (this.a/this.b));

}
	public static void main(String [] args){
		Calculadora numeros1= new Calculadora();
		Calculadora numeros2= new Calculadora();
		Calculadora numeros3= new Calculadora();
		

		numeros1.a=5;
		numeros1.b=6;
		numeros2.a=8;
		numeros2.b=9;
		numeros3.a=100;
		numeros3.b=10;	

		numeros1.soma();
		numeros1.subtracao();
		numeros1.multiplicacao();
		numeros1.divisao();
		
		numeros2.soma();
		numeros2.subtracao();
		numeros2.multiplicacao();
		numeros2.divisao();
		
		numeros3.soma();
		numeros3.subtracao();
		numeros3.multiplicacao();
		numeros3.divisao();
		
		
		
	}
}
