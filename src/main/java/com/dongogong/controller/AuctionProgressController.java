package com.dongogong.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(value="/auction_progress.do")
public class AuctionProgressController {

	@PostMapping
	public String auctionProgress() {
		return "auctionProgress_list";
	}
	
}
