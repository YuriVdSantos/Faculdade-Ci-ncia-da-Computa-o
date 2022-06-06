import javax.swing.*;

class ProgDecisao {
  public static void main(String entrata[]) {
    int num;
    char op = 0;
    String msg = "", msgEntr = "Digite 1 para impar/par ou 2 para positivo/negativo: ";

    num = Integer.parseInt(JOptionPane.showInputDialog("Digite um número inteiro: "));

    op = (JOptionPane.showInputDialog(msgEntr)).charAt(0);

    switch (op) {
      case '1': {
        if (num % 2 == 0) {
          msg = msg + num + "\nO número é par\n";
        } else {
          msg = msg + num + "\nO número é impar\n";
        }
        break;
      }
      case '2': {
        if (num > 0) {
          msg = msg + num + "\nO número é positivo\n";
        } else {
          msg = msg + num + "\nO número é negativo\n";
        }
        break;
      }
      default:
        JOptionPane.showMessageDialog(null, "Opção Inválida. Calculos não realizados.");
    }
    if (op == '1' || op == '2') {
      JOptionPane.showMessageDialog(null, msg);
    }
    System.exit(0);

  }
}
