package N4;

import l4.AbstractC1420H;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class f {

    /* renamed from: k, reason: collision with root package name */
    public static final /* synthetic */ f[] f6929k;

    static {
        f[] fVarArr = {new f("SOURCE", 0), new f("BINARY", 1)};
        f6929k = fVarArr;
        AbstractC1420H.z(fVarArr);
    }

    public static f valueOf(String str) {
        return (f) Enum.valueOf(f.class, str);
    }

    public static f[] values() {
        return (f[]) f6929k.clone();
    }
}
