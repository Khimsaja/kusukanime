package O4;

import l4.AbstractC1420H;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class f {

    /* renamed from: k, reason: collision with root package name */
    public static final f f7558k;

    /* renamed from: l, reason: collision with root package name */
    public static final f f7559l;

    /* renamed from: m, reason: collision with root package name */
    public static final /* synthetic */ f[] f7560m;

    static {
        f fVar = new f("READ_ONLY", 0);
        f7558k = fVar;
        f fVar2 = new f("MUTABLE", 1);
        f7559l = fVar2;
        f[] fVarArr = {fVar, fVar2};
        f7560m = fVarArr;
        AbstractC1420H.z(fVarArr);
    }

    public static f valueOf(String str) {
        return (f) Enum.valueOf(f.class, str);
    }

    public static f[] values() {
        return (f[]) f7560m.clone();
    }
}
