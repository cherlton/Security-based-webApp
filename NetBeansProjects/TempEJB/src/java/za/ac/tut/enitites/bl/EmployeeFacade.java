/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package za.ac.tut.enitites.bl;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import za.ac.tut.enitites.Employee;

/**
 *
 * @author Student
 */
@Stateless
public class EmployeeFacade extends AbstractFacade<Employee> implements EmployeeFacadeLocal {

    @PersistenceContext(unitName = "TempEJBPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public EmployeeFacade() {
        super(Employee.class);
    }

    @Override
    public Long numOfHighTemp() {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    Query qr=em.createQuery("SELECT COUNT(e) FROM Employee e WHERE e.temp>38");
    Long numHigh=(Long)qr.getSingleResult();
    return numHigh;
    }

    @Override
    public Long numOfLowTemp() {
       // throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
       Query qr=em.createQuery("SELECT COUNT(e) FROM Employee e  WHERE e.temp<38");
    Long numLow=(Long)qr.getSingleResult();
    return numLow;
    }
    
}
