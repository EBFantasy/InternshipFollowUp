package m2.projectapp.intershipfollow;

import java.io.*;

import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;

@WebServlet(name = "detail", value = "/servletDetail")
public class DetailServlet extends HttpServlet {
    private String title, bk, Box, headLine, headImg, sonBox1, sonBox2, sonBox3, sonHeadLine, avatar,
            CardSonBox1, CardSonBox1Span, CardSonBox1Input, etrLogo, CardSonBox2, CardSonBox2Span,
            CardSonBox2Input, CardSonBox2Textarea, CardSonBox3, CardSonBox3Span, CardSonBox3Textarea,
            btnStyle, btnStyleHover, listBtn, listBtnInline;

    public void init() {
        title = "Detail Page";
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
                "}";
        headLine = ".headLine {\n" +
                "    border: none;\n" +
                "    border-bottom: solid 0.5px;\n" +
                "    padding-bottom: 20px;\n" +
                "    padding-left: 16px;\n" +
                "}\n";
        headImg = ".headImg {\n" +
                "    position: absolute;\n" +
                "    top: 2%;\n" +
                "    left: 78%;\n" +
                "    max-width: 18%;\n" +
                "    height: auto;\n" +
                "}";
        sonBox1 = ".sonBox1 {\n" +
                "    position: absolute;\n" +
                "    top: 13.5%;\n" +
                "    left: 1.5%;\n" +
                "    border: 0.5px dashed;\n" +
                "    border-radius: 1px;\n" +
                "    width: 500px;\n" +
                "    height: 340px;\n" +
                "    overflow: auto;\n" +
                "}";
        sonBox2 = ".sonBox2 {\n" +
                "    position: absolute;\n" +
                "    top: 13.5%;\n" +
                "    left: 45%;\n" +
                "    border: 0.5px dashed;\n" +
                "    border-radius: 1px;\n" +
                "    width: 655px;\n" +
                "    height: 340px;\n" +
                "    overflow: auto;\n" +
                "}";
        sonBox3 = ".sonBox3 {\n" +
                "    position: absolute;\n" +
                "    top: 56.5%;\n" +
                "    left: 1.5%;\n" +
                "    border: 0.5px dashed;\n" +
                "    border-radius: 1px;\n" +
                "    width: 1191px;\n" +
                "    height: 300px;\n" +
                "    overflow: auto;\n" +
                "}";
        sonHeadLine = ".sonHeadLine {\n" +
                "    text-align: center;\n" +
                "    border: none;\n" +
                "    border-bottom: 1px solid;\n" +
                "    padding-bottom: 6px;\n" +
                "    margin-top: 4px;\n" +
                "}";
        avatar = ".avatar {\n" +
                "    width: 100px;\n" +
                "    height: 100px;\n" +
                "    display: block;\n" +
                "    margin: 0 auto;\n" +
                "    border-radius: 50%;\n" +
                "    padding-bottom: 15px ;\n" +
                "}";
        CardSonBox1 = ".CardSonBox1 {\n" +
                "    border: none;\n" +
                "    border-top: 0.5px solid;\n" +
                "    padding: 8px 0px 10px 30px;\n" +
                "    display: flex;\n" +
                "}";
        CardSonBox1Span = ".CardSonBox1 span {\n" +
                "    width: 100px;\n" +
                "    text-align: left;\n" +
                "    display: inline-block;\n" +
                "}";
        CardSonBox1Input = ".CardSonBox1 input {\n" +
                "    border: 0,5 solid;\n" +
                "    outline: none;\n" +
                "    width: 300px;\n" +
                "    font-size: 16px;\n" +
                "    display: inline-block;\n" +
                "    vertical-align: middle;\n" +
                "}";
        etrLogo = ".etrLogo {\n" +
                "    max-width: 30%;\n" +
                "    height: auto;\n" +
                "    display: block;\n" +
                "    margin: 0 auto;\n" +
                "    padding-bottom: 15px ;\n" +
                "}";
        CardSonBox2 = ".CardSonBox2 {\n" +
                "    border: none;\n" +
                "    border-top: 0.5px solid;\n" +
                "    padding: 8px 0px 10px 80px;\n" +
                "    display: flex;\n" +
                "}";
        CardSonBox2Span = ".CardSonBox2 span {\n" +
                "    width: 100px;\n" +
                "    text-align: left;\n" +
                "    margin-right: 50px;\n" +
                "    display: inline-block;\n" +
                "}";
        CardSonBox2Input = ".CardSonBox2 input {\n" +
                "    border: 0,5 solid;\n" +
                "    outline: none;\n" +
                "    width: 300px;\n" +
                "    font-size: 16px;\n" +
                "    display: inline-block;\n" +
                "    vertical-align: middle;\n" +
                "}\n";
        CardSonBox2Textarea = ".CardSonBox2 textarea {\n" +
                "    border: 0,5 solid;\n" +
                "    outline: none;\n" +
                "    width: 300px;\n" +
                "    height: 80px;\n" +
                "    font-size: 16px;\n" +
                "    display: inline-block;\n" +
                "    vertical-align: middle;\n" +
                "    resize: none;\n" +
                "}\n";
        CardSonBox3 = ".CardSonBox3 {\n" +
                "    border: none;\n" +
                "    border-top: 0.5px solid;\n" +
                "    padding: 8px 0px 10px 100px;\n" +
                "    display: flex;\n" +
                "}";
        CardSonBox3Span = ".CardSonBox3 span {\n" +
                "    width: 100px;\n" +
                "    text-align: left;\n" +
                "    display: inline-block;\n" +
                "    margin-right: 100px;\n" +
                "}";
        CardSonBox3Textarea = ".CardSonBox3 textarea {\n" +
                "    border: 0,5 solid;\n" +
                "    outline: none;\n" +
                "    width: 700px;\n" +
                "    height: 80px;\n" +
                "    font-size: 16px;\n" +
                "    display: inline-block;\n" +
                "    vertical-align: middle;\n" +
                "    resize: none;\n" +
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
                "    position: relative;\n" +
                "    top: 82.8%;\n" +
                "    left: 38.5%;\n" +
                "    margin-top: 8px;\n" +
                "}";
        listBtnInline = ".listBtnInline {\n" +
                "    display: inline-block;\n" +
                "}\n";
    }

    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        response.setContentType("text/html");

