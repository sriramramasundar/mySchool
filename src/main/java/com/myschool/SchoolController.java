package com.myschool;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.myschool.constants.Role;
import com.myschool.jpa.Authentication;
import com.myschool.repo.AuthenticationRepository;

@RestController
public class SchoolController {
	
    @Autowired
    AuthenticationRepository authRepo;

    @RequestMapping("/createUser")
    public void index() {
        System.out.println("Inside createUser");
    }
    
    @GetMapping(path = "/add")
    @ResponseBody
    public String addUser(@RequestParam String userId, @RequestParam String password) {

        Authentication auth = new Authentication();
        auth.setUserId(userId);
        auth.setPassword(password);
        auth.setRole(Role.ADMIN);
        authRepo.save(auth);

        String ret = "User account has been added, user name = " + userId + ", password = " + password;

        return ret;

    }
	
}
