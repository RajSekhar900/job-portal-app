package com.jobportal;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import com.jobportal.model.Job;

@Controller
public class JobController {

    @Autowired
    private JobService jobService;

    @GetMapping("/")
    public String viewJobs(Model model) {
        model.addAttribute("jobs", jobService.getAllJobs());
        return "index";
    }

    @GetMapping("/add")
    public String addJobForm(Model model) {
        model.addAttribute("job", new Job());
        return "job";
    }

    @PostMapping("/save")
    public String saveJob(@ModelAttribute Job job) {
        jobService.saveJob(job);
        return "redirect:/";
    }

    @GetMapping("/delete/{id}")
    public String deleteJob(@PathVariable Long id) {
        jobService.deleteJob(id);
        return "redirect:/";
    }

    @GetMapping("/edit/{id}")
    public String editJob(@PathVariable Long id, Model model) {
        model.addAttribute("job", jobService.getJobById(id));
        return "job";
    }

    @GetMapping("/search")
    public String searchJobs(@RequestParam String keyword, Model model) {
        model.addAttribute("jobs", jobService.searchJobs(keyword));
        return "index";
    }
}