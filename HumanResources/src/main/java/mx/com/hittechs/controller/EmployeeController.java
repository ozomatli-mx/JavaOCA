package mx.com.hittechs.controller;

//import java.time.LocalDate;
//import java.util.Calendar;
//import java.util.List;
//import javax.swing.ComboBoxModel;
//import javax.swing.DefaultComboBoxModel;
//import javax.swing.table.DefaultTableModel;
//import javax.swing.table.TableModel;
//import mx.com.hittechs.dao.DepartmentDao;
//import mx.com.hittechs.dao.EmployeeDao;
//import mx.com.hittechs.dao.JobDao;
//import mx.com.hittechs.dao.impl.DepartmentDaoImpl;
//import mx.com.hittechs.dao.impl.EmployeeDaoImpl;
//import mx.com.hittechs.dao.impl.JobDaoImpl;
//import mx.com.hittechs.model.Department;
//import mx.com.hittechs.model.Employee;
//import mx.com.hittechs.model.Job;
//import mx.com.hittechs.view.EmployeeView;
//
///**
// *
// * @author Hittechs Training & Consulting
// * @web www.hittechs.com.mx
// * @main contacto@hittechs.com.mx
// */
//public class EmployeeController {
//
//    EmployeeDao employeeDao = new EmployeeDaoImpl();
//    DepartmentDao departmentDao = new DepartmentDaoImpl();
//    JobDao jobDao = new JobDaoImpl();
//    EmployeeView view;
//
//    public EmployeeController(EmployeeView view) {
//        this.view = view;
//    }
//
//    public void save() {
//        Employee employee = new Employee();
//        Department department;
//        Job job;
//        int year;
//        int month;
//        int date;
//        int row;
//
//        employee.setId(Integer.parseInt(view.id.getText()));
//        employee.setFirstName(view.firstName.getText());
//        employee.setLastName(view.lastName.getText());
//        employee.setAge(Integer.parseInt(view.age.getText()));
//        employee.setEmail(view.email.getText());
//        employee.setPhoneNumber(view.phoneNumber.getText());
//        
//        department = departmentDao.findByTitle(view.departments.getSelectedItem().toString());
//        employee.setDepartment(department);
//        
//        job = jobDao.findByTitle(view.job.getSelectedItem().toString());
//        employee.setJob(job);
//        
//        employee.setSalary(Double.parseDouble(view.salary.getText()));
//        year = view.hireDate.getCalendar().get((Calendar.YEAR));
//        month = view.hireDate.getCalendar().get((Calendar.MONTH));
//        date = view.hireDate.getCalendar().get((Calendar.DATE));
//        employee.setHireDate(LocalDate.of(year, ++month, date));
//               
//        if (employee.getId() == -1) {
//            employeeDao.create(employee);
//            view.employees.setModel(findAllEmployees());
//            view.employees.changeSelection(view.employees.getRowCount() - 1, 0, false, false);
//            clear(false);
//        } else {
//            employeeDao.edit(employee);
//            row = view.employees.getSelectedRow();
//            view.employees.setModel(findAllEmployees());
//            view.employees.changeSelection(row, 0, false, false);
//        }
//    }
//
//    public TableModel findAllEmployees() {
//        DefaultTableModel tableModel = new DefaultTableModel();
//        String[] columnNames = {
//            "Id",
//            "First Name",
//            "Last Name",
//            "Age",
//            "Email",
//            "Phone Number",
//            "Salary",
//            "Hire Date",
//            "Department",
//            "Job"
//        };
//        tableModel.setColumnIdentifiers(columnNames);
//        List<Employee> employees = employeeDao.findAll();
//        for (Employee employee : employees) {
//            Object[] object = new Object[10];
//            object[0] = employee.getId();
//            object[1] = employee.getFirstName();
//            object[2] = employee.getLastName();
//            object[3] = employee.getAge();
//            object[4] = employee.getEmail();
//            object[5] = employee.getPhoneNumber();
//            object[6] = employee.getSalary();
//            object[7] = employee.getHireDate().toString();
//            if (employee.getDepartment() != null) {
//                object[8] = employee.getDepartment().getTitle();
//            } else {
//                object[8] = "";
//            }
//            if (employee.getJob() != null) {
//                object[9] = employee.getJob().getTitle();
//            } else {
//                object[9] = "";
//            }
//            tableModel.addRow(object);
//        }
//        return tableModel;
//    }
//
//    public void selectRow() {
//        Employee employee = getSelectedEmployee();
//        view.id.setText(Integer.toString(employee.getId()));
//        view.firstName.setText(employee.getFirstName());
//        view.lastName.setText(employee.getLastName());
//        view.age.setText(Integer.toString(employee.getAge()));
//        view.email.setText(employee.getEmail());
//        view.phoneNumber.setText(employee.getPhoneNumber());
//        view.salary.setText(Double.toString(employee.getSalary()));
//        Calendar hireDate = Calendar.getInstance();
//        LocalDate date = LocalDate.parse(employee.getHireDate().toString());
//        hireDate.set(date.getYear(), date.getMonthValue() - 1, date.getDayOfMonth());
//        view.hireDate.setCalendar(hireDate);
//        view.remove.setEnabled(true);
//        view.clear.setEnabled(true);
//    }
//
//    public ComboBoxModel findAllDepartments() {
//        List<Department> departments = departmentDao.findAll();
//        DefaultComboBoxModel model = new DefaultComboBoxModel();
//
//        for (Department department : departments) {
//            model.addElement(department.getTitle());
//        }
//        return model;
//    }
//
//    public ComboBoxModel findAllJobs() {
//        List<Job> jobs = jobDao.findAll();
//        DefaultComboBoxModel model = new DefaultComboBoxModel();
//
//        for (Job job : jobs) {
//            model.addElement(job.getTitle());
//        }
//        return model;
//    }
//
//    public Employee getSelectedEmployee() {
//        int row = view.employees.getSelectedRow();
//        LocalDate date;
//        Employee employee = new Employee();
//
//        employee.setId(Integer.parseInt(view.employees.getModel().getValueAt(row, 0).toString()));
//        employee.setFirstName(view.employees.getModel().getValueAt(row, 1).toString());
//        employee.setLastName(view.employees.getModel().getValueAt(row, 2).toString());
//        employee.setAge(Integer.parseInt(view.employees.getModel().getValueAt(row, 3).toString()));
//        employee.setEmail(view.employees.getModel().getValueAt(row, 4).toString());
//        employee.setPhoneNumber(view.employees.getModel().getValueAt(row, 5).toString());
//        employee.setSalary(Double.parseDouble(view.employees.getModel().getValueAt(row, 6).toString()));
//        date = LocalDate.parse(view.employees.getModel().getValueAt(row, 7).toString());
//        employee.setHireDate(date);
//        return employee;
//    }
//
//    public void remove() {
//        employeeDao.remove(getSelectedEmployee());
//        view.employees.setModel(findAllEmployees());
//        clear(true);
//    }
//
//    public void clear(boolean clearSelection) {
//        view.id.setText("-1");
//        view.firstName.setText("");
//        view.lastName.setText("");
//        view.age.setText("");
//        view.email.setText("");
//        view.phoneNumber.setText("");
//        view.salary.setText("");
//        view.hireDate.setCalendar(null);
//        if (clearSelection) {
//            view.remove.setEnabled(false);
//            view.clear.setEnabled(false);
//            view.employees.clearSelection();
//        } else {
//            view.remove.setEnabled(true);
//            view.clear.setEnabled(true);
//        }
//    }
//}
