package m2.projectapp.intershipfollow;

import java.io.*;

import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;

@WebServlet(name = "main", value = "/servletMain")
public class MainServlet extends HttpServlet {
    private String boxStyle, title, bkStyle, headLine, headImg, strongHead,
            introBox, introImg, spanIntro, listHead, listTable, btnStyle, btnStyleHover,
            listBtn, listBtnInline;

    public void init() {
        title = "MainPage";
        boxStyle = ".Box {" + "width: 1600px;" + "height: 800px;" + "padding: 40px;" +
                "position: absolute;" + "top: 50%;" + "left: 50%;" + "transform: translate(-50%, -50%);" +
                "animation: animated-border 1.5s infinite;" + "border: 1px solid;" + "border-radius: 1px;" +
                "padding: 15px;" + "background-color: white;" + "background-size: cover;" +
                "background-attachment: fixed;" + "}";
        bkStyle = ".bk {" + "width: 100%;" + "height: 100%;" + "position: absolute;" +
                "left: 0;" + "top: 0;" + "z-index: -1;" + "}";
        headLine = ".headLine {" + "border: none;" + "border-bottom: solid 0.5px;" + "padding-bottom: 20px;" +
                "padding-left: 12px;" + "}";
        headImg = ".headImg {" + "position: absolute;" + "top: 2%;" + "left: 84%;" + "max-width: 14%;" +
                "height: auto;" + "}";
        strongHead = ".strongHead {" + "font-size: 30px;" + "}";
        introBox = ".introBox {" + "margin-left: 420px;" + "margin-top: 120px;" + "padding-right: 100px;" + "}";
        introImg = ".introImg {" + "position: absolute;" + "top: 15%;" + "left: 2%;" + "max-width: 22%;" +
                "height: auto;" + "}";
        spanIntro = ".spanIntro {" + "font-size: 18px;" + "}";
        listHead = ".listHead {" + "margin-left: 420px;" + "margin-top: 100px;" + "font-size: 24px;" + "}";
        listTable = ".listTable {" + "border: 1px solid;" + "margin-top: 30px;" + "height: 260px;" +
                "overflow: auto;" + "padding: 8px;" + "}";
        btnStyle = ".btnStyle {" + "display: inline-block;" + "padding: 0.25rem 1rem;" + "margin-left: 30px;" +
                "font-size: 1rem;" + "font-weight: bold;" + "text-align: center;" + "text-decoration: none;" +
                "cursor: pointer;" + "border-radius: 0.25rem;" + "border: 2px solid #333;" + "color: #333;" +
                "background-color: transparent;" + "}";
        btnStyleHover = ".btnStyle:hover {" + "color: #fff;" + "background-color: #333;" + "}";
        listBtn = ".listBtn {" + "position: relative;" + "left: 37.5%;" + "margin-top: 8px;" + "}";
        listBtnInline = ".listBtnInline {" + "display: inline-block;" + "}";
    }

    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        response.setContentType("text/html");

