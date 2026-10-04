package Y4;

import l4.AbstractC1420H;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class q {

    /* renamed from: k, reason: collision with root package name */
    public static final q f10239k;

    /* renamed from: l, reason: collision with root package name */
    public static final q f10240l;

    /* renamed from: m, reason: collision with root package name */
    public static final /* synthetic */ q[] f10241m;

    static {
        q qVar = new q("PRETTY", 0);
        q qVar2 = new q("DEBUG", 1);
        f10239k = qVar2;
        q qVar3 = new q("NONE", 2);
        f10240l = qVar3;
        q[] qVarArr = {qVar, qVar2, qVar3};
        f10241m = qVarArr;
        AbstractC1420H.z(qVarArr);
    }

    public static q valueOf(String str) {
        return (q) Enum.valueOf(q.class, str);
    }

    public static q[] values() {
        return (q[]) f10241m.clone();
    }
}
