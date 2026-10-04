package D1;

import B1.K;
import android.content.ContentValues;
import android.database.Cursor;
import android.database.DatabaseUtils;
import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;
import y1.AbstractC2402y;

/* loaded from: classes.dex */
public abstract class c {
    public static final /* synthetic */ int a = 0;

    static {
        AbstractC2402y.a("media3.database");
    }

    public static int a(SQLiteDatabase sQLiteDatabase, int i7, String str) throws a {
        try {
            int i8 = K.a;
            if (!(DatabaseUtils.queryNumEntries(sQLiteDatabase, "sqlite_master", "tbl_name = ?", new String[]{"ExoPlayerVersions"}) > 0)) {
                return -1;
            }
            Cursor cursorQuery = sQLiteDatabase.query("ExoPlayerVersions", new String[]{"version"}, "feature = ? AND instance_uid = ?", new String[]{Integer.toString(i7), str}, null, null, null);
            try {
                if (cursorQuery.getCount() == 0) {
                    cursorQuery.close();
                    return -1;
                }
                cursorQuery.moveToNext();
                int i9 = cursorQuery.getInt(0);
                cursorQuery.close();
                return i9;
            } finally {
            }
        } catch (SQLException e7) {
            throw new a(e7);
        }
    }

    public static void b(SQLiteDatabase sQLiteDatabase, int i7, String str) throws SQLException, a {
        try {
            sQLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS ExoPlayerVersions (feature INTEGER NOT NULL,instance_uid TEXT NOT NULL,version INTEGER NOT NULL,PRIMARY KEY (feature, instance_uid))");
            ContentValues contentValues = new ContentValues();
            contentValues.put("feature", Integer.valueOf(i7));
            contentValues.put("instance_uid", str);
            contentValues.put("version", (Integer) 1);
            sQLiteDatabase.replaceOrThrow("ExoPlayerVersions", null, contentValues);
        } catch (SQLException e7) {
            throw new a(e7);
        }
    }
}
