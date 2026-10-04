package J5;

import l4.AbstractC1420H;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class c {

    /* renamed from: k, reason: collision with root package name */
    public static final c f4299k;

    /* renamed from: l, reason: collision with root package name */
    public static final c f4300l;

    /* renamed from: m, reason: collision with root package name */
    public static final c f4301m;

    /* renamed from: n, reason: collision with root package name */
    public static final /* synthetic */ c[] f4302n;

    static {
        c cVar = new c("SUSPEND", 0);
        f4299k = cVar;
        c cVar2 = new c("DROP_OLDEST", 1);
        f4300l = cVar2;
        c cVar3 = new c("DROP_LATEST", 2);
        f4301m = cVar3;
        c[] cVarArr = {cVar, cVar2, cVar3};
        f4302n = cVarArr;
        AbstractC1420H.z(cVarArr);
    }

    public static c valueOf(String str) {
        return (c) Enum.valueOf(c.class, str);
    }

    public static c[] values() {
        return (c[]) f4302n.clone();
    }
}
