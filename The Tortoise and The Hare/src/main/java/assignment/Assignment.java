package assignment;

public class Assignment {

    public static int kaplumbagaHareketi(int pozisyon) {
        int hareket = (int)(Math.random() * 10); // 0 ile 9 arasında rastgele bir sayı

        if (hareket < 5) {  // %50 ihtimalle 3 kare ilerler
            pozisyon += 3;
        } else if (hareket < 7) { // %20 ihtimall (bu koşul 5'ten sonra geldiği için 5 ve 6 için geçerli olacak)
            pozisyon -= 6;
        } else if (hareket < 9) { // %20 ihtimalle 1 kare ilerler (bu koşul 7 ve 8 için geçerli olacak)
            pozisyon += 1;
        } else {  // %10 ihtimalle yerinde sayar (bu koşul 9 için geçerli olacak)
            pozisyon += 0;
        }
        // 1. karenin altına inerse 1. kareye geri döndür
        if (pozisyon < 1) pozisyon = 1;

        return pozisyon;
    }

    public static int tavsanHareketi(int pozisyon) {
        int hareket = (int)(Math.random() * 10); // 0 ile 9 arasında rastgele bir sayı

        if (hareket < 2) {  // %20 ihtimalle 9 kare ileri gider (0 ve 1 için geçerli)
            pozisyon += 9;
        } else if (hareket < 3) {  // %10 ihtimalle 12 kare geri gider (2 için geçerli)
            pozisyon -= 12;
        } else if (hareket < 5) {  // %20 ihtimalle 1 kare ilerler (3 ve 4 için geçerli)
            pozisyon += 1;
        } else if (hareket < 7) {  // %20 ihtimalle 2 kare ilerler (5 ve 6 için geçerli)
            pozisyon += 2;
        } else {  // %30 ihtimalle yerinde sayar
            pozisyon += 0;
        }
        // 1. karenin altına inerse 1. kareye geri döndür
        if (pozisyon < 1) pozisyon = 1;

        return pozisyon;
    }
}