package com.exxx.newSecurity.startUp;


import com.exxx.newSecurity.domain.Role;
import com.exxx.newSecurity.domain.UserRoles;
import com.exxx.newSecurity.repository.RoleRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

@Component
@Slf4j
public class RoleCreator {

    private final RoleRepository roleRepository;

    public RoleCreator(RoleRepository roleRepository) {
        this.roleRepository = roleRepository;
    }


    @PostConstruct
    public void init(){
        log.info("creating roles...");
        if(roleRepository.count()==0){
            createRoles();
        }
    }






    private void createRoles(){
        for (UserRoles userRoles: UserRoles.values()){
            Role role=new Role();


            role.setDescription(addDescription(userRoles));
            role.setRoleName(userRoles.name());



            //role.setRoleName(userRoles.name());
            roleRepository.save(role);
        }
    }



private String addDescription(UserRoles name){
        switch (name) {
            case ADMIN:
                return "this is admin";
            case USER:
                return "this is user";
            default:
                return null;
        }
}


}
