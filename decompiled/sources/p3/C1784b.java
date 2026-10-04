package p3;

import b1.AbstractC0703b;
import kotlin.jvm.internal.l;

/* renamed from: p3.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1784b implements InterfaceC1787e {
    public final String a;

    public C1784b(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C1784b) && l.a(this.a, ((C1784b) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return AbstractC0703b.m(new StringBuilder("Error(msg="), this.a, ")");
    }
}
