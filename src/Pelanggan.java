package src;
public class Pelanggan {
  private String nama;
  private String tanggalBelanja;
  private boolean member;
  private int idMember;

  public void setNama (String a) {
    this.nama=a;
  }
  public void setTanggalBelanja (String a) {
    this.tanggalBelanja=a;
  }
  public void setMember (int b) {
    if (b==1) this.member=true;
    else this.member=false;
  }
  public void setIdMember (int b) {
    if (this.member) this.idMember=b;
  }
}
