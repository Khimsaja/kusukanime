package O5;

import l4.AbstractC1420H;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class b {

    /* renamed from: k, reason: collision with root package name */
    public static final b f7606k;

    /* renamed from: l, reason: collision with root package name */
    public static final b f7607l;

    /* renamed from: m, reason: collision with root package name */
    public static final b f7608m;

    /* renamed from: n, reason: collision with root package name */
    public static final b f7609n;

    /* renamed from: o, reason: collision with root package name */
    public static final b f7610o;

    /* renamed from: p, reason: collision with root package name */
    public static final /* synthetic */ b[] f7611p;

    static {
        b bVar = new b("CPU_ACQUIRED", 0);
        f7606k = bVar;
        b bVar2 = new b("BLOCKING", 1);
        f7607l = bVar2;
        b bVar3 = new b("PARKING", 2);
        f7608m = bVar3;
        b bVar4 = new b("DORMANT", 3);
        f7609n = bVar4;
        b bVar5 = new b("TERMINATED", 4);
        f7610o = bVar5;
        b[] bVarArr = {bVar, bVar2, bVar3, bVar4, bVar5};
        f7611p = bVarArr;
        AbstractC1420H.z(bVarArr);
    }

    public static b valueOf(String str) {
        return (b) Enum.valueOf(b.class, str);
    }

    public static b[] values() {
        return (b[]) f7611p.clone();
    }
}
