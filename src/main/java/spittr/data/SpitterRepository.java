package spittr.data;

import spittr.Spitter;

public interface SpitterRepository {
	Spitter save(String username, String password, String firstName, String lastName);
	Spitter save(Spitter unsaved);
	Spitter findByUsername(String username);
}
