package com.example.pioneers.controller;

import com.example.pioneers.dto.MbtiResponse;
import com.example.pioneers.dto.MbtiResult;
import com.example.pioneers.service.MbtiService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequiredArgsConstructor
@RequestMapping("/mbti")
public class MbtiController {

    private final MbtiService mbtiService;

    @PostMapping(value = "/result")
    public String mbti_calc(@RequestBody MbtiResponse mbtiResponse){
        String result = mbtiService.evaluateMbti(mbtiResponse);

        return result;
    }

    @GetMapping(value= "/result/{result}")
    public MbtiResult getMbti(@PathVariable String result){
        return mbtiService.findMbtiInfo(result);
    }

}
