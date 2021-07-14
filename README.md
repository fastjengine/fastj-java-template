# FastJ Java Template Program

## Requirements
- [Java 16 JDK][jdk-link]
- Basic understanding of Java


## Initial Setup

### Getting this template

- Clone the repository `git clone https://github.com/lucasstarsz/fastj-java-template`
- Or download from https://github.com/lucasstarsz/fastj-java-template/releases/latest

### Running the Program

1. Build the program:
    ```bash
    ./gradlew build
    ```
2. Run the template program:
    ```bash
    ./gradlew run
    ```


## General Usage

### Generating Installer/Executable

1. Build the program:
    ```bash
    ./gradlew build
    ```
2. Create the executable:
    ```bash
   ./gradlew jpackage 
   ```
3. The executable and installer files will be found in `build/jpackage`.

_Having trouble using `gradlew`? Read [this][Terminals Are Different]._


## Learning FastJ
Check out the following:
- [Example Programs][example-programs-readme-link]
- [FastJ Documentation][documentation-link]


## Configuring the Project Variables

Please view the [build.gradle](build.gradle) file -- it contains general instructions for modifying the base example.


[jdk-link]: https://adoptopenjdk.net/?variant=openjdk16 "Java 16 JDK Download"
[Terminals Are Different]: https://gist.github.com/lucasstarsz/9bbc306f8655b916367d557043e498ad "Terminals Access Files Differently"
[example-programs-readme-link]: http://fastj.me/tree/main/src/example "FastJ Examples"
[documentation-link]: https://javadoc.io/doc/io.github.lucasstarsz.fastj/fastj-library "FastJ API Documentation"
