package o4;

import X4.C0617n;
import f1.AbstractC0870c;
import l5.C1456i;
import l5.C1465r;
import u4.AbstractC2108n;
import u4.InterfaceC2088D;
import u4.InterfaceC2105k;
import z5.AbstractC2510o;
import z5.C2508m;

/* renamed from: o4.o, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1689o extends AbstractC0870c {
    public final u4.K a;

    /* renamed from: b, reason: collision with root package name */
    public final R4.J f13723b;

    /* renamed from: c, reason: collision with root package name */
    public final U4.d f13724c;

    /* renamed from: d, reason: collision with root package name */
    public final T4.g f13725d;

    /* renamed from: e, reason: collision with root package name */
    public final T4.i f13726e;

    /* renamed from: f, reason: collision with root package name */
    public final String f13727f;

    public C1689o(u4.K k7, R4.J j7, U4.d dVar, T4.g gVar, T4.i iVar) {
        String string;
        P4.g gVar2;
        String string2;
        kotlin.jvm.internal.l.f("proto", j7);
        kotlin.jvm.internal.l.f("nameResolver", gVar);
        kotlin.jvm.internal.l.f("typeTable", iVar);
        this.a = k7;
        this.f13723b = j7;
        this.f13724c = dVar;
        this.f13725d = gVar;
        this.f13726e = iVar;
        if (dVar.i()) {
            string2 = gVar.a(dVar.f9256o.f9246m).concat(gVar.a(dVar.f9256o.f9247n));
        } else {
            V4.d dVarB = V4.g.b(j7, gVar, iVar, true);
            if (dVarB == null) {
                throw new H5.C("No field signature for property: " + k7);
            }
            StringBuilder sb = new StringBuilder();
            sb.append(H4.w.a(dVarB.f9482h));
            InterfaceC2105k interfaceC2105kK = k7.k();
            kotlin.jvm.internal.l.e("getContainingDeclaration(...)", interfaceC2105kK);
            if (kotlin.jvm.internal.l.a(k7.getVisibility(), AbstractC2108n.f16321d) && (interfaceC2105kK instanceof C1456i)) {
                C0617n c0617n = U4.j.f9305i;
                kotlin.jvm.internal.l.e("classModuleName", c0617n);
                Integer num = (Integer) android.support.v4.media.session.b.w(((C1456i) interfaceC2105kK).f12785o, c0617n);
                String strA = num != null ? gVar.a(num.intValue()) : "main";
                C2508m c2508m = W4.f.a;
                c2508m.getClass();
                String strReplaceAll = c2508m.f19061k.matcher(strA).replaceAll("_");
                kotlin.jvm.internal.l.e("replaceAll(...)", strReplaceAll);
                string = "$".concat(strReplaceAll);
            } else if (!kotlin.jvm.internal.l.a(k7.getVisibility(), AbstractC2108n.a) || !(interfaceC2105kK instanceof InterfaceC2088D) || (gVar2 = ((C1465r) k7).f12826O) == null || gVar2.f7799l == null) {
                string = "";
            } else {
                StringBuilder sb2 = new StringBuilder("$");
                String strD = gVar2.f7798k.d();
                kotlin.jvm.internal.l.e("getInternalName(...)", strD);
                sb2.append(W4.e.e(AbstractC2510o.C0('/', strD, strD)).b());
                string = sb2.toString();
            }
            sb.append(string);
            sb.append("()");
            sb.append(dVarB.f9483i);
            string2 = sb.toString();
        }
        this.f13727f = string2;
    }

    @Override // f1.AbstractC0870c
    public final String G() {
        return this.f13727f;
    }
}
