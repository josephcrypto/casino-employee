package cn.coding.com.casinoemployee.controller;

import cn.coding.com.casinoemployee.entity.Contact;
import cn.coding.com.casinoemployee.repository.ContactRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@Controller
public class ContactController {

    @Autowired
    private ContactRepository contactRepository;

    @GetMapping("/contact/message")
    public String showContactForm(Model model){
        model.addAttribute("contact", new Contact());
        return "contact";
    }

    @PostMapping("/contact/save")
    public String SaveContact(Contact contact, RedirectAttributes attributes) {
        contactRepository.save(contact);
        attributes.addFlashAttribute("message", "You're email has been send");
        return "contact-success";
    }
}
