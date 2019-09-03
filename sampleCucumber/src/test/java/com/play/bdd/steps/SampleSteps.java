package com.play.bdd.steps;

import java.util.Map;

import cucumber.api.DataTable;
import cucumber.api.java.en.Given;

public class SampleSteps {
	@Given("^There (?:is|are) (\\d) (?:credit?|credits) for some course in Play$")
	public void animals_fed_by_people(int credit) {
		System.out.println(String.format("%d credit(s)", credit));
	}

	@Given("^I (?:love|adore|like) play$")
	public void I_have_a_X_cucumber_step() {
		System.out.println("Step defenition with a non capturing group");
	}

	@Given("^I have the following details for play$")
	public void i_have_the_following_play_details(DataTable dataTable) {
		for (Map<String, String> map : dataTable.asMaps(String.class, String.class)) {
			String course = map.get("course");
			String miles = map.get("miles");
			String credit = map.get("credits");
			System.out.println(String.format("play details %s %s at the credit of %s", miles, course, credit));
		}
	}
}
