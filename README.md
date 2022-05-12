# FastJ Java Template Program

## Requirements
- [Java 11 JDK or Higher][jdk-link]
- Basic understanding of Java


## Initial Setup

### Download the Template
You have a few options for getting the template:

#### Create from Template
1. Click the "Use This Template" button at the top of this project. Leave everything on the project creation screen as is, and hit "Create repository from template".
   ![image](https://user-images.githubusercontent.com/64715411/125542737-6eb23326-d07a-4a28-89af-dcacb4f01cac.png)
   ![image](https://user-images.githubusercontent.com/64715411/125543010-b960404a-ad40-431c-ab31-c097f52574bb.png)

2. Download your project from GitHub:
    - via terminal: `git clone https://github.com/yourgithubusername/yourprojectname`
    - or by downloading the ZIP file, specified under the "↓Code" button.
      ![image](https://user-images.githubusercontent.com/64715411/125545310-c62610da-1eb5-4e80-86b3-352b1ea16612.png)

#### Clone the template directly
1. Clone the repository via terminal: `git clone https://github.com/lucasstarsz/fastj-java-template`

#### Downloading the latest release
Download the archive (.zip file, or tar.gz file) from https://github.com/lucasstarsz/fastj-java-template/releases/latest


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
Check out the following links to learn how to use FastJ:
- [Example Programs][example-programs-readme-link]
- [FastJ Documentation][documentation-link]


## Configuring the Project Variables
Please view the [build.gradle](build.gradle) file -- it contains general instructions for modifying the base example.


[jdk-link]: https://adoptium.net/?variant=openjdk17 "Java JDK Download"
[Terminals Are Different]: https://gist.github.com/lucasstarsz/9bbc306f8655b916367d557043e498ad "Terminals Access Files Differently"
[example-programs-readme-link]: http://fastj.me/tree/main/src/example "FastJ Examples"
[documentation-link]: https://javadoc.io/doc/io.github.lucasstarsz.fastj/fastj-library "FastJ API Documentation"
