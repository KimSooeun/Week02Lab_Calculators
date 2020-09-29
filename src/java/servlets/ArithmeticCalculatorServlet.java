package servlets;

import java.io.*;
import javax.servlet.http.*;
import javax.servlet.ServletException;

/**
 * @author Sooeun Kim 817949
 */
public class ArithmeticCalculatorServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        request.setAttribute("noCalculation", true);
        getServletContext().getRequestDispatcher("/WEB-INF/arithmeticCalculator.jsp").forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String inputone = request.getParameter("number_input1");
        String inputtwo = request.getParameter("number_input2");
        String buttonValue = request.getParameter("calculate_button");
        
        request.setAttribute("firstNumber", inputone);
        request.setAttribute("secondNumber", inputtwo);
        
        if (inputone == null || inputone.equals("") || inputtwo == null || inputtwo.equals("")) {
            request.setAttribute("validInput", false);
            getServletContext().getRequestDispatcher("/WEB-INF/arithmeticCalculator.jsp").forward(request, response);
         } else {
            int parsedNumberOne = Integer.parseInt(inputone);
            int parsedNumberTwo = Integer.parseInt(inputtwo);
            int calculatedNum = 0;
            
            switch (buttonValue) {
                case "plus":
                    calculatedNum = parsedNumberOne + parsedNumberTwo;
                    break;
                case "minus":
                    calculatedNum = parsedNumberOne - parsedNumberTwo;
                    break;
                case "multiply":
                    calculatedNum = parsedNumberOne * parsedNumberTwo;
                    break;
                case "modulus":
                    if(parsedNumberTwo == 0) {
                        request.setAttribute("validInput", false);
                        getServletContext().getRequestDispatcher("/WEB-INF/arithmeticCalculator.jsp").forward(request, response);
                    }
                    calculatedNum = parsedNumberOne % parsedNumberTwo;
                    break;
            }
            request.setAttribute("validInput", true);
            request.setAttribute("calculatedOutput", calculatedNum);
            getServletContext().getRequestDispatcher("/WEB-INF/arithmeticCalculator.jsp").forward(request, response); 
        }
    }
}