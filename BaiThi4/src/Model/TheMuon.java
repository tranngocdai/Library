package Model;

import java.time.LocalDate;
import java.util.Date;

public class TheMuon {
    private SinhVien sinhvien;
    private int soPhieuMuon;
    private LocalDate dayMuon;
    private LocalDate hanTra;
    private int soHieu;

    public TheMuon(String name, String code, String lop, int soPhieuMuon, LocalDate dayMuon, LocalDate hanTra, String soHieu){}

    public TheMuon(SinhVien sinhvien, int soPhieuMuon,LocalDate dayMuon, LocalDate hanTra, int soHieu) {
        this.sinhvien = sinhvien;
        this.soPhieuMuon = soPhieuMuon;
        this.dayMuon = dayMuon;
        this.hanTra = hanTra;
        this.soHieu = soHieu;
    }

    public int getSoPhieuMuon() {
        return soPhieuMuon;
    }

    public void setSoPhieuMuon(int soPhieuMuon) {
        this.soPhieuMuon = soPhieuMuon;
    }

    public SinhVien getSinhvien() {
        return sinhvien;
    }

    public void setSinhvien(SinhVien sinhvien) {
        this.sinhvien = sinhvien;
    }

    public LocalDate getDayMuon() {
        return dayMuon;
    }

    public void setDayMuon(LocalDate dayMuon) {
        this.dayMuon = dayMuon;
    }

    public LocalDate getHanTra() {
        return hanTra;
    }

    public void setHanTra(LocalDate hanTra) {
        this.hanTra = hanTra;
    }

    public int getSoHieu() {
        return soHieu;
    }

    public void setSoHieu(int soHieu) {
        this.soHieu = soHieu;
    }

    @Override
    public String toString() {
        return "TheMuon{"
                + sinhvien.toString() + "số phiếu mượn"+ soPhieuMuon +
                ", dayMuon=" + dayMuon +
                ", hanTra=" + hanTra +
                ", soHieu=" + soHieu +
                '}';
    }
}
