package front.declencheur;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import front.elastic.services.StatsDynamique;

/**
 * Servlet implementation class Declancheur
 */
public class Declencheur extends HttpServlet {
	private static final long serialVersionUID = 1L;

    /**
     * Default constructor. 
     */
    public Declencheur() {
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		System.out.println("Je suis coté back :)");
		
		// apeller ta méthode
		StatsDynamique instanceStats = new StatsDynamique();
		instanceStats.simulation();
		
		response.getWriter().append("Servlet ").append(request.getContextPath());
	}



}
