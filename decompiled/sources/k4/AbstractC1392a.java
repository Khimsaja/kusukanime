package k4;

import P3.r;
import f4.InterfaceC0881a;
import java.util.Iterator;

/* renamed from: k4.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC1392a implements Iterable, InterfaceC0881a {

    /* renamed from: k, reason: collision with root package name */
    public final char f12664k;

    /* renamed from: l, reason: collision with root package name */
    public final char f12665l;

    /* renamed from: m, reason: collision with root package name */
    public final int f12666m = 1;

    public AbstractC1392a(char c2, char c4) {
        this.f12664k = c2;
        this.f12665l = (char) r.B(c2, c4, 1);
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return new C1393b(this.f12664k, this.f12665l, this.f12666m);
    }
}
