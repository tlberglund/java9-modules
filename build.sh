#~/bin/sh

rm -rf counting-logger/build/classes/*
rm -rf simple-logger/build/classes/*
rm -rf main-module/build/classes/*

cd counting-logger
javac -d build/classes $(find src/main/java -name "*.java")
jar cvf build/counting-logger.jar -C build/classes/ .

cd ../simple-logger
javac -d build/classes $(find src/main/java -name "*.java")
jar cvf build/simple-logger.jar -C build/classes/ .

cd ../main-module
javac -modulepath ../simple-logger/build -d build/classes $(find src/main/java -name "*.java")

# java -cp build/classes com.timberglund.poetry.PoetryEmitter
