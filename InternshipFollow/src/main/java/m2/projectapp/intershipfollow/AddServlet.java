package m2.projectapp.intershipfollow;

import java.io.*;

import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;

@WebServlet(name = "add", value = "/servletAdd")
public class AddServlet extends HttpServlet{
    private String title, bk, Box, headLine, headImg, sonBox, btnStyle, btnStyleHover,
            listBtn, listBtnInline, sonHeadLine, CardSonBox, CardSonBoxSpan,
            CardSonBoxInput, CardSonBoxTextarea;

    public void init() {
        title = "Add Page";
        bk = ".bk {\n" +
                "    width: 100%;\n" +
                "    height: 100%;\n" +
                "    position: absolute;\n" +
                "    left: 0;\n" +
                "    top: 0;\n" +
                "    z-index: -1;\n" +
                "}";
        Box = ".Box {\n" +
                "    width: 1200px;\n" +
                "    height: 800px;\n" +
                "    padding: 40px;\n" +
                "    position: absolute;\n" +
                "    top: 50%;\n" +
                "    left: 50%;\n" +
                "    transform: translate(-50%, -50%);\n" +
                "    animation: animated-border 1.5s infinite;\n" +
                "    border: 1px solid;\n" +
                "    border-radius: 1px;\n" +
                "    padding: 15px;\n" +
                "    background-color: white;\n" +
                "    background-size: cover;\n" +
                "    background-attachment: fixed;\n" +
                "}\n";
        headLine = ".headLine {\n" +
                "    border: none;\n" +
                "    border-bottom: solid 0.5px;\n" +
                "    padding-bottom: 20px;\n" +
                "    padding-left: 16px;\n" +
                "}";
        headImg = ".headImg {\n" +
                "    position: absolute;\n" +
                "    top: 2%;\n" +
                "    left: 78%;\n" +
                "    max-width: 18%;\n" +
                "    height: auto;\n" +
                "}";
        sonBox = ".sonBox {\n" +
                "    position: relative;\n" +
                "    border: 0.5px dashed;\n" +
                "    border-radius: 1px;\n" +
                "    width: 1198px;\n" +
                "    height: 650px;\n" +
                "    overflow: auto;\n" +
                "}";
        btnStyle = ".btnStyle {\n" +
                "    display: inline-block;\n" +
                "    padding: 0.25rem 1rem;\n" +
                "    margin-left: 30px;\n" +
                "    font-size: 1rem;\n" +
                "    font-weight: bold;\n" +
                "    text-align: center;\n" +
                "    text-decoration: none;\n" +
                "    cursor: pointer;\n" +
                "    border-radius: 0.25rem;\n" +
                "    border: 2px solid #333;\n" +
                "    color: #333;\n" +
                "    background-color: transparent;\n" +
                "}";
        btnStyleHover = ".btnStyle:hover {\n" +
                "    color: #fff;\n" +
                "    background-color: #333;\n" +
                "}";
        listBtn = ".listBtn {\n" +
                "    position: absolute;\n" +
                "    top: 81.2%;\n" +
                "    left: 44%;\n" +
                "    margin-top: 8px;\n" +
                "}";
        listBtnInline = ".listBtnInline {\n" +
                "    display: inline-block;\n" +
                "}";
        sonHeadLine = ".sonHeadLine {\n" +
                "    text-align: center;\n" +
                "    border: none;\n" +
                "    border-bottom: 0.5px dashed;\n" +
                "    padding-bottom: 14px;\n" +
                "    margin-top: 12px;\n" +
                "}";
        CardSonBox = ".CardSonBox {\n" +
                "    border: none;\n" +
                "    border-bottom: 0.5px solid;\n" +
                "    padding: 20px 0px 20px 180px;\n" +
                "    display: flex;\n" +
                "}";
        CardSonBoxSpan = ".CardSonBox span {\n" +
                "    width: 220px;\n" +
                "    text-align: left;\n" +
                "    display: inline-block;\n" +
                "}";
        CardSonBoxInput = ".CardSonBox input {\n" +
                "    border: 0,5 solid;\n" +
                "    outline: none;\n" +
                "    width: 500px;\n" +
                "    font-size: 16px;\n" +
                "    display: inline-block;\n" +
                "    vertical-align: middle;\n" +
                "}";
        CardSonBoxTextarea = ".CardSonBox textarea {\n" +
                "    border: 0,5 solid;\n" +
                "    outline: none;\n" +
                "    width: 600px;\n" +
                "    height: 80px;\n" +
                "    font-size: 16px;\n" +
                "    display: inline-block;\n" +
                "    vertical-align: middle;\n" +
                "    resize: none;\n" +
                "}";
    }

    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        response.setContentType("text/html");

