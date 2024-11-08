package src;

/**
 * Kelas Calculator menyediakan metode dasar untuk operasi matematika
 * seperti penjumlahan, pengurangan, perkalian, dan pembagian.
 */
public class Calculator {

    /**
     * Menambahkan dua bilangan.
     *
     * @param a bilangan pertama
     * @param b bilangan kedua
     * @return hasil dari penjumlahan a dan b
     */
    public int add(int a, int b) {
        return a + b;
    }

    /**
     * Mengurangi satu bilangan dari bilangan lainnya.
     *
     * @param a bilangan pertama
     * @param b bilangan kedua
     * @return hasil dari pengurangan b dari a
     */
    public int subtract(int a, int b) {
        return a - b;
    }

    /**
     * Mengalikan dua bilangan.
     *
     * @param a bilangan pertama
     * @param b bilangan kedua
     * @return hasil dari perkalian a dan b
     */
    public int multiply(int a, int b) {
        return a * b;
    }

    /**
     * Membagi satu bilangan dengan bilangan lainnya.
     *
     * @param a bilangan pertama (pembilang)
     * @param b bilangan kedua (penyebut)
     * @return hasil dari pembagian a dengan b
     * @throws ArithmeticException jika b adalah 0
     */
    public int divide(int a, int b) throws ArithmeticException {
        if (b == 0) {
            throw new ArithmeticException("Tidak dapat membagi dengan nol");
        }
        return a / b;
    }

    /**
     * Metode utama untuk menjalankan contoh dari operasi kalkulator.
     *
     * @param args argumen baris perintah
     */
    public static void main(String[] args) {
        Calculator calculator = new Calculator();

        // Contoh penggunaan metode
        System.out.println("Penjumlahan: " + calculator.add(10, 5));
        System.out.println("Pengurangan: " + calculator.subtract(10, 5));
        System.out.println("Perkalian: " + calculator.multiply(10, 5));
        try {
            System.out.println("Pembagian: " + calculator.divide(10, 0));
        } catch (ArithmeticException e) {
            System.out.println(e.getMessage());
        }
    }
}