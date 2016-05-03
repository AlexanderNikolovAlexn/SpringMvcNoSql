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
      var data = {};
      $(this).serializeArray().map(function(x){data[x.name] = x.value;});
      $.ajax({
        url: $(this).attr("action"),
        type: 'POST',
        contentType : 'application/json',
        dataType: 'json',
        data: JSON.stringify(data),
        success : function () {
          // TODO: make some update on the page!
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
