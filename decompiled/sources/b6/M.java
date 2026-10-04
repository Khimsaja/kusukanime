package b6;

import l4.AbstractC1420H;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class M {

    /* renamed from: m, reason: collision with root package name */
    public static final M f11002m;

    /* renamed from: n, reason: collision with root package name */
    public static final M f11003n;

    /* renamed from: o, reason: collision with root package name */
    public static final M f11004o;

    /* renamed from: p, reason: collision with root package name */
    public static final M f11005p;

    /* renamed from: q, reason: collision with root package name */
    public static final /* synthetic */ M[] f11006q;

    /* renamed from: r, reason: collision with root package name */
    public static final /* synthetic */ V3.b f11007r;

    /* renamed from: k, reason: collision with root package name */
    public final char f11008k;

    /* renamed from: l, reason: collision with root package name */
    public final char f11009l;

    static {
        M m7 = new M("OBJ", 0, '{', '}');
        f11002m = m7;
        M m8 = new M("LIST", 1, '[', ']');
        f11003n = m8;
        M m9 = new M("MAP", 2, '{', '}');
        f11004o = m9;
        M m10 = new M("POLY_OBJ", 3, '[', ']');
        f11005p = m10;
        M[] mArr = {m7, m8, m9, m10};
        f11006q = mArr;
        f11007r = AbstractC1420H.z(mArr);
    }

    public M(String str, int i7, char c2, char c4) {
        this.f11008k = c2;
        this.f11009l = c4;
    }

    public static M valueOf(String str) {
        return (M) Enum.valueOf(M.class, str);
    }

    public static M[] values() {
        return (M[]) f11006q.clone();
    }
}
