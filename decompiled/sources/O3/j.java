package O3;

import l4.AbstractC1420H;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class j {

    /* renamed from: k, reason: collision with root package name */
    public static final j f7525k;

    /* renamed from: l, reason: collision with root package name */
    public static final j f7526l;

    /* renamed from: m, reason: collision with root package name */
    public static final /* synthetic */ j[] f7527m;

    static {
        j jVar = new j("SYNCHRONIZED", 0);
        j jVar2 = new j("PUBLICATION", 1);
        f7525k = jVar2;
        j jVar3 = new j("NONE", 2);
        f7526l = jVar3;
        j[] jVarArr = {jVar, jVar2, jVar3};
        f7527m = jVarArr;
        AbstractC1420H.z(jVarArr);
    }

    public static j valueOf(String str) {
        return (j) Enum.valueOf(j.class, str);
    }

    public static j[] values() {
        return (j[]) f7527m.clone();
    }
}
