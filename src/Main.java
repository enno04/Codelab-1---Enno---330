import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;import java.util.Scanner;

import static java.lang.System.out;

class InputDataDiri {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        out.print("Masukan Nama Anda: ");
        String name = scanner.nextLine();
        out.print("Pilih Jenis Kelamin (P/L): ");
        String gender = scanner.nextLine();
        out.print("Masukkan Tanggal Lahir (yyyy-MM-dd): ");
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        LocalDate dob = LocalDate.parse(scanner.nextLine(), formatter);
        scanner.close();

        String genderDisplay = (gender.equalsIgnoreCase("L")) ? "Laki-Laki" : "Perempuan";
        Period period = Period.between(dob, LocalDate.now());
        int age = period.getYears();

        out.println("\n===== Input Data Diri =====");
        out.println("Nama: " + name);
        out.println("Jenis Kelamin: " + genderDisplay);
        out.println("Umur Anda: " + age + " Tahun");
    }
}
