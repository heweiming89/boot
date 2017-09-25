package io.heweiming.boot.api;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import io.heweiming.boot.web.AjaxResponse;

public interface ApplicationAPI {

    @PostMapping(value = "/api/authenticate")
    @ResponseBody
    public AjaxResponse<String> login(String email, String password);

}
