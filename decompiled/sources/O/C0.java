package O;

import f4.InterfaceC0881a;
import java.util.ArrayList;
import java.util.ConcurrentModificationException;
import java.util.HashMap;
import java.util.Iterator;

/* loaded from: classes.dex */
public final class C0 implements Iterable, InterfaceC0881a {

    /* renamed from: k, reason: collision with root package name */
    public final B0 f6958k;

    /* renamed from: l, reason: collision with root package name */
    public final int f6959l;

    /* renamed from: m, reason: collision with root package name */
    public final int f6960m;

    public C0(B0 b02, int i7, int i8) {
        this.f6958k = b02;
        this.f6959l = i7;
        this.f6960m = i8;
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        int i7;
        ArrayList arrayList;
        int iQ;
        B0 b02 = this.f6958k;
        if (b02.f6952q != this.f6960m) {
            throw new ConcurrentModificationException();
        }
        HashMap map = b02.f6954s;
        C0484c c0484c = null;
        int i8 = this.f6959l;
        if (map != null) {
            if (b02.f6951p) {
                C0486d.w("use active SlotWriter to crate an anchor for location instead");
                throw null;
            }
            if (i8 >= 0 && i8 < (i7 = b02.f6947l) && (iQ = C0486d.Q((arrayList = b02.f6953r), i8, i7)) >= 0) {
                c0484c = (C0484c) arrayList.get(iQ);
            }
            if (c0484c != null) {
            }
        }
        return new K(b02, i8 + 1, b02.f6946k[(i8 * 5) + 3] + i8);
    }
}
