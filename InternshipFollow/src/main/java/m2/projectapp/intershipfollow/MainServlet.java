package m2.projectapp.intershipfollow;

import java.io.*;

import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;

@WebServlet(name = "main", value = "/servletMain")
public class MainServlet extends HttpServlet {
    private String h1;
    private String boxStyle;
    private String title;
    private String bkstyle;

    public void init() {
        title = "MainPage";
        h1 = "Main page";
        boxStyle = ".Box {" + "width: 1600px;" + "height: 800px;" + "padding: 40px;" +
                "position: absolute;" + "top: 50%;" + "left: 50%;" + "transform: translate(-50%, -50%);" +
                "animation: animated-border 1.5s infinite;" + "border: 1px solid;" + "border-radius: 1px;" +
                "padding: 15px;" + "background-color: white;" + "background-size: cover;" +
                "background-attachment: fixed;" + "}";
        bkstyle = ".bk {" + "width: 100%;" + "height: 100%;" + "position: absolute;" +
                "left: 0;" + "top: 0;" + "z-index: -1;" + "}";
    }

    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        response.setContentType("text/html");

        // Main Page
        PrintWriter out = response.getWriter();
        out.println("");
        out.println("<html>");
        out.println("<head>");
        out.println("<style>");
        out.println(boxStyle + bkstyle);
        out.println("</style>");
        out.println("<script>");

        out.println("</script>");
        out.println("<title>" + title + "</title>");
        out.println("</head>");
        out.println("<body>");
        out.println("<img class='bk' src='https://s2.loli.net/2023/02/16/ihXefda8mjFJ6Gk.jpg'/>");
        out.println("<div class='Box'>");
        out.println("<h1>" + h1 + "</h1>");
        out.println("</div>");
        out.println("</body></html>");
    }

    public void destroy() {
    }
}