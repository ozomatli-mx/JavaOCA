//package mx.com.hittechs.controller.dao.impl;
//
//import java.sql.PreparedStatement;
//import java.sql.ResultSet;
//import java.sql.SQLException;
//import java.sql.Statement;
//import java.util.ArrayList;
//import java.util.List;
//import java.util.logging.Level;
//import java.util.logging.Logger;
//import mx.com.hittechs.dao.JobDao;
//import mx.com.hittechs.dao.utils.ConnectionUtils;
//import mx.com.hittechs.model.Job;
//
///**
// *
// * @author Hittechs Training & Consulting
// * @web www.hittechs.com.mx
// * @main contacto@hittechs.com.mx
// */
//public class JobDaoImpl implements JobDao {
//
//    @Override
//    public void create(Job job) {
//        try {
//            String insert = "INSERT INTO jobs"
//                    + "(title, min_salary, max_salary) VALUES"
//                    + "(?,?,?)";
//            PreparedStatement ps = ConnectionUtils.getConnection().prepareStatement(insert);
//            ps.setString(1, job.getTitle());
//            ps.setDouble(2, job.getMinSalary());
//            ps.setDouble(3, job.getMaxSalary());
//            ps.executeLargeUpdate();
//        } catch (SQLException ex) {
//            Logger.getLogger(JobDaoImpl.class.getName()).log(Level.SEVERE, null, ex);
//        }
//    }
//
//    @Override
//    public void edit(Job job) {
//        try {
//            String insert = "UPDATE jobs "
//                    + "SET title=?, min_salary=?, max_salary=? "
//                    + "WHERE id =?";
//            PreparedStatement ps = ConnectionUtils.getConnection().prepareStatement(insert);
//            ps.setString(1, job.getTitle());
//            ps.setDouble(2, job.getMinSalary());
//            ps.setDouble(3, job.getMaxSalary());
//            ps.setInt(4, job.getId());
//            ps.executeLargeUpdate();
//        } catch (SQLException ex) {
//            Logger.getLogger(JobDaoImpl.class.getName()).log(Level.SEVERE, null, ex);
//        }
//    }
//
//    @Override
//    public void remove(Job job) {
//        try {
//            String insert = "DELETE FROM jobs WHERE id =?";
//            PreparedStatement ps = ConnectionUtils.getConnection().prepareStatement(insert);
//            ps.setInt(1, job.getId());
//            ps.executeLargeUpdate();
//        } catch (SQLException ex) {
//            Logger.getLogger(JobDaoImpl.class.getName()).log(Level.SEVERE, null, ex);
//        }
//    }
//
//    @Override
//    public List<Job> findAll() {
//        List<Job> jobs = new ArrayList<>();
//        try {
//            Statement statement = ConnectionUtils.getConnection().createStatement();
//            ResultSet rs = statement.executeQuery("SELECT * FROM jobs");
//
//            while (rs.next()) {
//                Job job = new Job();
//                job.setId(rs.getInt("id"));
//                job.setTitle(rs.getString("title"));
//                job.setMinSalary(rs.getDouble("min_salary"));
//                job.setMinSalary(rs.getDouble("min_salary"));
//                jobs.add(job);
//            }
//        } catch (SQLException ex) {
//            Logger.getLogger(JobDaoImpl.class.getName()).log(Level.SEVERE, null, ex);
//        }
//        return jobs;
//    }
//
//    @Override
//    public Job findById(int id) {
//        Job job = new Job();
//        try {
//            PreparedStatement ps = ConnectionUtils.getConnection().prepareStatement("SELECT * FROM jobs "
//                    + "WHERE id=?");
//            ps.setInt(1, id);
//            ResultSet rs = ps.executeQuery();
//            while (rs.next()) {
//                job.setId(rs.getInt("id"));
//                job.setTitle(rs.getString("title"));
//                job.setMinSalary(rs.getDouble("min_salary"));
//                job.setMaxSalary(rs.getDouble("max_salary"));
//            }
//        } catch (SQLException ex) {
//            Logger.getLogger(JobDaoImpl.class.getName()).log(Level.SEVERE, null, ex);
//        }
//        return job;
//    }
//
//    @Override
//    public Job findByTitle(String title) {
//        Job job = new Job();
//        try {
//            PreparedStatement ps = ConnectionUtils.getConnection().prepareStatement("SELECT * FROM jobs "
//                    + "WHERE title=?");
//            ps.setString(1, title);
//            ResultSet rs = ps.executeQuery();
//            rs.next();
//            job.setId(rs.getInt("id"));
//            job.setTitle(rs.getString("title"));
//            job.setMinSalary(rs.getDouble("min_salary"));
//            job.setMaxSalary(rs.getDouble("max_salary"));
//        } catch (SQLException ex) {
//            Logger.getLogger(JobDaoImpl.class.getName()).log(Level.SEVERE, null, ex);
//        }
//        return job;
//    }
//}
