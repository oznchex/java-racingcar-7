# 📌 자동차 경주 - 구현 기능 목록

---

## ✏️ 자동차 경주 입력

- [x] 경주할 자동차 이름을 입력 받는다.
    - [x] 자동차 이름은 5자 이하만 가능하다.
    - [x] 자동차 이름은 쉼표(,)를 기준으로 구분한다.


- [ ] 자동차 이동 횟수를 입력 받는다.


- [ ] 경주할 자동차 이름을 입력 받은 후에, 자동차 이동 횟수를 입력 받는다.


- [ ] 사용자가 잘못된 값을 입력한 경우 `IllegalArgumentException`을 발생시킨다.

---

## ✏️ 자동차 경주 출력
- [ ] 자동차 경주 우승자를 출력한다
    - [ ] 우승자가 1명인 경우, 단독 우승자 안내 문구를 출력한다.
    - [ ] 우승자가 2명 이상인 경우, 공동 우승자 안내 문구를 출력한다.
    - [ ] 공동 우승자 안내 문구는 쉼표(,)를 이용하여 자동차 이름을 구분한다.

---

## 🚘 자동차 전진 조건
- [ ] 자동차가 경주 중 전진한 것으로 판단하는 기준이 존재한다.
    - [ ] 0에서 9 사이의 무작위 값을 구한 후 무작위 값이 4 이상인 경우 자동차는 전진한다.

---

## ⚠️ 예외 발생 추가 조건
- [x] 경주할 자동차 이름은 중복될 수 없다.
