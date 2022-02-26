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

## 7) [두 수 비교하기](../code/CompareTwoNumbers.java)
- 문제 
  - 두 정수 x,y 값 비교 후 등호로 표시
- 접근법
  - if문 

## 8) [시험 성적](../code/TestScore.java)
- 문제 
  - 100 ~ 90 = A
  - 89 ~ 80 = B
  - 79 ~ 70 = C
  - 69 ~ 60 = D
  - 나머지 = F
- 접근법
  - if 문

## 9) [윤년](../code/LeapYear.java)
- 문제 
  - 윤년 = 1
  - 아니면 = 0
  - 윤년의 연도가 4의 배수이고 400의 배수`일 때`
  - 단, 선행 조건을 충족 하면 윤년
    - 윤년의 연도가 100의 배수 `아닐 때` == 0
  - 1 <= 연도 <= 4000
- 접근법
  - if 문

## 10) [두 수의 합 찾기](../code/TwoSum.java)
- 문제
  - 두 수의 합이 target 일때 배열의 위치 값을 반환
- 접근법
  - 시간복잡도: O(n) / for 1개

## 11) [로또의 최고 순위와 최저 순위](../code/LottoRank.java)
- 문제
  - 로또 당첨 개념과 동일
  - 0~45의 수 중 6개를 뽑고 당첨 번호와 확인
  - 0의 경우 랜덤의 숫자가 들어감
  - 최고, 최저 순위에 영향을 줌
  - 로또 `최고 순위`와 `최저 순위`을 출력
- 접근법
  - 0과, 동일한 값 / if
  - Rank / Switch 
  - 시간복잡도: O(n) / for 2개

## 12) [신규아이디 추천](../code/NewIdRecommend.java)
- 문제
  - 아이디의 길이: 3자이상 15자 이하
  - 알파벳, 숫자, 빼기, 밑줄, 마침표 문자만 입력 가능
  - 마침표는 처음과 끝에 사용 못함
  - 7단계
    - 대문자 -> 소문자
    - 기타 문자 제거
    - ... / .. -> . 으로 수정
    - 처음에 위치한 . 은 제거
    - 빈 문자열 제거
    - 아이디 길이: 2자 이하인지 확인
- 접근법
  - toLowerCase
  - 정규표현식
  - 시간복잡도: O(n) / while

## 13) [숫자 문자열과 영단어](../code/NumStringAndEngWord.java)
- 문제
  - 0 ~ 9 까지 문자열 숫자를 숫자로 변경
  - zero, 0으로 시작 하지는 않음
  - 결과 값 = 2,000,000,000 이하
- 접근법
  - replace 문자열 치환
  - 시간복잡도: O(n) / for

## 14) [키패드 누르기](../code/KeypadPush.java)
- 문제
  - 키패드 1, 4, 7 : 왼쪽
  - 키패드 3, 6, 8 : 오른쪽
  - 키패드 2, 5, 8, 0
    - 두 엄지 손가락 중 키패드에 가까운 것 선택
- 접근법
  - 나눗셈 몫 / Switch
  - 시간복잡도: O(n) / for

## 15) [크레인 인형 뽑기 게임](../code/DrawingDoll.java)
- 문제
  - board = 5 * 5  이차원 배열 
  - moves = 1차원 배열
- 접근법
  - 스택 
  - 시간복잡도: O(n<sup>2</sup>) / for * 2

## 16) [회문](../code/ValidPalindrome.java)
- 문제
  - 문자열을 거꾸로 변경해도 같은지 확인
- 접근법
  - toLowerCase
  - 정규표현식
  - StringBuffer /  reverse

## 17) [문자열 뒤집기](../code/ReverseString.java)
- 문제
  - 배열에 있는 문자를 뒤집고 배열에 넣기
- 접근법
  - StringBuffer reverse
  - toCharArray

## 18) [로그파일 재정렬](../code/ReorderLogFiles.java)
- 문제
  - 로그의 가장 앞 부분 `식별자`
  - 문자로 구성된 로그가 숫자 로그보다 앞에 옴
  - 식별자는 순서 영향을 끼치지 않지만, 문자가 동일할 경우 식별자 순으로 함
  - 숫자 로그는 입력 순서대로
- 접근법
  - split
  - Arrays sort

## 19) [가장 흔한 단어](../code/MostCommonWord.java)
- 문제
  - 문장에서 가장 흔한 단어를 출력
  - 단, 금지단어를 제외한 값 출력
- 접근법
  - hash map
  - 시간복잡도: O(n) / for

