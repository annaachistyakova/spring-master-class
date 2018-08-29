package com.in28minutes.spring.basics.springin5steps.basic;

import org.springframework.stereotype.Component;

@Component 
public class BubbleSortAlgorithm implements SortAlgorithm {
	public int[] sort(int[] numbers) {
		// Logic for Bubble Sort
		return numbers;
	}
}

//////////////////////////////////////////////////////////////
//using @Qualifier
/*
package com.in28minutes.spring.basics.springin5steps;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component 
@Qualifier("bubble") //this one is not used here
public class BubbleSortAlgorithm implements SortAlgorithm {
	public int[] sort(int[] numbers) {
		// Logic for Bubble Sort
		return numbers;
	}
}
*/