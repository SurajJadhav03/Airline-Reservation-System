<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta name="viewport" content="width=device-width, initial-scale=1">
<style>
html {
	box-sizing: border-box;
}

*, *:before, *:after {
	box-sizing: inherit;
}

.column {
	float: left;
	width: 25.3%;
	margin-bottom: 16px;
	padding: 0 8px;
}

@media screen and (max-width: 650px) {
	.column {
		width: 100%;
		display: block;
	}
}

.card {
	box-shadow: 0 4px 8px 0 rgba(0, 0, 0, 0.2);
}

.container {
	padding: 0 16px;
}

.container::after, .row::after {
	content: "";
	clear: both;
	display: table;
}

.title {
	color: grey;
}

.button {
	border: none;
	outline: 0;
	display: inline-block;
	padding: 8px;
	color: white;
	background-color: #000;
	text-align: center;
	cursor: pointer;
	width: 100%;
}

.button:hover {
	background-color: #555;
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
</head>
<body>

	<div class="topnav">
		<a class="active" href="homePage">Home</a> <a href="servicePage">Service</a>
		<a href="aboutPage">About</a> <a href="contactPage">Contact</a> <a
			href="FlightPage">Flights</a> <a href="videopage">Videos</a> <a
			href="teampage">Our Team</a> <a href="continent">We Serve</a> 
			<a href="careerpage">Careers</a>
			<a
			href="https://www.britishairways.com/en-gb/information/about-ba/fleet-facts">Our
			Fleet</a> <a
			href="https://flightaware.com/live/flex_bigmap.rvt?search=-airline%20BAW&time=1677209160&key=085bf13bf9b23d28f67478d6d3d171601d1d0edf&title=Airborne%20British%20Airways%20&quot;Speedbird&quot;%20(BAW)%20Aircraft">Live</a>
			<a href="logoutPage">Sign Out</a>

	</div>







	<h1>Pilots</h1>
	<p>Some pilots take aircraft from one destination to the next.
		British Airways pilots connect Britain with the world and the world to
		Britain like no one else. Joining our flight crew is about living up
		to the highest professional and safety standards, playing a lead role
		on the team and doing that little bit more to make every flight
		memorable for our customers</p>
	<br>
	<form action="team">
		<div class="row">
			<div class="column">
				<div class="card">
					<img src="lisa.png" alt="Jane" style="width: 100%">
					<div class="container">
						<h2>Lisa Simon</h2>
						<p class="title">Sr.Pilot</p>
						<p>A Pilot who loves flying the A320 aircraft also expert in
							designing</p>
						<p>lisasi@gmail.com</p>
						<p>


							<button class="button" >Readmore</button>
							</a>


						</p>

					</div>
				</div>
			</div>



			<div class="column">
				<div class="card">
					<img src="jrpilot.jpg" alt="John" style="width: 100%">
					<div class="container">
						<h2>Jack Dave</h2>
						<p class="title">Jr.Pilot</p>
						<p>Graduate of our Cadet Programme who has been flying the
							British Airways Airbus now for four years..</p>
						<p>jackdave@gmail.com</p>
						<p>
							<button class="button">Contact</button>
						</p>
					</div>
				</div>
			</div>
		</div>


		<div class="column">
			<div class="card">
				<img src="pio.jpg" alt="John" style="width: 100%">
				<div class="container">
					<h2>Ken Miles</h2>
					<p class="title">Jr.Pilot</p>
					<p>valued and able to influence a part of the business that
						will have a direct impact on our product </p>
					<p>kenMilesuk@gmail.com</p>
					<p>
						<button class="button">Contact</button>
					</p>
				</div>
			</div>
		</div>
		</div>



		<div class="column">
			<div class="card">
				<img src="Pil.jpg" alt="John" style="width: 100%">
				<div class="container">
					<h2>Coral Shelby</h2>
					<p class="title">Jr.Pilot</p>
					<p>Graduate of our Cadet Programme who has been flying the
						Boeing 747 since 2 years & </p>
					<p>coralShelby@gmail.com</p>
					<p>
						<button class="button">Contact</button>
					</p>
				</div>
			</div>
		</div>
		</div>






	</form>
</body>
</html>
