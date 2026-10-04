package y;

import b1.AbstractC0703b;

/* renamed from: y.g, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2326g {
    public final int a;

    /* renamed from: b, reason: collision with root package name */
    public final int f17621b;

    /* renamed from: c, reason: collision with root package name */
    public final InterfaceC2333n f17622c;

    public C2326g(int i7, int i8, InterfaceC2333n interfaceC2333n) {
        this.a = i7;
        this.f17621b = i8;
        this.f17622c = interfaceC2333n;
        if (i7 < 0) {
            throw new IllegalArgumentException(AbstractC0703b.g(i7, "startIndex should be >= 0, but was ").toString());
        }
        if (i8 <= 0) {
            throw new IllegalArgumentException(AbstractC0703b.g(i8, "size should be >0, but was ").toString());
        }
    }
}
