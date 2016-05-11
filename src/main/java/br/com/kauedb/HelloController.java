package br.com.kauedb;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.servlet.http.HttpServletRequest;

/**
 *
 */
@Controller
public class HelloController {

    @RequestMapping(value = "/postHere", method = RequestMethod.POST)
    public String postHere(HttpServletRequest httpServletRequest) {
        final String something = httpServletRequest.getParameter("something");
        System.out.printf("something=%s", something);
        return "/hello";
    }

}
