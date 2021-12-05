# ProcessingForKotlinTemplate
A template for doing "Processing" for Kotlin

En | [Ja](./README.ja.md)  

## Use Library
- [shadow](https://github.com/johnrengelman/shadow) ([Apache License](http://www.apache.org/licenses/LICENSE-2.0))

## Usage
### Clone template
```bash
mkdir Your_Cool_Project_Name
cd Your_Cool_Project_Name
git clone https://github.com/kota-shiokara/ProcessingForKotlinTemplate.git
cd ProcessingForKotlinTemplate
```
or
**Use this template to create a new repository and clone it.**

### Edit settings.gradle
```settings.gradle
rootProject.name='Your_Project_Name'
```

### Edit build.gradle
```build.gradle
group 'Your_Group_Name'
```

### Edit src/main/kotlin/main.kt
```kt
class Main : PApplet(){
                .
                .
    override fun setup() {
        /* Write Your Code */
    }

    override fun draw() {
        /* Write Your Code */
    }
                .
                .
```

## Run
Type the following command directly under the root of project.
```bash
# Linux or macOS
./gradlew run
```
or
```cmd
@rem windows(command prompt)
gradlew run
```

**If you want to distribute your work as a jar file, type the following command.**

### Build
```bash
./gradlew shadow
```
or
```cmd
gradlew shadow
```
**The output file is stored under build/libs/.**

### Run
```bash
java -jar "Output_File_Name"
```

## Author
- [kota-shiokara](https://github.com/kota-shiokara)
- Email: ikanoshiokara.fun@gmail.com
- Twitter: [@shiokara_create](https://twitter.com/shiokara_create)

## About Report
Please use [issue](https://github.com/kota-shiokara/ProcessingForKotlinTemplate/issues) for filing feature requests and bug reports. Or use the contact information above.

## License
[MIT License](https://choosealicense.com/licenses/mit/)
