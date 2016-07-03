package cz.koprivajakub.rest.oauth2.server.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/secured")
public class SecuredController {

    @RequestMapping(path = "", method = {RequestMethod.GET, RequestMethod.POST})
    public String test() {
        return "secured";
    }
}
