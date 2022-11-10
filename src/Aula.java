import java.util.ArrayList;
import java.util.Scanner;

public class Aula {
    static ArrayList<Pessoa> grupo = new ArrayList<>();
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int leitor = 0;
        while (leitor != 5) {
            Menu.estrutura();
            leitor = sc.nextInt();
            switch (leitor) {
                case 1:
                    System.out.println("Digite seu nome:");
                    String name = sc.next();
                    System.out.println("Digite sua cidade:");
                    String cidade = sc.next();
                    System.out.println("Digite seu CPF");
                    int cpf = sc.nextInt();
                    System.out.println("Digite seu número de telefone:");
                    int telefone = sc.nextInt();
                    Pessoa pessoa = new Pessoa(name, cidade, cpf, telefone);
                    grupo.add(pessoa);
                    break;
                case 2:
                    System.out.println("Digite o CPF:");
                    int cpf2 = sc.nextInt();
                    for (Pessoa pessoa2 : grupo) {
                        if (pessoa2.cpf == cpf2) {
                            System.out.println("Digite seu nome:");
                            String name2 = sc.next();

                            System.out.println("Digite sua cidade:");
                            String cidade2 = sc.next();
                            System.out.println("Digite seu número de telefone:");
                            int telefone2 = sc.nextInt();
                            pessoa = new Pessoa(name2, cidade2, cpf2, telefone2);
                            grupo.set(grupo.indexOf(pessoa2), pessoa);

                        }
                        break;
                    }
                case 3:
                    System.out.println("Digite o CPF");
                    int cpf3 = sc.nextInt();
                    for (Pessoa pessoa2 : grupo) {
                        if (pessoa2.cpf == cpf3) {
                            System.out.println(pessoa2);
                        }
                    }
                    break;

                case 4:
                    for (Pessoa pessoa2 : grupo) {
                        System.out.println(pessoa2);
                    }
            }
        }

    }
}
