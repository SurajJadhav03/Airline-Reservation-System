<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
  <head>
    <title>Add Map</title>
    <script src="https://polyfill.io/v3/polyfill.min.js?features=default"></script>

    <link rel="stylesheet" type="text/css" href="./style.css" />
    <script type="module" src="./index.js"></script>
  </head>
  <body>
 
  
	<div class="topnav">
		<a class="active" href="homePage">Home</a> <a href="servicePage">Service</a>
		<a href="aboutPage">About</a> <a href="contactPage">Contact</a> <a
			href="FlightPage">Flights</a> <a href="videopage">Videos</a> <a
			href="teampage">Our Team</a> <a href="continent">We Serve</a> <a
			href="careerpage">Careers</a> <a
			href="https://www.britishairways.com/en-gb/information/about-ba/fleet-facts">Our
			Fleet</a> <a
			href="https://flightaware.com/live/flex_bigmap.rvt?search=-airline%20BAW&time=1677209160&key=085bf13bf9b23d28f67478d6d3d171601d1d0edf&title=Airborne%20British%20Airways%20&quot;Speedbird&quot;%20(BAW)%20Aircraft">Live</a>
		<a href="logoutPage">Sign Out</a>

	</div>


  
  
  
  
  
  
  
  
  
  <table align="left" border=2  cellspacing=10 cellpadding=10>
<caption>We Serve</caption>
<tr>
  <th>Country</th>
  <th>City</th>
  <th>Airport</th>
   <th>Notes</th>
</tr>
<tr>
  <td>Albania</td>
  <td>Tirana</td>
  <td>Tirana Airport</td>
</tr>
<tr>
 <td>Tirana</td>
  <td>	Algiers</td>
  <td>Buenos Aires</td>
</tr>
<tr>
  <td></td>
  <td></td>
  <td></td>
</tr>
  
  
  
  
  <form action="continent">
    <h3>British Airways</h3>
    <!--The div element for the map -->
    <div id="map"></div>

    <!-- 
      The `defer` attribute causes the callback to execute after the full HTML
      document has been parsed. For non-blocking uses, avoiding race conditions,
      and consistent behavior across browsers, consider loading using Promises
      with https://www.npmjs.com/package/@googlemaps/js-api-loader.
      -->
    <script
      src="https://maps.googleapis.com/maps/api/js?key=AIzaSyB41DRUbKWJHPxaFjMAwdrzWzbVKartNGg&callback=initMap&v=weekly"
      defer
    ></script>
    </form>
     <img src="contidesti.jpg" width=100%>
  </body>
</html>

<style>

/* Set the size of the div element that contains the map */
#map {
  height: 400px; /* The height is 400 pixels */
  width: 100%; /* The width is the width of the web page */
}




.topnav {
	overflow: hidden;
	background-color: #333;
}

.topnav a {
	float: left;
	color: #f2f2f2;
	text-align: center;
	padding: 14px 16px;
	text-decoration: none;
	font-size: 17px;
}

.topnav a:hover {
	background-color: #ddd;
	color: black;
}

.topnav a.active {
	background-color: #04AA6D;
	color: white;
}


</style>


<script>
//Initialize and add the map
function initMap() {
  // The location of Uluru
  const uluru = { lat: -25.344, lng: 131.031 };
  // The map, centered at Uluru
  const map = new google.maps.Map(document.getElementById("map"), {
    zoom: 4,
    center: uluru,
  });
  // The marker, positioned at Uluru
  const marker = new google.maps.Marker({
    position: uluru,
    map: map,
  });
}

window.initMap = initMap;



</script>


