package Y4;

import l4.AbstractC1420H;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public abstract class t {

    /* renamed from: k, reason: collision with root package name */
    public static final s f10242k;

    /* renamed from: l, reason: collision with root package name */
    public static final r f10243l;

    /* renamed from: m, reason: collision with root package name */
    public static final /* synthetic */ t[] f10244m;

    static {
        s sVar = new s();
        f10242k = sVar;
        r rVar = new r();
        f10243l = rVar;
        t[] tVarArr = {sVar, rVar};
        f10244m = tVarArr;
        AbstractC1420H.z(tVarArr);
    }

    public static t valueOf(String str) {
        return (t) Enum.valueOf(t.class, str);
    }

    public static t[] values() {
        return (t[]) f10244m.clone();
    }

    public abstract String a(String str);
}
