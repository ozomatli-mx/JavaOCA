package mx.com.hittechs.dao.impl;

//import java.sql.PreparedStatement;
//import java.sql.ResultSet;
//import java.sql.SQLException;
//import java.sql.Statement;
//import java.util.ArrayList;
//import java.util.List;
//import java.util.logging.Level;
//import java.util.logging.Logger;
//import mx.com.hittechs.dao.DepartmentDao;
//import mx.com.hittechs.dao.utils.ConnectionUtils;
//import mx.com.hittechs.model.Department;
//
///**
// *
// * @author Hittechs Training & Consulting
// * @web www.hittechs.com.mx
// * @main contacto@hittechs.com.mx
// */
//public class DepartmentDaoImpl implements DepartmentDao {
//
//    @Override
//    public void create(Department deparment) {
//        try {
//            String insert = "INSERT INTO deparments"
//                    + "(title, location) VALUES"
//                    + "(?,?)";
//            PreparedStatement ps = ConnectionUtils.getConnection().prepareStatement(insert);
//            ps.setString(1, deparment.getTitle());
//            ps.setString(2, deparment.getLocation());
//            ps.executeLargeUpdate();
//        } catch (SQLException ex) {
//            Logger.getLogger(DepartmentDaoImpl.class.getName()).log(Level.SEVERE, null, ex);
//        }
//    }
//
//    @Override
//    public void edit(Department deparment) {
//        try {
//            String insert = "UPDATE deparments "
//                    + "SET title=?, location=? "
//                    + "WHERE id =?";
//            PreparedStatement ps = ConnectionUtils.getConnection().prepareStatement(insert);
//            ps.setString(1, deparment.getTitle());
//            ps.setString(2, deparment.getLocation());
//            ps.setInt(3, deparment.getId());
//            ps.executeLargeUpdate();
//        } catch (SQLException ex) {
//            Logger.getLogger(DepartmentDaoImpl.class.getName()).log(Level.SEVERE, null, ex);
//        }
//    }
//
//    @Override
//    public void remove(Department department) {
//        try {
//            String insert = "DELETE FROM deparments WHERE id =?";
//            PreparedStatement ps = ConnectionUtils.getConnection().prepareStatement(insert);
//            ps.setInt(1, department.getId());
//            ps.executeLargeUpdate();
//        } catch (SQLException ex) {
//            Logger.getLogger(DepartmentDaoImpl.class.getName()).log(Level.SEVERE, null, ex);
//        }
//    }
//
//    @Override
//    public List<Department> findAll() {
//        List<Department> deparments = new ArrayList<>();
//        try {
//            Statement statement = ConnectionUtils.getConnection().createStatement();
//            ResultSet rs = statement.executeQuery("SELECT * FROM departments");
//
//            while (rs.next()) {
//                Department department = new Department();
//                department.setId(rs.getInt("id"));
//                department.setTitle(rs.getString("title"));
//                department.setLocation(rs.getString("location"));
//                deparments.add(department);
//            }
//        } catch (SQLException ex) {
//            Logger.getLogger(DepartmentDaoImpl.class.getName()).log(Level.SEVERE, null, ex);
//        }
//        return deparments;
//    }
//
//    @Override
//    public Department findById(int id) {
//        Department department = new Department();
//        try {
//            PreparedStatement ps = ConnectionUtils.getConnection().prepareStatement("SELECT * FROM departments "
//                    + "WHERE id=?");
//            ps.setInt(1, id);
//            ResultSet rs = ps.executeQuery();
//            while (rs.next()) {
//                department.setId(rs.getInt("id"));
//                department.setTitle(rs.getString("title"));
//                department.setLocation(rs.getString("location"));
//            }
//        } catch (SQLException ex) {
//            Logger.getLogger(DepartmentDaoImpl.class.getName()).log(Level.SEVERE, null, ex);
//        }
//        return department;
//    }
//
//    @Override
//    public Department findByTitle(String title) {
//        Department department = new Department();
//        try {
//            PreparedStatement ps = ConnectionUtils.getConnection().prepareStatement("SELECT * FROM departments "
//                    + "WHERE title=?");
//            ps.setString(1, title);
//            ResultSet rs = ps.executeQuery();
//            rs.next();
//            department.setId(rs.getInt("id"));
//            department.setTitle(rs.getString("title"));
//            department.setLocation(rs.getString("location"));
//        } catch (SQLException ex) {
//            Logger.getLogger(DepartmentDaoImpl.class.getName()).log(Level.SEVERE, null, ex);
//        }
//        return department;
//    }
//}