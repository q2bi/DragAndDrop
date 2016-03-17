package com.mkyong.web.controller;

import java.io.File;
import java.io.IOException;

import org.javalite.activejdbc.Base;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;



import org.javalite.activejdbc.Base;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.itextpdf.text.pdf.AcroFields;
import com.itextpdf.text.pdf.PdfReader;

@Controller
public class HelloController {

	@RequestMapping(value = "/", method = RequestMethod.GET)
	public ModelAndView getData() throws IOException {
		ModelAndView model = new ModelAndView("upload");
//		File file = new File(".");
//		String currentDirectory = file.getAbsolutePath();
//		System.out.println("Current working directory : "+currentDirectory);
//    	PdfReader reader = new PdfReader("fillable_form.pdf");
//    	AcroFields fields = reader.getAcroFields();
//      Base.open("com.mysql.jdbc.Driver", "jdbc:mysql://localhost/SAE_Report_Form", "root", "8515111q");
//	    patientinformations p = new patientinformations();
//	    p.set("AssignedCaseNum", fields.getField("Section0_AssignedCase#").toString());
//	    p.set("PatientNum", fields.getField("Section1_Patient#").toString());
//	    p.set("PatientInitials", fields.getField("Section1_PatientInitials").toString());
//	    p.set("DateOfBirth_DD", fields.getField("Section1_DateOfBirth_DD").toString());
//	    p.set("DateOfBirth_MMM", fields.getField("Section1_DateOfBirth_MMM").toString());
//	    p.set("DateOfBirth_YYYY", fields.getField("Section1_DateOfBirth_YYYY").toString());
//	    p.set("SEX", fields.getField("Section1_Sex_Radio").toString());
//	    p.set("Weight", fields.getField("Section1_Weight").toString());
//		p.set("Weight_Unit", fields.getField("Section1_Weight_Unit_Radio").toString());
//	    p.set("Height", fields.getField("Section1_Height").toString());
//		  p.set("Height_Unit", fields.getField("Section1_Height_Radio").toString());
//		  p.set("Race", fields.getField("Section1_Race_Radio").toString());
//		  p.saveIt();
//		  Base.close();
		return model;
	}
	
	@RequestMapping(value = "/hello", method = RequestMethod.GET)
	public ModelAndView getData2() {

		ModelAndView model = new ModelAndView("hello");
	
		return model;

	}
	
}