package dmacc.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import dmacc.beans.Contract;
import dmacc.repository.ContractRepository;

@Controller
public class WebController {
	@Autowired
	ContractRepository repo;

	@GetMapping({ "/", "viewAll" })
	public String viewAllContracts(Model model) {
		if (repo.findAll().isEmpty()) {
			return addNewContract(model);
		}
		model.addAttribute("contracts", repo.findAll());
		return "results";
	}

	@GetMapping("/inputContract")
	public String addNewContract(Model model) {
		Contract c = new Contract();
		model.addAttribute("newContract", c);
		return "input";
	}

	@PostMapping("/inputContract")
	public String addNewContract(@ModelAttribute Contract c, Model model) {
		repo.save(c);
		return viewAllContracts(model);
	}

	@PostMapping("/costSortResults")
	public String costSortResults(Model model) {
		return viewAllContracts(model);
	}
	
	@GetMapping("/edit/{id}")
	public String showUpdateContract(@PathVariable("id") long id, Model model) {
		Contract c = repo.findById(id).orElse(null);
		model.addAttribute("newContract", c);
		return "input";
	}

	@PostMapping("/update/{id}")
	public String reviseContract(Contract c, Model model) {
		repo.save(c);
		return viewAllContracts(model);
	}

	@GetMapping("/delete/{id}")
	public String deleteUser(@PathVariable("id") long id, Model model) {
		Contract c = repo.findById(id).orElse(null);
		repo.delete(c);
		return viewAllContracts(model);
	}
	
}
