package servlets;

import java.io.*;
import javax.servlet.http.*;
import javax.servlet.ServletException;

/**
 *
 * @author Sooeun Kim 817949
 */
public class AgeCalculatorServlet extends HttpServlet {
     @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        getServletContext().getRequestDispatcher("/WEB-INF/ageCalculator.jsp").forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String ageinput = request.getParameter("age_input");
        
        if (ageinput == null || ageinput.equals("")) {
            request.setAttribute("validInput", false);
            getServletContext().getRequestDispatcher("/WEB-INF/ageCalculator.jsp").forward(request, response);
            return;
         } else {
            int parsedAgeInput = Integer.parseInt(ageinput);
            parsedAgeInput = Integer.parseInt(ageinput);
            parsedAgeInput++;
            request.setAttribute("validInput", true);
            request.setAttribute("ageInput", parsedAgeInput);
            getServletContext().getRequestDispatcher("/WEB-INF/ageCalculator.jsp").forward(request, response); 
        }
    }
}
