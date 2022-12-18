package kr.co.kybex.toy_servlets;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.HashMap;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import kr.co.kybex.toy_servlets.beans.QuestionBean;
import kr.co.kybex.toy_servlets.beans.UserInfo;

@WebServlet(urlPatterns = "/pollListServlet")
public class PollListServlet extends HttpServlet {
        @Override
        protected void doGet(HttpServletRequest request, HttpServletResponse response)
                        throws ServletException, IOException {
                response.setContentType("text/html;charset=UTF-8"); // 한글세팅
                PrintWriter printWriter = response.getWriter();

                DataInfo dataInfo = new DataInfo();
                QuestionBean bean = dataInfo.getSampleQuestion();
                ArrayList outputList = dataInfo.getQuestions();
                UserInfo yongbeom = dataInfo.getUserInfo();

                printWriter.println("<html>");

                printWriter.println("<html lang='en'>");
                printWriter.println("    <head>");
                printWriter.println("        <meta charset='UTF-8' />");
                printWriter.println("        <title>Document</title>");
                printWriter.println("           <link");
                printWriter.println(
                                "            href='https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/css/bootstrap.min.css'");
                printWriter.println("            rel='stylesheet'");
                printWriter.println(
                                "            integrity='sha384-rbsA2VBKQhggwzxH7pPCaAqO46MgnOM80zW1RWuH61DGLwZJEdK2Kadq2F9CUG65'");
                printWriter.println("            crossorigin='anonymous' />");
                printWriter.println("    </head>");
                printWriter.println("    <body>");
                printWriter.println("        <div class='container-fluid'>");
                printWriter.println("           <div>PollListServlet</div>");
                printWriter.println("           <br>");
                printWriter.println("           <div>본인 정보: " + yongbeom.getName() + " </div>");
                printWriter.println("           <div>본인 소속: " + yongbeom.getDepartment() + "</div>");
                printWriter.println("           <br>");
                printWriter.println("           <div>Questions</div>");

                for (int i = 0; i < outputList.size(); i++) {
                        HashMap<String, Object> question;
                        question = (HashMap<String, Object>) outputList.get(i);
                        String questionStr = (String) question.get("question");
                        printWriter.println("           <div>" + questionStr + "</div>");

                        ArrayList arr = (ArrayList) question.get("answers");
                        for (int j = 0; j < arr.size(); j++) {
                                printWriter.println("<div class='form-check'>");
                                printWriter.println(
                                                "<input type='radio' class='form-check-input' name='Radios" + i
                                                                + "' id='radiosQ" + i + "A" + j + "'/>");
                                printWriter.println(
                                                "<label for='radiosQ" + i + "A" + j + "' class='form-check-label'>"
                                                                + arr.get(j)
                                                                + "</label>");
                                printWriter.println("</div>");
                        }
                }
                // printWriter.println(" <div>" + +"</div>");

                printWriter.println("        </div>");

                printWriter.println("        <script");
                printWriter.println(
                                "            src='https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/js/bootstrap.bundle.min.js'");
                printWriter.println(
                                "            integrity='sha384-kenU1KFdBIe4zVF0s0G1M5b4hcpxyD9F7jL+jjXkk+Q2h455rYXK/7HAuoJl+0I4'");
                printWriter.println("            crossorigin='anonymous'></script>");
                printWriter.println("    </body>");
                printWriter.println("</html>");

                printWriter.close();
        }
}
