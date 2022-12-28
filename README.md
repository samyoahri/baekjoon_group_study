---
# 💯 백준코테 그룹 스터디 📝
---
자료구조, 알고리즘 및 코테 문제 풀이 스터디입니다.

## ✅ 참여 방법
1. 관리자에게 브랜치 생성요청을 해주세요. 자기 해당 닉네임을 요청해주세요.
2. 이 저장소를 `fork` 해주세요.
3. 해당하는 날짜에 필요한 문제폴더와 링크가 있습니다. 가능하면 해당하는 날짜의 문제를 풀어주세요.
4. 백준에 문제를 제출하여 정답처리가 제대로 되었으면, ```파일작성규칙```에 따라 파일을 만들어 주세요.
4. 이때 `commit 규칙`을 지켜주세요.
5. 원본 저장소로 `Pull Request`를 한다. (매일 저녁6시~7시 이후 merge 예정)
6. 다른 사람들의 PR을 보고 자유롭게 코드리뷰를 한다.
7. 주의사항: ***기존 폴더와 파일을 지우면 안됩니다!!***


<br />
<br />

## ✅ 소스코드 작성규칙
- 소스코드는 자유롭게 작성해주세요.
- 주의사항: java 사용자들은 백준 제출시 클래스 이름이 Main이어야 제출이 가능합니다. 하지만, 커밋 제출할 때는 파일이름과 클래스 이름 규칙을 따라주세요.
  - 백준 제출시 코드
    ```java
    public class Main {
        public static void main(String[] args) {
            System.out.println("Hello World!");
        }
    }
    ```
    
  - 커밋 제출시 코드
    ```java
    public class boj_2557_samyoahri {
        public static void main(String[] args) {
            System.out.println("Hello World!");
        }
    }
    ```
<br />
<br />

## ✅ 파일 작성 규칙
- '코테플랫폼_문제번호_작성자닉네임' 순서로 작성해주세요.
  - `boj_3003_samyoahri`
  - `boj_1000_jinwoo`
  - `boj_2557_bando99`
- 폴더명 또는 소스코드 파일명에 콜론 ":" 안됩니다
- 주의사항: java 사용자들은 백준 제출시 클래스 이름이 Main이어야 제출이 가능합니다. 하지만, 커밋 제출할 때는 파일이름과 클래스 이름 규칙을 따라주세요.
  - 백준 제출시 코드
    ```java
    public class Main {
        public static void main(String[] args) {
            System.out.println("Hello World!");
        }
    }
    ```
    
  - 커밋 제출시 코드
    ```java
    public class boj_2557_samyoahri {
        public static void main(String[] args) {
            System.out.println("Hello World!");
        }
    }
    ```
<br />
<br />

## ✅ commit 규칙
- commit은 1문제를 풀때마다 작성해주세요.
  - commit을 1문제마다 작성해주셔야 코드를 깃으로 관리하기 편합니다.
  - 14명이 같이 코드를 공유하는 일이라 불편하시더라도 조금만 양해해주세요. 관리하는 저는 더 힘듭니다.ㅠㅠ
- commit도 관리하기 편하기 위해 `파일 작성 규칙`에 기반해서 작성해주세요
- 코드를 처음만들 때는, Create '코테플랫폼_문제번호_작성자닉네임' 순서로 작성해주세요.
  - `Create boj_3003_samyoahri`
  - `Create boj_1000_jinwoo`
  - `Create boj_2557_bando99`
- 코드를 수정할 때는, Create '코테플랫폼_문제번호_작성자닉네임' 순서로 작성해주세요.
  - `Update boj_3003_samyoahri`
  - `Update boj_1000_jinwoo`
  - `Update boj_2557_bando99`
- description: 문제이름 / 난이도 / 걸린시간 순으로 작성해주세요. 반드시 작성해야하는 것은 아니지만 백준 문제를 선정하는데 도움이 됩니다.
- 터미널에서 작성법: 
```
git commit -m "Create boj_3003_samyoahri"
```

<br />
<br />

## ✅ PR 규칙
- PR시 자신이 해당하는 branch에 pr을 날려주세요. `main`브랜치에 날리면 안됩니다.
- 단, 자신의 repository 혹은 원격저장소에는 main으로 커밋은 괜찮습니다. pull request 날릴 때 `main`브랜치에 날리면 안된다는 뜻입니다.
- PR 제목: 이름 / 주차 / 몇 문제
-  ```samyoahri / 8월 1주차 / 4문제 ```



