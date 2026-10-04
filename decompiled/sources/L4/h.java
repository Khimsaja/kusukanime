package L4;

import java.util.List;
import l5.C1451d;
import l5.C1456i;
import m5.C1520i;
import m5.C1523l;
import n5.AbstractC1565b;
import u4.InterfaceC2099e;
import u4.InterfaceC2102h;
import u4.N;
import x4.AbstractC2275b;

/* loaded from: classes.dex */
public final class h extends AbstractC1565b {

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f6076c = 0;

    /* renamed from: d, reason: collision with root package name */
    public final C1520i f6077d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ AbstractC2275b f6078e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(i iVar) {
        super(((K4.a) iVar.f6088t.f110l).a);
        this.f6078e = iVar;
        C1523l c1523l = ((K4.a) iVar.f6088t.f110l).a;
        g gVar = new g(iVar, 2);
        c1523l.getClass();
        this.f6077d = new C1520i(c1523l, gVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:115:0x0292  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x0301  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x0315  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x0322  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x0358  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x013c  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x01b8  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x01cd  */
    /* JADX WARN: Type inference failed for: r6v16 */
    /* JADX WARN: Type inference failed for: r6v4, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r6v6, types: [java.util.Collection] */
    @Override // n5.AbstractC1569f
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.util.Collection b() {
        /*
            Method dump skipped, instructions count: 890
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: L4.h.b():java.util.Collection");
    }

    @Override // n5.M
    public final boolean e() {
        switch (this.f6076c) {
        }
        return true;
    }

    @Override // n5.AbstractC1565b, n5.M
    public final InterfaceC2102h f() {
        switch (this.f6076c) {
            case 0:
                return (i) this.f6078e;
            default:
                return (C1456i) this.f6078e;
        }
    }

    @Override // n5.M
    public final List getParameters() {
        switch (this.f6076c) {
        }
        return (List) this.f6077d.invoke();
    }

    @Override // n5.AbstractC1569f
    public final N h() {
        switch (this.f6076c) {
            case 0:
                return ((K4.a) ((i) this.f6078e).f6088t.f110l).f4711m;
            default:
                return N.f16297m;
        }
    }

    @Override // n5.AbstractC1565b
    /* renamed from: m */
    public final InterfaceC2099e f() {
        switch (this.f6076c) {
            case 0:
                return (i) this.f6078e;
            default:
                return (C1456i) this.f6078e;
        }
    }

    public final String toString() {
        switch (this.f6076c) {
            case 0:
                String strB = ((i) this.f6078e).getName().b();
                kotlin.jvm.internal.l.e("asString(...)", strB);
                return strB;
            default:
                String str = ((C1456i) this.f6078e).getName().f9624k;
                kotlin.jvm.internal.l.e("toString(...)", str);
                return str;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(C1456i c1456i) {
        super(c1456i.f12792v.a.a);
        this.f6078e = c1456i;
        C1523l c1523l = c1456i.f12792v.a.a;
        C1451d c1451d = new C1451d(c1456i, 6);
        c1523l.getClass();
        this.f6077d = new C1520i(c1523l, c1451d);
    }
}
