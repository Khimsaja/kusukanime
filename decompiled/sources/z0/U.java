package z0;

import O.C0497i0;
import android.view.Choreographer;
import androidx.lifecycle.AbstractC0690q;
import androidx.lifecycle.EnumC0689p;
import io.ktor.util.GzipHeaderFlags;
import java.lang.ref.WeakReference;
import java.util.List;
import r0.C1861b;

/* loaded from: classes.dex */
public final class U extends kotlin.jvm.internal.m implements e4.k {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ int f18679l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ Object f18680m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ Object f18681n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ U(int i7, Object obj, Object obj2) {
        super(1);
        this.f18679l = i7;
        this.f18681n = obj;
        this.f18680m = obj2;
    }

    @Override // e4.k
    public final Object invoke(Object obj) {
        F.E e7;
        switch (this.f18679l) {
            case 0:
                return new C2476w0((F.C) this.f18681n, new C1861b(11, (W) this.f18680m));
            case 1:
                C2476w0 c2476w0 = (C2476w0) this.f18681n;
                synchronized (c2476w0.f18938c) {
                    try {
                        c2476w0.f18940e = true;
                        Q.d dVar = c2476w0.f18939d;
                        int i7 = dVar.f7829m;
                        if (i7 > 0) {
                            Object[] objArr = dVar.f7827k;
                            int i8 = 0;
                            do {
                                N0.m mVar = (N0.m) ((WeakReference) objArr[i8]).get();
                                if (mVar != null && (e7 = mVar.f6885b) != null) {
                                    mVar.a(e7);
                                    mVar.f6885b = null;
                                }
                                i8++;
                            } while (i8 < i7);
                        }
                        c2476w0.f18939d.g();
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                ((W) this.f18680m).f18706l.a.f();
                return O3.C.a;
            case 2:
                C2433a0 c2433a0 = (C2433a0) this.f18681n;
                O.B b4 = (O.B) this.f18680m;
                synchronized (c2433a0.f18726n) {
                    c2433a0.f18728p.remove(b4);
                }
                return O3.C.a;
            case 3:
                ((Choreographer) ((C0497i0) this.f18681n).f7086l).removeFrameCallback((O.B) this.f18680m);
                return O3.C.a;
            case GzipHeaderFlags.EXTRA /* 4 */:
                C2454l c2454l = (C2454l) obj;
                o1 o1Var = (o1) this.f18681n;
                if (!o1Var.f18820m) {
                    AbstractC0690q abstractC0690qF = c2454l.a.f();
                    W.a aVar = (W.a) this.f18680m;
                    o1Var.f18822o = aVar;
                    if (o1Var.f18821n == null) {
                        o1Var.f18821n = abstractC0690qF;
                        abstractC0690qF.a(o1Var);
                    } else if (abstractC0690qF.b().compareTo(EnumC0689p.f10738m) >= 0) {
                        o1Var.f18819l.j(new W.a(true, -2000640158, new n1(o1Var, aVar, 1)));
                    }
                }
                return O3.C.a;
            default:
                return ((s3.T) this.f18681n).invoke(((List) this.f18680m).get(((Number) obj).intValue()));
        }
    }
}
