class MeuSegundoProgramaJava
{
	public static void main (String parametro[])
	{
		int n1, n2, soma;
		
		n1 = Integer.parseInt(parametro[0]);
		n2 = Integer.parseInt(parametro[1]);
		
		soma = n1 + n2;

		System.out.println(n1 + " + " + n2 + " = " + soma);
		System.exit(0);
	}
}