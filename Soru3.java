
    import java.util.Stack;

public class Soru3<T> {
    //stack1 ve stack2 stackleri kuyruk uygulamak için kullanıldı.
    private Stack<T> stack1 = new Stack<>(); //stack1 stack'i kuyruğun sonuna eklenen elemanları tutmak için kullanıldı.
    private Stack<T> stack2 = new Stack<>(); //stack2 stack'i kuyruğun önünden silinen elemanları tutmak için kullanıldı.

    
    public void enqueue(T item) { //Bu metot elemanları kuyruğun en sonuna ekliyor.
        stack1.push(item);
    }

   
    public T dequeue() {  //Bu metot elemanı siler ve kuyruğun başına döner.
        //Eğer stack2 stack'i boş ise dequeue çağırıldığında stack1 stack'indeki elemanlar ters sırayla stack2 stack'ine aktarılır.
            if (stack2.empty()) {
            while (!stack1.empty()) {
                stack2.push(stack1.pop());
            }
        }
        //pop metodu ile sildik ve kuyruktaki en eski elemana döndük.
        return stack2.pop();
    }

    
    public T peek() { //Bu metot kuyruğun en önündeki elemanı silmeden bize döndürüyor.
        
        if (stack2.empty()) { //Eğer stack2 stack'i boş ise peek çağırıldığında stack1 stack'indeki elemanlar ters sırayla stack2 stack'ine aktarılır.
            while (!stack1.empty()) {
                stack2.push(stack1.pop());
            }
        }
        
        return stack2.peek(); //stack2 stack'indeki ilk elemanı silmeden döndürür.
    }

        }

