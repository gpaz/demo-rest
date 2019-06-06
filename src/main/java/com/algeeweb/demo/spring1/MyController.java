package com.algeeweb.demo.spring1;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/api")
@RestController
public class MyController {

    @RequestMapping(method = RequestMethod.GET, produces = {MediaType.APPLICATION_JSON_VALUE})
    public String home() {
        return "{\"value\":\"home\"}";
    }

    @RequestMapping(value = "obj", method = RequestMethod.GET, produces = {MediaType.APPLICATION_JSON_VALUE})
    public String object() {
        return "{\"value\":\"homeobj\"}";
    }

    @RequestMapping(value = "objRaw", method = RequestMethod.GET, produces = {MediaType.APPLICATION_JSON_VALUE})
    public SampleObject objectRaw() {
        return new SampleObject("MENAMe", "binaryEth");
    }

    @RequestMapping(value = "createJson", method = RequestMethod.GET, produces = {MediaType.APPLICATION_JSON_VALUE})
    public SampleObject createJson(
            @RequestParam(name = "name", required = false) String name,
            @RequestParam(name = "ethnicity", required = false) String ethnicity)
    {
        return new SampleObject(
                name == null ? null : name.toLowerCase(),
                ethnicity == null ? null : ethnicity.toLowerCase()
        );
    }


}
