<%--
  Created by IntelliJ IDEA.
  User: Eagle
  Date: 28.4.2016 г.
  Time: 11:14
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Create Student</title>
  <script type="text/javascript" src="https://ajax.googleapis.com/ajax/libs/jquery/1.8.1/jquery.min.js"></script>
</head>
<body>
<form id="studentForm" action="${urlRestStudent}" method="POST">
  <table>
    <tr>
      <td>Faculty Number</td>
      <td><input type="text" name="facultyNum"/></td>
    </tr>
    <tr>
      <td>First Name</td>
      <td><input type="text" name="firstName"/></td>
    </tr>
    <tr>
      <td>Last Name</td>
      <td><input type="text" name="lastName"/></td>
    </tr>
    <tr>
      <td>Email</td>
      <td><input type="text" name="email"/></td>
    </tr>
    <tr>
      <td>Speciality</td>
      <td><input type="text" name="speciality"/></td>
    </tr>
  </table>
  <input type="submit" value="Submit"/>
</form>

<script type="text/javascript">
  $(function($) {
    $('#studentForm').submit(function() {
      event.preventDefault();
      alert("facultyNum:" + $('input[name=facultyNum]').val());
      var student = {
        "facultyNum" : $('input[name=facultyNum]').val(),
        "firstName" : $('input[name=firstName]').val(),
        "lastName" : $('input[name=lastName]').val(),
        "email" : $('input[name=email]').val(),
        "speciality" : $('input[name=speciality]').val(),
      };
      alert("form data is: " + JSON.stringify(student));
      $.ajax({
        url: $(this).attr("action"),
        type: 'POST',
        contentType : 'application/json',
        dataType: 'json',
        data: JSON.stringify(student),
        success : function () {
          alert('success');
        },
        error : function () {
          alert('error');
        },
      });
    });
  });
</script>

</body>
</html>
