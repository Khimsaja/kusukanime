package E;

import H0.C0209a;
import H0.p;
import I0.y;
import O3.C;
import P3.F;
import android.graphics.Matrix;
import android.graphics.Path;
import e4.k;
import e5.AbstractC0832b;
import h0.C0987j;
import kotlin.jvm.internal.m;
import v.c0;
import w0.AbstractC2182Q;
import w0.S;

/* loaded from: classes.dex */
public final class c extends m implements k {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ int f1784l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ int f1785m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ Object f1786n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ int f1787o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(int i7, S s7, int i8) {
        super(1);
        this.f1784l = 1;
        this.f1785m = i7;
        this.f1786n = s7;
        this.f1787o = i8;
    }

    @Override // e4.k
    public final Object invoke(Object obj) {
        switch (this.f1784l) {
            case 0:
                AbstractC2182Q.d((AbstractC2182Q) obj, (S) this.f1786n, -this.f1785m, -this.f1787o);
                return C.a;
            case 1:
                AbstractC2182Q.d((AbstractC2182Q) obj, (S) this.f1786n, F.W((this.f1785m - r0.f16840k) / 2.0f), F.W((this.f1787o - r0.f16841l) / 2.0f));
                return C.a;
            case 2:
                AbstractC2182Q.d((AbstractC2182Q) obj, (S) this.f1786n, this.f1785m, this.f1787o);
                return C.a;
            default:
                p pVar = (p) obj;
                C0209a c0209a = pVar.a;
                int iB = pVar.b(this.f1785m);
                int iB2 = pVar.b(this.f1787o);
                CharSequence charSequence = c0209a.f3099e;
                if (iB < 0 || iB > iB2 || iB2 > charSequence.length()) {
                    StringBuilder sbB = c0.b("start(", iB, ") or end(", iB2, ") is out of range [0..");
                    sbB.append(charSequence.length());
                    sbB.append("], or start > end!");
                    throw new IllegalArgumentException(sbB.toString().toString());
                }
                Path path = new Path();
                y yVar = c0209a.f3098d;
                yVar.f3924e.getSelectionPath(iB, iB2, path);
                int i7 = yVar.f3926g;
                if (i7 != 0 && !path.isEmpty()) {
                    path.offset(0.0f, i7);
                }
                long jE = AbstractC0832b.e(0.0f, pVar.f3141f);
                Matrix matrix = new Matrix();
                matrix.setTranslate(g0.c.d(jE), g0.c.e(jE));
                path.transform(matrix);
                ((C0987j) this.f1786n).a.addPath(path, g0.c.d(0L), g0.c.e(0L));
                return C.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ c(Object obj, int i7, int i8, int i9) {
        super(1);
        this.f1784l = i9;
        this.f1786n = obj;
        this.f1785m = i7;
        this.f1787o = i8;
    }
}
