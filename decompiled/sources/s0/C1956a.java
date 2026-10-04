package s0;

import b1.AbstractC0703b;

/* renamed from: s0.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1956a implements InterfaceC1969n {

    /* renamed from: b, reason: collision with root package name */
    public final int f15440b;

    public C1956a(int i7) {
        this.f15440b = i7;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!C1956a.class.equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        kotlin.jvm.internal.l.d("null cannot be cast to non-null type androidx.compose.ui.input.pointer.AndroidPointerIconType", obj);
        return this.f15440b == ((C1956a) obj).f15440b;
    }

    public final int hashCode() {
        return this.f15440b;
    }

    public final String toString() {
        return AbstractC0703b.l(new StringBuilder("AndroidPointerIcon(type="), this.f15440b, ')');
    }
}
