## 🚀 2단계 - 사다리(생성)

### 기능 요구사항
- 사다리 게임에 참여하는 사람에 이름을 최대5글자까지 부여할 수 있다. 사다리를 출력할 때 사람 이름도 같이 출력한다.
- 사람 이름은 쉼표(,)를 기준으로 구분한다.
- 사람 이름을 5자 기준으로 출력하기 때문에 사다리 폭도 넓어져야 한다.
- 사다리 타기가 정상적으로 동작하려면 라인이 겹치지 않도록 해야 한다.
- |-----|-----| 모양과 같이 가로 라인이 겹치는 경우 어느 방향으로 이동할지 결정할 수 없다.

### 기능 나누기
- [x] 사람의 이름은 5글자가 최대이다.
- [x] 사다리의 높이는 1 이상이다.
- [x] 참여할 사람들의 이름은 최소 1명 이상이다.
- [x] 결과를 보고 싶은 사람은 반드시 참여한 사람이 포함되어야한다.
- [x] all을 입력하면 모든 결과를 출력한다.
- [x] all을 입력했을 때 프로그램이 종료된다.

### 클래스별 역할
- `People`
  - 사람들의 이름을 담고 있는 클래스
- `Name`
  - 이름 검증에 대한 책임을 맡고있다.
- `Height`
  - 사다리 높이 검증에 대한 책임을 맡고있다.
- `Line`
  - 사다리를 잇는 로직이 담겨있다.
- `Lines`
  - Line 리스트를 가지고 있다.
- `Ladder`
  - 사람과 만들어진 사다리를 가지고 있다.
- `LineGenerator`
  - 사람과 사다리 높이를 가지고 있다.
  - Line에게 사다리를 만드는 것을 이관한다.
- `Results`
  - Result List를 담고 있다.
  - 추가적으로 모든 실행 결과에 대한 검증을 담당한다.
- `Result`
  - 결과 하나를 담고 있다.
  - 결과에 대한 검증을 담당한다.
- `Game`
  - 사다리 게임을 총괄하며 Results와 Ladder를 담고있다.
- `GameResult`
  - 게임 진행 결과를 가지고 있다.