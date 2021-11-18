/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;

import Entity.NhanVien;
import java.util.List;

/**
 *
 * @author PC
 */
public class NhanVienDAO extends HomeDAO<NhanVien, String>{
    final String INSERT_SQL="INSERT INTO NhanVien(MaNV,TenNV,GioiTinh,DiaChi,SDT,Email) values(?,?,?,?',?,?)";
    final String UPDATE_SQL= "UPDATE NhanVien set TenNV=?,GioiTinh=?, DiaChi =?,SDT=?,Email=? WHERE MaNV =?";
    final String DELETE_SQL= "DELETE FROM NhanVien WHERE MaNV=?";
    final String SELECT_ALL_SQL= "SELECT * FROM NhanVien";
    final String SELECT_BY_ID_SQL= "SELECT * FROM NhanVien WHERE MaNV =?";
    @Override
    public void insert(NhanVien entity) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void update(NhanVien entity) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void delete(String id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<NhanVien> selectAll() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public NhanVien selectById(String id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<NhanVien> selectBySql(String sql, Object... args) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
