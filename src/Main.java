import javax.swing.*;

public class Main {
    public static void main(String[] args) {

        String scelta = "";
        ContoCorrente contoCorrente = new ContoCorrente();

        do {

            scelta = JOptionPane.showInputDialog("BANCA - Digita la lettera corrispondente all'operazione che vuoi effettuare\n" +
                    "v - versamento\n" +
                    "p - prelievo\n" +
                    "s - saldo\n" +
                    "l - visualizza gli ultimi cinque movimenti\n" +
                    "x - esci\n" +
                    "seleziona l'operazione da effettuare : ");

            switch (scelta) {
                case "v": {
                    int cifra = Integer.parseInt(JOptionPane.showInputDialog("Digitare la cifra da versare"));
                    contoCorrente.versamento(cifra);
                    JOptionPane.showMessageDialog(null, "Sono stati versati " + cifra + " € ");
                    break;
                }
                case "p": {
                    int cifra = Integer.parseInt(JOptionPane.showInputDialog("Digitare la cifra da prelevare"));
                    contoCorrente.prelievo(cifra);
                    JOptionPane.showMessageDialog(null, "Sono stati prelevati " + cifra + " € ");
                    break;
                }
                case "s": {
                    JOptionPane.showMessageDialog(null, "Saldo " + contoCorrente.saldo() + " € ");
                    break;
                }
                case "l": {
                    JOptionPane.showMessageDialog(null, contoCorrente.listaMovimenti());
                    break;
                }
                case "x": {
                    break;
                }
                default: {
                    JOptionPane.showMessageDialog(null, "selezione non valida");
                    break;
                }

            }
        }
        while (!scelta.equals("x"));

    }
}