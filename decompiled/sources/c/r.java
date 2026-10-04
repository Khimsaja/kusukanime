package c;

import O3.C;
import java.util.ListIterator;

/* loaded from: classes.dex */
public final class r extends kotlin.jvm.internal.m implements e4.k {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ int f11095l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ x f11096m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ r(x xVar, int i7) {
        super(1);
        this.f11095l = i7;
        this.f11096m = xVar;
    }

    @Override // e4.k
    public final Object invoke(Object obj) {
        Object objPrevious;
        Object objPrevious2;
        switch (this.f11095l) {
            case 0:
                C0740b c0740b = (C0740b) obj;
                kotlin.jvm.internal.l.f("backEvent", c0740b);
                x xVar = this.f11096m;
                P3.l lVar = xVar.f11109b;
                ListIterator listIterator = lVar.listIterator(lVar.a());
                while (true) {
                    if (listIterator.hasPrevious()) {
                        objPrevious = listIterator.previous();
                        if (((q) objPrevious).a) {
                        }
                    } else {
                        objPrevious = null;
                    }
                }
                q qVar = (q) objPrevious;
                if (xVar.f11110c != null) {
                    xVar.b();
                }
                xVar.f11110c = qVar;
                if (qVar != null) {
                    qVar.d(c0740b);
                }
                break;
            default:
                C0740b c0740b2 = (C0740b) obj;
                kotlin.jvm.internal.l.f("backEvent", c0740b2);
                x xVar2 = this.f11096m;
                q qVar2 = xVar2.f11110c;
                if (qVar2 == null) {
                    P3.l lVar2 = xVar2.f11109b;
                    ListIterator listIterator2 = lVar2.listIterator(lVar2.a());
                    while (true) {
                        if (listIterator2.hasPrevious()) {
                            objPrevious2 = listIterator2.previous();
                            if (((q) objPrevious2).a) {
                            }
                        } else {
                            objPrevious2 = null;
                        }
                    }
                    qVar2 = (q) objPrevious2;
                }
                if (qVar2 != null) {
                    qVar2.c(c0740b2);
                }
                break;
        }
        return C.a;
    }
}
