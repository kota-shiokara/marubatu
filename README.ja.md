# ProcessingForKotlinTemplate
KotlinでProcessingをやるときのテンプレート  

[En](./README.md) | Ja  

## 使用ライブラリ
- [shadow](https://github.com/johnrengelman/shadow) ([Apache License](http://www.apache.org/licenses/LICENSE-2.0))

## 使い方
### テンプレートのクローン
```bash
mkdir 適当なリポジトリ
cd 適当なリポジトリ
git clone https://github.com/kota-shiokara/ProcessingForKotlinTemplate.git
cd ProcessingForKotlinTemplate
```
or
**もしくは、このテンプレートを使用して新しいリポジトリを作成し、クローンしてください。**

### settings.gradleの修正
```settings.gradle
rootProject.name='プロジェクトの名前'
```

### build.gradleの修正
```build.gradle
group 'あなたのグループ名'
```

### src/main/kotlin/main.ktの追記
```kt
class Main : PApplet(){
                .
                .
    override fun setup() {
        /* あなたのコードを書いてください */
    }

    override fun draw() {
        /* あなたのコードを書いてください */
    }
                .
                .
```

## Run
プロジェクトのルート直下、このファイルがある場所で下記のコマンドを入力してください。
```bash
# Linux もしくは macOS
./gradlew run
```
もしくは
```cmd
@rem windows(コマンドプロンプト)
gradlew run
```

**もしあなたが自分の作品をJarファイルで公開等したい場合、下記の工程を行ってください。**

### ビルド
```bash
./gradlew shadow
```
もしくは
```cmd
gradlew shadow
```
**出力ファイルはbuild/libs/以下に格納されます。**

### Run
```bash
java -jar "出力ファイルの名前(もしくはそれを含めたパス)"
```

## 開発者情報
- [kota-shiokara](https://github.com/kota-shiokara)
- Email: ikanoshiokara.fun@gmail.com
- Twitter: [@shiokara_create](https://twitter.com/shiokara_create)

## 報告
バグの報告、改善の要望につきましては [issue](https://github.com/kota-shiokara/ProcessingForKotlinTemplate/issues) もしくは上記連絡先にお願いします。  

## License
[MIT License](https://choosealicense.com/licenses/mit/)
