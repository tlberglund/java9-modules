#~/bin/sh


# High-tech clean task

rm -rf counting-logger/build
rm -rf simple-logger/build
rm -rf main-module/build

mkdir -p counting-logger/build/classes
mkdir -p simple-logger/build/classes
mkdir -p main-module/build/classes

rm mlibs/*.jar

# Next-level javac abstraction

cd counting-logger
javac -d build/classes $(find src/main/java -name "*.java")
jar cvf ../mlibs/counting-logger.jar -C build/classes/ .

cd ../simple-logger
javac -d build/classes $(find src/main/java -name "*.java")
jar cvf ../mlibs/simple-logger.jar -C build/classes/ .

cd ../main-module
javac -mp ../mlibs -d build/classes $(find src/main/java -name "*.java")
jar cvf ../mlibs/main.jar -C build/classes/ .

cd ..
java -mp mlibs -m com.timberglund.poetry/com.timberglund.poetry.PoetryEmitter
