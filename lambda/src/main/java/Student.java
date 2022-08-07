
import lombok.*;

//@NoArgsConstructor
@AllArgsConstructor (access = AccessLevel.PRIVATE)
//@Getter
//@Setter
//@EqualsAndHashCode
//@ToString
@Data
@Builder
@RequiredArgsConstructor

public class Student {
    private String firstName;
    private String lastName;
    private String userName;
    private String email;
    private String password;
    private String confirmPassword;
    private final int age;
}
