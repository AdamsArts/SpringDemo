package com.mipl.project.Gadgets.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

import com.mipl.project.Gadgets.Entity.Laptop;

@Service
public class LapInfo {

	public static List<Laptop> lapDetails = new ArrayList<>(
			Arrays.asList(new Laptop(1, "Dell", 45000, "Windows 10"), new Laptop(2, "HP", 48000, "Windows 11")));

	public static List<Laptop> lapCollection() {

		return lapDetails;
	}

	public static String insertLap(Laptop laptop) {
		lapDetails.add(laptop);
		return "Record inserted";
	}

}
