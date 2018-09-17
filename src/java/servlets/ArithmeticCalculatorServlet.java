package servlets;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author 659159
 */
public class ArithmeticCalculatorServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        request.setAttribute("answer", "---");
        getServletContext().getRequestDispatcher("/WEB-INF/arithmeticcalculator.jsp").forward(request, response);

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        String first = request.getParameter("first");
        String second = request.getParameter("second");
        String symbols = request.getParameter("mathsym");

        if (first == null || first.equals("") || second == null || second.equals("")) {
            request.setAttribute("answer", "Invalid");
            request.setAttribute("first", first);
            request.setAttribute("second", second);
            getServletContext().getRequestDispatcher("/WEB-INF/arithmeticcalculator.jsp").forward(request, response);

            return;
        }
        int firstValue, secondValue;
        try {
            firstValue = Integer.parseInt(first);
            secondValue = Integer.parseInt(second);
        } catch (NumberFormatException e) {
            request.setAttribute("answer", "Invalid");
            getServletContext().getRequestDispatcher("/WEB-INF/arithmeticcalculator.jsp").forward(request, response);
            return;
        }

        if (symbols.equals("+")) {

            int result = firstValue + secondValue;

            request.setAttribute("answer", result);

        }

        if (symbols.equals("-")) {

            int result = firstValue - secondValue;

            request.setAttribute("answer", result);

        }
        if (symbols.equals("*")) {

            int result = firstValue * secondValue;

            request.setAttribute("answer", result);

        }

        if (symbols.equals("%")) {

            int result = firstValue % secondValue;

            request.setAttribute("answer", result);

        }

        getServletContext().getRequestDispatcher("/WEB-INF/arithmeticcalculator.jsp").forward(request, response);
    }

}
