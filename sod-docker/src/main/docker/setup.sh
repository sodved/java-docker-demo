#!/bin/sh -ue

echo "=======================  SETUP  =============================="
echo "Java version: $(java -version 2>&1)"
echo "Creating sod.txt"
java -jar /sod-java-*.jar
echo "=============================================================="
