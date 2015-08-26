#!/bin/sh
#Going to parent's folder
cd .. &&
cd .. &&
#Cleaning the whole project
mvn clean compile &&
#Instrument Cobertura
cd cobertura-plus-poc-coverage/scripts &&
ant instrument &&
#Going to parent's folder
cd .. &&
cd .. &&
#Generating tests classes
mvn test &&
#Creating the Cobertura Report and cleaning Cobertura files
cd cobertura-plus-poc-coverage/scripts &&
ant report &&
ant cleanCoberturaFiles