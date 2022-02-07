package delivery;

import java.util.ArrayList;
import java.util.List;

public class Cliente extends Pessoa { //dessa forma, Cliente passa a ser herdeira de Pessoa

    private List<Endereco> enderecos;

    public void adicionaEndereco(Endereco endereco) {
        if (endereco == null) {
            throw new NullPointerException("endereço não pode ser nulo.");
        }
        if (endereco.cep == null) {
            throw new NullPointerException("o CEP não pode ser nulo.");
        }

        getEnderecos().add(endereco); //só quando passa por essas duas validações é que o endereço pode ser adicionado na lista
    }

    private List<Endereco> getEnderecos() { //com o get eu garanto o encapsulamento da classe
        if (enderecos == null) {
            enderecos = new ArrayList<Endereco>();
        }
        return enderecos;
    }

    public void setEnderecos(List<Endereco> enderecos) {
        this.enderecos = enderecos;
    }


}
