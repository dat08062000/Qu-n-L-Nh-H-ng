/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entity;

/**
 *
 * @author PC
 */
public class NhanVien {
    private String MaNV;
    private String TenNV;
    private String Gioitinh;
    private String DiaChi;
    private String SDT;
    private String Email;

    public NhanVien() {
    }

    public NhanVien(String MaNV, String TenNV, String Gioitinh, String DiaChi, String SDT, String Email) {
        this.MaNV = MaNV;
        this.TenNV = TenNV;
        this.Gioitinh = Gioitinh;
        this.DiaChi = DiaChi;
        this.SDT = SDT;
        this.Email = Email;
    }

    public String getMaNV() {
        return MaNV;
    }

    public void setMaNV(String MaNV) {
        this.MaNV = MaNV;
    }

    public String getTenNV() {
        return TenNV;
    }

    public void setTenNV(String TenNV) {
        this.TenNV = TenNV;
    }

    public String getGioitinh() {
        return Gioitinh;
    }

    public void setGioitinh(String Gioitinh) {
        this.Gioitinh = Gioitinh;
    }

    public String getDiaChi() {
        return DiaChi;
    }

    public void setDiaChi(String DiaChi) {
        this.DiaChi = DiaChi;
    }

    public String getSDT() {
        return SDT;
    }

    public void setSDT(String SDT) {
        this.SDT = SDT;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String Email) {
        this.Email = Email;
    }
    @Override
    public String toString() {
        return this.MaNV;
    }
    
}
