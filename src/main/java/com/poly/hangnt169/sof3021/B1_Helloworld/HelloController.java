package com.poly.hangnt169.sof3021.B1_Helloworld;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
// Tất cả các class trong mục com
// => Spring sẽ nhận và đánh dấu là 1 bean
// Controller la tầng giao tiếp giữa client va server
// thông qua phương HTTP
// Có 4 phương thức HTTP cơ bản :
// GET : Read => Hiển thị, Đọc dữ liệu
// POST: Create (Insert) : Thêm mới dữ liệu
// PUT: Update : Sửa
// DELETE : Delete : Xoá
// J5: Get, post
// Get: Hiển thị
// Post: Xử lý
// Có 2 loại controller:
// @Controller => Theo mô hình MVC => Trả về 1 view
// => J5 : Controller
// @RestController => 3 layer/microservice ...
// => Trả về api => J6
public class HelloController {

    // Khi su dung @Controller
    // Tat cả các hàm trong class đấy
    // Luôn luôn return 1 String (Trả ra tên của view)
    @GetMapping("/demo")
    public String demoController(Model model){
        // Truyen gia tri tu controller => jsp
        // J4: setAttribute("ten",Object -> lisst, String,1object...);
        // J5: Model => addAttribute
        model.addAttribute("test","Test demo ");
        return "a";
    }

}
