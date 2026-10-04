package P;

import O.C0517t;
import O.D0;

/* loaded from: classes.dex */
public abstract class C {
    public final int a;

    /* renamed from: b, reason: collision with root package name */
    public final int f7642b;

    public C(int i7, int i8) {
        this.a = i7;
        this.f7642b = i8;
    }

    public abstract void a(B1.s sVar, B2.l lVar, D0 d02, C0517t c0517t);

    public String b(int i7) {
        return "IntParameter(" + i7 + ')';
    }

    public String c(int i7) {
        return "ObjectParameter(" + i7 + ')';
    }

    public final String toString() {
        String strN = kotlin.jvm.internal.y.a.b(getClass()).n();
        return strN == null ? "" : strN;
    }

    public /* synthetic */ C(int i7, int i8, int i9) {
        this((i9 & 1) != 0 ? 0 : i7, (i9 & 2) != 0 ? 0 : i8);
    }
}
