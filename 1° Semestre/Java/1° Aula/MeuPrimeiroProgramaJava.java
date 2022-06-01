//salvar como MeuPrimeiroProgramaJava.java

//nome da classe
class MeuPrimeiroProgramaJava
{
	//módulo principal como a entrada pela linha de comando
	public static void main (String entrada[])
	{
		//declaração de variáveis
		int inteiro = 22;
		char caracter = 'F';
		double real = 1.65;
		String frase = "Yuri Vieira";
		boolean VF = true;

		if (VF == true)
		{
			System.out.println("Eu sou o " + frase + " e tenho " + inteiro + " anos com " + real + "m de altura");
		}
		System.exit(0);
	}
}