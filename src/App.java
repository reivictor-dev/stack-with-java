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

        // item do topo removido e armazenado
        int itemToPush = stack1.pop();
        int itemToPush2 = stack2.pop();

        //
        

        System.out.println(itemToPush);
        emptyStack.push(itemToPush);
        

        // Organizar a estrura dentro do while com as opções

        
        while (true) {
    
            System.out.println("---------BEM VINDO---------");
            System.out.println(
                    "---------Ao final do jogo, a metade dos números menores deverá ficar na pilha 1.");
            System.out.println("---------A metade dos números maiores deverá ficar na pilha 2.");
            System.out.println("---------A pilha 3 será utilizada para as manobras.");
            System.out.println("________________________________________________________________________");
            System.out.println("---------1# Verificar as pilhas");
            System.out.println("---------2# Retirar de uma pilha");
            System.out.println("---------3# Utilizar a pilha de transição");
            System.out.println("---------4# Retirar da pilha de transição e colocar em outra");
            System.out.println("---------0# Encerrar");

            Scanner scn = new Scanner(System.in);
            int option = scn.nextInt();

            if (option == 0) {
                break;
            }

            if(option == 1) {
                System.out.println("Pilha 1(menores): "+stack1.printStack());
                System.out.println("**");
                System.out.println("Pilha de transição: "+emptyStack.printStack());
                System.out.println("**");
                System.out.println("Pilha 2(maiores): "+stack2.printStack());
                continue;
            }
        }
    }
}
