package pessoa;

class Pessoa {
    private String nome;
    private int idade;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        if (idade > 0) {
            this.idade = idade;
        } else {
            System.out.println("Idade inválida. A idade deve ser um número positivo.");
        }
    }

    public Pessoa(String nome, int idade) {
        this.nome = nome;
        setIdade(idade);
    }

}
public class Main {

    public static void main(String[] args) {
        Pessoa pessoa1 = new Pessoa("Maria", 20);
        Pessoa pessoa2 = new Pessoa("João", 25);

        System.out.println("Pessoa 1: " + pessoa1.getNome() + ", Idade: " + pessoa1.getIdade());
        System.out.println("Pessoa 2: " + pessoa2.getNome() + ", Idade: " + pessoa2.getIdade());

        //modificando o nome da pessoa1
        System.out.println("Alterando o nome da Pessoa 1...");
        pessoa1.setNome("Ana");
        System.out.println("Novo nome da Pessoa 1: " + pessoa1.getNome());

        //definindo uma idade inválida para a pessoa2 
        System.out.println("Tentando alterar a idade da Pessoa 2 para um valor inválido...");
        pessoa2.setIdade(-5); // Mensagem de erro
        System.out.println("Idade da Pessoa 2 após tentativa de alteração: " + pessoa2.getIdade());

        //Alterando a idade da pessoa2 para um valor válido
        pessoa2.setIdade(30);
        System.out.println("Idade da Pessoa 2 após alteração válida: " + pessoa2.getIdade());
    }
    
}
