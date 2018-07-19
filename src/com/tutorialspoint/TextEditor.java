package com.tutorialspoint;

import org.springframework.beans.factory.annotation.Autowired;

public class TextEditor {
	@Autowired
	private SpellChecker spellChecker;

	public TextEditor(SpellChecker spellChecker) {
		System.out.println("Inside TextEditor constructor");
		this.spellChecker = spellChecker;
	}

	public void spellChecker() {
		spellChecker.checkSpelling();
	}

	public SpellChecker getSpellChecker() {
		return spellChecker;
	}

	public void setSpellChecker(SpellChecker spellChecker) {
		this.spellChecker = spellChecker;
	}
}
