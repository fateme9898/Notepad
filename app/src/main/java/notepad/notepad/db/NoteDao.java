package notepad.notepad.db;

import android.arch.persistence.room.Dao;
import android.arch.persistence.room.Delete;
import android.arch.persistence.room.Insert;
import android.arch.persistence.room.Query;
import android.arch.persistence.room.Update;


import java.util.List;

import notepad.notepad.util.Constants;

@Dao
public interface NoteDao {

    @Query("SELECT * FROM " + Constants.TABLE_NAME_NOTE)
    List<Note> getNotes();

    @Insert
    long insertNote(Note note);

    @Update
    void updateNote(Note repos);

    @Delete
    void deleteNote(Note note);

}
