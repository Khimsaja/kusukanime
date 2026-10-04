package i1;

import android.os.Build;
import android.view.View;
import d1.C0782a;
import java.util.Objects;

/* loaded from: classes.dex */
public class P {

    /* renamed from: b, reason: collision with root package name */
    public static final S f11963b;
    public final S a;

    static {
        int i7 = Build.VERSION.SDK_INT;
        f11963b = (i7 >= 30 ? new C1043H() : i7 >= 29 ? new C1042G() : new C1041F()).b().a.a().a.b().a.c();
    }

    public P(S s7) {
        this.a = s7;
    }

    public S a() {
        return this.a;
    }

    public S b() {
        return this.a;
    }

    public S c() {
        return this.a;
    }

    public C1050c e() {
        return null;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof P)) {
            return false;
        }
        P p7 = (P) obj;
        return n() == p7.n() && m() == p7.m() && Objects.equals(k(), p7.k()) && Objects.equals(i(), p7.i()) && Objects.equals(e(), p7.e());
    }

    public C0782a f(int i7) {
        return C0782a.f11199e;
    }

    public C0782a g(int i7) {
        if ((i7 & 8) == 0) {
            return C0782a.f11199e;
        }
        throw new IllegalArgumentException("Unable to query the maximum insets for IME");
    }

    public C0782a h() {
        return k();
    }

    public int hashCode() {
        return Objects.hash(Boolean.valueOf(n()), Boolean.valueOf(m()), k(), i(), e());
    }

    public C0782a i() {
        return C0782a.f11199e;
    }

    public C0782a j() {
        return k();
    }

    public C0782a k() {
        return C0782a.f11199e;
    }

    public C0782a l() {
        return k();
    }

    public boolean m() {
        return false;
    }

    public boolean n() {
        return false;
    }

    public boolean o(int i7) {
        return true;
    }

    public void d(View view) {
    }

    public void p(C0782a[] c0782aArr) {
    }

    public void q(S s7) {
    }

    public void r(C0782a c0782a) {
    }
}
