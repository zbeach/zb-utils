# ZB Utils
A set of utility functions for various purposes

## Build
If you have Gradle installed, run `gradle build`.

Otherwise,
- On **Linux** or **macOS**, in the project's root directory, run `./gradlew build`
- On **Windows**, in the project's root directory, run `gradlew.bat build`.

## Style requirement
ZB Utils's source code complies with [Google's Java Style standard](https://google.github.io/styleguide/javaguide.html).

If you have Gradle installed, to easily format the source code, run `gradle goJF`. To verify that all `*.java` files are formatted properly, run `gradle verGJF`.

## Generate Javadoc
If you have Gradle installed, run `gradle makeJavadocs`

Otherwise,
- On **Linux** or **macOS**, in the project's root directory, run `./gradlew makeJavadocs`
- On **Windows**, in the project's root directory, run `gradlew.bat  makeJavadocs`

## Gradle plugins (automatically downloaded)
- [google-java-format-gradle-plugin](https://github.com/sherter/google-java-format-gradle-plugin) uses [google-java-format](https://github.com/google/google-java-format) to reformat Java source code to comply with Google Java Style.
