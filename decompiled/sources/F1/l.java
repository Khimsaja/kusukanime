package F1;

import B1.AbstractC0015b;
import B1.K;
import android.content.ContentValues;
import android.database.Cursor;
import android.database.DatabaseUtils;
import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.util.SparseArray;
import b1.AbstractC0703b;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.util.HashMap;
import java.util.Iterator;

/* loaded from: classes.dex */
public final class l implements n {

    /* renamed from: e, reason: collision with root package name */
    public static final String[] f2201e = {"id", "key", "metadata"};
    public final D1.b a;

    /* renamed from: b, reason: collision with root package name */
    public final SparseArray f2202b = new SparseArray();

    /* renamed from: c, reason: collision with root package name */
    public String f2203c;

    /* renamed from: d, reason: collision with root package name */
    public String f2204d;

    public l(D1.b bVar) {
        this.a = bVar;
    }

    @Override // F1.n
    public final boolean a() throws D1.a {
        try {
            SQLiteDatabase readableDatabase = this.a.getReadableDatabase();
            String str = this.f2203c;
            str.getClass();
            return D1.c.a(readableDatabase, 1, str) != -1;
        } catch (SQLException e7) {
            throw new D1.a(e7);
        }
    }

    @Override // F1.n
    public final void b(HashMap map) throws D1.a {
        SparseArray sparseArray = this.f2202b;
        if (sparseArray.size() == 0) {
            return;
        }
        try {
            SQLiteDatabase writableDatabase = this.a.getWritableDatabase();
            writableDatabase.beginTransactionNonExclusive();
            for (int i7 = 0; i7 < sparseArray.size(); i7++) {
                try {
                    k kVar = (k) sparseArray.valueAt(i7);
                    if (kVar == null) {
                        int iKeyAt = sparseArray.keyAt(i7);
                        String str = this.f2204d;
                        str.getClass();
                        writableDatabase.delete(str, "id = ?", new String[]{Integer.toString(iKeyAt)});
                    } else {
                        i(writableDatabase, kVar);
                    }
                } catch (Throwable th) {
                    writableDatabase.endTransaction();
                    throw th;
                }
            }
            writableDatabase.setTransactionSuccessful();
            sparseArray.clear();
            writableDatabase.endTransaction();
        } catch (SQLException e7) {
            throw new D1.a(e7);
        }
    }

    @Override // F1.n
    public final void c(HashMap map) throws D1.a {
        try {
            SQLiteDatabase writableDatabase = this.a.getWritableDatabase();
            writableDatabase.beginTransactionNonExclusive();
            try {
                j(writableDatabase);
                Iterator it = map.values().iterator();
                while (it.hasNext()) {
                    i(writableDatabase, (k) it.next());
                }
                writableDatabase.setTransactionSuccessful();
                this.f2202b.clear();
                writableDatabase.endTransaction();
            } catch (Throwable th) {
                writableDatabase.endTransaction();
                throw th;
            }
        } catch (SQLException e7) {
            throw new D1.a(e7);
        }
    }

    @Override // F1.n
    public final void d(long j7) {
        String hexString = Long.toHexString(j7);
        this.f2203c = hexString;
        this.f2204d = AbstractC0703b.i("ExoPlayerCacheIndex", hexString);
    }

    @Override // F1.n
    public final void e(k kVar, boolean z7) {
        SparseArray sparseArray = this.f2202b;
        int i7 = kVar.a;
        if (z7) {
            sparseArray.delete(i7);
        } else {
            sparseArray.put(i7, null);
        }
    }

    @Override // F1.n
    public final void f(k kVar) {
        this.f2202b.put(kVar.a, kVar);
    }

    @Override // F1.n
    public final void g(HashMap map, SparseArray sparseArray) throws D1.a {
        D1.b bVar = this.a;
        AbstractC0015b.h(this.f2202b.size() == 0);
        try {
            SQLiteDatabase readableDatabase = bVar.getReadableDatabase();
            String str = this.f2203c;
            str.getClass();
            if (D1.c.a(readableDatabase, 1, str) != 1) {
                SQLiteDatabase writableDatabase = bVar.getWritableDatabase();
                writableDatabase.beginTransactionNonExclusive();
                try {
                    j(writableDatabase);
                    writableDatabase.setTransactionSuccessful();
                    writableDatabase.endTransaction();
                } catch (Throwable th) {
                    writableDatabase.endTransaction();
                    throw th;
                }
            }
            SQLiteDatabase readableDatabase2 = bVar.getReadableDatabase();
            String str2 = this.f2204d;
            str2.getClass();
            Cursor cursorQuery = readableDatabase2.query(str2, f2201e, null, null, null, null, null);
            while (cursorQuery.moveToNext()) {
                try {
                    int i7 = cursorQuery.getInt(0);
                    String string = cursorQuery.getString(1);
                    string.getClass();
                    map.put(string, new k(i7, string, B0.b.a(new DataInputStream(new ByteArrayInputStream(cursorQuery.getBlob(2))))));
                    sparseArray.put(i7, string);
                } finally {
                }
            }
            cursorQuery.close();
        } catch (SQLiteException e7) {
            map.clear();
            sparseArray.clear();
            throw new D1.a(e7);
        }
    }

    @Override // F1.n
    public final void h() throws D1.a {
        D1.b bVar = this.a;
        String str = this.f2203c;
        str.getClass();
        try {
            String strConcat = "ExoPlayerCacheIndex".concat(str);
            SQLiteDatabase writableDatabase = bVar.getWritableDatabase();
            writableDatabase.beginTransactionNonExclusive();
            try {
                int i7 = D1.c.a;
                try {
                    int i8 = K.a;
                    if (DatabaseUtils.queryNumEntries(writableDatabase, "sqlite_master", "tbl_name = ?", new String[]{"ExoPlayerVersions"}) > 0) {
                        writableDatabase.delete("ExoPlayerVersions", "feature = ? AND instance_uid = ?", new String[]{Integer.toString(1), str});
                    }
                    writableDatabase.execSQL("DROP TABLE IF EXISTS " + strConcat);
                    writableDatabase.setTransactionSuccessful();
                } catch (SQLException e7) {
                    throw new D1.a(e7);
                }
            } finally {
                writableDatabase.endTransaction();
            }
        } catch (SQLException e8) {
            throw new D1.a(e8);
        }
    }

    public final void i(SQLiteDatabase sQLiteDatabase, k kVar) throws IOException, SQLException {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        B0.b.b(kVar.f2200e, new DataOutputStream(byteArrayOutputStream));
        byte[] byteArray = byteArrayOutputStream.toByteArray();
        ContentValues contentValues = new ContentValues();
        contentValues.put("id", Integer.valueOf(kVar.a));
        contentValues.put("key", kVar.f2197b);
        contentValues.put("metadata", byteArray);
        String str = this.f2204d;
        str.getClass();
        sQLiteDatabase.replaceOrThrow(str, null, contentValues);
    }

    public final void j(SQLiteDatabase sQLiteDatabase) throws SQLException, D1.a {
        String str = this.f2203c;
        str.getClass();
        D1.c.b(sQLiteDatabase, 1, str);
        String str2 = this.f2204d;
        str2.getClass();
        sQLiteDatabase.execSQL("DROP TABLE IF EXISTS ".concat(str2));
        sQLiteDatabase.execSQL("CREATE TABLE " + this.f2204d + " (id INTEGER PRIMARY KEY NOT NULL,key TEXT NOT NULL,metadata BLOB NOT NULL)");
    }
}
