import delivery.Cliente;
import delivery.Endereco;

import java.util.ArrayList;

public class EntregaCartaoApp {

    public static void main(String[] args) {

        Endereco endereco = new Endereco();
        endereco.cep = "0000000000";
        //dados do endereço

        Cliente cliente = new Cliente();
        //dados do cliente

        try {
            cliente.adicionaEndereco(endereco);
            System.out.println("endereço adicionado com sucesso!");
        } catch (Exception e) {
            System.err.println("houve um erro ao adicionar o endereco: " + e.getMessage());
        }


    }
}
