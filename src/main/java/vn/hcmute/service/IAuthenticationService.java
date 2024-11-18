package vn.hcmute.service;

import vn.hcmute.DTO.LoginUserDto;
import vn.hcmute.DTO.RegisterUserDto;
import vn.hcmute.entity.User;

public interface IAuthenticationService {
    User signup(RegisterUserDto input);

    User authenticate(LoginUserDto input);
}
