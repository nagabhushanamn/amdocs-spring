package com.bank.web;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.context.WebApplicationContext;
import org.springframework.web.context.support.WebApplicationContextUtils;

import com.bank.service.TxrService;

/**
 * Servlet implementation class TxrController
 */
@WebServlet(urlPatterns = { "/txr" })
public class TxrController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		// Input
		String amount = request.getParameter("amount");
		String fromAccNum = request.getParameter("fromAccNum");
		String toAccNum = request.getParameter("toAccNum");

		// process
		WebApplicationContext context = WebApplicationContextUtils
				.getRequiredWebApplicationContext(getServletContext());
		TxrService txrService = context.getBean("txrService", TxrService.class);
		boolean b = txrService.txr(Double.parseDouble(amount), fromAccNum, toAccNum);

		// output
		request.getRequestDispatcher("/WEB-INF/txr-status.jsp").forward(request, response);

	}

}
