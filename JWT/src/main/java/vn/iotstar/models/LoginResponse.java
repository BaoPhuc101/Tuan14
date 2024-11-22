package vn.iotstar.models;

import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class LoginResponse {
    private String token;
    
    private long expiresIn;

    public String getToken() {
        return token;
    }
}