        // Add page
        PrintWriter out = response.getWriter();
        out.println("<html>");
        out.println("<head>");
        out.println("<style>");
        out.println(bk + Box + headImg + headLine + sonBox + btnStyle + btnStyleHover +
                listBtn + listBtnInline + sonHeadLine + CardSonBox + CardSonBoxSpan +
                CardSonBoxInput + CardSonBoxTextarea);
        out.println("</style>");
        out.println("<script>");
        out.println("</script>");
        out.println("<title>" + title + "</title>");
        out.println("</head>");
        out.println("<body>");
        out.println("<img class=\"bk\" src=\"https://s2.loli.net/2023/02/16/ihXefda8mjFJ6Gk.jpg\"/>\n" +
                "    <div class=\"Box\">\n" +
                "        <h1 class=\"headLine\">Add Page</h1>\n" +
                "        <img class=\"headImg\" src=\"https://s2.loli.net/2023/03/08/gaYrbk79TA8BOUX.png\">\n" +
                "        <div class=\"sonBox\">\n" +
                "            <h3 class=\"sonHeadLine\">Add new intern's information here !</h3>\n" +
                "            <div class=\"CardSonBox\">\n" +
                "                <span>ID number :</span>\n" +
                "                <input type=\"text\" value=\"\" name=\"idInput\"/>\n" +
                "            </div>\n" +
                "            <div class=\"CardSonBox\">\n" +
                "                <span>Name :</span>\n" +
                "                <input type=\"text\" value=\"\" name=\"nameInput\"/>\n" +
                "            </div>\n" +
                "            <div class=\"CardSonBox\">\n" +
                "                <span>Group :</span>\n" +
                "                <input type=\"text\" value=\"\" name=\"grpInput\"/>\n" +
                "            </div>\n" +
                "            <div class=\"CardSonBox\">\n" +
                "                <span>Start Date :</span>\n" +
                "                <input type=\"date\" value=\"\" name=\"startInput\"/>\n" +
                "            </div>\n" +
                "            <div class=\"CardSonBox\">\n" +
                "                <span>End Date :</span>\n" +
                "                <input type=\"date\" value=\"\" name=\"endInput\"/>\n" +
                "            </div>\n" +
                "            <div class=\"CardSonBox\">\n" +
                "                <span>Educational level :</span>\n" +
                "                <input type=\"text\" value=\"\" name=\"levelInput\"/>\n" +
                "            </div>\n" +
                "            <div class=\"CardSonBox\">\n" +
                "                <span>Educational institution :</span>\n" +
                "                <input type=\"text\" value=\"\" name=\"institutionInput\"/>\n" +
                "            </div>\n" +
                "            <div class=\"CardSonBox\">\n" +
                "                <span>Major :</span>\n" +
                "                <input type=\"text\" value=\"\" name=\"majorInput\"/>\n" +
                "            </div>\n" +
                "            <div class=\"CardSonBox\">\n" +
                "                <span>Intern's address :</span>\n" +
                "                <textarea id=\"adsStr\" value=\"\" name=\"addressText\"></textarea>\n" +
                "            </div>\n" +
                "        </div>\n" +
                "    </div>\n" +
                "    <div class=\"listBtn\">\n" +
                "        <div class=\"listBtnInline\">\n" +
                "            <button class=\"btnStyle\" type=\"button\" onclick=\"window.location.href='servletMain'\">Return</button>\n" +
                "        </div>\n" +
                "        <div class=\"listBtnInline\">\n" +
                "            <form action=\"servletMain\" method=\"get\">\n" +
                "                <input class=\"btnStyle\" type=\"submit\" value=\"Validate\" name=\"valBtn\"/>\n" +
                "            </form>\n" +
                "        </div>\n" +
                "    </div>");
        out.println("</body></html>");
    }

    public void destroy() {
    }
}