        // Detail page
        PrintWriter out = response.getWriter();
        out.println("<html>");
        out.println("<head>");
        out.println("<style>");
        out.println(bk + Box + headLine + headImg + sonBox1 + sonBox2 + sonBox3 + sonHeadLine +
                avatar + CardSonBox1 + CardSonBox1Span + CardSonBox1Input + etrLogo +
                CardSonBox2 + CardSonBox2Span + CardSonBox2Input + CardSonBox2Textarea +
                CardSonBox3 + CardSonBox3Span + CardSonBox3Textarea + btnStyle + btnStyleHover +
                listBtn + listBtnInline);
        out.println("</style>");
        out.println("<title>" + title + "</title>");
        out.println("</head>");
        out.println("<body>");
        out.println("<img class=\"bk\" src=\"https://s2.loli.net/2023/02/16/ihXefda8mjFJ6Gk.jpg\"/>\n" +
                "    <div class=\"Box\">\n" +
                "        <h1 class=\"headLine\">Detail Page</h1>\n" +
                "        <img class=\"headImg\" src=\"https://s2.loli.net/2023/03/08/gaYrbk79TA8BOUX.png\">\n" +
                "        <div class=\"sonBox1\">\n" +
                "            <h3 class=\"sonHeadLine\">Internship Information Card</h3>\n" +
                "            <img class=\"avatar\" id=\"avatarImg\" alt=\"avatar img\"/>\n" +
                "            <div class=\"CardSonBox1\">\n" +
                "                <span>ID number : </span>\n" +
                "                <input id=\"idNum\" type=\"text\" value=\"\" name=\"idInput\"/>\n" +
                "            </div>\n" +
                "            <div class=\"CardSonBox1\">\n" +
                "                <span>Name :</span>\n" +
                "                <input id=\"nameStr\" type=\"text\" value=\"\" name=\"nameInput\"/>\n" +
                "            </div>\n" +
                "            <div class=\"CardSonBox1\">\n" +
                "                <span>Group :</span>\n" +
                "                <input id=\"grpStr\" type=\"text\" value=\"\" name=\"groupInput\"/>\n" +
                "            </div>\n" +
                "        </div>\n" +
                "        <div class=\"sonBox2\">\n" +
                "            <h3 class=\"sonHeadLine\">Enterprise Details</h3>\n" +
                "            <img class=\"etrLogo\" id=\"etrImg\" alt=\"etr img\"/>\n" +
                "            <div class=\"CardSonBox2\">\n" +
                "                <span>Name :</span>\n" +
                "                <input id=\"etrStr\" type=\"text\" value=\"\" name=\"etrInput\"/>\n" +
                "            </div>\n" +
                "            <div class=\"CardSonBox2\">\n" +
                "                <span>Enterprise Address :</span>\n" +
                "                <textarea id=\"adsStr\" value=\"\" name=\"addressText\"></textarea>\n" +
                "            </div>\n" +
                "            <div class=\"CardSonBox2\">\n" +
                "                <span>Apprentice Leader :</span>\n" +
                "                <input id=\"leaderStr\" type=\"text\" value=\"\" name=\"leaderInput\"/>\n" +
                "            </div>\n" +
                "            <div class=\"CardSonBox2\">\n" +
                "                <span>Start date :</span>\n" +
                "                <input id=\"sTime\" type=\"date\" value=\"\" name=\"startInput\"/>\n" +
                "            </div>\n" +
                "            <div class=\"CardSonBox2\">\n" +
                "                <span>End date :</span>\n" +
                "                <input id=\"eTime\" type=\"date\" value=\"\" name=\"endInput\"/>\n" +
                "            </div>\n" +
                "        </div>\n" +
                "        <div class=\"sonBox3\">\n" +
                "            <h3 class=\"sonHeadLine\">Management of Projects</h3>\n" +
                "            <div class=\"CardSonBox3\">\n" +
                "                <span>Mission description :</span>\n" +
                "                <textarea id=\"msionStr\" value=\"\" name=\"descriptionText\"></textarea>\n" +
                "            </div>\n" +
                "            <div class=\"CardSonBox3\">\n" +
                "                <span>Comments :</span>\n" +
                "                <textarea id=\"commStr\" value=\"\" name=\"commentText\"></textarea>\n" +
                "            </div>\n" +
                "        </div>\n" +
                "        <div class=\"listBtn\">\n" +
                "            <div class=\"listBtnInline\">\n" +
                "                <button class=\"btnStyle\" type=\"button\" onclick=\"window.location.href='servletMain'\">Return</button>\n" +
                "            </div>\n" +
                "            <div class=\"listBtnInline\">\n" +
                "                <form action=\"servletMain\" method=\"get\">\n" +
                "                    <input class=\"btnStyle\" type=\"submit\" value=\"Validate\" name=\"valBtn\"/>\n" +
                "                </form>\n" +
                "            </div>\n" +
                "        </div>\n" +
                "    </div>");
        out.println("<script>\n" +
                "        // Store the link to the corresponding avatar in the database and replace it here when it is used.\n" +
                "        // Then it can dynamically render the avatar here.\n" +
                "        // Note : This script must be executed after the img label has been rendered, otherwise it will not render properly!\n" +
                "        var avatarLink = \"https://s2.loli.net/2023/03/10/Rfb7iya12chVdUp.png\";\n" +
                "        var avatarImg = document.getElementById(\"avatarImg\");\n" +
                "        avatarImg.src = avatarLink;\n" +
                "\n" +
                "        var etrLink = \"https://s2.loli.net/2023/03/10/LMqbsej63cBoCaK.png\";\n" +
                "        var etrImg = document.getElementById(\"etrImg\");\n" +
                "        etrImg.src = etrLink;\n" +
                "\n" +
                "        var ids = \"fr13471982750\"; // Example showing dynamically render the idNumber here, same for the next few.\n" +
                "        var idNum = document.getElementById(\"idNum\");\n" +
                "        idNum.value = ids;\n" +
                "\n" +
                "        var names = \"Tom Maria\"; \n" +
                "        var nameStr = document.getElementById(\"nameStr\");\n" +
                "        nameStr.value = names;\n" +
                "\n" +
                "        var groups = \"Group 1\"; \n" +
                "        var grpStr = document.getElementById(\"grpStr\");\n" +
                "        grpStr.value = groups;\n" +
                "\n" +
                "        var enterprises = \"SNCF\"; \n" +
                "        var etrStr = document.getElementById(\"etrStr\");\n" +
                "        etrStr.value = enterprises;\n" +
                "\n" +
                "        var addresses = \"48 Av. Long Hallway 38992 BelleBeen ile-de-Francais\";\n" +
                "        var adsStr = document.getElementById(\"adsStr\");\n" +
                "        adsStr.value = addresses;\n" +
                "\n" +
                "        var leaders = \"Maria Shelter\";\n" +
                "        var leaderStr = document.getElementById(\"leaderStr\");\n" +
                "        leaderStr.value = leaders;\n" +
                "\n" +
                "        var startTimes = new Date(\"2018-8-18\");\n" +
                "        var startYear = startTimes.getFullYear();\n" +
                "        var startMonth = (\"0\" + (startTimes.getMonth() + 1)).slice(-2);\n" +
                "        var startDay = (\"0\" + startTimes.getDate()).slice(-2);\n" +
                "        var formattedStartDate = startYear + \"-\" + startMonth + \"-\" + startDay;\n" +
                "        var sTime = document.getElementById(\"sTime\");\n" +
                "        sTime.value = formattedStartDate;\n" +
                "\n" +
                "        var endTimes = new Date(\"2019-8-18\");\n" +
                "        var endYear = endTimes.getFullYear();\n" +
                "        var endtMonth = (\"0\" + (endTimes.getMonth() + 1)).slice(-2);\n" +
                "        var endDay = (\"0\" + endTimes.getDate()).slice(-2);\n" +
                "        var formattedEndDate = endYear + \"-\" + endtMonth + \"-\" + endDay;\n" +
                "        var eTime = document.getElementById(\"eTime\");\n" +
                "        eTime.value = formattedEndDate;\n" +
                "\n" +
                "        var missions = \"Blank here\";\n" +
                "        var msionStr = document.getElementById(\"msionStr\");\n" +
                "        msionStr.value = missions;\n" +
                "\n" +
                "        var comments = \"Blank here\";\n" +
                "        var commStr = document.getElementById(\"commStr\");\n" +
                "        commStr.value = comments;\n" +
                "    </script>");
    }

    public void destroy() {
    }

}