## 20) [그룹 애너그램](../code/GroupAnagrams.java)
- 문제 
  - 문자열 배열을 받아 애너그램 단위로 그룹핑
  - 애너그램: 언어유회로 문자를 재배열해 다른 뜻을 가진 단어로 바꾸는 것
- 접근법
  - Sort로 정렬해서 같은 단어 찾음
  - Hash map을 통해 분류 및 저장
  - 시간복잡도: O(n) / for

## 21) [가장 긴 팰린드롬 부분 문자열](../code/LongestPalindromeSubstring.java)
- 문제
  - 문장에서 가장 긴 팰린드롬 찾기
- 접근법
  - 시간복잡도: O(n) / for and while

## 22) [주식을 사고팔기 가장 좋은시점](../code/MaxProfit.java)
- 문제
  - 한 번의 거래로 낼 수 있는 최대 이익 산출
- 접근법
  - 배열을 반복문을 돌면서 최소값 최댓값을 변경하면서 확인
  - 시간복잡도: O(n) / for

## 22) [없는 숫자 더하기](../code/AddMissingNumbers.java)
- 문제
  - 0~9 까지 숫자 중 없는 수만 더하기
  - 다 더한 다음 없는 수만 빼면 됨
- 접근법
  - 시간복잡도: O(n) / for

## 23) [음양 더하기](../code/AddYinAndYang.java)
- 문제
  - absolutes의 인덱스와 signs 인덱스 같음
    - signs의 값이 true 덧셈
    - signs의 값이 false 뺄셈
- 접근법
  - 시간복잡도: O(n) / for

## 24) [내적](../code/DotProduct.java)
- 문제
  - a[0]*b[0] + a[1]*b[1] + ... + a[n-1]*b[n-1]
- 접근법
  - 시간복잡도: O(n) / for

## 25) [3진법 뒤집기](../code/TernaryReverse.java)
- 문제
  - 자연수 n이 매개변수로 주어짐
  - n을 3진법 상에서 앞뒤로 뒤집음
  - 이를 다시 10진법으로 표현하시오 
- 접근법
  - 시간복잡도: O(n) / for

## 26) [약수의 개수와 덧셈](../code/NumberAndAdditionOfFactors.java)
- 문제
  - left, right 값이 주어짐
  - 각 약수의 개수가 짝수 더함
  - 각 약수의 개수가 홀수 뺌
  - 결과값을 도출
- 접근법
  - 시간복잡도: O(n) / for

## 27) [2016년](../code/Pro2016.java)
- 문제 
  - 2016년 x월 x일의 요일은 무엇인가?
- 접근법
  - 캘린더 사용

## 28) [최소직사각형](../code/MinimumRectangle.java)
- 문제
  - 2차원 배열의 가로, 세로 값 
  - 모든 명함을 수납 할 수 있도록 가장 작은 지갑 만들기
- 접근법
  - math 사용
  - 시간복잡도: O(n) / for

## 29) [나머지가 1인 수 찾기](../code/RemainderBeingOne.java)
- 문제
  - 자연수 n을 x로 나눔 
  - 나머지 1이 된 가장 작은 자연수 찾기
- 접근법
  - 시간복잡도: O(n) / for

## 30) [부족한 금액 계산하기](../code/CalculateTheShortfall.java)
- 문제
  - price 이용료
  - count 요금이 price에 n배 증가
  - money 가지고 있는 돈
  - result 부족한 금액을 넘기기
- 접근법
  - 산술연산

## 31) [가운데 글자 가져오기](../code/GetMiddleText.java)
- 문제
  - 문자의 가운데 글자 가져오기
  - 짝수: 두글자를 반환
- 접근법
  - subString 글자 반환

## 32) [나누어 떨어지는 숫자 배열](../code/DivisibleArrayOfNumbers.java)
- 문제
  - arr: 자연수들의 배열
  - divisor: 나눌 수
  - arr 안에 있는 자연수 중 divisor로 나눠 0인 값을 넣기
  - 나누어 떨어지는 값이 없으면 -1 입력
- 접근법
  - 스트림

## 33) [두 정수 사이의 합](../code/SumAtoB.java)
- 문제
  - a, b 중 작은 수에서 큰 수의까지의 합 구하기
- 접근법
  - 등차 수열 합 공식
  - math 사용

## 34) [문자열 내 p와 y의 개수](../code/StrPandYCount.java)
- 문제
  - 대, 소문자 섞인 문자열
  - p, y가 각각 대소문자 한개씩 있으면 `True`
  - p, y가 각각 대소문자 한개씩 없으면 `Flase`
