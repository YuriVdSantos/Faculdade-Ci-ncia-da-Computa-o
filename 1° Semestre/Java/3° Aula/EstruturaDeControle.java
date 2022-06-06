import javax.swing.*;

class EstruturaDeControle {
  public static void main(String entrada[]) {
    int n1, n2;
    char op = 0;
    String msg = "", msgEntr = "Digite\n1 Para Mutiplicar \n2 Para Produtório  \n3 Para Mostrar Informações ";

    n1 = Integer.parseInt(JOptionPane.showInputDialog("Digite um número inteiro:"));
    n2 = Integer.parseInt(JOptionPane.showInputDialog("Digite um número inteiro:"));
    op = (JOptionPane.showInputDialog(msgEntr)).charAt(0);
    int p = n1 * n2;
    switch (op) {
      case '1': {
        if (n1 >= 0 && n2 >= 0) {
          msg = msg + n1 + " x " + n2 + " = " + p + "\n";
        } else {
          msg = msg + "Número inválido.\n";
        }
        break;
      }
      case '2': {
        p = p * n1;
        msg = msg + "A produtória do primeiro número é: " + p + "\n";
        break;
      }
      case '3': {
        msg = msg + "O primeiro número é: " + n1 + "\n";
        msg = msg + "O segundo número é: " + n2 + "\n";
        break;
      }
      default:
        JOptionPane.showMessageDialog(null, "Opção Inválida. Cálculos não realizados");
    }
    JOptionPane.showMessageDialog(null, msg);
    System.exit(0);
  }
}