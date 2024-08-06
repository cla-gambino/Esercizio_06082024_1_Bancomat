public class ContoCorrente {

    private int saldo;
    private int[] movimenti = new int[5];

    public ContoCorrente() {
        this.saldo = 0;
    }

    public int getSaldo() {
        return saldo;
    }

    public void setSaldo(int saldo) {
        this.saldo = saldo;
    }

    public int[] getMovimenti() {
        return movimenti;
    }

    public void setMovimenti(int[] movimenti) {
        this.movimenti = movimenti;
    }

    public void versamento(int cifraDaVersare) {
        saldo += cifraDaVersare;
        for (int i = 0; i < movimenti.length - 1; i++) {
            movimenti[i] = movimenti[i + 1];
            movimenti[movimenti.length - 1] = cifraDaVersare;
        }
    }

    public void prelievo(int cifraDaPrelevare) {
        saldo -= cifraDaPrelevare;
        for (int i = 0; i < movimenti.length - 1; i++) {
            movimenti[i] = movimenti[i + 1];
            movimenti[movimenti.length - 1] = -cifraDaPrelevare;
        }
    }

    public int saldo() {
        return saldo;
    }

    public String listaMovimenti() {
        StringBuilder message = new StringBuilder();
        for (int i = 0; i < movimenti.length; i++) {
            if (movimenti[i] != 0) {
                if (movimenti[i] > 0) {
                    message.append("Versamento: + ").append(movimenti[i]).append(" € \n ");
                } else {
                    message.append("Prelievo: - ").append(movimenti[i]).append(" € \n ");
                }
            }
        }
        return message.toString();
    }


}
