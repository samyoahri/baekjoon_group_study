---
# ๐ฏ ๋ฐฑ์ค์ฝํ ๊ทธ๋ฃน ์คํฐ๋ ๐
---
์๋ฃ๊ตฌ์กฐ, ์๊ณ ๋ฆฌ์ฆ ๋ฐ ์ฝํ ๋ฌธ์  ํ์ด ์คํฐ๋์๋๋ค.

## โ ์ฐธ์ฌ ๋ฐฉ๋ฒ
1. ๊ด๋ฆฌ์์๊ฒ ๋ธ๋์น ์์ฑ์์ฒญ์ ํด์ฃผ์ธ์. ์๊ธฐ ํด๋น ๋๋ค์์ ์์ฒญํด์ฃผ์ธ์.
2. ์ด ์ ์ฅ์๋ฅผ `fork` ํด์ฃผ์ธ์.
3. ํด๋นํ๋ ๋ ์ง์ ํ์ํ ๋ฌธ์ ํด๋์ ๋งํฌ๊ฐ ์์ต๋๋ค. ๊ฐ๋ฅํ๋ฉด ํด๋นํ๋ ๋ ์ง์ ๋ฌธ์ ๋ฅผ ํ์ด์ฃผ์ธ์.
4. ๋ฐฑ์ค์ ๋ฌธ์ ๋ฅผ ์ ์ถํ์ฌ ์ ๋ต์ฒ๋ฆฌ๊ฐ ์ ๋๋ก ๋์์ผ๋ฉด, ```ํ์ผ์์ฑ๊ท์น```์ ๋ฐ๋ผ ํ์ผ์ ๋ง๋ค์ด ์ฃผ์ธ์.
4. ์ด๋ `commit ๊ท์น`์ ์ง์ผ์ฃผ์ธ์.
5. ์๋ณธ ์ ์ฅ์๋ก `Pull Request`๋ฅผ ํ๋ค. (๋งค์ผ ์ ๋6์~7์ ์ดํ merge ์์ )
6. ๋ค๋ฅธ ์ฌ๋๋ค์ PR์ ๋ณด๊ณ  ์์ ๋กญ๊ฒ ์ฝ๋๋ฆฌ๋ทฐ๋ฅผ ํ๋ค.
7. ์ฃผ์์ฌํญ: ***๊ธฐ์กด ํด๋์ ํ์ผ์ ์ง์ฐ๋ฉด ์๋ฉ๋๋ค!!***


<br />
<br />

## โ ์์ค์ฝ๋ ์์ฑ๊ท์น
- ์์ค์ฝ๋๋ ์์ ๋กญ๊ฒ ์์ฑํด์ฃผ์ธ์.
- ์ฃผ์์ฌํญ: java ์ฌ์ฉ์๋ค์ ๋ฐฑ์ค ์ ์ถ์ ํด๋์ค ์ด๋ฆ์ด Main์ด์ด์ผ ์ ์ถ์ด ๊ฐ๋ฅํฉ๋๋ค. ํ์ง๋ง, ์ปค๋ฐ ์ ์ถํ  ๋๋ ํ์ผ์ด๋ฆ๊ณผ ํด๋์ค ์ด๋ฆ ๊ท์น์ ๋ฐ๋ผ์ฃผ์ธ์.
  - ๋ฐฑ์ค ์ ์ถ์ ์ฝ๋
    ```java
    public class Main {
        public static void main(String[] args) {
            System.out.println("Hello World!");
        }
    }
    ```
    
  - ์ปค๋ฐ ์ ์ถ์ ์ฝ๋
    ```java
    public class boj_2557_samyoahri {
        public static void main(String[] args) {
            System.out.println("Hello World!");
        }
    }
    ```
<br />
<br />

## โ ํ์ผ ์์ฑ ๊ท์น
- '์ฝํํ๋ซํผ_๋ฌธ์ ๋ฒํธ_์์ฑ์๋๋ค์' ์์๋ก ์์ฑํด์ฃผ์ธ์.
  - `boj_3003_samyoahri`
  - `boj_1000_jinwoo`
  - `boj_2557_bando99`
