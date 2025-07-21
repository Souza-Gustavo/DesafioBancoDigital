public class Main {

    public static void main(String[] args) {

        Conta cc = new ContaCorrente();
        Conta poupanca = new ContaPoupanca();

        cc.depositar(100);
        cc.trasnferir(50, poupanca);

    cc.imprimirExtrato();
    poupanca.imprimirExtrato();

    }

}
