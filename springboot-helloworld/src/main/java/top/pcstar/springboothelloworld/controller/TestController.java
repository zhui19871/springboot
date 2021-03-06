package top.pcstar.springboothelloworld.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import top.pcstar.springboothelloworld.entity.Test;
import top.pcstar.springboothelloworld.service.TestService;

import java.util.List;

/**
 * @Author: PanChao
 * @Description: Controller测试类
 * @Date: Created in 20:52 2018/7/15
 */
@RestController
public class TestController {
    @Autowired
    private TestService testService;

    @RequestMapping("/insterTest")
    public String insterTest(String name, String sex) {
        testService.insterTest(name, sex);
        return "success";
    }

    @GetMapping("/selectTest")
    public List<Test> selectTest() {
        return testService.selectTest();
    }
}
