package vn.hcmute.DTO;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class LoginReponseDto {
    private String token;

    private Long expiresIn;

    public String getToken() {
        return token;
    }
}
