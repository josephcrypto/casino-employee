package cn.coding.com.casinoemployee;

import cn.coding.com.casinoemployee.entity.Message;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

@SpringBootApplication
@RestController
public class CasinoEmployeeApplication {

    public static void main(String[] args) {
        SpringApplication.run(CasinoEmployeeApplication.class, args);
    }


    @PostMapping("/api/validateLogin")
    public String validateLogin(@RequestBody JSONObject jsonparam, HttpServletRequest request) {
        String username = jsonparam.get("username").toString();
        String password = jsonparam.get("password").toString();
        String str = "";
        Message message = new Message();
        if (username.equals("admin") && password.equals("admin12345")) {
            HttpSession session = request.getSession();
            session.setAttribute("username", "admin");
            message.setCode(1);
            message.setMessage("Login Successfully");
            str = JSON.toJSONString(message);
        } else {
            message.setCode(0);
            message.setMessage("Invalid username or password!");
            str = JSON.toJSONString(message);
        }
        return str;
    }
}
