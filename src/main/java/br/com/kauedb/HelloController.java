package br.com.kauedb;

import org.springframework.web.bind.annotation.*;

/**
 *
 */
@RestController
public class HelloController {

    @RequestMapping(value = "/say", method = RequestMethod.POST)
    @ResponseBody
    public String postHere(@RequestBody String msg) {
        return String.format("{\"msg\":\"%s\"}", msg);
    }

}
