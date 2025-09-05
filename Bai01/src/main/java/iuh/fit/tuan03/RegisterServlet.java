package iuh.fit.tuan03;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/registration-form")
public class RegisterServlet extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("UTF-8");
        response.setContentType("text/html;charset=UTF-8");

        String firstName = request.getParameter("firstName");
        String lastName = request.getParameter("lastName");

        int day = Integer.parseInt(request.getParameter("day"));
        String month = request.getParameter("month");
        int year = Integer.parseInt(request.getParameter("year"));

        String email = request.getParameter("email");
        String mobile = request.getParameter("mobile");
        String gender = request.getParameter("gender");
        String address = request.getParameter("address");
        String city = request.getParameter("city");
        String pincode = request.getParameter("pincode");
        String state = request.getParameter("state");
        String country = request.getParameter("country");

        String[] hobbies = request.getParameterValues("hobbies");

        String[] boards = request.getParameterValues("board");
        String[] percentages = request.getParameterValues("percentage");
        String[] years = request.getParameterValues("year");

        Student.Qualification[] qualifications = new Student.Qualification[4];
        String[] examNames = {"Class X", "Class XII", "Graduation", "Masters"};
        for (int i = 0; i < 4; i++) {
            String b = (boards != null && boards.length > i) ? boards[i] : "";
            double perc = 0;
            try {
                perc = (percentages != null && percentages.length > i) ? Double.parseDouble(percentages[i]) : 0;
            } catch (NumberFormatException e) {
                perc = 0;
            }
            int y = 0;
            try {
                y = (years != null && years.length > i) ? Integer.parseInt(years[i]) : 0;
            } catch (NumberFormatException e) {
                y = 0;
            }
            qualifications[i] = new Student.Qualification(examNames[i], b, perc, y);
        }

        String course = request.getParameter("course");

        Student student = new Student(firstName, lastName, day, month, year, email,
                mobile, gender, address, city, pincode, state,
                country, hobbies, qualifications, course);

        PrintWriter out = response.getWriter();
        out.println("<html><body>");
        out.println("<h2>Student Registration Details</h2>");
        out.println("Name: " + student.getFirstName() + " " + student.getLastName() + "<br>");
        out.println("DOB: " + student.getDayOfBirth() + "/" + student.getMonthOfBirth() + "/" + student.getYearOfBirth() + "<br>");
        out.println("Email: " + student.getEmail() + "<br>");
        out.println("Mobile: " + student.getMobileNumber() + "<br>");
        out.println("Gender: " + student.getGender() + "<br>");
        out.println("Address: " + student.getAddress() + "<br>");
        out.println("City: " + student.getCity() + "<br>");
        out.println("Pin Code: " + student.getPinCode() + "<br>");
        out.println("State: " + student.getState() + "<br>");
        out.println("Country: " + student.getCountry() + "<br>");
        out.println("Hobbies: ");
        if (student.getHobbies() != null) {
            for (String h : student.getHobbies()) {
                out.print(h + " ");
            }
        }
        out.println("<br>");

        out.println("<h3>Qualifications</h3>");
        out.println("<ul>");
        for (Student.Qualification q : student.getQualifications()) {
            out.println("<li>" + q.getExamination() + ": Board=" + q.getBoard() + ", Percentage=" + q.getPercentage() + ", Year=" + q.getYearOfPassing() + "</li>");
        }
        out.println("</ul>");

        out.println("Course applies for: " + student.getCourse() + "<br>");

        out.println("</body></html>");
    }
}
