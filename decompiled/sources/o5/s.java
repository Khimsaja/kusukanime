package o5;

import l4.AbstractC1420H;
import n5.AbstractC1566c;
import n5.C1575l;
import n5.K;
import n5.a0;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public abstract class s {

    /* renamed from: k, reason: collision with root package name */
    public static final q f13815k;

    /* renamed from: l, reason: collision with root package name */
    public static final o f13816l;

    /* renamed from: m, reason: collision with root package name */
    public static final r f13817m;

    /* renamed from: n, reason: collision with root package name */
    public static final p f13818n;

    /* renamed from: o, reason: collision with root package name */
    public static final /* synthetic */ s[] f13819o;

    static {
        q qVar = new q();
        f13815k = qVar;
        o oVar = new o();
        f13816l = oVar;
        r rVar = new r();
        f13817m = rVar;
        p pVar = new p();
        f13818n = pVar;
        s[] sVarArr = {qVar, oVar, rVar, pVar};
        f13819o = sVarArr;
        AbstractC1420H.z(sVarArr);
    }

    public static s b(a0 a0Var) {
        kotlin.jvm.internal.l.f("<this>", a0Var);
        if (a0Var.u0()) {
            return f13816l;
        }
        if (a0Var instanceof C1575l) {
        }
        return AbstractC1566c.h(C1713m.f13813k.a(), AbstractC1566c.m(a0Var), K.f13365b) ? f13818n : f13817m;
    }

    public static s valueOf(String str) {
        return (s) Enum.valueOf(s.class, str);
    }

    public static s[] values() {
        return (s[]) f13819o.clone();
    }

    public abstract s a(a0 a0Var);
}
