# Steps

In order to make Kotlin work in VS Code, I had to execute these steps:

1) Download the ZIP file as indicated in [Kotlin webpage](https://kotlinlang.org/docs/command-line.html#install-the-compiler)
2) [Unzip the file content](https://askubuntu.com/questions/86849/how-to-unzip-a-zip-file-from-the-terminal) to /usr/local/bin/kotlin/
3) Create ~/.bash_aliases file with some EXPORTS, as [taught on StackOverflow](https://stackoverflow.com/questions/69090560/running-kotlin-from-vs-code-in-ubuntu-gives-kotlinc-not-found)
4) [Installed two Extensions](https://dev.to/mwrpwr/learning-kotlin-programming-with-visual-studio-code-5e29): Kotlin Language and Code Runner


## Another sources for installation (previous steps didn't work)

https://aster.cloud/2022/09/07/how-to-install-kotlin-on-ubuntu-22-04/


## To compile and run the file hello.kt

```sh
kotlinc hello.kt
kotlin HelloKt
```