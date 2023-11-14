import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

@WebServlet("/start")
public class StartServlet extends HttpServlet {

    public static final int Health=3;

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        HttpSession session=req.getSession();

        if(session.getAttribute("visited")==null)
        {
            session.setAttribute("visited",true);
            session.setAttribute("health",Health);
            session.setAttribute("win",false);
        }
        session.getServletContext().getRequestDispatcher("/index.jsp").forward(req,resp);




    }
}
