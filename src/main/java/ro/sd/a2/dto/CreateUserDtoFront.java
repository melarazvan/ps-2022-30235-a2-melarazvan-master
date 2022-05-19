package ro.sd.a2.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class CreateUserDtoFront {
    public String name;
    public String password;
    public String email;

}
