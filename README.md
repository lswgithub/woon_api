# woon_api

## functional Programming ##

1. 클래스와 같이 함수를 사용한다.
  함수에 대한 참조 또는 다른 함수에 파라미터 등으로 전달될수 있다.
  
2. Pure functions
  실행 시 부작용(side effect)이 없어야 한다.
  함수에서 반환되는 값은 파라미터로 전달된 값에"만" 의존한다. 
    No state, No side effects, Immutable variables, Favour recursion over looping(루프 반복을 통한 재귀 호출)
    
3. Higher order functions
  함수는 하나 또는 그 이상의 "함수들"을 파라미터로 받으며,
  함수의 반환값은 다른 함수(ex. factory pattern)) 가 된다.
  
 