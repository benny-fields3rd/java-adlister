import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "CounterServlet", urlPatterns = "/count")
public class CounterServlet extends HttpServlet {
    protected void doPost( HttpServletRequest request, HttpServletResponse response ) throws ServletException, IOException {
    }

    private int count = 0;
    // Create a page that displays "Hello World!" when a user visits /hello
    protected void doGet( HttpServletRequest request, HttpServletResponse response ) throws ServletException, IOException {
        System.out.println("You will see this in the console.");
        String reset = request.getParameter("reset");
        if (reset != null) {
            count = 0;
        }
        count++;
        response.getWriter().printf("<h1>Page viewed %d times.</h1>", count);
    }
}
