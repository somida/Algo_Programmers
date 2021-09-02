# Java

<hr />

### 문자열 숫자로 바꾸기

##### String to Int

* Java 1.5에서 도입된 **Autoboxing and Unboxing**으로 인해 어느 것을 사용해도 상관이 없다. Integer객체로 반환 받아서 int 변수에 할당하면 자동 형변환 실행 (단, 내부적으로 객체 생성 오버헤드 있을 수 있음)

```java
// 1. 원시데이터(int)를 반환할 때 (진수 생략 시, 10진수)
Integer.parseInt(str, 진수)
    
// 2. Wrapper객체(Integer)를 반환할 때
Integer.valueOf(str)
```



##### charAt

* String에서 특정 index에 해당하는 유니코드 단일문자 반환

```java
charAt(i)
```



##### char to Int

```java
// 1.
ch - '0'

// 2.
Character.getNumericValue(ch)
```

















