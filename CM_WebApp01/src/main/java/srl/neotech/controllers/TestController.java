package srl.neotech.controllers;

import org.springframework.stereotype.Controller;

@Controller
public class TestController {

	@Requestmapping(value="/musicDetail", method= RequestMethod.GET)                 ) 
	public String musicDetail () {
		return "musicDetail" ;
           }
	@getmapping (value="/musicStore" , method= RequestMethod.GET)"
	public String musicStore () {
		return "musicStore" ;
}