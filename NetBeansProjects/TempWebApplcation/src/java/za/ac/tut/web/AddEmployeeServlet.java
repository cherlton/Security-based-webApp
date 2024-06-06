/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package za.ac.tut.web;

import java.io.IOException;
import java.io.PrintWriter;
import javax.ejb.EJB;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import za.ac.tut.enitites.Employee;
import za.ac.tut.enitites.bl.EmployeeFacadeLocal;

/**
 *
 * @author Student
 */
public class AddEmployeeServlet extends HttpServlet {

   @EJB
   private EmployeeFacadeLocal efl;
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
       String name=request.getParameter("name");
       Long id=Long.parseLong(request.getParameter("id"));
       double temp=Double.parseDouble(request.getParameter("temp"));
       Employee em=createEmployee(name,id,temp);
       efl.create(em);
        RequestDispatcher disp=request.getRequestDispatcher("adddOutcome.jsp");
        disp.forward(request, response);
    }

    private Employee createEmployee(String name, Long id, double temp) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    Employee em=new Employee();
    em.setId(id);
    em.setNme(name);
    em.setTemp(temp);;
    return em;
    }

 
}