<br />
<br />

## ✅ (option)코드리뷰 규칙
- 작성예정


<br />
<br />

## ✅ git 사용방법
### CLI, 소스트리 사용법
- 좀 더 다양한 기능을 사용하기 위해서는 git CLI와 소스트리를 이용하는 것이 좋습니다. 
하지만, 필자도 git과 sourcetree는 아직 잘 사용하는 것이 아니라서 링크로 대체합니다.
- 얄코강좌(https://www.youtube.com/watch?v=1I3hMwQU6GU)
- 생활코딩강좌(https://www.youtube.com/playlist?list=PLcDtUrBwapUOQzycPhaGUFnc-ogBOI6N_)
### github desktop 사용법
- 그래서 좀 더 사용하기 편한 github desktop을 사용하고자 합니다.
  #### 1. url접속
  - https://github.com/samyoahri/baekjoon_group_study.git
  #### 2. fork
  - fork는 samyoahri의 원격저장소(remote repository)를 그대로 들고가서 자기 자신의 원격 저장소로 들고 가는 과정입니다.
  - 기존 클론으로 들고가면 자기 자신의 원격저장소(예를 들어, riberty의 저장소)에 잔디가 심기지 않는 것에 대한 방법으로 fork를 떠서 가져가는 과정을 추가했습니다. 일반적으로는 하지 않아도 되는 과정일 수 있지만, 그래도 원활한 진행을 위해서 반드시 fork를 떠주세요.
  - samyoahri의 원격저장소 중 하나인 baekjoon_group_study저장소로 들어가주세요. 들어가서 아래 그림과 같이 fork 버튼이 보이시나요? fork를 눌러주세요
  ![fork1](https://user-images.githubusercontent.com/82167151/209756109-50691198-3b27-4ea8-8cc1-fc88a01dda05.png)
  - fork를 누르시면 아래와 같은 창으로 바뀔 것입니다. 아래와 같이 진행하여 create fork버튼을 눌러주세요.
  ![fork2](https://user-images.githubusercontent.com/121100022/209756386-06f83fdd-aa39-4ea5-be38-d9734366e7ac.png)
  - 그러면 아래와 같이 자기자신의 원격 저장소(remote repository)로 들고갈 것입니다. 아래와 같이 Bictor Lym과 같이 자기 저장소에 제대로 fork를 떳는지 확인해주세요.
  ![fork3](https://user-images.githubusercontent.com/121100022/209756410-b1be60f4-1857-405b-b33d-7f52361ce87c.png)
  #### 3. git clone
  - clone은 원격저장소에 있는 소스코드를 로컬 저장소(local repository)로 들고 가는 과정입니다. 좀 더 쉽게 말해서, 인터넷에만 있는 코드를 자기자신의 컴퓨터에 코드를 가져오는 과정입니다.
  - 이 과정을 진행하는 이유는 좀 더 편하게 로컬 저장소에서 작업을 해서 쉽게 자기 자신의 원격저장소에 저장하기 위해서 하는 것입니다. 이 과정을 진행하지 않으면 깃허브 저장소를 열어서 파일을 올리는 과정을 손으로 일일이 해야합니다. 파일이 적을 때는 손으로 일일이 하는 것이 그렇게 어렵지 않지만, 파일을 10개씩 생산하거나 수정하다 보면 그걸 사람손으로 일일이 올리는 과정이 엄청 힘듭니다. 그것보다는 CLI인 GIT을 사용하거나 아니면 현재 진행중인 GUI툴인 Github desktop을 사용하기 위해서 반드시 필요한 과정입니다.
  - 아래와 같이 자기 자신의 github desktop을 들어가서 자기자신의 원격저장소의 repository를 clone해주세요.
  ![git_clone1](https://user-images.githubusercontent.com/121100022/209757466-0f7b7ded-2c37-43f4-a812-cdda076c8549.png)
  - 여기서 절대 samyoahri의 repository를 클론하지마세요. 아까 위에서 fork를 뜨면서 자기자신의 repository에 samyoahri의 저장소를 fork해 왔습니다.
  - 그러니까, 반드시 자기 자신의 repository를 클론하세요.!!!!
  ![git_clone2](https://user-images.githubusercontent.com/121100022/209757467-27f9111e-ce37-4d37-99a8-15793b4d7358.png)
  - 우리는 코드를 통합할 것이므로 아래와 같이 `To contribute to the parent project`를 클릭해주세요.
  - `for my own purpose`는 개인 프로젝트시 코드를 들고 갈때 사용하기 적합합니다.
  ![git_clone3](https://user-images.githubusercontent.com/121100022/209757469-ce996e6e-ef3d-499e-92a8-26ba6e1c71c8.png)

  #### 4. branch
  - branch를 이용하여서 좀 더 보기 편한 구조로 만들어볼까도 생각했지만, 현재는 생략하고 추후 어느정도 깃 사용법이 올라가면 적용해볼 생각입니다.
  #### 5. folder
  - folder 구조는 손대실 것이 없습니다. 관리자가 알아서 폴더를 만들 예정입니다.
  - 아래에서 보는 것과 같이 큰 폴더 week00과 같이 주차에 따라 큰 폴더가 있을 것입니다.
    현재 해당하는 `weekXX`폴더를 찾아주세요
  - week00에서 보듯이 그 아래에는 해당 주차에 풀 백준문제에 해당하는 문제번호와 요일이 적혀 있습니다.
    `문제출처_문제번호_요일`로 폴더 구조가 더 있습니다. 해당하는 문제를 검색하시면 됩니다.
  ![folder_updated1_1](https://user-images.githubusercontent.com/82167151/209761082-cc5bc44c-65c2-4730-adfb-577f47cf15f6.png)
  #### 6. gitignore
  - 소스코드를 제외한 모든 파일들을 gitignore에 작성해주세요
  #### 7. code 작성
  - 아래와 같이 해당하는 `weekXX`폴더에 들어가서 `boj_문제번호_요일`의 폴더들 중 해당하는 요일의 폴더에 들어가주세요
  - 아래와 같이 그 곳에 해당하는 소스코드 파일을 만들어주세요
  ![code_updated1_2](https://user-images.githubusercontent.com/121100022/209762651-d839166f-72ea-4e68-baf3-49104630da5b.png)
  - 아래 내용은 정말 중요합니다!!!
  - 코드를 공유해서 누가 작성한 것인지 확인하고 pull request를 받았을 때, 한눈에 누가 작성한 것인지 알기 위해서 반드시 필요한 과정입니다.
  - 소스코드를 작성할 때 `boj_문제번호_작성자`방식으로 소스코드의 파일이름을 정의해주세요!!! 반드시
![code_updated1_3](https://user-images.githubusercontent.com/121100022/209762655-ab9f276b-3976-46d9-abab-bceefda423c3.png)
  - 아래와 같이 문제에 해당하는 소스코드를 작성해주세요.
  ![code_updated1_4](https://user-images.githubusercontent.com/121100022/209762656-3d1d1647-8352-42b6-8cdf-ea1d57d42941.png)
  #### 8. 백준제출
  - 위에서 설명한 것과 같이 JAVA사용자들은 주의가 필요합니다. 아래와 같이 백준제출시 코드와 깃허브 제출시 코드가 서로 다릅니다. 기존 로컬에서 소스코드를 작성하실 때는 깃허브 규칙을 준수하시다가, 백준 제출시 클래스 이름을 `Main`으로 바꾸시는 것이 훨씬 편할 것입니다.
  ![baekjoon_submit1](https://user-images.githubusercontent.com/121100022/209763710-cc1c2e54-1975-464b-ad82-13733194fe9b.png)
  - 아래와 같이 제출을 완료하면 정답처리가 될 것입니다.
  ![baekjoon_submit2](https://user-images.githubusercontent.com/121100022/209763712-42f470cb-c4d5-4a8a-8f2a-4eb25a24be44.png)

  #### 9. fetch
  - fetch는 자기자신의 remote repository의 변경이 없는지 확인하는 작업입니다.
  - 하지만 저희는 fork를 떠서 작업을 하고 있으므로, fetch를 하기전 samyoahri의 원격저장소와의 차이를 먼저 확인해야합니다.
  - 그러기 위해서, fork sync를 아래와 같이 진행할 예정입니다.
  ![fetch_updated1_1](https://user-images.githubusercontent.com/121100022/209765842-2fc83bd8-4e78-4815-8321-1750a2f6a3f4.png)
  - 위에서 fork sync를 맞추고 나면 github desktop에서 fetch를 진행해주세요.
  ![fetch_updated1_2](https://user-images.githubusercontent.com/121100022/209765845-529e5170-3e1b-40fc-9a3c-f445e87c8084.png)
  - 우리는 pull과정을 진행할 것입니다. pull이란 자기자신의 원격저장소의 코드나 commit이 달라진 부분들을 전부 가져오는 과정입니다.
  - pull과정을 진행하기위해, 아래와 같이 pull을 진행할 파일들이 업로드 되어있을 수 있습니다. 그러면 해당하는 모든 파일들을 pull해주세요.
  ![fetch_updated1_3](https://user-images.githubusercontent.com/121100022/209765848-17ea3cc0-9ee8-460c-8fb8-6118bcb756b5.png)

  #### 10. commit
  - fetch도 완료했고 pull도 위에서 완료했습니다.
  - commit은 자기가 만든 소스코드를 local저장소(자기자신의 숨긴파일 .git)에 올리는 과정입니다.
  - 그러면 이제 commit을 진행해봅시다. commit을 진행하기 위해 github desktop에 접속합니다. 아래에서 보는 것과 같이 github desktop이 알아서 파일의 변화를 읽어 줍니다.
  - 그 다음, 해당하는 작업을 `commit 규칙`에 맞춰서 작성해주세요
  - `commit 규칙`은 `Create boj_문제번호_작성자이름`순으로 작성해주세요.
  - 아래에서 보는 것과 같이 commit을 할 때는 작업한 파일을 하나씩 올려주세요. 혹시라도 충돌이 났을 때, 되돌리기 위해 수정하려면 관리자뿐만 아니라 모두가 많은 시간을 사용해야 할 수 있습니다.
  ![commit_updated1](https://user-images.githubusercontent.com/121100022/209766868-d5f52b8c-81c3-42f2-b79c-7277228fdef0.png)
  - description은 생략하셔도 되지만, 편하게 막 작성해주셔도 됩니다. 체감 난이도를 이야기해주시면, 다음 문제를 선정하는데 도움이 됩니다.
  #### 11. push
  - push는 지금까지 작업했던 소스코드를 로컬저장소(.git)에서 원격저장소(자기자신의 github)에 올리는 과정입니다.
  - 아래와 같이 push를 눌러주면 알아서 진행됩니다.
  ![push_updated1_1](https://user-images.githubusercontent.com/121100022/209767821-33a0cb51-f7c9-429e-b2a9-17b3ce968b85.png)

  #### 12. pull request
  - 지금까지 작업한 소스코드는 자기자신의 폴더, 로컬저장소, 원격저장소에는 저장되어있는 상태이지만, samyoahri의 원격저장소에는 저장되어 있지 않은 상태입니다.
  - samyoahri의 원격저장소에 저장하기위해 samyoahri에게 pull request를 날려야 합니다.
  - 그러기 위해서 여러가지 방법이 있지만 2가지 방법을 소개하고자 합니다.
  - 1. 자기자신의 github로 가는 방법
  ![pull_request_updated1](https://user-images.githubusercontent.com/121100022/209769413-2c030b7c-b553-4dfa-9725-fbf5c5b6127a.png)

  - 2. github desktop으로 가는 방법
  ![pull_request_updated2](https://user-images.githubusercontent.com/121100022/209769416-8aeb7b10-93dc-463e-a217-171f646cb0d6.png)
  - github로 가든 github desktop으로 가든 결과적으로는 samyoahri의 원격 저장소로 가게 될겁니다. 아래와 같은 형태로요.
  ![pull_request_updated3](https://user-images.githubusercontent.com/121100022/209769419-2427d813-e931-475d-a980-0c0d2da7a1d1.png)
  - 이제 pull request를 날렸으면 아래와 같은 창이 뜰겁니다. 하지만 관리자가 merge를 바로 못하게 막아 뒀습니다. 빨간색으로 `review required`와 `Merge is blocked`가 뜨는 것은 자연스러운 일입니다. 너무 걱정하지마세요.
  ![pull_request_updated4](https://user-images.githubusercontent.com/121100022/209770247-d5025918-339c-44bd-b848-375b412211f2.png)

  #### 13. 확인
  - 아래와 같이 자신이 작성한 pull request가 제대로 떠있으면 잘하신 것입니다.
  - ![image](https://user-images.githubusercontent.com/121100022/209770724-753a33ad-6a77-4463-bb4c-d0e236ae8e30.png)
  - 나머지는 관리자가 제대로 커밋규칙과 파일규칙에 맞게 잘 작성했는지만 확인하고 Merge할 것입니다.
