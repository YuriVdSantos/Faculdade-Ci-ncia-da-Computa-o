import javax.swing.*;

class ProgRepeticao {
  public static void main(String entrada[]) {
    int tabuada;
    char op = 0;
    String msg = "", msgEntr = "Digite 1 para usar o For \n2 para usar o While ou \n3 para usar o Do While";

    tabuada = Integer.parseInt(JOptionPane.showInputDialog("Digite um número inteiro:"));
    op = (JOptionPane.showInputDialog(msgEntr)).charAt(0);

    switch (op) {
      case '1': {
        msg = msg + "Tabuada do " + tabuada + "feita usando For: \n";
        for (int i = 1; i <= 10; i++) {
          msg = msg + tabuada + " x " + i + " = " + tabuada * i + "\n";
        }
        break;
      }
      case '2': {
        msg = msg + "Tabuada do " + tabuada + "feita usando While: \n";
        int i = 1;
        while (i <= 10) {
          msg = msg + tabuada + " x " + i + " = " + tabuada * i + "\n";
          i++;
        }
        break;
      }
      case '3': {
        msg = msg + "Tabuada do " + tabuada + "feita usando Do While: \n";
        int i = 1;
        do {
          msg = msg + tabuada + " x " + i + " = " + tabuada * i + "\n";
          i++;
        } while (i <= 10);
        break;
      }
      default:
        JOptionPane.showMessageDialog(null, "Opção Inválida. Cálculos não realizados");
    }
    if (op >= '1' && op <= '3') {
      JOptionPane.showMessageDialog(null, msg);
    }
    System.exit(0);
  }
}
