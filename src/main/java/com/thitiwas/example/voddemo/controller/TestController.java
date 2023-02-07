package com.thitiwas.example.voddemo.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1")
@Slf4j
public class TestController {

    @GetMapping("/video")
    public ResponseEntity<String> testTeacher(@RequestParam("name") String name, @RequestParam("token") String token) {
        log.info("teacher10");
        log.info("name :{}", name);
        log.info("token :{}", token);
        String ret = "{\n" +
                "  \"sequences\": [\n" +
                "    {\n" +
                "      \"clips\": [\n" +
                "        {\n" +
                "          \"type\": \"source\",\n" +
                "          \"path\": \"/vod/videos/teacher10/teacher10_1080_1080_bit7000.mp4\"\n" +
                "        }\n" +
                "      ]\n" +
                "    },\n" +
                "    {\n" +
                "      \"clips\": [\n" +
                "        {\n" +
                "          \"type\": \"source\",\n" +
                "          \"path\": \"/vod/videos/teacher10/teacher10_1080_480_bit1750.mp4\"\n" +
                "        }\n" +
                "      ]\n" +
                "    },\n" +
                "    {\n" +
                "      \"clips\": [\n" +
                "        {\n" +
                "          \"type\": \"source\",\n" +
                "          \"path\": \"/vod/videos/teacher10/teacher10_1080_720_bit3500.mp4\"\n" +
                "        }\n" +
                "      ]\n" +
                "    }\n" +
                "  ]\n" +
                "}\n";
        return ResponseEntity.ok(ret);
    }
}