- ํด๋๋ช ๋๋ ์์ค์ฝ๋ ํ์ผ๋ช์ ์ฝ๋ก  ":" ์๋ฉ๋๋ค
- ์ฃผ์์ฌํญ: java ์ฌ์ฉ์๋ค์ ๋ฐฑ์ค ์ ์ถ์ ํด๋์ค ์ด๋ฆ์ด Main์ด์ด์ผ ์ ์ถ์ด ๊ฐ๋ฅํฉ๋๋ค. ํ์ง๋ง, ์ปค๋ฐ ์ ์ถํ  ๋๋ ํ์ผ์ด๋ฆ๊ณผ ํด๋์ค ์ด๋ฆ ๊ท์น์ ๋ฐ๋ผ์ฃผ์ธ์.
  - ๋ฐฑ์ค ์ ์ถ์ ์ฝ๋
    ```java
    public class Main {
        public static void main(String[] args) {
            System.out.println("Hello World!");
        }
    }
    ```
    
  - ์ปค๋ฐ ์ ์ถ์ ์ฝ๋
    ```java
    public class boj_2557_samyoahri {
        public static void main(String[] args) {
            System.out.println("Hello World!");
        }
    }
    ```
<br />
<br />

## โ commit ๊ท์น
- commit์ 1๋ฌธ์ ๋ฅผ ํ๋๋ง๋ค ์์ฑํด์ฃผ์ธ์.
  - commit์ 1๋ฌธ์ ๋ง๋ค ์์ฑํด์ฃผ์์ผ ์ฝ๋๋ฅผ ๊น์ผ๋ก ๊ด๋ฆฌํ๊ธฐ ํธํฉ๋๋ค.
  - 14๋ช์ด ๊ฐ์ด ์ฝ๋๋ฅผ ๊ณต์ ํ๋ ์ผ์ด๋ผ ๋ถํธํ์๋๋ผ๋ ์กฐ๊ธ๋ง ์ํดํด์ฃผ์ธ์. ๊ด๋ฆฌํ๋ ์ ๋ ๋ ํ๋ญ๋๋ค.ใ ใ 
- commit๋ ๊ด๋ฆฌํ๊ธฐ ํธํ๊ธฐ ์ํด `ํ์ผ ์์ฑ ๊ท์น`์ ๊ธฐ๋ฐํด์ ์์ฑํด์ฃผ์ธ์
- ์ฝ๋๋ฅผ ์ฒ์๋ง๋ค ๋๋, Create '์ฝํํ๋ซํผ_๋ฌธ์ ๋ฒํธ_์์ฑ์๋๋ค์' ์์๋ก ์์ฑํด์ฃผ์ธ์.
  - `Create boj_3003_samyoahri`
  - `Create boj_1000_jinwoo`
  - `Create boj_2557_bando99`
- ์ฝ๋๋ฅผ ์์ ํ  ๋๋, Create '์ฝํํ๋ซํผ_๋ฌธ์ ๋ฒํธ_์์ฑ์๋๋ค์' ์์๋ก ์์ฑํด์ฃผ์ธ์.
  - `Update boj_3003_samyoahri`
  - `Update boj_1000_jinwoo`
  - `Update boj_2557_bando99`
- description: ๋ฌธ์ ์ด๋ฆ / ๋์ด๋ / ๊ฑธ๋ฆฐ์๊ฐ ์์ผ๋ก ์์ฑํด์ฃผ์ธ์. ๋ฐ๋์ ์์ฑํด์ผํ๋ ๊ฒ์ ์๋์ง๋ง ๋ฐฑ์ค ๋ฌธ์ ๋ฅผ ์ ์ ํ๋๋ฐ ๋์์ด ๋ฉ๋๋ค.
- ํฐ๋ฏธ๋์์ ์์ฑ๋ฒ: 
```
git commit -m "Create boj_3003_samyoahri"
```

<br />
<br />

## โ PR ๊ท์น
- PR์ ์์ ์ด ํด๋นํ๋ branch์ pr์ ๋ ๋ ค์ฃผ์ธ์. `main`๋ธ๋์น์ ๋ ๋ฆฌ๋ฉด ์๋ฉ๋๋ค.
- ๋จ, ์์ ์ repository ํน์ ์๊ฒฉ์ ์ฅ์์๋ main์ผ๋ก ์ปค๋ฐ์ ๊ด์ฐฎ์ต๋๋ค. pull request ๋ ๋ฆด ๋ `main`๋ธ๋์น์ ๋ ๋ฆฌ๋ฉด ์๋๋ค๋ ๋ป์๋๋ค.
- PR ์ ๋ชฉ: ์ด๋ฆ / ์ฃผ์ฐจ / ๋ช ๋ฌธ์ 
-  ```samyoahri / 8์ 1์ฃผ์ฐจ / 4๋ฌธ์  ```



