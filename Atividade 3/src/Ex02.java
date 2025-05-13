import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Ex02 {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Digite o número de participantes (n): ");
            int n = sc.nextInt();
            System.out.print("Digite o número de batidas (k): ");
            int k = sc.nextInt();
            
            if (n <= 0 || k <= 0) {
                System.out.println("Erro: n e k devem ser números positivos.");
                return;
            }
            
            Queue<Integer> fila = new LinkedList<>();
            for (int i = 1; i <= n; i++) {
                fila.add(i);
            }
            
            while (fila.size() > 1) {
                for (int i = 1; i < k; i++) {
                    int participante = fila.poll();
                    fila.add(participante);
                }
                fila.poll();
            }
            System.out.println("O vencedor é o participante: " + fila.peek());
        }
    }
}
