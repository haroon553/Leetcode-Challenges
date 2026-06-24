package org.example.countCharacters;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CountCharactersTest {

    @Test
    void countChars() {
        String [] words = {"cat","bt","hat","tree"};
        String chars = "atach";
        CountCharacters countCharacters = new CountCharacters();
        assertEquals(6,countCharacters.countChars(words,chars));
    }

    @Test
    void countCharacters() {
        String [] words = {"cat","bt","hat","tree"};
        String chars = "atach";
        CountCharacters countCharacters = new CountCharacters();
        assertEquals(6,countCharacters.countCharacters(words,chars));
    }
}