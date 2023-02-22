package com.elevate.app.takeaway.controllers;

import com.elevate.app.takeaway.model.LoginModel;
import com.elevate.app.takeaway.model.ResponseModel;
import com.elevate.app.takeaway.service.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

@RestController
@RequestMapping("/api/v1/login")
public class LoginController
{
    @Autowired
    LoginService loginService;

    @PostMapping("/create/login")
    public ResponseModel createLogin(@Valid @RequestBody LoginModel loginModel){
        ResponseModel model = new ResponseModel();
        model.id = loginService.createUserNameAndPassword(loginModel);
        model.message = "Login Successfully";
        model.responseCode = HttpStatus.CREATED.value();
        return model;
    }

}