- 접근법
  - 람다식

## 35) [문자열 내림차순으로 배치하기](../code/StrDesc.java)
- 문제
  - 문자를 큰 것부터 작은 순으로 정렬
  - 새로운 문자열을 리턴하는 함수
- 접근법
  - Arrays
  - StringBuilder

## 36) [문자열 다루기 기본](../code/StrBasic.java)
- 문제
  - 문자열 s의 길이가 4 혹은 6
  - 숫자로 되어 있는지 확인
  - s 길이가 1이상, 9 이하인 문자열
- 접근법
  - 정규표현식

## 37) [서울에서 김서방 찾기](../code/FindKimInSeoul.java)
- 문제
  - String[] 안에 있는 값 중 "Kim" 인덱스 찾기
- 접근법
  - Arrays.asList().indexOf() 사용

## 38) [소수 찾기](../code/FindDecimals.java)
- 문제
  - 주어진 n의 값의 아랫수들의 소수의 갯수 찾기
- 접근법
  - 시간복잡도: O(n<sup>2</sup>) / for

## 39) [수박수박수박?](../code/StringPattern.java)
- 문제
  - count 갯수만큼 수박수~ 등 만듬
- 접근법
  - replace 등 사용

## 40) [문자열을 정수로 바꾸기](../code/StrChangeInt.java)
- 문제
  - 문자열을 정수로 바꾸기
- 접근법
  - Integer.parseInt

## 41) [약수의 합](../code/SumDivisor.java)
- 문제
  - 정수 num
  - 약수를 구하고 더한 값 return
- 접근법
  - 시간복잡도: O(n) / for

## 42) [자릿수 더하기](../code/DigitAdd.java)
- 문제
  - 자연수 N
  - N의 각 자릿수의 합을 구해서 return
- 접근법
  - 시간복잡도: O(n) / while

## 43) [자연수 뒤집어 배열로 만들기](../code/StrReverse.java)
- 문제
  - 자연수 n을 뒤집는다.
  - 뒤집은 수를 배열 리턴
- 접근법
  - 시간복잡도: O(n) / for

## 44) [정수 내림차순으로 배치](../code/IntDesc.java)
- 문제
  - 정수 n을 매겨변수로 입력 받음
  - n의 각 자릿수를 큰것 부터 작은 순으로 정력
- 접근법
  - String 변환 후 정렬

## 45) [제일 작은 수 제거하기](../code/RemoveSmallestNumber.java)
- 문제 
  - int[] 안에서 제일 작은 수 빼고 반환
  - 배열이 빌 경우 -1 넣어서 반환
- 접근법
  - 제일 작은 값 찾고 
  - stream, filter 사용

## 46) [짝수와 홀수](../code/EvenOrOdd.java)
- 문제
  - 짝수 Even / 0도 포함
  - 홀수 Odd 
- 접근법
  - 삼항 연산자

## 47) [최소공배수, 최대공약수](../code/GcdLcm.java)
- 문제 
  - 최소공배수
  - 최대공약수 
  - 배열에 순서대로 반환하는 함수 만들기
- 접근법
  - 각 계산식 
  - 재귀기법

## 48) [평균 구하기](../code/Avg.java)
- 문제
  - 정수를 담고 있는 배열의 평균값을 리턴
- 접근법
  - 스트림

## 49) [하샤드 수](../code/HarshadNumber.java)
- 문제
  - 양의 정수 x가 하샤드 수 
  - x의 자릿수의 합으로 x가 나누어져야함
- 접근법
  - 스트림

## 50) [핸드폰번호가리기](../code/PhoneNumberHide.java)
- 문제
  - 뒷 4자리 빼고 * 
- 접근법
  - 정규표현식

## 51) [x만큼 간격이 있는 n개의 숫자](../code/NNumbersSpacedByX.java)
- 문제
  - n개의 배열
  - x만큼 간격 늘어남
- 접근법
  - for문

## 52) [직사각형 별찍기](../code/RectangleStar.java)
- 문제
  - 가로: n
  - 세로: m
  - 각 크기 만큼 * 입력해 직사각형 만들기
- 접근법
  - 스트림

## 53) [같은 숫자는 싫어](../code/Deduplication.java)
- 문제 
  - 배열 Arr 주어짐
  - 배열의 각 오소는 0~9까지
  - 공통된 배열의 원소는 한개 빼고 전부 제거
- 접근법
  - for문