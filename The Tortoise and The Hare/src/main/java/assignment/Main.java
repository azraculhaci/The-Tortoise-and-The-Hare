package assignment;

public class Main {
    public static void main(String[] args) {
        int kaplumbagaPozisyon = 1;
        int tavsanPozisyon = 1;

        while (kaplumbagaPozisyon < 70 && tavsanPozisyon < 70) {

            // Kaplumbağa
            kaplumbagaPozisyon = Assignment.kaplumbagaHareketi(kaplumbagaPozisyon);

            // Tavşan
            tavsanPozisyon = Assignment.tavsanHareketi(tavsanPozisyon);


            System.out.println("Kaplumbağa pozisyonu: " + kaplumbagaPozisyon);
            System.out.println();
            System.out.println("Tavşan pozisyonu: " + tavsanPozisyon);

            try {
                Thread.sleep(200);  // 300 milisaniye bekle
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            // Kazanan
            if (kaplumbagaPozisyon >= 70) {
                System.out.println("Kaplumbağa kazandı!");
                break;
            } else if (tavsanPozisyon >= 70) {
                System.out.println("Tavşan kazandı!");
                break;
            }
        }
    }
}
