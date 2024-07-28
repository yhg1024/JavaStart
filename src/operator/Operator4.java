package operator;

public class Operator4 {
    public static void main(String[] args) {
        int sum3 = 2 * 2 + 3 * 3; // (2 * 2) + (3 * 3)
        int sum4 = (2 * 2) + (3 * 3); // sum3과 같다.
        System.out.println("sum3 = " + sum3);
        System.out.println("sum4 = " + sum4);
        
        // 괄호를 명시적으로 사용하는 것이 더 명확하고 이해하기 쉽다.
        // 코드가 많더라도 명확하고 단순한 것이 더 유지보수 하기 좋다.
        // 연산자 우선순위가 애매하거나 조금이라도 복잡하다면 언제나 괄호를 고려하자
    }
}
