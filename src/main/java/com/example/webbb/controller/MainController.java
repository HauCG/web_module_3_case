package com.example.webbb.controller;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Objects;

@WebServlet(name = "Controller", urlPatterns = "/h_store")
public class MainController extends HttpServlet {
    @Override
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        showWelcomePage(request, response);
        // giấu hết chỉ lviec với post
    }

    @Override
    public void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {

        String status = request.getParameter("S");        // OK LÀ THÀNH CÔNG , KO LÀ CHƯA LOGIN
        String action = request.getParameter("A");
        String identity = request.getParameter("I");
        int accountId;
        // kiểm tra xem có nhập ko vì int ko trả về null
        if (request.getParameter("C") != null) {
             accountId = Integer.parseInt(request.getParameter("C"));  // C là code đại diện cho accountId
        } else {
             accountId = -1;
        }

        if (status == null) {
            status = "KO";
        }                      // Mặc định là "KO" chưa đăng nhập
        if (action == null) {
            action = "Default";
        }                      // Mặc định là Default
        if (identity == null) {
            identity = "N";
        }                    // Mặc định là "N" như kiểu null
        if (!identity.equals("C") && !identity.equals("S") && !identity.equals("A") && !identity.equals("N")) {
            showPageNotFound(request, response);
        } // Xử lý khác
        switch (status) {
            case "KO":
                showWelcomePage(request, response);
                break;
            case "OK":
                // trạng thaiais đnăg nhập ok mà ko có id thì trả sang trang lỗi
                // todo:  kiểm tra đúng idcus và đúng identity ko thì ở jsp hay controlerr luôn(ngày mai)
                if (accountId != -1) {
                    switch (action) {
                        case "homePage":
                            showHomePage(request, response, identity);
                            break;
                        case "other":
                            // TODO thêm các chức năng khác
                            break;
                        default:
                            showPageNotFound(request, response);
                            break;
                    }
                } else {
                    showPageNotFound(request, response);
                }
            default:
                showPageNotFound(request, response);
                break;
        }
    }
    // C LÀ KHÁCH HÀNG, S LÀ NGƯỜI BÁN, A LÀ CHỦ SÀN


    private void showHomePage(HttpServletRequest request, HttpServletResponse response, String identity) throws IOException, ServletException {
//        truyền vào để kiểm tra xong xử lý ở jsp
        request.setAttribute("identity", identity);
        RequestDispatcher dispatcher = request.getRequestDispatcher("/homePage.jsp");
        dispatcher.forward(request, response);
    }

    private void showWelcomePage(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        RequestDispatcher dispatcher = request.getRequestDispatcher("/welcomeView/welcomePage.jsp");
        dispatcher.forward(request, response);
    }
    private void showPageNotFound(HttpServletRequest request, HttpServletResponse response) throws IOException {
        response.sendRedirect("/WEB-INF/pageNotFound.jsp");
    }
}