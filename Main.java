import java.util.Scanner;
public class Main {
    public static void main(String[] args){
    
Scanner scanner = new Scanner(System.in); //Kullanıcıdan girdi almak için scanner objesi oluşturdum.
System.out.print("Kaç kişi bilet almak istiyor?"); //Bilet satın almak isteyen kişi sayısını kullanıcıdan alıyoruz.
int n = scanner.nextInt();
//Kuyruktaki her kişi için sırası ile kaç bilet almak istediğini soruyoruz.
int[] bilet = new int[n];
for (int i = 0; i < n; i++) {
    System.out.printf("%d . kişinin kaç bilet almak istediğini giriniz :  ", i);
    bilet[i] = scanner.nextInt();
}
System.out.print("İstenen kişinin kuyruktaki sırasını giriniz: "); //Tüm biletleri almasını istediğimiz kişinin kuyruktaki sırasını soruyoruz.
int k = scanner.nextInt();
int time = Soru1.question_one(bilet, k); //Zaman değişkenini oluşturdum.
scanner.close(); //Scanner objesini proje verimliliği için kapatıyoruz.

if (time == -1) {
    System.out.println("İstenen kişi tüm biletlerini alamadı.");
} else {
    System.out.println("İstenen kişinin tüm biletleri alması için geçen süre : " + time  );
}
 Soru2.question_2(); //Soru 2'nin çalışması için bu kısımın çalıştırılması gerekiyor.
}
}