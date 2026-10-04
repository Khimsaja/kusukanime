package q5;

import l4.AbstractC1420H;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class j {

    /* renamed from: l, reason: collision with root package name */
    public static final j f14747l;

    /* renamed from: m, reason: collision with root package name */
    public static final j f14748m;

    /* renamed from: n, reason: collision with root package name */
    public static final j f14749n;

    /* renamed from: o, reason: collision with root package name */
    public static final /* synthetic */ j[] f14750o;

    /* renamed from: k, reason: collision with root package name */
    public final String f14751k;

    static {
        j jVar = new j("IN", 0, "in");
        f14747l = jVar;
        j jVar2 = new j("OUT", 1, "out");
        f14748m = jVar2;
        j jVar3 = new j("INV", 2, "");
        f14749n = jVar3;
        j[] jVarArr = {jVar, jVar2, jVar3};
        f14750o = jVarArr;
        AbstractC1420H.z(jVarArr);
    }

    public j(String str, int i7, String str2) {
        this.f14751k = str2;
    }

    public static j valueOf(String str) {
        return (j) Enum.valueOf(j.class, str);
    }

    public static j[] values() {
        return (j[]) f14750o.clone();
    }

    @Override // java.lang.Enum
    public final String toString() {
        return this.f14751k;
    }
}
