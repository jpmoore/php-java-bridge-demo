<?php

require_once("http://localhost:8087/JavaBridge/java/Java.inc");

$world = new java("HelloWorld");
echo $world->hello(array("world")) . "\n";

?>
