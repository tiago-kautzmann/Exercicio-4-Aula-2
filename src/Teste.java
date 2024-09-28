public class Teste {

    public static void main(String[] args) {

        ContaCorrente conta1 = new ContaCorrente(0, 500);
        conta1.deposita(600);
        conta1.deposita(30.5);
        conta1.deposita(100);
        conta1.saca(40);
        conta1.saca(5.0);
        conta1.deposita(50.0);
        conta1.saca(1235.5);

        System.out.println("O saldo da conta é: " + conta1.getSaldo());

    }

}