        // Main Page
        PrintWriter out = response.getWriter();
        out.println("<html>");
        out.println("<head>");
        out.println("<style>");
        out.println(boxStyle + bkStyle + headLine + headImg + strongHead + introBox + introImg + spanIntro +
                listHead + listTable + btnStyle + btnStyleHover + listBtn + listBtnInline);
        out.println("</style>");
        out.println("<script>");
        out.println("function creatTable() {\n" +
                "            var rowNum = 12; // The number of students from database, here '12' is just an example\n" +
                "            var table = document.getElementById(\"listTable\");\n" +
                "            var label = new Array(8);\n" +
                "            label[0] = \"#\";\n" +
                "            label[1] = \"ID\";\n" +
                "            label[2] = \"Name\";\n" +
                "            label[3] = \"Group\";\n" +
                "            label[4] = \"Duration\";\n" +
                "            label[5] = \"Attendance\";\n" +
                "            label[6] = \"Work completed\";\n" +
                "            label[7] = \"Return of report\";\n" +
                "            var names = new Array(rowNum); // Using for rendering names\n" +
                "            var ids = new Array(rowNum); // Using for rendering id of interns\n" +
                "\n" +
                "            table.innerHTML = \"\"; // Delete all the existed lines in the table\n" +
                "\n" +
                "            // Table labels\n" +
                "            var labelRow = table.insertRow();\n" +
                "            var labels = labelRow.insertCell(0); \n" +
                "            labels.innerHTML = '<div style=\"width:50px;text-align:center;\">' + label[0] + '</div>';\n" +
                "            var labels = labelRow.insertCell(1);\n" +
                "            labels.innerHTML = '<div style=\"width:160px;text-align:center;\">' + label[1] + '</div>';\n" +
                "            var labels = labelRow.insertCell(2);\n" +
                "            labels.innerHTML = '<div style=\"width:120px;text-align:center;\">' + label[2] + '</div>';\n" +
                "            var labels = labelRow.insertCell(3);\n" +
                "            labels.innerHTML = '<div style=\"width:100px;text-align:center;\">' + label[3] + '</div>';\n" +
                "            var labels = labelRow.insertCell(4);\n" +
                "            labels.innerHTML = '<div style=\"width:100px;text-align:center;\">' + label[4] + '</div>';\n" +
                "            var labels = labelRow.insertCell(5);    \n" +
                "            labels.innerHTML = '<div style=\"width:100px;text-align:center;\">' + label[5] + '</div>';\n" +
                "            var labels = labelRow.insertCell(6);     \n" +
                "            labels.innerHTML = '<div style=\"width:140px;text-align:center;\">' + label[6] + '</div>';\n" +
                "            var labels = labelRow.insertCell(7);     \n" +
                "            labels.innerHTML = '<div style=\"width:140px;text-align:center;\">' + label[7] + '</div>';\n" +
                "\n" +
                "            // List interns\n" +
                "            for (var j = 0; j < rowNum; j++) {\n" +
                "                var row = table.insertRow();\n" +
                "                var cell1 = row.insertCell(0);\n" +
                "                var cell2 = row.insertCell(1);\n" +
                "                var cell3 = row.insertCell(2);\n" +
                "                var cell4 = row.insertCell(3);\n" +
                "                var cell5 = row.insertCell(4);\n" +
                "                var cell6 = row.insertCell(5);\n" +
                "                var cell7 = row.insertCell(6);\n" +
                "                var cell8 = row.insertCell(7);\n" +
                "                cell1.innerHTML = '<input type=\"checkbox\" id=\"checkbox-' + j + '\"style = \"display: block;margin: auto;\">';\n" +
                "                cell2.innerHTML = \"fr1347198275\" + j; // Example for rendering id\n" +
                "                cell3.innerHTML = \"name \" + j; // Example for rendering names\n" +
                "                cell4.innerHTML = \"Group \" + j; // Example\n" +
                "                cell5.innerHTML = '<input type=\"checkbox\" id=\"checkbox-' + j+200 + '\"style = \"display: block;margin: auto;\">';\n" +
                "                cell6.innerHTML = '<input type=\"checkbox\" id=\"checkbox-' + j+300 + '\"style = \"display: block;margin: auto;\">';\n" +
                "                cell7.innerHTML = '<input type=\"checkbox\" id=\"checkbox-' + j+400 + '\"style = \"display: block;margin: auto;\">';\n" +
                "                cell8.innerHTML = '<input type=\"checkbox\" id=\"checkbox-' + j+500 + '\"style = \"display: block;margin: auto;\">';\n" +
                "            }\n" +
                "\t\t}");
        out.println("</script>");
        out.println("<title>" + title + "</title>");
        out.println("</head>");
        out.println("<body>");
        out.println("<img class=\"bk\" src=\"https://s2.loli.net/2023/02/16/ihXefda8mjFJ6Gk.jpg\"/>\n" +
                "    <div class=\"Box\">\n" +
                "        <h1 class=\"headLine\">Extranet IntershipFollow</h1>\n" +
                "        <img class=\"headImg\" src=\"https://s2.loli.net/2023/03/08/gaYrbk79TA8BOUX.png\">\n" +
                "        <div class=\"introBox\">\n" +
                "            <img class=\"introImg\" src=\"https://s2.loli.net/2023/03/08/T65kGLcEepZWMlr.png\">\n" +
                "            <strong class=\"strongHead\">Welcome to IntershipFollow !</strong>\n" +
                "            <br/>\n" +
                "            <br/>\n" +
                "            <span class=\"spanIntro\">This page will assist you in better managing the interns under your responsibility, and monitoring and reviewing their internship status.</span>\n" +
                "        </div>\n" +
                "        <div class=\"listHead\">\n" +
                "            <span><strong>List of interns :</strong></span>\n" +
                "            <button class=\"btnStyle\" onclick=\"creatTable()\">Show the list</button>\n" +
                "        </div>\n" +
                "        <div class=\"listTable\">\n" +
                "            <table id=\"listTable\" border=\"1\">\n" +
                "            </table>\n" +
                "        </div>\n" +
                "        <div class=\"listBtn\">\n" +
                "            <div class=\"listBtnInline\">\n" +
                "                <input class=\"btnStyle\" type=\"submit\" value=\"Modify\" name=\"mdfBtn\">\n" +
                "            </div>\n" +
                "            <div class=\"listBtnInline\">\n" +
                "                <input class=\"btnStyle\" type=\"submit\" value=\"Validate\" name=\"valBtn\">\n" +
                "            </div>\n" +
                "            <div class=\"listBtnInline\">\n" +
                "                <form action=\"servletDetail\" method=\"get\">\n" +
                "                    <input class=\"btnStyle\" type=\"submit\" value=\"Details\" name=\"dtlBtn\">\n" +
                "                </form>\n" +
                "            </div>\n" +
                "            <div style=\"clear: both;\"></div>\n" +
                "        </div>\n" +
                "    </div>");
        out.println("</body></html>");
    }

    public void destroy() {
    }
}
