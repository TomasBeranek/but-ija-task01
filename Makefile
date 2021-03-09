# File:           StoreShelf.java
# Course:         Java Programming Language (IJA) -- BUT FIT
# Project:        A simple implementation of a system that represents shelfs
#                 for storing items
# Author:         Tomas Beranek (xberan46)
# Email:          xberan46@stud.fit.vutbr.cz
# Date:           9.3.2021

SRC=src

test: clean
	mkdir build
	javac -classpath ${SRC}:junit.jar:ija2020-ukol1.jar -d build ${SRC}/ija/ija2020/homework1/Homework1Test.java
	java -cp build:junit.jar:ija2020-ukol1.jar org.junit.runner.JUnitCore ija.ija2020.homework1.Homework1Test

clean:
	rm -rf build xberan46.zip

zip:
	cd src/ && zip -r xberan46.zip ija && mv xberan46.zip ../
