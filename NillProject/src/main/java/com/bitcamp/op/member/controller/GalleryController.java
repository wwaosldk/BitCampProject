package com.bitcamp.op.member.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class GalleryController {
	
	@RequestMapping(value="/gallery")
	public String toGallery() {
		return "redirect:/gal";
	}
	
	@RequestMapping(value="/gal")
	public String getGallery() {
		return "gallery/Gallery";
	}
}
