package f3;

import T2.p;
import d3.AbstractC0798j;
import d3.C0803o;

/* renamed from: f3.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0875a implements InterfaceC0879e {

    /* renamed from: b, reason: collision with root package name */
    public final int f11432b;

    public C0875a(int i7) {
        this.f11432b = i7;
        if (i7 <= 0) {
            throw new IllegalArgumentException("durationMillis must be > 0.");
        }
    }

    @Override // f3.InterfaceC0879e
    public final InterfaceC0880f a(p pVar, AbstractC0798j abstractC0798j) {
        return !(abstractC0798j instanceof C0803o) ? new C0878d(pVar, abstractC0798j) : ((C0803o) abstractC0798j).f11318c == U2.e.f9204k ? new C0878d(pVar, abstractC0798j) : new C0876b(pVar, abstractC0798j, this.f11432b);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C0875a) {
            return this.f11432b == ((C0875a) obj).f11432b;
        }
        return false;
    }

    public final int hashCode() {
        return Boolean.hashCode(false) + (this.f11432b * 31);
    }
}
