package com.vedantu.www;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class BoradingHouseAssignment {
	public List<List<String>> getAssignedBoradHouseAssignment(List<String> registrationPreference) {
		String[] inputStartLine = registrationPreference.get(0).split(" ");
		int numberofSeats = Integer.parseInt(inputStartLine[1]) / 4;
		List<String> av = new ArrayList();
		List<String> anv = new ArrayList();
		List<String> bv = new ArrayList();
		List<String> bnv = new ArrayList();
		List<String> na = new ArrayList();
		Map<String, String> registeredMapping = new HashMap<String, String>();
		for (int i = 1; i < registrationPreference.size(); i++) {
			String preference = registrationPreference.get(i).toLowerCase();
			String[] preferenceDetails = preference.split(" ");
			if (!registeredMapping.containsKey(preferenceDetails[1])) {
				if (preferenceDetails[3].equals("v")) {
					if (preferenceDetails[2].equals("a")) {
						if (av.size() < numberofSeats) {
							av.add(preferenceDetails[1]);
							registeredMapping.put(preferenceDetails[1], "av");
						} else if (bv.size() < numberofSeats) {
							bv.add(preferenceDetails[1]);
							registeredMapping.put(preferenceDetails[1], "bv");
						} else if (na.size() < numberofSeats) {
							na.add(preferenceDetails[1]);
							registeredMapping.put(preferenceDetails[1], "na");
						}
					} else if (preferenceDetails[2].equals("b")) {
						if (bv.size() < numberofSeats) {
							bv.add(preferenceDetails[1]);
							registeredMapping.put(preferenceDetails[1], "bv");
						} else if (av.size() < numberofSeats) {
							av.add(preferenceDetails[1]);
							registeredMapping.put(preferenceDetails[1], "av");
						} else if (na.size() < numberofSeats) {
							na.add(preferenceDetails[1]);
							registeredMapping.put(preferenceDetails[1], "na");
						}
					}
				} else if (preferenceDetails[3].equals("nv")) {
					if (preferenceDetails[2].equals("a")) {
						if (anv.size() < numberofSeats) {
							anv.add(preferenceDetails[1]);
							registeredMapping.put(preferenceDetails[1], "anv");
						} else if (bnv.size() < numberofSeats) {
							bnv.add(preferenceDetails[1]);
							registeredMapping.put(preferenceDetails[1], "bnv");
						} else if (av.size() < numberofSeats) {
							av.add(preferenceDetails[1]);
							registeredMapping.put(preferenceDetails[1], "av");
						} else if (bv.size() < numberofSeats) {
							bv.add(preferenceDetails[1]);
							registeredMapping.put(preferenceDetails[1], "bv");
						} else if (na.size() < numberofSeats) {
							na.add(preferenceDetails[1]);
							registeredMapping.put(preferenceDetails[1], "na");
						}
					} else if (preferenceDetails[2].equals("b")) {
						if (bnv.size() < numberofSeats) {
							bnv.add(preferenceDetails[1]);
							registeredMapping.put(preferenceDetails[1], "bnv");
						} else if (anv.size() < numberofSeats) {
							anv.add(preferenceDetails[1]);
							registeredMapping.put(preferenceDetails[1], "anv");
						} else if (bv.size() < numberofSeats) {
							bv.add(preferenceDetails[1]);
							registeredMapping.put(preferenceDetails[1], "bv");
						} else if (av.size() < numberofSeats) {
							av.add(preferenceDetails[1]);
							registeredMapping.put(preferenceDetails[1], "av");
						} else if (na.size() < numberofSeats) {
							na.add(preferenceDetails[1]);
							registeredMapping.put(preferenceDetails[1], "na");
						}
					}
				}
			}
		}
		List<List<String>> assignedValues = new ArrayList<List<String>>();
		assignedValues.add(bv);
		assignedValues.add(av);
		assignedValues.add(bnv);
		assignedValues.add(anv);
		assignedValues.add(na);
		return assignedValues;
	}

}
