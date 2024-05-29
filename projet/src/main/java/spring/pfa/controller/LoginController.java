package spring.pfa.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import spring.pfa.model.Administrateur;
import spring.pfa.model.Employe;
import spring.pfa.repository.AdministrateurRepository;
import spring.pfa.repository.EmployeRepository;

@Controller
@RequestMapping("/auth")
public class LoginController {

    @Autowired
    private EmployeRepository employeRepository;

    @Autowired
    private AdministrateurRepository adminRepository;

    @PostMapping("/loginEmployee")
    public String loginEmploye(@RequestParam String mail, @RequestParam String password, Model model) {
        Employe e = employeRepository.findByMail(mail);
        if (e != null && e.getPassword().equals(password)) {
            return "profileEmploye";
        } else {
            model.addAttribute("error", "Invalid email or password");
            return "loginEmployee";
        }
    }
    @PostMapping("/loginAdmin")
    public String loginAdmin(@RequestParam String mail, @RequestParam String password, Model model) {
    	Administrateur admin = adminRepository.findByMail(mail);

        // Check if employee exists and password matches
        if (admin != null && admin.getPassword().equals(password)) {
            return "profileAdmin";
        } else {
            // Add an error message to the model
            model.addAttribute("error", "Invalid email or password");
            return "loginAdmin";
        }
    }
}
