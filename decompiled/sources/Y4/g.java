package Y4;

import java.io.IOException;
import n5.AbstractC1586x;
import n5.Q;
import n5.b0;

/* loaded from: classes.dex */
public final class g implements e4.k {

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ int f10160k;

    /* renamed from: l, reason: collision with root package name */
    public final h f10161l;

    public /* synthetic */ g(h hVar, int i7) {
        this.f10160k = i7;
        this.f10161l = hVar;
    }

    @Override // e4.k
    public final Object invoke(Object obj) throws IOException {
        switch (this.f10160k) {
            case 0:
                Q q6 = (Q) obj;
                kotlin.jvm.internal.l.f("it", q6);
                if (q6.c()) {
                    return "*";
                }
                AbstractC1586x abstractC1586xB = q6.b();
                kotlin.jvm.internal.l.e("getType(...)", abstractC1586xB);
                String strU = this.f10161l.U(abstractC1586xB);
                if (q6.a() == b0.f13390m) {
                    return strU;
                }
                return q6.a() + ' ' + strU;
            default:
                AbstractC1586x abstractC1586x = (AbstractC1586x) obj;
                kotlin.jvm.internal.l.c(abstractC1586x);
                return this.f10161l.U(abstractC1586x);
        }
    }
}
