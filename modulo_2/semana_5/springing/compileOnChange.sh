#!/bin/sh

tree -if --noreport | entr -c mvn compile
