package L;

import K5.InterfaceC0330i;
import u.C2062a;
import u.C2063b;
import u.C2064c;

/* renamed from: L.t, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0417t implements InterfaceC0330i {

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ int f5797k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ Y.r f5798l;

    public /* synthetic */ C0417t(Y.r rVar, int i7) {
        this.f5797k = i7;
        this.f5798l = rVar;
    }

    @Override // K5.InterfaceC0330i
    public final Object emit(Object obj, S3.c cVar) {
        switch (this.f5797k) {
            case 0:
                u.i iVar = (u.i) obj;
                boolean z7 = iVar instanceof u.g;
                Y.r rVar = this.f5798l;
                if (z7) {
                    rVar.add(iVar);
                } else if (iVar instanceof u.h) {
                    rVar.remove(((u.h) iVar).a);
                } else if (iVar instanceof u.d) {
                    rVar.add(iVar);
                } else if (iVar instanceof u.e) {
                    rVar.remove(((u.e) iVar).a);
                } else if (iVar instanceof u.m) {
                    rVar.add(iVar);
                } else if (iVar instanceof u.n) {
                    rVar.remove(((u.n) iVar).a);
                } else if (iVar instanceof u.l) {
                    rVar.remove(((u.l) iVar).a);
                }
                break;
            case 1:
                u.i iVar2 = (u.i) obj;
                boolean z8 = iVar2 instanceof u.g;
                Y.r rVar2 = this.f5798l;
                if (z8) {
                    rVar2.add(iVar2);
                } else if (iVar2 instanceof u.h) {
                    rVar2.remove(((u.h) iVar2).a);
                } else if (iVar2 instanceof u.d) {
                    rVar2.add(iVar2);
                } else if (iVar2 instanceof u.e) {
                    rVar2.remove(((u.e) iVar2).a);
                } else if (iVar2 instanceof u.m) {
                    rVar2.add(iVar2);
                } else if (iVar2 instanceof u.n) {
                    rVar2.remove(((u.n) iVar2).a);
                } else if (iVar2 instanceof u.l) {
                    rVar2.remove(((u.l) iVar2).a);
                } else if (iVar2 instanceof C2063b) {
                    rVar2.add(iVar2);
                } else if (iVar2 instanceof C2064c) {
                    rVar2.remove(((C2064c) iVar2).a);
                } else if (iVar2 instanceof C2062a) {
                    rVar2.remove(((C2062a) iVar2).a);
                }
                break;
            default:
                u.i iVar3 = (u.i) obj;
                boolean z9 = iVar3 instanceof u.g;
                Y.r rVar3 = this.f5798l;
                if (z9) {
                    rVar3.add(iVar3);
                } else if (iVar3 instanceof u.h) {
                    rVar3.remove(((u.h) iVar3).a);
                } else if (iVar3 instanceof u.d) {
                    rVar3.add(iVar3);
                } else if (iVar3 instanceof u.e) {
                    rVar3.remove(((u.e) iVar3).a);
                } else if (iVar3 instanceof u.m) {
                    rVar3.add(iVar3);
                } else if (iVar3 instanceof u.n) {
                    rVar3.remove(((u.n) iVar3).a);
                } else if (iVar3 instanceof u.l) {
                    rVar3.remove(((u.l) iVar3).a);
                } else if (iVar3 instanceof C2063b) {
                    rVar3.add(iVar3);
                } else if (iVar3 instanceof C2064c) {
                    rVar3.remove(((C2064c) iVar3).a);
                } else if (iVar3 instanceof C2062a) {
                    rVar3.remove(((C2062a) iVar3).a);
                }
                break;
        }
        return O3.C.a;
    }
}
