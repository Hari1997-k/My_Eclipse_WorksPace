<html>
<head>
<style>
.sidenav a {
  padding: 8px 8px 8px 32px;
  text-decoration: none;
  font-size: 25px;
  color: #818181;
  display: block;
  transition: 0.3s;
}
</style>
</head>
<body>
<header
         style="color: black; font-family: Times New Roman; min-width: 100%; top: 0%; left: 0%; position: fixed; background-color: black; text-align: center;">
         <h1 style="color: white;">Plaza Management System</h1>

      </header>
      <a href = "/Demo/user">
<img src = "https://cdn.clipart.email/9dd8a12324af3318cf416a5f35f35ade_iconsetc-flat-circle-white-on-black-bootstrap-font-awesome-user-icon_512-512.png" alt = "MyACCOUNT" width="60px" height="60px" style = "position: fixed; margin-left: 32cm; bottom : 14.65cm;">
</a>

      <br><br><br><br><br>
      <center>
<form action="user" method="POST" modelAttribute="user"> 
<input type = "text" id = "search" name="id">
<input type = "submit" value ="Go" id = "go" style ="border-radius : 10px;"><br><br>
</form>
<img src = " https://imageog.flaticon.com/icons/png/512/75/75825.png?size=1200x630f&pad=10,10,10,10&ext=png&bg=FFFFFFFF" width="150px" height="150px" style = "position: absolute; margin-left : -2.09cm; " alt = "oops" >
<%-- </form> 
 --%></center>

<div id="mySidenav" class="sidenav" style ="height: 100%;
  width: 0;
  position: fixed;
  z-index: 1;
  top: 0;
  left: 0;
  background-color: #111;
  overflow-x: hidden;
  transition: 0.5s;
  padding-top: 60px; padding-top: 15px;" >
  
  <a href="javascript:void(0)" class="closebtn" onclick="closeNav()" style = " position: absolute;
  top: 0;
  right: 25px;
  font-size: 36px;
  margin-left: 50px;">&times;
  </a>
  
  <a href="#">Add Staff</a>
  <a href="#">List Staff</a>
  <a href="#">Create Plaza</a>
  <a href="#">List Plaza</a>
    <a href="#">List Plaza</a>
  <a href="#">Create Fare</a>
  <a href="#">Create TollBooth</a>
  <a href="#">List TollBooth</a>
  <a href="#">Create Vehicle Detail</a>
  <a href="#">List Vehicle Detail</a>
  <a href="#">Logout</a>

</div>


<span style="font-size:30px;cursor:pointer; bottom : 4cm;" onclick="openNav()">&#9776; </span>

<script>
function openNav() {
  document.getElementById("mySidenav").style.width = "250px";
}

function closeNav() {
  document.getElementById("mySidenav").style.width = "0";
}
</script>
   
</body>
</html> 