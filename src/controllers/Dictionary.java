package controllers;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.HashMap;
import java.util.Map;

@Controller
public class Dictionary {
    @RequestMapping("/index")
    public String home(){
        return "/index";
    }@RequestMapping("/home")
    public String dictionar(@RequestParam String dictionary, Model model){
        Map<String, String> dic = new HashMap<>();
        dic.put("hello", "Xin chào");
        dic.put("how", "Thế nào");
        dic.put("book", "Quyển vở");
        dic.put("computer", "Máy tính");
        String a =dic.get(dictionary);
        model.addAttribute("a",a);
        return "/index2";
    }
}