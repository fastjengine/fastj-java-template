# FastJ Java Template Program

## How to Use

- Clone the repository `git clone https://github.com/lucasstarsz/fastj-java-template`
- Or download from https://github.com/lucasstarsz/fastj-java-template/releases/latest

_Note: this project uses Java 16 and Gradle 7._

## Running the Program

1. Build the program:
    ```bash
    ./gradlew build
    ```
2. Run the template program:
    ```bash
    ./gradlew run
    ```


## Distributing Installer/Executable

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


## Configuring the Project Variables

Please view the [build.gradle](build.gradle) file -- it contains general instructions for modifying the base example.


[Terminals Are Different]: https://gist.github.com/lucasstarsz/9bbc306f8655b916367d557043e498ad "Terminals Access Files Differently"

