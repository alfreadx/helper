package helper

import spock.lang.Specification;

class HelloSpec extends Specification{

	def "length of name compare"(){
		expect:
		name.size() == length
		
		where:
		name | length
		"Spock" | 5
		"HIHI" | 4
		"OKOKWOW" | 7
		"Wo" | 2
		
		
	}
	
}
