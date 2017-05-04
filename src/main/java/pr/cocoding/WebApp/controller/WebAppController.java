package pr.cocoding.WebApp.controller;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import pr.cocoding.WebApp.DAO.EmployeeJDBCTemplate;
import pr.cocoding.WebApp.model.Employee;
import pr.cocoding.WebApp.model.Message;

import org.springframework.ui.ModelMap;

@Controller
public class WebAppController{
 
    @RequestMapping("/hello")
    public ModelAndView printHello(ModelMap model) {
    	ApplicationContext context = new ClassPathXmlApplicationContext("Beans.xml");
	    EmployeeJDBCTemplate employeeJDBCTemplate = (EmployeeJDBCTemplate) context.getBean("employeeJDBCTemplate");
    	Employee employee = employeeJDBCTemplate.getEmployee(100);
	    
	    String content = "Employee no. 100 is "+employee.getFirst()+" "+employee.getLast()+", age "+employee.getAge();
        return new ModelAndView("helloPage", "message", content);
    }
}
   
