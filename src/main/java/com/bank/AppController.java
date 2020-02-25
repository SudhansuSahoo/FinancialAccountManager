package com.bank;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class AppController {

	@Autowired
	private AccountService service; 
	
	public Bank_Account newAccount = new Bank_Account((long) 0, null, null, null, null, null, null, null, null, null, 0);
	
	@RequestMapping("/")
	public String viewHomePage(Model model) {
		List<Bank_Account> listAccounts = service.listAll();
		model.addAttribute("listAccounts", listAccounts);
		model.addAttribute("newAccount", newAccount);
		
		return "index";
	}
	
	@RequestMapping("/new")
	public String showNewAccountPage(Model model) {
		Bank_Account account = new Bank_Account();
		model.addAttribute("account", account);
		
		return "new_account";
	}
	
	@RequestMapping(value = "/save", method = RequestMethod.POST)
	public String saveAccount(@ModelAttribute("account") Bank_Account account) {
		service.save(account);
		
		newAccount = account;
		return "redirect:/";
	}
	
	@RequestMapping("/edit/{id}")
	public ModelAndView showEditAccountPage(@PathVariable(name = "id") int id) {
		ModelAndView mav = new ModelAndView("edit_account");
		Bank_Account account = service.get(id);
		mav.addObject("account", account);
		
		return mav;
	}
	
	@RequestMapping("/delete/{id}")
	public String deleteAccount(@PathVariable(name = "id") int id) {
		service.delete(id);
		return "redirect:/";		
	}
}
