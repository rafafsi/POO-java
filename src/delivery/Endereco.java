package delivery;

public class Endereco extends Object { // por default toda classe extende naturalmente Object, por isso nao precisa declarar.

    public enum TipoEndereco {
        RESIDENCIAL,
        ENTREGA,
        TRABALHO
    }

    public String endereco;
    public String numero;
    public String complemento;
    public String bairro;
    public String cidade;
    public String estado;
    public String cep;
}


//em java, quando se tem um objeto muito complexo (como é o caso na lista) ele normalmente é nulo.
//cpf, cnpj e cep são String porque eles podem começar com 0 e porque não se faz nenhuma operação com eles.