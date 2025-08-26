package Servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import daoImpl.AddCarDaoImpl;
import model.Car;


@WebServlet("/CRUDApplicationServlet")
public class CRUDApplicationServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

    public CRUDApplicationServlet() {
    }

	
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        try {
        
        int carEngineNumber = Integer.parseInt(request.getParameter("engineNumber"));
        String carName = request.getParameter("name");
        String carModel = request.getParameter("model");
        String carColor = request.getParameter("color");
        String carType = request.getParameter("bodyType");
        String carCompany = request.getParameter("company");
        
        Car car = new Car();
        car.setCarEngineNumber(carEngineNumber);
        car.setName(carName);
        car.setModel(carModel);
        car.setColor(carColor);
        car.setBodyType(carType);
        car.setCompany(carCompany);
        
        AddCarDaoImpl addCarDao = new AddCarDaoImpl();
        addCarDao.addCar(car);  

        out.println("<h2>Record added successfully!</h2>");

    } catch (Exception e) {
        e.printStackTrace(out);
        out.println("<h2>Error while adding Record: " + e.getMessage() + "</h2>");
    }
}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
