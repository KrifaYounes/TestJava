#!/bin/bash


functionTest(){
   echo "$0"
   echo "$1"
   echo "$2"
   git checkout -b "$0"
   git push origin "$0"
   git add .
   git commit -m "[$1] $2"
   git push --set-upstream origin "$0"
}

functionTest $0 $1 $2
