package library;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

//메서드 호출시 전달할 데이터를
//묶어서 전달하기 위해
//가방을 만들어서 값을 넣어 전달함.
//DTO(VO)
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Bag {
    private String name;
    private int age;
}
