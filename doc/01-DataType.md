# DataType
## 1) [패리티 계산](../code/Parity.java)
- 문제
  - 2진수
  - 1의 갯수가 홀수 일때 출력 `1`
  - 짝수이면 `0` 
- 접근법
  - 하위 비트를 지워서 접근
  - 시간복잡도 = O(k)

## 2) [x/y 계산](../code/PrimitiveDivide.java)
- 문제
  - 양의정수 x, y를 나눈 몫 구하기
  - 사용가능한 연산: 덧셈, 뺄셈, 시프트 연산
- 접근법
  - 반복할 때마다 추가 비트 하나를 처리
  - 전체 시간 복잡도: `O(n)`
  - 시프트 연산과 덧셈 연산의 시간복잡도: `O(1)`

## 3) [x<sup>y</sup> 계산](../code/IndicesY.java)
- 문제
  - 지수 승 계산하기
- 접근법
  - 함수 호출 비용 줄이기 위해 while문 사용
  - 시간 복잡도: `O(n)`

## 4) [숫자 뒤집기](../code/ReverseNumber.java)
- 문제
  - 입력된 숫자를 뒤집기
- 접근법 
  - 갯수만큼 while
  - 시간 복잡도: `O(n)`

## 5) [회문 확인](../code/IsPalindromeNumber.java)
- 문제
  - 앞뒤로 읽어도 동일한 문자열
- 접근법 
  - 시간 복잡도: `O(n)` 

## 6) [x*y](../code/PrimitiveMultiply.java)
- 문제
  - 곱셈 연산기가 없을 때 곱셈 만드시오
- 접근법
  - 시간 복잡도: O(n) ~  O(n<sup>2</sup>)