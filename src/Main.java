public class Main {

    public static void main(String[] args) {
        Conta conta1 = new Conta();
        conta1.cliente.nome = "Thiago Calebe ";
        conta1.cliente.sexo = 'm';
        conta1.cliente.idade = 16;
        conta1.cliente.cpf = "129324824374";
        conta1.cliente.endereco = "Congonhas";
        conta1.agencia = "4384";
        conta1.numero = 92373;
        conta1.saldo = 10;
        conta1.limite = 100;
        conta1.sacar(5);
        conta1.depositar(100);
        conta1.imprimir();
        conta1.imprimirExtrato();
    }
}