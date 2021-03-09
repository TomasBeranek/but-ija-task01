SRC=src

test: clean
	mkdir build
	javac -classpath ${SRC}:junit.jar:ija2020-ukol1.jar -d build ${SRC}/ija/ija2020/homework1/Homework1Test.java
	java -cp build:junit.jar:ija2020-ukol1.jar org.junit.runner.JUnitCore ija.ija2020.homework1.Homework1Test

clean:
	rm -rf build xberan46.zip

zip:
	cd src/ && zip -r xberan46.zip && mv xberan46.zip ../
