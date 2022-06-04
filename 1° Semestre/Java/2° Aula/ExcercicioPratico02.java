class ExcercicioPratico02 {
  public static void main(String entrada[]) {
    int n1, n2, div;
    double pot;
    String msg = "";

    n1 = Integer.parseInt(entrada[0]);
    n2 = Integer.parseInt(entrada[1]);

    div = (int) n1 / (int) n2;
    pot = Math.pow(n1, n2);
    msg = "Os valores fornecidos são: " + n1 + " e " + n2 + "\n";
    msg = msg + "O resultado da divisao e: " + div + "\nO resultado da potencia e: " + pot;
    System.out.println(msg);
    System.exit(0);
  }
}