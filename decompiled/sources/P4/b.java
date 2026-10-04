package P4;

import l4.AbstractC1420H;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class b {

    /* renamed from: k, reason: collision with root package name */
    public static final b f7784k;

    /* renamed from: l, reason: collision with root package name */
    public static final b f7785l;

    /* renamed from: m, reason: collision with root package name */
    public static final b f7786m;

    /* renamed from: n, reason: collision with root package name */
    public static final /* synthetic */ b[] f7787n;

    static {
        b bVar = new b("PROPERTY", 0);
        f7784k = bVar;
        b bVar2 = new b("BACKING_FIELD", 1);
        f7785l = bVar2;
        b bVar3 = new b("DELEGATE_FIELD", 2);
        f7786m = bVar3;
        b[] bVarArr = {bVar, bVar2, bVar3};
        f7787n = bVarArr;
        AbstractC1420H.z(bVarArr);
    }

    public static b valueOf(String str) {
        return (b) Enum.valueOf(b.class, str);
    }

    public static b[] values() {
        return (b[]) f7787n.clone();
    }
}
