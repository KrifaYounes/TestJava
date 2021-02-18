#!/bin/bash


functionTest(){
   echo "$1"
   echo "$2"
   echo "$3"
   git checkout -b "$1"
   git push origin "$1"
   git add .
   git commit -m "[$2] $3"
   git push --set-upstream origin "$1"
}

functionTest $1 $2 $3
