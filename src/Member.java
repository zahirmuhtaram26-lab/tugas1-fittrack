// Source code is decompiled from a .class file using FernFlower decompiler (from Intellij IDEA).
public class Member {
   private String nama;
   private String noTelepon;
   private String tanggalDaftar;
   private String jenisPaket;
   private static final int MIN_PANJANG_TELEPON = 10;

   public Member(String var1, String var2, String var3, String var4) {
      this.nama = "Belum diisi";
      this.noTelepon = "0000000000";
      this.tanggalDaftar = "01-01-2026";
      this.jenisPaket = "Basic";
      this.setNama(var1);
      this.setNoTelepon(var2);
      this.setTanggalDaftar(var3);
      this.setJenisPaket(var4);
   }

   public Member(String var1, String var2, String var3) {
      this(var1, var2, var3, "Basic");
   }

   public String getNama() {
      return this.nama;
   }

   public void setNama(String var1) {
      if (var1 != null && !var1.trim().isEmpty()) {
         this.nama = var1.trim();
      } else {
         System.out.println("Nama tidak boleh kosong atau hanya spasi.");
      }

   }

   public String getNoTelepon() {
      return this.noTelepon;
   }

   public void setNoTelepon(String var1) {
      if (var1 != null && var1.matches("[0-9]+") && var1.length() >= 10) {
         this.noTelepon = var1;
      } else {
         System.out.println("Nomor telepon harus diawali angka 0 dan minimal 10 digit.");
      }

   }

   public String getTanggalDaftar() {
      return this.tanggalDaftar;
   }

   public void setTanggalDaftar(String var1) {
      if (var1 != null && !var1.trim().isEmpty()) {
         this.tanggalDaftar = var1.trim();
      } else {
         System.out.println("Tanggal daftar tidak boleh kosong.");
      }

   }

   public String getJenisPaket() {
      return this.jenisPaket;
   }

   public void setJenisPaket(String var1) {
      if (!"Basic".equals(var1) && !"Premium".equals(var1) && !"VIP".equals(var1)) {
         System.out.println("Jenis paket tidak valid. Gunakan Basic, Premium, atau VIP.");
      } else {
         this.jenisPaket = var1;
      }

   }

   public String toString() {
      return "Nama: " + this.nama + ", No. Telepon: " + this.noTelepon + ", Tanggal Daftar: " + this.tanggalDaftar + ", Paket: " + this.jenisPaket;
   }
}
