package br.com.projeto.entra21.crud;

import java.util.ArrayList;
import java.util.Arrays;

import br.com.projeto.entra21.annotations.Reminder;

@Reminder(value = "Interface com generics para cria��o dos CRUDs")
public interface ICrud<A> {
	ArrayList<String> options = new ArrayList<String>(Arrays.asList("List", "Add", "Search", "Edit", "Delete"));

	public void list(ArrayList<A> list);

	public void add();

	public A search(A key);

	public void edit(A key);

	public void delete(A key);

	public A captureKey();

	public A captureValues();

	public void viewDetails(A complete);
	

}
