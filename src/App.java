
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
        System.out.println(stack1.printStack());
        System.out.println(stack2.printStack());

        System.out.println(itemToPush);
        emptyStack.push(itemToPush);
        System.out.println(emptyStack.printStack());

        // Organizar a estrura dentro do while com as opções

        while (true) {
            System.out.println("---------BEM VINDO---------");
            System.out.println(
                    "---------Ao final do jogo, a metade dos números menores deverá ficar na pilha 1.---------");
            System.out.println("---------A metade dos números maiores deverá ficar na pilha 2.---------");
            System.out.println("---------A pilha 3 será utilizada para as manobras.---------");
        }
    }
}
