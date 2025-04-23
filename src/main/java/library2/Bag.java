package library2;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@AllArgsConstructor //모든 필드 넣은 생성자
@NoArgsConstructor //기본 생성자(파라메터없는)
@Data //toString(), get/set메서드 등
public class Bag {
    //가방역할의 클래스의 필드는
    //필드를 외부에서 직접 접근하지 않고
    //get~()메서드로 접근하게 하기 위해
    //private으로 선언!!
    private String name;
    private int age;
}
