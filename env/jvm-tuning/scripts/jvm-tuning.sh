#!/bin/bash

MemoryException = -XX:+HeapDumpOnOutOfMemoryError
ApplicationName = appName 

echo $MemoryException



java $ApplicationName $MemoryException