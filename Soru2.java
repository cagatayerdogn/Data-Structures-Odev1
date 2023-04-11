import java.util.Stack;

public class Soru2 {

    public static void question_2() {
    int[] array = {9, 4, 3, -2, 7, 1};
    
    Stack<Integer> stack = new Stack<>(); // Stack'i oluşturdum ve array'in elemanlarını stack'e ekledim
    for (int i = 0; i < array.length; i++) {
     stack.push(array[i]); // stack'e elemanları eklenir.
    }
    
     
     Stack<Integer> sortedStack = new Stack<>(); // Stack sıralanır.
     while (!stack.empty()) { // stack boş olana kadar devam edilir
     int current = stack.pop(); // stack'ten eleman çıkarılır.
     while (!sortedStack.empty() && current > sortedStack.peek()) {
     /*sıralanmış stack dolu ve mevcut elemandan daha küçük bir eleman varsa
      sıralanmış stack'ten eleman çıkarılır ve ilk stack'e geri eklenir*/
      stack.push(sortedStack.pop());
     }
     sortedStack.push(current); // sıralanmış stack'e mevcut elemanı eklenir
     }
    
     // Sıralanmış stack yazdırılır.
     while (!sortedStack.empty()) { // sıralanmış stack boş olana kadar devam edilir.
      System.out.print(sortedStack.pop() + " "); // elemanları yazdırır
     }
     }
    }