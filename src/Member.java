public class Member {
    private String nama = "Belum diisi";
    private String noTelepon = "0000000000";
    private String tanggalDaftar = "01-01-2026";
    private String jenisPaket = "Basic";

    private static final int MIN_PANJANG_TELEPON = 10;

    public Member(String nama, String noTelepon,
                  String tanggalDaftar, String jenisPaket) {
        setNama(nama);
        setNoTelepon(noTelepon);
        setTanggalDaftar(tanggalDaftar);
        setJenisPaket(jenisPaket);
    }

   
    public Member(String nama, String noTelepon, String tanggalDaftar) {
        this(nama, noTelepon, tanggalDaftar, "Basic");
    }


    public String getNama() {
        return nama;
    }


    public void setNama(String nama) {
        if (nama != null && !nama.trim().isEmpty()) {
            this.nama = nama.trim();
        } else {
            System.out.println("Nama tidak boleh kosong atau hanya spasi.");
        }
    }

    
    public String getNoTelepon() {
        return noTelepon;
    }

  
    public void setNoTelepon(String noTelepon) {
        if (noTelepon != null
                && noTelepon.matches("[0-9]+")
                && noTelepon.length() >= MIN_PANJANG_TELEPON) {
            this.noTelepon = noTelepon;
        } else {
            System.out.println(
                "Nomor telepon harus diawali angka 0 dan minimal 10 digit."
            );
        }
    }


    public String getTanggalDaftar() {
        return tanggalDaftar;
    }
}
public void setTanggalDaftar(String tanggalDaftar) {
        if (tanggalDaftar != null && !tanggalDaftar.trim().isEmpty()) {
            this.tanggalDaftar = tanggalDaftar.trim();
        } else {
            System.out.println("Tanggal daftar tidak boleh kosong.");
        }
    }

    /** Mengambil jenis paket. @return jenis paket */
    public String getJenisPaket() {
        return jenisPaket;
    }

  
    public void setJenisPaket(String jenisPaket) {
        if ("Basic".equals(jenisPaket)
                || "Premium".equals(jenisPaket)
                || "VIP".equals(jenisPaket)) {
            this.jenisPaket = jenisPaket;
        } else {
            System.out.println(
                "Jenis paket tidak valid. Gunakan Basic, Premium, atau VIP."
            );
        }
    }

    
    @Override
    public String toString() {
        return "Nama: " + nama
                + ", No. Telepon: " + noTelepon
                + ", Tanggal Daftar: " + tanggalDaftar
                + ", Paket: " + jenisPaket;
    }
