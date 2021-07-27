package Model;

import java.time.LocalDate;

public class SinhVien {
    private String name;
    private String code;
    private LocalDate ngaySinh;
    private String lop;

    public SinhVien(){}

    public SinhVien(String name, String code, LocalDate ngaySinh, String lop) {
        this.name = name;
        this.code = code;
        this.ngaySinh = ngaySinh;
        this.lop = lop;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public LocalDate getNgaySinh() {
        return ngaySinh;
    }

    public void setNgaySinh(LocalDate ngaySinh) {
        this.ngaySinh = ngaySinh;
    }

    public String getLop() {
        return lop;
    }

    public void setLop(String lop) {
        this.lop = lop;
    }

    @Override
    public String toString() {
        return "SinhVien{" +
                "name='" + name + '\'' +
                ", code='" + code + '\'' +
                ", date=" + ngaySinh +
                ", lop='" + lop + '\'' +
                '}';
    }
}
