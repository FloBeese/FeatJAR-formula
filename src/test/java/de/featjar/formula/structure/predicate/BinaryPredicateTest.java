package de.featjar.formula.structure.predicate;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;
import java.util.Arrays;


public class BinaryPredicateTest {
	
	@Test
	void testLessEqual() {
		LessEqual lessEqual = new LessEqual();
		
		assertTrue(lessEqual.evaluate(Arrays.asList(7,100)).get());
		assertFalse(lessEqual.evaluate(Arrays.asList(123, 100)).get());
		assertTrue(lessEqual.evaluate(Arrays.asList(123, 123)).get());
		
		assertFalse(lessEqual.evaluate(Arrays.asList(123, null)).isPresent());
		assertFalse(lessEqual.evaluate(Arrays.asList(null,123)).isPresent());
		assertFalse(lessEqual.evaluate(Arrays.asList(null, null)).isPresent());
	}
	
	@Test 
	void testEquals() {
		Equals equals = new Equals();
		
		assertFalse(equals.evaluate(Arrays.asList(7,100)).get());
		assertFalse(equals.evaluate(Arrays.asList(123, 100)).get());
		assertTrue(equals.evaluate(Arrays.asList(123, 123)).get());
		
		assertFalse(equals.evaluate(Arrays.asList(123, null)).isPresent());
		assertFalse(equals.evaluate(Arrays.asList(null,123)).isPresent());
		assertFalse(equals.evaluate(Arrays.asList(null, null)).isPresent());
	}
	
	@Test
	void testLess() {
		LessThan lessThan = new LessThan();
		
		assertTrue(lessThan.evaluate(Arrays.asList(7,100)).get());
		assertFalse(lessThan.evaluate(Arrays.asList(123, 100)).get());
		assertFalse(lessThan.evaluate(Arrays.asList(123, 123)).get());
		
		assertFalse(lessThan.evaluate(Arrays.asList(123, null)).isPresent());
		assertFalse(lessThan.evaluate(Arrays.asList(null,123)).isPresent());
		assertFalse(lessThan.evaluate(Arrays.asList(null, null)).isPresent());
	}
	
	@Test
	void testGreaterEqual() {
		GreaterEqual greaterEqual = new GreaterEqual();
		
		assertFalse(greaterEqual.evaluate(Arrays.asList(7,100)).get());
		assertTrue(greaterEqual.evaluate(Arrays.asList(123, 100)).get());
		assertTrue(greaterEqual.evaluate(Arrays.asList(123, 123)).get());
		
		assertFalse(greaterEqual.evaluate(Arrays.asList(123, null)).isPresent());
		assertFalse(greaterEqual.evaluate(Arrays.asList(null,123)).isPresent());
		assertFalse(greaterEqual.evaluate(Arrays.asList(null, null)).isPresent());
	}
	
	@Test
	void testNotEquals() {
		NotEquals notEquals = new NotEquals();
		
		assertTrue(notEquals.evaluate(Arrays.asList(7,100)).get());
		assertTrue(notEquals.evaluate(Arrays.asList(123, 100)).get());
		assertFalse(notEquals.evaluate(Arrays.asList(123, 123)).get());
		
		assertFalse(notEquals.evaluate(Arrays.asList(123, null)).isPresent());
		assertFalse(notEquals.evaluate(Arrays.asList(null,123)).isPresent());
		assertFalse(notEquals.evaluate(Arrays.asList(null, null)).isPresent());
	}
	
	void testGreaterThan() {
		GreaterThan greaterThan = new GreaterThan();
		
		assertFalse(greaterThan.evaluate(Arrays.asList(7,100)).get());
		assertTrue(greaterThan.evaluate(Arrays.asList(123, 100)).get());
		assertFalse(greaterThan.evaluate(Arrays.asList(123, 123)).get());
		
		assertFalse(greaterThan.evaluate(Arrays.asList(123, null)).isPresent());
		assertFalse(greaterThan.evaluate(Arrays.asList(null,123)).isPresent());
		assertFalse(greaterThan.evaluate(Arrays.asList(null, null)).isPresent());
	}
}
