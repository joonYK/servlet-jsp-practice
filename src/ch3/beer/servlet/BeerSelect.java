package ch3.beer.servlet;

import ch3.beer.model.BeerExpert;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

public class BeerSelect extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String color = req.getParameter("color");
        BeerExpert be = new BeerExpert();
        List<String> brands = be.getBrands(color);

        req.setAttribute("brands", brands);
        RequestDispatcher view = req.getRequestDispatcher("ch3/beer/advisorResult.jsp");
        view.forward(req, resp);
    }
}
