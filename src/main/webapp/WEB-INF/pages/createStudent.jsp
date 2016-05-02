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
  <script type="text/javascript">
      $(function() {
        $('#studentForm').submit(function() {
          alert("submitting");
          var form  = $(this);
          var urlForm = form.atr('action');
          alert("url is: " + urlForm);
          var formData = JSON.stringify(form.serializeArray());
          alert(formData);
          $.ajax({
            headers: {
              'Accept': 'application/json',
              'Content-Type': 'application/json'
            },
            url: urlForm,
            type: 'POST',
            contentType : 'application/json',
            mimeType: 'application/json',
            dataType: 'json',
            data: formData,
            success : function () {
              alert('success');
            },
            error : function () {
              alert('error');
            },
          });
          alert("after Ajax");
          event.preventDefault();
        });
      });
  </script>
</head>
<body>
<form id="studentForm" action="${urlRestStudent}" method="POST">
  <table>
    <tr>
      <td>Faculty Number</td>
      <td><input type="text" id="facultyNum"/></td>
    </tr>
    <tr>
      <td>First Name</td>
      <td><input type="text" id="firstName"/></td>
    </tr>
    <tr>
      <td>Last Name</td>
      <td><input type="text" id="lastName"/></td>
    </tr>
    <tr>
      <td>Email</td>
      <td><input type="text" id="email"/></td>
    </tr>
    <tr>
      <td>Speciality</td>
      <td><input type="text" id="speciality"/></td>
    </tr>
  </table>
  <input type="submit" value="Submit"/>
</form>
</body>
</html>
