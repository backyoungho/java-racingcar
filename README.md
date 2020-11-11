# 자동차 경주 게임
## 진행 방법
* 자동차 경주 게임 요구사항을 파악한다.
* 요구사항에 대한 구현을 완료한 후 자신의 github 아이디에 해당하는 브랜치에 Pull Request(이하 PR)를 통해 코드 리뷰 요청을 한다.
* 코드 리뷰 피드백에 대한 개선 작업을 하고 다시 PUSH한다.
* 모든 피드백을 완료하면 다음 단계를 도전하고 앞의 과정을 반복한다.

## 온라인 코드 리뷰 과정
* [텍스트와 이미지로 살펴보는 온라인 코드 리뷰 과정](https://github.com/next-step/nextstep-docs/tree/master/codereview)

## 기능 목록
#### InputView 클래스 구현
  - 자동차 이름 입력 요청 문구 출력
  - 자동차 이름 입력
  - 자동차 이름 입력 받은 정보 출력
  - 시도 할 횟수 입력 요청 문구 출력
  - 시도 할 횟수 입력
  - 시도 할 횟수 입력 받은 정보 출력

#### Cars 클래스 구현
  - 자동차 객체 생성
  - 자동차 객체 반환
  - 자동차 댓수 확인

#### Car 클래스 구현
  - 랜덤 값에 따라 자동차 이동
  - 자동차 이름 반환

#### 랜덤 생성기
  - Random 클래스를 이용한 랜덤 값 반환
  
#### 우승자 추출기
  - 우승자 리스트를 추출

#### Game 클래스 구현
  - 게임 진행
  - 라운드 진행
  - 우승자 선정

#### ResultView 클래스 구현
  - 실행결과 출력
  - 줄바꿈 
  - 우승자 출력