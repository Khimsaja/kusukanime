package s4;

import l4.AbstractC1420H;
import p.I0;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class d {

    /* renamed from: k, reason: collision with root package name */
    public static final I0 f15828k;

    /* renamed from: l, reason: collision with root package name */
    public static final /* synthetic */ d[] f15829l;

    static {
        d[] dVarArr = {new d("Function", 0), new d("SuspendFunction", 1), new d("KFunction", 2), new d("KSuspendFunction", 3), new d("UNKNOWN", 4)};
        f15829l = dVarArr;
        AbstractC1420H.z(dVarArr);
        f15828k = new I0(12);
    }

    public static d valueOf(String str) {
        return (d) Enum.valueOf(d.class, str);
    }

    public static d[] values() {
        return (d[]) f15829l.clone();
    }
}
