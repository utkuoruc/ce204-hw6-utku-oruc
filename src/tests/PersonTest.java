package tests;

import static org.junit.Assert.*;

import org.junit.Test;

import classes.*;

public class PersonTest {

	@Test
	public void testPerson() {
		Person person = new Client("utku","duyar sokak","05510615333");
		
		assertEquals(true, person != null);
		
	}

	@Test
	public void testSetName() {
		Person person = new Client("utku","duyar sokak","05510615333");
		person.setName("jack");
		assertEquals("jack", person.getName());
	}

	@Test
	public void testSetAddress() {
		Person person = new Client("utku","duyar sokak","05510615333");
		person.setAddress("yengin sokak");
		assertEquals("yengin sokak", person.getAddress());
	}

	@Test
	public void testSetPhoneNumber() {
		Person person = new Client("utku","duyar sokak","05510615333");
		person.setPhoneNumber("444 4 444");
		assertEquals("444 4 444", person.getPhoneNumber());
	}

	@Test
	public void testGetName() {
		Person person = new Client("utku","duyar sokak","05510615333");
		person.setName("jack");
		assertEquals("jack", person.getName());
	}

	@Test
	public void testGetAddress() {
		Person person = new Client("utku","duyar sokak","05510615333");
		person.setAddress("yengin sokak");
		assertEquals("yengin sokak", person.getAddress());
	}

	@Test
	public void testGetPhoneNumber() {
		Person person = new Client("utku","duyar sokak","05510615333");
		person.setPhoneNumber("444 4 444");
		assertEquals("444 4 444", person.getPhoneNumber());
	}

	@Test
	public void testDelete() {
		Person person = new Client("utku","duyar sokak","05510615333");
		person.setPhoneNumber("444 4 444");
		person.delete();
		assertEquals("duyar sokak", person.getAddress());
	}

}
