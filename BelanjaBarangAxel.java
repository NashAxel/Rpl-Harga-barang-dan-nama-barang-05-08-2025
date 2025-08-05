import java.util.Scanner;

public class BelanjaBarangAxel {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        System.out.println("Masukan nama barang");
        String nama_barang = input.nextLine ();
        System.out.println("Masukan harga barang");
        int harga_barang = input.nextInt();

        System.out.println("===");
        System.out.println("Barang yang dibeli :"+nama_barang+",harga barang"+harga_barang);

    }
}
