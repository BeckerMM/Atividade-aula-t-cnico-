public class Pessoa {
    String name;
    String cidade;
    int cpf;
    int telefone;

    public Pessoa(String name, String cidade, int cpf, int telefone){
        this.name= name;
        this.cidade= cidade;
        this.cpf=cpf;
        this.telefone=telefone;

    }
    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return "\nNome: "+name +"\nCidade"+ cidade +"\nCPF:"+ cpf + "\nTelefone"+telefone+"\n";
    }
}