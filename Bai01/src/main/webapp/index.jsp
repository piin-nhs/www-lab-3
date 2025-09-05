<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
  <style>
    body {
      background-color: #aee6f5;
      font-family: Arial, sans-serif;

    }
    form {
      background-color: #c2f0f7;
      padding: 20px;
      width: 800px;
      margin: auto;
      border-radius: 10px;
    }

    label {
      display: inline-block;
      min-width: 150px;
    }
    input, select, textarea {
      margin: 5px 0;
      padding: 4px;
      box-sizing: border-box;
    }
    table {
      width: 100%;
    }
    th, td {
      padding: 5px;
    }
  </style>
</head>
<body>
<form action="registration-form" name="formDangKy" method="GET">

  <label >First name</label>
  <input type="text" name="firstName"  >
  <label>(max 30 characters a-z and A-Z)</label> <br>

  <label>Last name</label>
  <input type="text" name="lastName" >
  <label>(max 30 characters a-z and A-Z)</label> <br>


  <label>Date of birth</label>
  <select name="day">
    <option>Day</option>
    <%
      for(int i=1; i<=31; i++) {
    %>
    <option><%= i %></option>
    <%
      }
    %>
  </select>
  <select name="month">
    <option>Month</option>
    <option>Jan</option><option>Feb</option><option>Mar</option>
    <option>Apr</option><option>May</option><option>Jun</option>
    <option>Jul</option><option>Aug</option><option>Sep</option>
    <option>Oct</option><option>Nov</option><option>Dec</option>
  </select>
  <select name="year">
    <option>Year</option>
    <option>2025</option>
  </select> <br>

  <label>Email</label>
  <input type="email" name="email" > <br>

  <label>Mobile number</label>
  <input type="text" name="mobile" >
  <label>(10 digit number)</label> <br>


  <label>Gender</label>
  <input type="radio" name="gender" value="Male" > Male
  <input type="radio" name="gender" value="Female"> Female <br>
  <div style="display: flex; align-items: center">
    <label style="margin: 0 2px ">Address</label>
    <textarea name="address" rows="3"></textarea> <br>
  </div>



  <label>City</label>
  <input type="text" name="city">
  <label>(max 30 characters a-z and A-Z)</label> <br>


  <label>Pin code</label>
  <input type="text" name="pincode" >
  <label>(6 digit number)</label> <br>


  <label>State</label>
  <input type="text" name="state">
  <label>(max 30 characters a-z and A-Z)</label> <br>


  <label>Country</label>
  <input type="text" name="country" value="India"> <br>

  <label>Hobbies</label>
  <input type="checkbox" name="hobbies" value="Drawing"> Drawing
  <input type="checkbox" name="hobbies" value="Singing"> Singing
  <input type="checkbox" name="hobbies" value="Dancing"> Dancing
  <input type="checkbox" name="hobbies" value="Sketching"> Sketching
  <input type="checkbox" name="hobbies" value="Others"> Others
  <input type="text" name="mobile" >



  <h3>Qualification</h3>
  <table >
    <tr>
      <th>Sl.No.</th>
      <th>Examination</th>
      <th>Board</th>
      <th>Percentage</th>
      <th>Year of Passing</th>
    </tr>
    <tr>
      <td>1</td>
      <td>Class X</td>
      <td><input type="text" name="board"></td>
      <td><input type="text" name="percentage"></td>
      <td><input type="text" name="year"></td>
    </tr>
    <tr>
      <td>2</td>
      <td>Class XII</td>
      <td><input type="text" name="board"></td>
      <td><input type="text" name="percentage"></td>
      <td><input type="text" name="year"></td>
    </tr>
    <tr>
      <td>3</td>
      <td>Graduation</td>
      <td><input type="text" name="board"></td>
      <td><input type="text" name="percentage"></td>
      <td><input type="text" name="year"></td>
    </tr>
    <tr>
      <td>4</td>
      <td>Masters</td>
      <td><input type="text" name="board"></td>
      <td><input type="text" name="percentage"></td>
      <td><input type="text" name="year"></td>
    </tr>
  </table>

  <label>Course applies for</label>
  <input type="radio" name="course" value="BCA"> BCA
  <input type="radio" name="course" value="B.Sc"> B.Sc
  <input type="radio" name="course" value="B.Com"> B.Com
  <input type="radio" name="course" value="B.A"> B.A

  <br><br>
  <div style="display: flex; justify-content: center">
    <input style="margin-right: 10px" type="submit" value="Submit">
    <input type="reset" value="Reset">
  </div>
</form>
</body>
</html>
