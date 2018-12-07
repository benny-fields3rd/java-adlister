import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "CounterServlet", urlPatterns = "/counter")
public class CounterServlet extends HttpServlet {
    protected void doPost( HttpServletRequest request, HttpServletResponse response ) throws ServletException, IOException {
    }

    public static int count = 1;

    protected void doGet( HttpServletRequest request, HttpServletResponse response ) throws ServletException, IOException {
        System.out.println("You will see this in the console");
        response.getWriter().println(count);
        count++;
    }
}
