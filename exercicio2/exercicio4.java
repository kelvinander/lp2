public class Aluno{
	int  idade;
	String nome, matricula;
	

	public void imprimirDadosCadastrais(){
		System.out.println("Nome: " + this.nome);
		System.out.println("Idade: " + this.idade);
		System.out.println("Matricula: " + this.matricula);
  }
		
		

	public static void main (String [] args){
		Aluno novo1 = new Aluno();
		novo1.nome= "Kelvin Anderson";
		novo1.idade= 17;
		novo1.matricula="201318110157";

		Aluno novo2 = new Aluno();
		novo2.nome= "Leonardo Marcelino";
		novo2.idade= 16;
		novo2.matricula="201318110158";

		Aluno novo3 = new Aluno();
		novo3.nome= "Bruno Augusto";
		novo3.idade= 18;
		novo3.matricula="201318110159";
		
		Aluno novo4 = new Aluno();
		novo4.nome= "Bruna Santana";
		novo4.idade= 16;
		novo4.matricula="201318110159";

		novo1.imprimirDadosCadastrais();
		novo2.imprimirDadosCadastrais();
		novo3.imprimirDadosCadastrais();
		novo4.imprimirDadosCadastrais();


  }

}
