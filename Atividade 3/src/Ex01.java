import java.util.Scanner;
import java.util.Stack;

public class Ex01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite o número de servidores: ");
        int n = sc.nextInt();
        int[] cargas = new int[n];
        System.out.println("Digite as cargas dos servidores:");
        for (int i = 0; i < n; i++) {
            cargas[i] = sc.nextInt();
        }
        
        int dias = contarDias(cargas);
        System.out.println("Número de dias até estabilizar: " + dias);
        
        sc.close();
    }
    
    private static int contarDias(int[] cargas) {
        int dias = 0;
        
        while (true) {
            Stack<Integer> pilha = new Stack<>();
            boolean houveDesligamento = false;
            
            pilha.push(cargas[0]);
            
            for (int i = 1; i < cargas.length; i++) {
                if (cargas[i] <= cargas[i - 1]) {
                    pilha.push(cargas[i]);
                } else {
                    houveDesligamento = true;
                }
            }
            
            if (!houveDesligamento) {
                break;
            }
            
            dias++;
            
            int[] novasCargas = new int[pilha.size()];
            for (int i = pilha.size() - 1; i >= 0; i--) {
                novasCargas[i] = pilha.pop();
            }
            cargas = novasCargas;
    
            if (cargas.length <= 1) {
                break;
            }
        }
        
        return dias;
    }
}
