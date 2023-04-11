import java.util.Queue;
import java.util.LinkedList;
public class Soru1 {
    public static int question_one(int[] biletsayisi, int k) {

        
        int n = biletsayisi.length; //Arraydeki her elemanı kuyruğa for döngüsüyle eklemek için n değişkinini oluşturarak arrayin uzunluğunu alıyoruz.
        //Integer tipinde bilet sayısı kuyruğu oluşturdum.
        
        Queue<Integer> biletSayisi = new LinkedList<>(); //Dinamik veri yapısı olduğu için LinkedList(daha verimli olduğu için) uygulaması kullandım.
        
        for (int i = 0; i < n; i++) { //Arraydeki elemanları kuyruktaki elemanların ilk değeri olarak atamak için for döngüsü kullandım
                biletSayisi.offer(i);
        }
        
        int time = 0; //Zaman değişkeni oluşturdum.
        
        while (!biletSayisi.isEmpty()) { //biletSayisi kuyruğu boşalana kadar while döngüsü devam eder.
            
            int ondekiKisi = biletSayisi.poll();//Poll metot yardımıyla sıranın en önündeki kişiyi ondekiKisi değişkenine atadım.
            //Bu metot kuyruğun en önündeki elemanı alıyor ve kuyruktan siliyor.
            
            if (biletsayisi[ondekiKisi] > 0) { //En öndeki kişi hala alacak bileti varsa if koşulu doğru olur.
                
                biletsayisi[ondekiKisi]--; //En öndeki kişinin almak istediği bilet sayısından 1 tane eksiltiyoruz.
               
                if (ondekiKisi == k) {  //İstenen kişi en öndeyse if koşulu doğru olur.
                 if (biletsayisi[k] == 0) { //Eğer istenen kişi biletlerinin tamamını almışsa bu if koşulu da doğru olur.
                        return time + 1; //Zamana 1 ekler ve zaman değişkenine döner.
                    } //Satır 23 deki if koşulundan önce poll metotunu kullandık, kuyruğun en önündeki elemanı aldık ve sildik.
                }     //Bu if koşulunda en öndeki kişinin bilet sayısı kontrol edildi ve if koşulu doğruysa 1 bileti eksiltildi.
                      //Sonrasında, bu kişi kuyruğun en sonuna eklendi. Çünkü hala alacak bileti var.
                
                
                biletSayisi.offer(ondekiKisi);
            }
                if (biletsayisi[ondekiKisi] == 0 && ondekiKisi != k) { //Eğer sıranın en önündeki kişi tüm biletlerini almışsa ve bu kişi istenen kişi değilse if koşulu doğru olur.
                biletSayisi.remove(ondekiKisi); //Bu kişi kuyruktan çıkartılıyor çünkü alması gereken tüm biletleri aldı.
            }
            
            time++; //Zaman 1 artılır.
        }
        
        return -1; /*return e dönmesi istenen kişinin hala alacak bileti olduğu anlamına gelir. Dolayısıyla zaman değişkeni -1 e döner.
        Bu koşulu main fonksiyonu içinde kontrol ediyoruz, eğer tüm program düzgün çalışıyorsa bu koşulun sonuçlarını görmememiz gerekiyor */
    }

}

