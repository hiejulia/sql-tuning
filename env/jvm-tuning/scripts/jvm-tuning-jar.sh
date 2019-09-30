#!/bin/bash

MemoryException = -XX:+HeapDumpOnOutOfMemoryError
ApplicationName = appName 

AppJarName = $ApplicationName-xx.jar 

java -jar $AppJarName 