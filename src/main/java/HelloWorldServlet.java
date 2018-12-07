import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "HelloWorldServlet", urlPatterns = "/hello")
public class HelloWorldServlet extends HttpServlet {
    @Override
    protected void doGet( HttpServletRequest req, HttpServletResponse resp ) throws ServletException, IOException {
        System.out.println("You will see this in the console");
//        resp.getWriter().println("<h1>Hello World!</h1>");

        PrintWriter out = resp.getWriter();

        String name = req.getParameter("name");

        if (name == null) {
            name = "World";
        }
            out.printf("<h1>Hello %s!</h1>", name);
    }
}
