package com.espirt.microservice.productscategories.restController;
import com.espirt.microservice.productscategories.services.serv.OpenAIService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.io.IOException;
import java.util.Map;

@RestController
@RequestMapping("/api/gpt")
@CrossOrigin(origins = "http://localhost:4200")  // Allow Angular frontend
public class OpenAIController {

    @Autowired
    private OpenAIService openAIService;

    @PostMapping("/ask")
    public String askGPT(@RequestBody Map<String, String> request) throws IOException {
        String userMessage = request.get("message");
        return openAIService.generateResponse(userMessage);
    }
}
