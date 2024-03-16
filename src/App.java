import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        // setar tamanho da pilha
        int tamanhoPilha = 4;

        // 2 pilhas preenchidas
        Stack stack1 = new Stack(tamanhoPilha);
        stack1.populate();
        Stack stack2 = new Stack(tamanhoPilha);
        stack2.populate();
        Stack emptyStack = new Stack(tamanhoPilha);

        // Organizar a estrura dentro do while com as opções

        while (true) {
            System.out.println("________________________________________________________________________");
            System.out.println("_________BEM VINDO_________");
            System.out.println(
                    "-Ao final do jogo, a metade dos números menores deverá ficar na pilha 1.");
            System.out.println("-A metade dos números maiores deverá ficar na pilha 2.");
            System.out.println("-A pilha 3 será utilizada para as manobras.");
            System.out.println("________________________________________________________________________");
            System.out.println("-1# Verificar as pilhas");
            System.out.println("-2# Alocar na pilha de transiçã1o");
            System.out.println("-3# Retirar da pilha de transição e alocar");
            System.out.println("-0# Encerrar");

            Scanner scn = new Scanner(System.in);
            int option = scn.nextInt();

            if (option == 0) {
                break;
            }

            if (option == 1) {
                System.out.println("Pilha 1(menores): " + stack1.printStack());
                System.out.println("**");
                System.out.println("Pilha de transição: " + emptyStack.printStack());
                System.out.println("**");
                System.out.println("Pilha 2(maiores): " + stack2.printStack());
                continue;
            }

            if (option == 2) {
                System.out.println("De qual pilha deseja retirar para alocar na de transição? 1 ou 2?");
                int optPilha = scn.nextInt();

                if (optPilha == 1) {
                    int itemToPush = stack1.pop();
                    emptyStack.push(itemToPush);
                }

                if (optPilha == 2) {
                    int itemToPush2 = stack2.pop();
                    emptyStack.push(itemToPush2);
                }

                continue;
            }

            if (option == 3) {
                if (emptyStack.isVazia()) {
                    System.out.println("Verifique a pilha de transição");
                }

                System.out.println("Em qual pilha deseja alocar? 1 ou 2?");
                int optPilha = scn.nextInt();

                if (optPilha == 1) {
                    if (stack1.full()) {
                        System.out.println("Pilha está cheia!");
                        continue;
                    }
                    int itemToPush = emptyStack.pop();
                    stack1.push(itemToPush);
                }

                if (optPilha == 2) {
                    if (stack2.full()) {
                        System.out.println("Pilha está cheia!");
                        continue;
                    }
                    int itemToPush2 = emptyStack.pop();
                    stack2.push(itemToPush2);
                }

                continue;
            }

            if (stack1.verifyGame(stack1, stack2)) {
                System.out.println("Parabens, voce venceu!");
                break;
            }

        }
    }
}
