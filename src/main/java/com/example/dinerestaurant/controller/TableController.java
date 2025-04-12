package com.dinein.controller;

import java.io.IOException;
import java.util.Optional;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import com.dinein.model.Table;
import com.dinein.repository.StaffRepository;
import com.dinein.repository.TableRepository;

@RequestMapping("/api/table")
@RestController
public class TableController {

	@Autowired
	TableRepository repo;

	@Autowired
	StaffRepository staffRepo;
	
	@RequestMapping("/api/list")
    public String home(Model model) {
        model.addAttribute("datalist", repo.findAll());
        return "table";
    }
	
	@RequestMapping("/api/list/waiter")
    public String waiterTable(Model model, HttpServletRequest req) {
        model.addAttribute("datalist", repo.findAllByWaiterId(req.getSession().getAttribute("userid").toString()));
        return "table";
    }
	
	@RequestMapping("/api/create")
	public String create(Model model) {
		return "table_create";
	}
	
	@RequestMapping("/api/save")
	public String save(Table obj) throws IOException{
		repo.save(obj);		
		return "redirect:/table/list";
	}
	
	
	 @RequestMapping("/api/delete/{id}")
	    public String delete(@PathVariable String id) {
	        Optional<Table> obj = repo.findById(id);
	        repo.delete(obj.get());
	        return "redirect:/table/list";
	    }
	    
	    @RequestMapping("/api/edit/{id}")
	    public String edit(@PathVariable String id, Model model) {
	        model.addAttribute("obj", repo.findById(id).get());
			model.addAttribute("waiters", staffRepo.findAllByDesignation("Waiter"));

	        return "table_edit";
	    }
	    
	    @RequestMapping("/api/update")
	    public String update(Table obj) {
		    repo.save(obj);
	        return "redirect:/table/list";
	    }
	 
}
