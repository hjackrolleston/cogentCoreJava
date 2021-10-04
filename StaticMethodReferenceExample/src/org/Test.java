package org;
import org.Notable;
import org.NoteClass;
public class Test {

	public static void main(String[] args) {
		Notable note = NoteClass::noteSomething;
		note.note("lecture");
	}

}
