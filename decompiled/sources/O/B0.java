package O;

import f4.InterfaceC0881a;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import m.C1496q;

/* loaded from: classes.dex */
public final class B0 implements Iterable, InterfaceC0881a {

    /* renamed from: l, reason: collision with root package name */
    public int f6947l;

    /* renamed from: n, reason: collision with root package name */
    public int f6949n;

    /* renamed from: o, reason: collision with root package name */
    public int f6950o;

    /* renamed from: p, reason: collision with root package name */
    public boolean f6951p;

    /* renamed from: q, reason: collision with root package name */
    public int f6952q;

    /* renamed from: s, reason: collision with root package name */
    public HashMap f6954s;

    /* renamed from: t, reason: collision with root package name */
    public C1496q f6955t;

    /* renamed from: k, reason: collision with root package name */
    public int[] f6946k = new int[0];

    /* renamed from: m, reason: collision with root package name */
    public Object[] f6948m = new Object[0];

    /* renamed from: r, reason: collision with root package name */
    public ArrayList f6953r = new ArrayList();

    public final int a(C0484c c0484c) {
        if (this.f6951p) {
            C0486d.w("Use active SlotWriter to determine anchor location instead");
            throw null;
        }
        if (c0484c.a()) {
            return c0484c.a;
        }
        C0486d.T("Anchor refers to a group that was removed");
        throw null;
    }

    public final void h() {
        this.f6954s = new HashMap();
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return new K(this, 0, this.f6947l);
    }

    public final A0 j() {
        if (this.f6951p) {
            throw new IllegalStateException("Cannot read while a writer is pending");
        }
        this.f6950o++;
        return new A0(this);
    }

    public final D0 m() {
        if (this.f6951p) {
            C0486d.w("Cannot start a writer when another writer is pending");
            throw null;
        }
        if (this.f6950o > 0) {
            C0486d.w("Cannot start a writer when a reader is pending");
            throw null;
        }
        this.f6951p = true;
        this.f6952q++;
        return new D0(this);
    }
}
