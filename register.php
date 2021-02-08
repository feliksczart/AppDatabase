<?php

require "init.php";

$name="feliks";
$password="feliks123";
$contact="000000";
$country="Poland";

$sql_query="insert into users values('$name','$password','$contact','$country');";

if(mysqli_query($connection,$sql_query)){
    echo "Data inserted";
}
else{
    echo "Insertion error";
}

?>