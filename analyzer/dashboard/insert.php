<?php
  // recover json file
  $data = json_decode(file_get_contents("php://input"));

  // connect to database
  DEFINE('DB_USERNAME', 'root');
  DEFINE('DB_PASSWORD', 'root');
  DEFINE('DB_HOST', 'localhost');
  DEFINE('DB_DATABASE', 'atmosphere');
  
  $mysqli = new mysqli(DB_HOST, DB_USERNAME, DB_PASSWORD, DB_DATABASE);

  if (mysqli_connect_error())
    die('Connect Error ('.mysqli_connect_errno().') '.mysqli_connect_error());
  else
  	echo 'Connected successfully.';

 
  // execute query to insert values into table
  if ($result = $mysqli->query("INSERT INTO properties(vtest1, vtest2) VALUES ('".$data->vtest1."','".$data->vtest2."')")) {
     $result->close();
  }

  // close database connection
  $mysqli->close();
?>
