package f2;

import b1.AbstractC0703b;
import y1.B;

/* renamed from: f2.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0873a implements B {
    public final int a;

    /* renamed from: b, reason: collision with root package name */
    public final String f11430b;

    public C0873a(int i7, String str) {
        this.a = i7;
        this.f11430b = str;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Ait(controlCode=");
        sb.append(this.a);
        sb.append(",url=");
        return AbstractC0703b.m(sb, this.f11430b, ")");
    }
}
