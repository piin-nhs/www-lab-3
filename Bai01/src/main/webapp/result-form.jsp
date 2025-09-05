<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ page import="iuh.fit.tuan03.Student" %>
<!DOCTYPE html>
<html>
<head>
    <title>Student Registration Result</title>
    <style>
        body {
            background-color: #aee6f5;
            font-family: Arial, sans-serif;
            padding: 20px;
        }
        h2, h3 {
            color: #333;
        }
        ul {
            list-style-type: none;
            padding-left: 0;
        }
        ul li {
            margin-bottom: 6px;
        }
    </style>
</head>
<body>
<%
    Student student = (Student) request.getAttribute("student");
    if (student == null) {
%>
<p>No student data found!</p>
<%
} else {
%>

<h2>Student Registration Details</h2>
<p><strong>Name:</strong> <%= student.getFirstName() + " " + student.getLastName() %></p>
<p><strong>Date of Birth:</strong> <%= student.getDayOfBirth() + "/" + student.getMonthOfBirth() + "/" + student.getYearOfBirth() %></p>
<p><strong>Email:</strong> <%= student.getEmail() %></p>
<p><strong>Mobile:</strong> <%= student.getMobileNumber() %></p>
<p><strong>Gender:</strong> <%= student.getGender() %></p>
<p><strong>Address:</strong> <%= student.getAddress() %></p>
<p><strong>City:</strong> <%= student.getCity() %></p>
<p><strong>Pin Code:</strong> <%= student.getPinCode() %></p>
<p><strong>State:</strong> <%= student.getState() %></p>
<p><strong>Country:</strong> <%= student.getCountry() %></p>
<p><strong>Hobbies:</strong>
        <%
    String[] hobbies = student.getHobbies();
    if (hobbies != null && hobbies.length > 0) {
%>
<p>
    <strong>Hobbies:</strong>
    <%= String.join(", ", hobbies) %>
</p>
<%
} else {
%>
<p><strong>Hobbies:</strong> None</p>
<%
    }
%>

</p>

<h3>Qualifications</h3>
<ul>
    <%
        for (Student.Qualification q : student.getQualifications()) {
    %>
    <li><strong><%= q.getExamination() %>:</strong> Board = <%= q.getBoard() %>, Percentage = <%= q.getPercentage() %>, Year of Passing = <%= q.getYearOfPassing() %></li>
    <%
        }
    %>
</ul>

<p><strong>Course applies for:</strong> <%= student.getCourse() %></p>

<%
    }
%>
</body>
</html>
