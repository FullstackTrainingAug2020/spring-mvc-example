package com.spring.example.mvc.controller;

import java.util.Locale;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.spring.example.mvc.model.User;

@Controller
public class GoogleController {

		/**
		 * Simply selects the home view to render by returning its name.
		 */
		@RequestMapping(value = "/maps", method = RequestMethod.GET)
		public void maps(Locale locale, Model model) {
			//Logic to return MAPS
		}

		@RequestMapping(value = "/mail", method = RequestMethod.POST)
		public void mail(@Validated User user, Model model) {
			//Logic to return MAIL
		}
	}

