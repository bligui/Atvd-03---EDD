import java.util.LinkedList;
import java.util.Scanner;

public class Ex03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Digite o tamanho da primeira lista: ");
        int n1 = sc.nextInt();
        LinkedList<Integer> lista1 = new LinkedList<>();
        System.out.println("Digite os " + n1 + " elementos da primeira lista:");
        for (int i = 0; i < n1; i++) {
            lista1.add(sc.nextInt());
        }
        
        System.out.print("Digite o tamanho da segunda lista: ");
        int n2 = sc.nextInt();
        LinkedList<Integer> lista2 = new LinkedList<>();
        System.out.println("Digite os " + n2 + " elementos da segunda lista:");
        for (int i = 0; i < n2; i++) {
            lista2.add(sc.nextInt());
        }

        
        LinkedList<Integer> resultado = mergeListas(lista1, lista2);
        System.out.println("Lista intercalada e ordenada: " + resultado);
        
        sc.close();
    }
    
    private static LinkedList<Integer> mergeListas(LinkedList<Integer> l1, LinkedList<Integer> l2) {
        LinkedList<Integer> listaResultante = new LinkedList<>();
        
        while (!l1.isEmpty() && !l2.isEmpty()) {
            if (l1.peekFirst() <= l2.peekFirst()) {
                listaResultante.add(l1.pollFirst());
            } else {
                listaResultante.add(l2.pollFirst());
            }
        }
        
        while (!l1.isEmpty()) {
            listaResultante.add(l1.pollFirst());
        }
        
        while (!l2.isEmpty()) {
            listaResultante.add(l2.pollFirst());
        }
        
        return listaResultante;
    }
}
