package F1;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;
import io.ktor.http.ContentDisposition;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

/* loaded from: classes.dex */
public final class g {

    /* renamed from: c, reason: collision with root package name */
    public static final String[] f2188c = {ContentDisposition.Parameters.Name, "length", "last_touch_timestamp"};
    public final Object a;

    /* renamed from: b, reason: collision with root package name */
    public Serializable f2189b;

    public g() {
        this.a = new HashMap();
        this.f2189b = new ArrayList();
    }

    public void a(String str, Object obj) {
        HashMap map = (HashMap) this.a;
        obj.getClass();
        map.put(str, obj);
        ((ArrayList) this.f2189b).remove(str);
    }

    public HashMap b() throws D1.a {
        try {
            ((String) this.f2189b).getClass();
            Cursor cursorQuery = ((D1.b) this.a).getReadableDatabase().query((String) this.f2189b, f2188c, null, null, null, null, null);
            try {
                HashMap map = new HashMap(cursorQuery.getCount());
                while (cursorQuery.moveToNext()) {
                    String string = cursorQuery.getString(0);
                    string.getClass();
                    map.put(string, new f(cursorQuery.getLong(1), cursorQuery.getLong(2)));
                }
                cursorQuery.close();
                return map;
            } catch (Throwable th) {
                if (cursorQuery == null) {
                    throw th;
                }
                try {
                    cursorQuery.close();
                    throw th;
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                    throw th;
                }
            }
        } catch (SQLException e7) {
            throw new D1.a(e7);
        }
    }

    public void c(long j7) throws D1.a {
        D1.b bVar = (D1.b) this.a;
        try {
            String hexString = Long.toHexString(j7);
            this.f2189b = "ExoPlayerCacheFileMetadata" + hexString;
            if (D1.c.a(bVar.getReadableDatabase(), 2, hexString) != 1) {
                SQLiteDatabase writableDatabase = bVar.getWritableDatabase();
                writableDatabase.beginTransactionNonExclusive();
                try {
                    D1.c.b(writableDatabase, 2, hexString);
                    writableDatabase.execSQL("DROP TABLE IF EXISTS " + ((String) this.f2189b));
                    writableDatabase.execSQL("CREATE TABLE " + ((String) this.f2189b) + " (name TEXT PRIMARY KEY NOT NULL,length INTEGER NOT NULL,last_touch_timestamp INTEGER NOT NULL)");
                    writableDatabase.setTransactionSuccessful();
                } finally {
                    writableDatabase.endTransaction();
                }
            }
        } catch (SQLException e7) {
            throw new D1.a(e7);
        }
    }

    public void d(Set set) throws D1.a {
        ((String) this.f2189b).getClass();
        try {
            SQLiteDatabase writableDatabase = ((D1.b) this.a).getWritableDatabase();
            writableDatabase.beginTransactionNonExclusive();
            try {
                Iterator it = set.iterator();
                while (it.hasNext()) {
                    writableDatabase.delete((String) this.f2189b, "name = ?", new String[]{(String) it.next()});
                }
                writableDatabase.setTransactionSuccessful();
                writableDatabase.endTransaction();
            } catch (Throwable th) {
                writableDatabase.endTransaction();
                throw th;
            }
        } catch (SQLException e7) {
            throw new D1.a(e7);
        }
    }

    public void e(long j7, long j8, String str) throws SQLException, D1.a {
        ((String) this.f2189b).getClass();
        try {
            SQLiteDatabase writableDatabase = ((D1.b) this.a).getWritableDatabase();
            ContentValues contentValues = new ContentValues();
            contentValues.put(ContentDisposition.Parameters.Name, str);
            contentValues.put("length", Long.valueOf(j7));
            contentValues.put("last_touch_timestamp", Long.valueOf(j8));
            writableDatabase.replaceOrThrow((String) this.f2189b, null, contentValues);
        } catch (SQLException e7) {
            throw new D1.a(e7);
        }
    }

    public g(D1.b bVar) {
        this.a = bVar;
    }
}
