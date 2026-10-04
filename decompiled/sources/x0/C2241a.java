package x0;

import f6.AbstractC0905c;

/* renamed from: x0.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2241a extends e3.c {
    public InterfaceC2246f a;

    @Override // e3.c
    public final boolean q(C2248h c2248h) {
        return c2248h == this.a.getKey();
    }

    @Override // e3.c
    public final Object w(C2248h c2248h) {
        if (c2248h == this.a.getKey()) {
            return this.a.getValue();
        }
        AbstractC0905c.C("Check failed.");
        throw null;
    }
}
