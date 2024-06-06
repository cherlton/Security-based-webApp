/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package za.ac.tut.enitites.bl;

import java.util.List;
import javax.ejb.Local;
import za.ac.tut.enitites.Employee;

/**
 *
 * @author Student
 */
@Local
public interface EmployeeFacadeLocal {

    void create(Employee employee);

    void edit(Employee employee);
    Long numOfHighTemp();
    Long numOfLowTemp();
    void remove(Employee employee);

    Employee find(Object id);

    List<Employee> findAll();

    List<Employee> findRange(int[] range);

    int count();
    
}
