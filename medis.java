import java.util.ArrayList;
import java.util.Scanner;
import java.util.Scanner;


public class medis {

class Pasien {
    private String nama;
    private int umur;
    private String alamat;
    private String keluhan;

    public Pasien(String nama, int umur, String alamat, String keluhan) {
        this.nama = nama;
        this.umur = umur;
        this.alamat = alamat;
        this.keluhan = keluhan;
    }

    public String getNama() {
        return nama;
    }

    public int getUmur() {
        return umur;
    }

    public String getAlamat() {
        return alamat;
    }

    public String getKeluhan() {
        return keluhan;
    }

    @Override
    public String toString() {
        return "Nama: " + nama + "\nUmur: " + umur + "\nAlamat: " + alamat + "\nKeluhan: " + keluhan;
    }
}

class Dokter {
    private String nama;
    private String spesialisasi;

    public Dokter(String nama, String spesialisasi) {
        this.nama = nama;
        this.spesialisasi = spesialisasi;
    }

    public String getNama() {
        return nama;
    }

    public String getSpesialisasi() {
        return spesialisasi;
    }

    @Override
    public String toString() {
        return "Nama Dokter: " + nama + "\nSpesialisasi: " + spesialisasi;
    }
}

public class testmedis {
    public static void main(String[] args) {
        ArrayList<Pasien> daftarPasien = new ArrayList<>();
        ArrayList<Dokter> daftarDokter = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\nMenu:");
            System.out.println("1. Tambah Pasien");
            System.out.println("2. Tambah Dokter");
            System.out.println("3. Tampilkan Daftar Pasien");
            System.out.println("4. Tampilkan Daftar Dokter");
            System.out.println("5. Keluar");
            System.out.print("Pilih menu (1/2/3/4/5): ");
            int pilihan = scanner.nextInt();

            switch (pilihan) {
                case 1:
                    System.out.print("Nama Pasien: ");
                    scanner.nextLine();
                    String namaPasien = scanner.nextLine();
                    System.out.print("Umur: ");
                    int umurPasien = scanner.nextInt();
                    scanner.nextLine();
                    System.out.print("Alamat: ");
                    String alamatPasien = scanner.nextLine();
                    System.out.print("Keluhan: ");
                    String keluhanPasien = scanner.nextLine();
                    Pasien pasien = new Pasien(namaPasien, umurPasien, alamatPasien, keluhanPasien);
                    daftarPasien.add(pasien);
                    System.out.println("Pasien berhasil ditambahkan!");
                    break;

                case 2:
                    System.out.print("Nama Dokter: ");
                    scanner.nextLine();
                    String namaDokter = scanner.nextLine();
                    System.out.print("Spesialisasi: ");
                    String spesialisasiDokter = scanner.nextLine();
                    Dokter dokter = new Dokter(namaDokter, spesialisasiDokter);
                    daftarDokter.add(dokter);
                    System.out.println("Dokter berhasil ditambahkan!");
                    break;

                case 3:
                    System.out.println("\nDaftar Pasien:");
                    for (Pasien p : daftarPasien) {
                        System.out.println(p);
                    }
                    break;

                case 4:
                    System.out.println("\nDaftar Dokter:");
                    for (Dokter d : daftarDokter) {
                        System.out.println(d);
                    }
                    break;

                case 5:
                    System.out.println("Terima kasih!");
                    System.exit(0);
                    break;

                default:
                    System.out.println("Pilihan tidak valid. Silakan pilih lagi.");
                    break;
            }
        }
    }
}

    
    
}
