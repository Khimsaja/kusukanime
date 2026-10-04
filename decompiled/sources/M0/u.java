package M0;

import b1.AbstractC0703b;

/* loaded from: classes.dex */
public final class u implements Comparable {

    /* renamed from: l, reason: collision with root package name */
    public static final u f6412l;

    /* renamed from: m, reason: collision with root package name */
    public static final u f6413m;

    /* renamed from: n, reason: collision with root package name */
    public static final u f6414n;

    /* renamed from: o, reason: collision with root package name */
    public static final u f6415o;

    /* renamed from: p, reason: collision with root package name */
    public static final u f6416p;

    /* renamed from: q, reason: collision with root package name */
    public static final u f6417q;

    /* renamed from: r, reason: collision with root package name */
    public static final u f6418r;

    /* renamed from: k, reason: collision with root package name */
    public final int f6419k;

    static {
        u uVar = new u(100);
        u uVar2 = new u(200);
        u uVar3 = new u(300);
        u uVar4 = new u(400);
        f6412l = uVar4;
        u uVar5 = new u(500);
        f6413m = uVar5;
        u uVar6 = new u(600);
        f6414n = uVar6;
        u uVar7 = new u(700);
        u uVar8 = new u(800);
        u uVar9 = new u(900);
        f6415o = uVar4;
        f6416p = uVar5;
        f6417q = uVar6;
        f6418r = uVar7;
        P3.r.I(uVar, uVar2, uVar3, uVar4, uVar5, uVar6, uVar7, uVar8, uVar9);
    }

    public u(int i7) {
        this.f6419k = i7;
        if (1 > i7 || i7 >= 1001) {
            throw new IllegalArgumentException(AbstractC0703b.g(i7, "Font weight can be in range [1, 1000]. Current value: ").toString());
        }
    }

    @Override // java.lang.Comparable
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final int compareTo(u uVar) {
        return kotlin.jvm.internal.l.g(this.f6419k, uVar.f6419k);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof u) {
            return this.f6419k == ((u) obj).f6419k;
        }
        return false;
    }

    public final int hashCode() {
        return this.f6419k;
    }

    public final String toString() {
        return AbstractC0703b.l(new StringBuilder("FontWeight(weight="), this.f6419k, ')');
    }
}
