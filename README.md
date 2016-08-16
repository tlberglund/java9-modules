

## Steps to do Things

```
└── src
    └── main
        └── java
            ├── com
            │   └── timberglund
            │       └── poetry
            │           └── PoetryEmitter.java
            └── module-info.java
```
`javac -d build/classes $(find src/main/java -name "*.java")`
`jar cvf build/poetry.jar -C build/classes/ .`
`java -cp build/classes com.timberglund.poetry.PoetryEmitter`
