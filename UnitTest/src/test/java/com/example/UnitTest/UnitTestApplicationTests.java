package com.example.UnitTest;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

import com.example.UnitTest.repository.DataService;
import com.example.UnitTest.service.BusinessService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

public class UnitTestApplicationTests {

	@Mock
	DataService dataServiceMock;

	@InjectMocks
	BusinessService businessImpl;

	@BeforeEach
	public void setUp() {
		MockitoAnnotations.openMocks(this); // Inicializa los mocks y el objeto bajo prueba.
	}

	@Test
	public void testFindTheGreatestFromAllData() {
		when(dataServiceMock.retrieveAllData()).thenReturn(new int[] { 24, 15, 3 });
		assertEquals(24, businessImpl.findTheGreatestFromAllData());
	}

	@Test
	public void testFindTheGreatestFromAllData_ForOneValue() {
		when(dataServiceMock.retrieveAllData()).thenReturn(new int[] { 15 });
		assertEquals(15, businessImpl.findTheGreatestFromAllData());
	}

	@Test
	public void testFindTheGreatestFromAllData_NoValues() {
		when(dataServiceMock.retrieveAllData()).thenReturn(new int[] {});
		assertEquals(Integer.MIN_VALUE, businessImpl.findTheGreatestFromAllData());
	}
}
