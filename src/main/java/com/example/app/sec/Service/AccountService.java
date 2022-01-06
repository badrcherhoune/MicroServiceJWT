package com.example.app.sec.Service;

import com.example.app.sec.Entity.AppRole;
import com.example.app.sec.Entity.AppUser;

import java.util.List;

public interface AccountService {
    AppUser addNewUser(AppUser appUser);
    AppRole addNewRole(AppRole appRole);
    void addRoleToUser(String userName,String roleName);
    AppUser loadUsernameByUserName(String username);
    List<AppUser> listUsers();
}