<br />
<br />

## โ (option)์ฝ๋๋ฆฌ๋ทฐ ๊ท์น
- ์์ฑ์์ 


<br />
<br />

## โ git ์ฌ์ฉ๋ฐฉ๋ฒ
### CLI, ์์คํธ๋ฆฌ ์ฌ์ฉ๋ฒ
- ์ข ๋ ๋ค์ํ ๊ธฐ๋ฅ์ ์ฌ์ฉํ๊ธฐ ์ํด์๋ git CLI์ ์์คํธ๋ฆฌ๋ฅผ ์ด์ฉํ๋ ๊ฒ์ด ์ข์ต๋๋ค. 
ํ์ง๋ง, ํ์๋ git๊ณผ sourcetree๋ ์์ง ์ ์ฌ์ฉํ๋ ๊ฒ์ด ์๋๋ผ์ ๋งํฌ๋ก ๋์ฒดํฉ๋๋ค.
- ์์ฝ๊ฐ์ข(https://www.youtube.com/watch?v=1I3hMwQU6GU)
- ์ํ์ฝ๋ฉ๊ฐ์ข(https://www.youtube.com/playlist?list=PLcDtUrBwapUOQzycPhaGUFnc-ogBOI6N_)
### github desktop ์ฌ์ฉ๋ฒ
- ๊ทธ๋์ ์ข ๋ ์ฌ์ฉํ๊ธฐ ํธํ github desktop์ ์ฌ์ฉํ๊ณ ์ ํฉ๋๋ค.
  #### 1. url์ ์
  - https://github.com/samyoahri/baekjoon_group_study.git
  #### 2. fork
  - fork๋ samyoahri์ ์๊ฒฉ์ ์ฅ์(remote repository)๋ฅผ ๊ทธ๋๋ก ๋ค๊ณ ๊ฐ์ ์๊ธฐ ์์ ์ ์๊ฒฉ ์ ์ฅ์๋ก ๋ค๊ณ  ๊ฐ๋ ๊ณผ์ ์๋๋ค.
  - ๊ธฐ์กด ํด๋ก ์ผ๋ก ๋ค๊ณ ๊ฐ๋ฉด ์๊ธฐ ์์ ์ ์๊ฒฉ์ ์ฅ์(์๋ฅผ ๋ค์ด, riberty์ ์ ์ฅ์)์ ์๋๊ฐ ์ฌ๊ธฐ์ง ์๋ ๊ฒ์ ๋ํ ๋ฐฉ๋ฒ์ผ๋ก fork๋ฅผ ๋ ์ ๊ฐ์ ธ๊ฐ๋ ๊ณผ์ ์ ์ถ๊ฐํ์ต๋๋ค. ์ผ๋ฐ์ ์ผ๋ก๋ ํ์ง ์์๋ ๋๋ ๊ณผ์ ์ผ ์ ์์ง๋ง, ๊ทธ๋๋ ์ํํ ์งํ์ ์ํด์ ๋ฐ๋์ fork๋ฅผ ๋ ์ฃผ์ธ์.
  - samyoahri์ ์๊ฒฉ์ ์ฅ์ ์ค ํ๋์ธ baekjoon_group_study์ ์ฅ์๋ก ๋ค์ด๊ฐ์ฃผ์ธ์. ๋ค์ด๊ฐ์ ์๋ ๊ทธ๋ฆผ๊ณผ ๊ฐ์ด fork ๋ฒํผ์ด ๋ณด์ด์๋์? fork๋ฅผ ๋๋ฌ์ฃผ์ธ์
  ![fork1](https://user-images.githubusercontent.com/82167151/209756109-50691198-3b27-4ea8-8cc1-fc88a01dda05.png)
  - fork๋ฅผ ๋๋ฅด์๋ฉด ์๋์ ๊ฐ์ ์ฐฝ์ผ๋ก ๋ฐ๋ ๊ฒ์๋๋ค. ์๋์ ๊ฐ์ด ์งํํ์ฌ create fork๋ฒํผ์ ๋๋ฌ์ฃผ์ธ์.
  ![fork2](https://user-images.githubusercontent.com/121100022/209756386-06f83fdd-aa39-4ea5-be38-d9734366e7ac.png)
  - ๊ทธ๋ฌ๋ฉด ์๋์ ๊ฐ์ด ์๊ธฐ์์ ์ ์๊ฒฉ ์ ์ฅ์(remote repository)๋ก ๋ค๊ณ ๊ฐ ๊ฒ์๋๋ค. ์๋์ ๊ฐ์ด Bictor Lym๊ณผ ๊ฐ์ด ์๊ธฐ ์ ์ฅ์์ ์ ๋๋ก fork๋ฅผ ๋ณ๋์ง ํ์ธํด์ฃผ์ธ์.
  ![fork3](https://user-images.githubusercontent.com/121100022/209756410-b1be60f4-1857-405b-b33d-7f52361ce87c.png)
  #### 3. git clone
  - clone์ ์๊ฒฉ์ ์ฅ์์ ์๋ ์์ค์ฝ๋๋ฅผ ๋ก์ปฌ ์ ์ฅ์(local repository)๋ก ๋ค๊ณ  ๊ฐ๋ ๊ณผ์ ์๋๋ค. ์ข ๋ ์ฝ๊ฒ ๋งํด์, ์ธํฐ๋ท์๋ง ์๋ ์ฝ๋๋ฅผ ์๊ธฐ์์ ์ ์ปดํจํฐ์ ์ฝ๋๋ฅผ ๊ฐ์ ธ์ค๋ ๊ณผ์ ์๋๋ค.
  - ์ด ๊ณผ์ ์ ์งํํ๋ ์ด์ ๋ ์ข ๋ ํธํ๊ฒ ๋ก์ปฌ ์ ์ฅ์์์ ์์์ ํด์ ์ฝ๊ฒ ์๊ธฐ ์์ ์ ์๊ฒฉ์ ์ฅ์์ ์ ์ฅํ๊ธฐ ์ํด์ ํ๋ ๊ฒ์๋๋ค. ์ด ๊ณผ์ ์ ์งํํ์ง ์์ผ๋ฉด ๊นํ๋ธ ์ ์ฅ์๋ฅผ ์ด์ด์ ํ์ผ์ ์ฌ๋ฆฌ๋ ๊ณผ์ ์ ์์ผ๋ก ์ผ์ผ์ด ํด์ผํฉ๋๋ค. ํ์ผ์ด ์ ์ ๋๋ ์์ผ๋ก ์ผ์ผ์ด ํ๋ ๊ฒ์ด ๊ทธ๋ ๊ฒ ์ด๋ ต์ง ์์ง๋ง, ํ์ผ์ 10๊ฐ์ฉ ์์ฐํ๊ฑฐ๋ ์์ ํ๋ค ๋ณด๋ฉด ๊ทธ๊ฑธ ์ฌ๋์์ผ๋ก ์ผ์ผ์ด ์ฌ๋ฆฌ๋ ๊ณผ์ ์ด ์์ฒญ ํ๋ญ๋๋ค. ๊ทธ๊ฒ๋ณด๋ค๋ CLI์ธ GIT์ ์ฌ์ฉํ๊ฑฐ๋ ์๋๋ฉด ํ์ฌ ์งํ์ค์ธ GUIํด์ธ Github desktop์ ์ฌ์ฉํ๊ธฐ ์ํด์ ๋ฐ๋์ ํ์ํ ๊ณผ์ ์๋๋ค.
  - ์๋์ ๊ฐ์ด ์๊ธฐ ์์ ์ github desktop์ ๋ค์ด๊ฐ์ ์๊ธฐ์์ ์ ์๊ฒฉ์ ์ฅ์์ repository๋ฅผ cloneํด์ฃผ์ธ์.
  ![git_clone1](https://user-images.githubusercontent.com/121100022/209757466-0f7b7ded-2c37-43f4-a812-cdda076c8549.png)
  - ์ฌ๊ธฐ์ ์ ๋ samyoahri์ repository๋ฅผ ํด๋ก ํ์ง๋ง์ธ์. ์๊น ์์์ fork๋ฅผ ๋จ๋ฉด์ ์๊ธฐ์์ ์ repository์ samyoahri์ ์ ์ฅ์๋ฅผ forkํด ์์ต๋๋ค.
  - ๊ทธ๋ฌ๋๊น, ๋ฐ๋์ ์๊ธฐ ์์ ์ repository๋ฅผ ํด๋ก ํ์ธ์.!!!!
  ![git_clone2](https://user-images.githubusercontent.com/121100022/209757467-27f9111e-ce37-4d37-99a8-15793b4d7358.png)
  - ์ฐ๋ฆฌ๋ ์ฝ๋๋ฅผ ํตํฉํ  ๊ฒ์ด๋ฏ๋ก ์๋์ ๊ฐ์ด `To contribute to the parent project`๋ฅผ ํด๋ฆญํด์ฃผ์ธ์.
  - `for my own purpose`๋ ๊ฐ์ธ ํ๋ก์ ํธ์ ์ฝ๋๋ฅผ ๋ค๊ณ  ๊ฐ๋ ์ฌ์ฉํ๊ธฐ ์ ํฉํฉ๋๋ค.
  ![git_clone3](https://user-images.githubusercontent.com/121100022/209757469-ce996e6e-ef3d-499e-92a8-26ba6e1c71c8.png)

  #### 4. branch
  - branch๋ฅผ ์ด์ฉํ์ฌ์ ์ข ๋ ๋ณด๊ธฐ ํธํ ๊ตฌ์กฐ๋ก ๋ง๋ค์ด๋ณผ๊น๋ ์๊ฐํ์ง๋ง, ํ์ฌ๋ ์๋ตํ๊ณ  ์ถํ ์ด๋์ ๋ ๊น ์ฌ์ฉ๋ฒ์ด ์ฌ๋ผ๊ฐ๋ฉด ์ ์ฉํด๋ณผ ์๊ฐ์๋๋ค.
  #### 5. folder
  - folder ๊ตฌ์กฐ๋ ์๋์ค ๊ฒ์ด ์์ต๋๋ค. ๊ด๋ฆฌ์๊ฐ ์์์ ํด๋๋ฅผ ๋ง๋ค ์์ ์๋๋ค.
  - ์๋์์ ๋ณด๋ ๊ฒ๊ณผ ๊ฐ์ด ํฐ ํด๋ week00๊ณผ ๊ฐ์ด ์ฃผ์ฐจ์ ๋ฐ๋ผ ํฐ ํด๋๊ฐ ์์ ๊ฒ์๋๋ค.
    ํ์ฌ ํด๋นํ๋ `weekXX`ํด๋๋ฅผ ์ฐพ์์ฃผ์ธ์
  - week00์์ ๋ณด๋ฏ์ด ๊ทธ ์๋์๋ ํด๋น ์ฃผ์ฐจ์ ํ ๋ฐฑ์ค๋ฌธ์ ์ ํด๋นํ๋ ๋ฌธ์ ๋ฒํธ์ ์์ผ์ด ์ ํ ์์ต๋๋ค.
    `๋ฌธ์ ์ถ์ฒ_๋ฌธ์ ๋ฒํธ_์์ผ`๋ก ํด๋ ๊ตฌ์กฐ๊ฐ ๋ ์์ต๋๋ค. ํด๋นํ๋ ๋ฌธ์ ๋ฅผ ๊ฒ์ํ์๋ฉด ๋ฉ๋๋ค.
  ![folder_updated1_1](https://user-images.githubusercontent.com/82167151/209761082-cc5bc44c-65c2-4730-adfb-577f47cf15f6.png)
  #### 6. gitignore
  - ์์ค์ฝ๋๋ฅผ ์ ์ธํ ๋ชจ๋  ํ์ผ๋ค์ gitignore์ ์์ฑํด์ฃผ์ธ์
  #### 7. code ์์ฑ
  - ์๋์ ๊ฐ์ด ํด๋นํ๋ `weekXX`ํด๋์ ๋ค์ด๊ฐ์ `boj_๋ฌธ์ ๋ฒํธ_์์ผ`์ ํด๋๋ค ์ค ํด๋นํ๋ ์์ผ์ ํด๋์ ๋ค์ด๊ฐ์ฃผ์ธ์
  - ์๋์ ๊ฐ์ด ๊ทธ ๊ณณ์ ํด๋นํ๋ ์์ค์ฝ๋ ํ์ผ์ ๋ง๋ค์ด์ฃผ์ธ์
  ![code_updated1_2](https://user-images.githubusercontent.com/121100022/209762651-d839166f-72ea-4e68-baf3-49104630da5b.png)
  - ์๋ ๋ด์ฉ์ ์ ๋ง ์ค์ํฉ๋๋ค!!!
  - ์ฝ๋๋ฅผ ๊ณต์ ํด์ ๋๊ฐ ์์ฑํ ๊ฒ์ธ์ง ํ์ธํ๊ณ  pull request๋ฅผ ๋ฐ์์ ๋, ํ๋์ ๋๊ฐ ์์ฑํ ๊ฒ์ธ์ง ์๊ธฐ ์ํด์ ๋ฐ๋์ ํ์ํ ๊ณผ์ ์๋๋ค.
  - ์์ค์ฝ๋๋ฅผ ์์ฑํ  ๋ `boj_๋ฌธ์ ๋ฒํธ_์์ฑ์`๋ฐฉ์์ผ๋ก ์์ค์ฝ๋์ ํ์ผ์ด๋ฆ์ ์ ์ํด์ฃผ์ธ์!!! ๋ฐ๋์
![code_updated1_3](https://user-images.githubusercontent.com/121100022/209762655-ab9f276b-3976-46d9-abab-bceefda423c3.png)
  - ์๋์ ๊ฐ์ด ๋ฌธ์ ์ ํด๋นํ๋ ์์ค์ฝ๋๋ฅผ ์์ฑํด์ฃผ์ธ์.
  ![code_updated1_4](https://user-images.githubusercontent.com/121100022/209762656-3d1d1647-8352-42b6-8cdf-ea1d57d42941.png)
  #### 8. ๋ฐฑ์ค์ ์ถ
  - ์์์ ์ค๋ชํ ๊ฒ๊ณผ ๊ฐ์ด JAVA์ฌ์ฉ์๋ค์ ์ฃผ์๊ฐ ํ์ํฉ๋๋ค. ์๋์ ๊ฐ์ด ๋ฐฑ์ค์ ์ถ์ ์ฝ๋์ ๊นํ๋ธ ์ ์ถ์ ์ฝ๋๊ฐ ์๋ก ๋ค๋ฆ๋๋ค. ๊ธฐ์กด ๋ก์ปฌ์์ ์์ค์ฝ๋๋ฅผ ์์ฑํ์ค ๋๋ ๊นํ๋ธ ๊ท์น์ ์ค์ํ์๋ค๊ฐ, ๋ฐฑ์ค ์ ์ถ์ ํด๋์ค ์ด๋ฆ์ `Main`์ผ๋ก ๋ฐ๊พธ์๋ ๊ฒ์ด ํจ์ฌ ํธํ  ๊ฒ์๋๋ค.
  ![baekjoon_submit1](https://user-images.githubusercontent.com/121100022/209763710-cc1c2e54-1975-464b-ad82-13733194fe9b.png)
  - ์๋์ ๊ฐ์ด ์ ์ถ์ ์๋ฃํ๋ฉด ์ ๋ต์ฒ๋ฆฌ๊ฐ ๋  ๊ฒ์๋๋ค.
  ![baekjoon_submit2](https://user-images.githubusercontent.com/121100022/209763712-42f470cb-c4d5-4a8a-8f2a-4eb25a24be44.png)

  #### 9. fetch
  - fetch๋ ์๊ธฐ์์ ์ remote repository์ ๋ณ๊ฒฝ์ด ์๋์ง ํ์ธํ๋ ์์์๋๋ค.
  - ํ์ง๋ง ์ ํฌ๋ fork๋ฅผ ๋ ์ ์์์ ํ๊ณ  ์์ผ๋ฏ๋ก, fetch๋ฅผ ํ๊ธฐ์  samyoahri์ ์๊ฒฉ์ ์ฅ์์์ ์ฐจ์ด๋ฅผ ๋จผ์  ํ์ธํด์ผํฉ๋๋ค.
  - ๊ทธ๋ฌ๊ธฐ ์ํด์, fork sync๋ฅผ ์๋์ ๊ฐ์ด ์งํํ  ์์ ์๋๋ค.
  ![fetch_updated1_1](https://user-images.githubusercontent.com/121100022/209765842-2fc83bd8-4e78-4815-8321-1750a2f6a3f4.png)
  - ์์์ fork sync๋ฅผ ๋ง์ถ๊ณ  ๋๋ฉด github desktop์์ fetch๋ฅผ ์งํํด์ฃผ์ธ์.
  ![fetch_updated1_2](https://user-images.githubusercontent.com/121100022/209765845-529e5170-3e1b-40fc-9a3c-f445e87c8084.png)
  - ์ฐ๋ฆฌ๋ pull๊ณผ์ ์ ์งํํ  ๊ฒ์๋๋ค. pull์ด๋ ์๊ธฐ์์ ์ ์๊ฒฉ์ ์ฅ์์ ์ฝ๋๋ commit์ด ๋ฌ๋ผ์ง ๋ถ๋ถ๋ค์ ์ ๋ถ ๊ฐ์ ธ์ค๋ ๊ณผ์ ์๋๋ค.
  - pull๊ณผ์ ์ ์งํํ๊ธฐ์ํด, ์๋์ ๊ฐ์ด pull์ ์งํํ  ํ์ผ๋ค์ด ์๋ก๋ ๋์ด์์ ์ ์์ต๋๋ค. ๊ทธ๋ฌ๋ฉด ํด๋นํ๋ ๋ชจ๋  ํ์ผ๋ค์ pullํด์ฃผ์ธ์.
  ![fetch_updated1_3](https://user-images.githubusercontent.com/121100022/209765848-17ea3cc0-9ee8-460c-8fb8-6118bcb756b5.png)

  #### 10. commit
  - fetch๋ ์๋ฃํ๊ณ  pull๋ ์์์ ์๋ฃํ์ต๋๋ค.
  - commit์ ์๊ธฐ๊ฐ ๋ง๋  ์์ค์ฝ๋๋ฅผ local์ ์ฅ์(์๊ธฐ์์ ์ ์จ๊ธดํ์ผ .git)์ ์ฌ๋ฆฌ๋ ๊ณผ์ ์๋๋ค.
  - ๊ทธ๋ฌ๋ฉด ์ด์  commit์ ์งํํด๋ด์๋ค. commit์ ์งํํ๊ธฐ ์ํด github desktop์ ์ ์ํฉ๋๋ค. ์๋์์ ๋ณด๋ ๊ฒ๊ณผ ๊ฐ์ด github desktop์ด ์์์ ํ์ผ์ ๋ณํ๋ฅผ ์ฝ์ด ์ค๋๋ค.
  - ๊ทธ ๋ค์, ํด๋นํ๋ ์์์ `commit ๊ท์น`์ ๋ง์ถฐ์ ์์ฑํด์ฃผ์ธ์
  - `commit ๊ท์น`์ `Create boj_๋ฌธ์ ๋ฒํธ_์์ฑ์์ด๋ฆ`์์ผ๋ก ์์ฑํด์ฃผ์ธ์.
  - ์๋์์ ๋ณด๋ ๊ฒ๊ณผ ๊ฐ์ด commit์ ํ  ๋๋ ์์ํ ํ์ผ์ ํ๋์ฉ ์ฌ๋ ค์ฃผ์ธ์. ํน์๋ผ๋ ์ถฉ๋์ด ๋ฌ์ ๋, ๋๋๋ฆฌ๊ธฐ ์ํด ์์ ํ๋ ค๋ฉด ๊ด๋ฆฌ์๋ฟ๋ง ์๋๋ผ ๋ชจ๋๊ฐ ๋ง์ ์๊ฐ์ ์ฌ์ฉํด์ผ ํ  ์ ์์ต๋๋ค.
  ![commit_updated1](https://user-images.githubusercontent.com/121100022/209766868-d5f52b8c-81c3-42f2-b79c-7277228fdef0.png)
  - description์ ์๋ตํ์๋ ๋์ง๋ง, ํธํ๊ฒ ๋ง ์์ฑํด์ฃผ์๋ ๋ฉ๋๋ค. ์ฒด๊ฐ ๋์ด๋๋ฅผ ์ด์ผ๊ธฐํด์ฃผ์๋ฉด, ๋ค์ ๋ฌธ์ ๋ฅผ ์ ์ ํ๋๋ฐ ๋์์ด ๋ฉ๋๋ค.
  #### 11. push
  - push๋ ์ง๊ธ๊น์ง ์์ํ๋ ์์ค์ฝ๋๋ฅผ ๋ก์ปฌ์ ์ฅ์(.git)์์ ์๊ฒฉ์ ์ฅ์(์๊ธฐ์์ ์ github)์ ์ฌ๋ฆฌ๋ ๊ณผ์ ์๋๋ค.
  - ์๋์ ๊ฐ์ด push๋ฅผ ๋๋ฌ์ฃผ๋ฉด ์์์ ์งํ๋ฉ๋๋ค.
  ![push_updated1_1](https://user-images.githubusercontent.com/121100022/209767821-33a0cb51-f7c9-429e-b2a9-17b3ce968b85.png)

  #### 12. pull request
  - ์ง๊ธ๊น์ง ์์ํ ์์ค์ฝ๋๋ ์๊ธฐ์์ ์ ํด๋, ๋ก์ปฌ์ ์ฅ์, ์๊ฒฉ์ ์ฅ์์๋ ์ ์ฅ๋์ด์๋ ์ํ์ด์ง๋ง, samyoahri์ ์๊ฒฉ์ ์ฅ์์๋ ์ ์ฅ๋์ด ์์ง ์์ ์ํ์๋๋ค.
  - samyoahri์ ์๊ฒฉ์ ์ฅ์์ ์ ์ฅํ๊ธฐ์ํด samyoahri์๊ฒ pull request๋ฅผ ๋ ๋ ค์ผ ํฉ๋๋ค.
  - ๊ทธ๋ฌ๊ธฐ ์ํด์ ์ฌ๋ฌ๊ฐ์ง ๋ฐฉ๋ฒ์ด ์์ง๋ง 2๊ฐ์ง ๋ฐฉ๋ฒ์ ์๊ฐํ๊ณ ์ ํฉ๋๋ค.
  - 1. ์๊ธฐ์์ ์ github๋ก ๊ฐ๋ ๋ฐฉ๋ฒ
  ![pull_request_updated1](https://user-images.githubusercontent.com/121100022/209769413-2c030b7c-b553-4dfa-9725-fbf5c5b6127a.png)

  - 2. github desktop์ผ๋ก ๊ฐ๋ ๋ฐฉ๋ฒ
  ![pull_request_updated2](https://user-images.githubusercontent.com/121100022/209769416-8aeb7b10-93dc-463e-a217-171f646cb0d6.png)
  - github๋ก ๊ฐ๋  github desktop์ผ๋ก ๊ฐ๋  ๊ฒฐ๊ณผ์ ์ผ๋ก๋ samyoahri์ ์๊ฒฉ ์ ์ฅ์๋ก ๊ฐ๊ฒ ๋ ๊ฒ๋๋ค. ์๋์ ๊ฐ์ ํํ๋ก์.
  ![pull_request_updated3](https://user-images.githubusercontent.com/121100022/209769419-2427d813-e931-475d-a980-0c0d2da7a1d1.png)
  - ์ด์  pull request๋ฅผ ๋ ๋ ธ์ผ๋ฉด ์๋์ ๊ฐ์ ์ฐฝ์ด ๋ฐ๊ฒ๋๋ค. ํ์ง๋ง ๊ด๋ฆฌ์๊ฐ merge๋ฅผ ๋ฐ๋ก ๋ชปํ๊ฒ ๋ง์ ๋์ต๋๋ค. ๋นจ๊ฐ์์ผ๋ก `review required`์ `Merge is blocked`๊ฐ ๋จ๋ ๊ฒ์ ์์ฐ์ค๋ฌ์ด ์ผ์๋๋ค. ๋๋ฌด ๊ฑฑ์ ํ์ง๋ง์ธ์.
  ![pull_request_updated4](https://user-images.githubusercontent.com/121100022/209770247-d5025918-339c-44bd-b848-375b412211f2.png)

  #### 13. ํ์ธ
  - ์๋์ ๊ฐ์ด ์์ ์ด ์์ฑํ pull request๊ฐ ์ ๋๋ก ๋ ์์ผ๋ฉด ์ํ์  ๊ฒ์๋๋ค.
  - ![image](https://user-images.githubusercontent.com/121100022/209770724-753a33ad-6a77-4463-bb4c-d0e236ae8e30.png)
  - ๋๋จธ์ง๋ ๊ด๋ฆฌ์๊ฐ ์ ๋๋ก ์ปค๋ฐ๊ท์น๊ณผ ํ์ผ๊ท์น์ ๋ง๊ฒ ์ ์์ฑํ๋์ง๋ง ํ์ธํ๊ณ  Mergeํ  ๊ฒ์๋๋ค.
