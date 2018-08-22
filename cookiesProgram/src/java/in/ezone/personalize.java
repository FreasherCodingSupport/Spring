
package in.ezone;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet(name = "personalize", urlPatterns = {"/per"})
public class personalize extends HttpServlet {
    protected void sevice(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            String ch = request.getParameter("interest");
            Cookie c = new Cookie ("cNews",ch);
            c.setMaxAge(60);//in seconds
            responce.addCookie(c);
            responce.SendRedirect("News");//news  servelet
        }
    }
}
