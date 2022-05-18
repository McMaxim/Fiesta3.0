package space.sosnovskikh.fiesta30;




import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.util.Log;

import androidx.annotation.Nullable;

import java.util.ArrayList;
import java.util.List;

public class


MyDB {
    private static final String DATABASE_NAME = "simple.db";
    private static final int DATABASE_VERSION = 6;
    private static final String TABLE_NAME = "GG";
    public static final String COLUMN_ID = "id";
    public static final String COLUMN_SRED = "SRED";
    public static final String COLUMN_POINT = "point";
    public static final String COLUMN_NUMBER = "number";
    public static final int NUM_COLUMN_ID = 0;
    public static final int NUM_COLUMN_POINT = 2;
    public static final int NUM_COLUMN_SRED = 1;
    public static final int NUM_COLUMN_NUMBER = 3;
    private SQLiteDatabase dataBase;

    public MyDB(Context context) {
        OpenHelper openHelper = new OpenHelper(context);
        dataBase = openHelper.getWritableDatabase();
    }

    public Table select(long id) {
        Cursor cursor = dataBase.query(TABLE_NAME, null, COLUMN_ID + " = " + id,
                null, null, null, null);
        Table table;
        if (cursor.moveToFirst()) {
            table = new Table();
            table.setId(cursor.getLong(NUM_COLUMN_ID));
            table.setPoint(cursor.getInt(NUM_COLUMN_POINT));
            table.setStat(cursor.getFloat(NUM_COLUMN_SRED));
            table.setNumber(cursor.getInt(NUM_COLUMN_NUMBER));
            cursor.close();
            return table;
        }
        cursor.close();
        return null;
    }

    public List<Table> selectAll() {
        Cursor cursor = dataBase.query(TABLE_NAME, null, null,
                null, null, null, null);
        ArrayList<Table> list = new ArrayList<>();
        cursor.moveToFirst();
        if (!cursor.isAfterLast()) {
            do {
                Table table = new Table();
                table.setId(cursor.getLong(NUM_COLUMN_ID));
                table.setPoint(cursor.getInt(NUM_COLUMN_POINT));
                table.setStat(cursor.getInt(NUM_COLUMN_SRED));
                table.setNumber(cursor.getInt(NUM_COLUMN_NUMBER));
                list.add(table);
            }while (cursor.moveToNext());
        }
        cursor.close();
        return list;
    }

    public long insert(List<Table> list) {
        if (list.size() == 0) {
            return 0;
        }
        long count = 0;
        for (Table table: list) {
            ContentValues cv = new ContentValues();
            cv.put(COLUMN_SRED, table.getStat());
            cv.put(COLUMN_POINT, table.getPoint());
            cv.put(COLUMN_NUMBER, table.getNumber());
            dataBase.insert(TABLE_NAME, null, cv);
            count++;
        }
        return count;
    }

    public long insert(int point, int stat, int number) {
        ContentValues cv = new ContentValues();
        cv.put(COLUMN_POINT, point);
        cv.put(COLUMN_SRED, stat);
        cv.put(COLUMN_NUMBER, number );
        return dataBase.insert(TABLE_NAME, null, cv);
    }

    public long delete(long id){
        return dataBase.delete(TABLE_NAME,
                COLUMN_ID + "=?", new String[]{String.valueOf(id)});
    }

    public long update(Table table){
        ContentValues contentValues = new ContentValues();
        contentValues.put(COLUMN_SRED, table.getStat());
        contentValues.put(COLUMN_POINT, table.getPoint());
        contentValues.put(COLUMN_NUMBER, table.getNumber());
        return dataBase.update(TABLE_NAME, contentValues,
                COLUMN_ID + "=?", new String[]{String.valueOf(table.getId())});
    }

    private class OpenHelper extends SQLiteOpenHelper {
        public OpenHelper(@Nullable Context context) {
            super(context, DATABASE_NAME, null, DATABASE_VERSION);
        }

        @Override
        public void onCreate(SQLiteDatabase db) {
            String query = "CREATE TABLE " + TABLE_NAME + " (" +
                    COLUMN_ID + " INTEGER PRIMARY KEY AUTOINCREMENT, " +
                    COLUMN_SRED + " FLOAT, " +
                    COLUMN_POINT + " INTEGER, " +
                    COLUMN_NUMBER + " INTEGER);";
            Log.d("My", query);
            db.execSQL(query);
        }

        @Override
        public void onUpgrade(SQLiteDatabase db, int oldV, int newV) {
            db.execSQL("DROP TABLE IF EXISTS " + TABLE_NAME);
            onCreate(db);
        }
    }
}