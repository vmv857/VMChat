package me.noip.vmv857.loc;

import android.content.Context;
import android.database.Cursor;
import android.support.v4.content.CursorLoader;

public class IdWhoCursorLoader extends CursorLoader {

	LocDbHlp db;
    
    public IdWhoCursorLoader(Context context, LocDbHlp db) {
      super(context);
      this.db = db;
    }
    
    @Override
    public Cursor loadInBackground() {
      Cursor cursor = db.get_idwho();
      return cursor;
    }
    
  }