package heimaailma;

import java.io.IOException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class HeiMaailmaController {

    @Autowired
    private HeiMaailmaService service;

    @RequestMapping(value = "/siirto", method = RequestMethod.GET)
    public void siirraRahaa() throws IOException {
        this.service.testaaMua();
        
    }

    
}