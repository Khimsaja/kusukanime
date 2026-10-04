package t4;

import java.util.List;
import u4.InterfaceC2097c;
import u4.InterfaceC2099e;
import u4.InterfaceC2105k;
import v4.AbstractC2157e;
import v4.C2159g;

/* loaded from: classes.dex */
public final class l implements e4.k {

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ int f16065k;

    /* renamed from: l, reason: collision with root package name */
    public final o f16066l;

    public /* synthetic */ l(o oVar, int i7) {
        this.f16065k = i7;
        this.f16066l = oVar;
    }

    @Override // e4.k
    public final Object invoke(Object obj) {
        boolean z7 = false;
        o oVar = this.f16066l;
        switch (this.f16065k) {
            case 0:
                O3.l lVar = (O3.l) obj;
                kotlin.jvm.internal.l.f("<destruct>", lVar);
                String str = (String) lVar.f7528k;
                String str2 = (String) lVar.f7529l;
                String str3 = "'" + str + "()' member of List is redundant in Kotlin and might be removed soon. Please use '" + str2 + "()' stdlib extension instead";
                List listH = P3.r.H(AbstractC2157e.a(oVar.a.f17339n, str3, str2 + "()", "HIDDEN"));
                return listH.isEmpty() ? C2159g.a : new v4.i(0, listH);
            default:
                InterfaceC2097c interfaceC2097c = (InterfaceC2097c) obj;
                if (interfaceC2097c.c() == 1) {
                    oVar.getClass();
                    InterfaceC2105k interfaceC2105kK = interfaceC2097c.k();
                    kotlin.jvm.internal.l.d("null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.ClassDescriptor", interfaceC2105kK);
                    String str4 = C2053d.a;
                    if (C2053d.f16046j.containsKey(Z4.e.g((InterfaceC2099e) interfaceC2105kK))) {
                        z7 = true;
                    }
                }
                return Boolean.valueOf(z7);
        }
    }
}
