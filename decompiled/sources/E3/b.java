package E3;

import B1.AbstractC0015b;
import android.content.SharedPreferences;
import android.util.SparseBooleanArray;
import b6.o;
import kotlin.jvm.internal.l;
import y1.C2391m;

/* loaded from: classes.dex */
public class b implements a {
    public final /* synthetic */ int a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f1931b;

    /* renamed from: c, reason: collision with root package name */
    public final Object f1932c;

    public /* synthetic */ b(boolean z7, int i7, Object obj) {
        this.a = i7;
        this.f1932c = obj;
        this.f1931b = z7;
    }

    public void a(int i7) {
        AbstractC0015b.h(!this.f1931b);
        ((SparseBooleanArray) this.f1932c).append(i7, true);
    }

    public C2391m b() {
        AbstractC0015b.h(!this.f1931b);
        this.f1931b = true;
        return new C2391m((SparseBooleanArray) this.f1932c);
    }

    public String c(String str) {
        l.f("key", str);
        SharedPreferences sharedPreferences = (SharedPreferences) this.f1932c;
        if (sharedPreferences.contains(str)) {
            return sharedPreferences.getString(str, "");
        }
        return null;
    }

    public void d() {
        this.f1931b = false;
    }

    public void e(byte b4) {
        ((o) this.f1932c).h(b4);
    }

    public void f(char c2) {
        ((o) this.f1932c).c(c2);
    }

    public void g(int i7) {
        ((o) this.f1932c).h(i7);
    }

    public void h(long j7) {
        ((o) this.f1932c).h(j7);
    }

    public void i(String str) {
        l.f("v", str);
        ((o) this.f1932c).p(str);
    }

    public void j(short s7) {
        ((o) this.f1932c).h(s7);
    }

    public void k(String str) {
        l.f("value", str);
        ((o) this.f1932c).n(str);
    }

    public void l(String str, String str2) {
        l.f("key", str);
        l.f("value", str2);
        SharedPreferences.Editor editorPutString = ((SharedPreferences) this.f1932c).edit().putString(str, str2);
        l.e("putString(...)", editorPutString);
        if (this.f1931b) {
            editorPutString.commit();
        } else {
            editorPutString.apply();
        }
    }

    public void m(String str) {
        l.f("key", str);
        SharedPreferences.Editor editorRemove = ((SharedPreferences) this.f1932c).edit().remove(str);
        l.e("remove(...)", editorRemove);
        if (this.f1931b) {
            editorRemove.commit();
        } else {
            editorRemove.apply();
        }
    }

    public String toString() {
        switch (this.a) {
            case 3:
                return this.f1931b ? "FALL_THROUGH" : String.valueOf(this.f1932c);
            default:
                return super.toString();
        }
    }

    public b(o oVar) {
        this.a = 2;
        this.f1932c = oVar;
        this.f1931b = true;
    }

    public b() {
        this.a = 4;
        this.f1932c = new SparseBooleanArray();
    }

    public void n() {
    }

    public void o() {
    }
}
