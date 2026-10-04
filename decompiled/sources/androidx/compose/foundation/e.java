package androidx.compose.foundation;

import O.C0510p;
import a0.q;
import e4.o;
import f1.AbstractC0871d;
import kotlin.jvm.internal.m;
import q.o0;
import s.EnumC1903a0;

/* loaded from: classes.dex */
public final class e extends m implements o {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ o0 f10564l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(o0 o0Var) {
        super(3);
        this.f10564l = o0Var;
    }

    @Override // e4.o
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        C0510p c0510p = (C0510p) obj2;
        ((Number) obj3).intValue();
        c0510p.R(1478351300);
        o0 o0Var = this.f10564l;
        q qVarK = AbstractC0871d.o0(new ScrollSemanticsElement(o0Var), o0Var, EnumC1903a0.f15259k, true, null, o0Var.f14599c, null, c0510p, 64).k(new ScrollingLayoutElement(o0Var));
        c0510p.p(false);
        return qVarK;
    }
}
