package com.example.HelloSpring;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;


@RestController
@SpringBootApplication
public class HelloSpringApplication {

	public static void main(String[] args) {
		SpringApplication.run(HelloSpringApplication.class, args);
	}

	//purpose test only

	private List<String> names = new ArrayList<>();

	@GetMapping("/names")
	public List<String> getNames(){
		return names;
	}

	@PostMapping("/names/add")
	public void addName(@RequestParam("name") final String name){
		names.add(name);
	}

	@PutMapping("/names/edit")
	public String editName(@RequestParam("name") final String name, @RequestParam("newName") final String newName){
		String result = name+" -> "+newName;
		int index = names.indexOf(name);
		names.remove(name);
		names.add(index,newName);
		return result;
	}

	@DeleteMapping("/names/delete")
	public boolean deleteName(@RequestParam("name")final String name){
		return names.remove(name);
	}

	@DeleteMapping("/names/deleteAll")
	public void deleteAll(){
		names.clear();
	}

}
